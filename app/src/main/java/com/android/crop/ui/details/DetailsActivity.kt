package com.android.crop.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.crop.ItemModel
import com.android.crop.R
import com.android.crop.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailsBinding
    var name: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        name = intent?.getStringExtra("name").toString()
        binding.textViewName.text = name
        val adapter = ItemListAdapter(getList(name))
        binding.recyclerView.adapter = adapter
    }

    private fun getList(name: String): ArrayList<ItemModel> {
        return when (name) {
            "Kharif" -> getKharifList()
            "Rabi" -> getRabiList()
            "Summer" -> getSummerList()
            "Field Crops" -> getFieldCrops()
            "Plantation Crops" -> getPlantationCrops()
            "Commercial Crops" -> getCommercialCrops()
            "Horticulture" -> getHorticultureCrops()
            "Forage and Grass" -> getForageAndGrass()
            "Miscellaneous Crops" -> getMiscellaneousCrops()
            else -> arrayListOf()
        }
    }

    private fun getMiscellaneousCrops(): ArrayList<ItemModel> {
        binding.textViewDescription.text = ""
        val list = arrayListOf<ItemModel>()
        val imageListSilk = arrayListOf<Int>()
        imageListSilk.add(R.drawable.silk_1)
        imageListSilk.add(R.drawable.silk_2)

        val imageListAloeVira = arrayListOf<Int>()
        imageListAloeVira.add(R.drawable.aloe_vera_1)
        imageListAloeVira.add(R.drawable.aloe_vera_2)
        val itemModel = ItemModel("Sericulture Crops - Silk", imageListSilk)
        val itemModelOne = ItemModel("Medicinal  Crops - Aloe Vera", imageListAloeVira)
        list.add(itemModel)
        list.add(itemModelOne)
        return list
    }

    private fun getForageAndGrass(): ArrayList<ItemModel> {
        binding.textViewDescription.text = ""
        val list = arrayListOf<ItemModel>()

        list.add(getSorghum())
        return list
    }

    private fun getHorticultureCrops(): ArrayList<ItemModel> {
        binding.textViewDescription.text = ""
        val list = arrayListOf<ItemModel>()

        list.add(getMango())
        list.add(getCocoa())
        list.add(getLemon())
        list.add(getGuava())
        list.add(getPomegranate())
        list.add(getTomato())
        return list
    }

    private fun getPlantationCrops(): ArrayList<ItemModel> {
        binding.textViewDescription.text = ""
        val list = arrayListOf<ItemModel>()

        list.add(getTea())
        list.add(getCoffee())
        list.add(getCoconut())
        return list
    }

    private fun getCommercialCrops(): ArrayList<ItemModel> {
        binding.textViewDescription.text = ""
        val list = arrayListOf<ItemModel>()

        list.add(getSunflower())
        list.add(getCotton())
        list.add(getSugarcane())
        list.add(getGroundnut())
        list.add(getTobacco())
        return list
    }

    private fun getFieldCrops(): ArrayList<ItemModel> {
        binding.textViewDescription.text = ""
        val list = arrayListOf<ItemModel>()

        list.add(getRice())
        list.add(getMaize())
        list.add(getMillet())
        return list
    }

    private fun getSummerList(): ArrayList<ItemModel> {
        binding.textViewDescription.text = "Sowing - March; Harvesting – July"
        val list = arrayListOf<ItemModel>()

        list.add(getSesame())
        list.add(getWatermelon())
        list.add(getMuskmelon())
        list.add(getCauliflower())
        return list
    }

    private fun getRabiList(): ArrayList<ItemModel> {
        binding.textViewDescription.text = "Sowing - October/December; Harvesting – April/June"
        val list = arrayListOf<ItemModel>()

        list.add(getRice())
        list.add(getOnion())
        list.add(getMaize())
        list.add(getSunflower())
        return list
    }

    private fun getKharifList(): ArrayList<ItemModel> {
        binding.textViewDescription.text = "Sowing - October/December; Harvesting – April/June"
        val list = arrayListOf<ItemModel>()

        list.add(getRice())
        list.add(getCotton())
        list.add(getTobacco())
        list.add(getGroundnut())
        list.add(getMillet())
        list.add(getChiily())

        return list
    }

    private fun getRice(): ItemModel {
        val imageListRice = arrayListOf<Int>()
        imageListRice.add(R.drawable.rice_1)
        imageListRice.add(R.drawable.rice_2)
        return ItemModel("Rice", imageListRice)
    }

    private fun getOnion(): ItemModel {
        val imageListOnion = arrayListOf<Int>()
        imageListOnion.add(R.drawable.onion_1)
        imageListOnion.add(R.drawable.onion_2)
        return ItemModel("Onion", imageListOnion)
    }

    private fun getMaize(): ItemModel {
        val imageListMaize = arrayListOf<Int>()
        imageListMaize.add(R.drawable.maize_1)
        imageListMaize.add(R.drawable.maize_2)
        return ItemModel("Maize", imageListMaize)
    }

    private fun getSesame(): ItemModel {
        val imageListSesame = arrayListOf<Int>()
        imageListSesame.add(R.drawable.sesame_1)
        imageListSesame.add(R.drawable.sesame_2)
        return ItemModel("Sesame", imageListSesame)
    }

    private fun getWatermelon(): ItemModel {
        val imageListWatermelon = arrayListOf<Int>()
        imageListWatermelon.add(R.drawable.watermelon_1)
        imageListWatermelon.add(R.drawable.watermelon_2)
        return ItemModel("Watermelon", imageListWatermelon)
    }

    private fun getMuskmelon(): ItemModel {
        val imageListMuskmelon = arrayListOf<Int>()
        imageListMuskmelon.add(R.drawable.sunflower_1)
        imageListMuskmelon.add(R.drawable.sunflower_2)
        return ItemModel("Muskmelon", imageListMuskmelon)
    }

    private fun getCauliflower(): ItemModel {
        val imageListCauliflower = arrayListOf<Int>()
        imageListCauliflower.add(R.drawable.sunflower_1)
        imageListCauliflower.add(R.drawable.sunflower_2)
        return ItemModel("Cauliflower", imageListCauliflower)
    }

    private fun getSunflower(): ItemModel {
        val imageListSunflower = arrayListOf<Int>()
        imageListSunflower.add(R.drawable.sunflower_1)
        imageListSunflower.add(R.drawable.sunflower_2)
        return ItemModel("Sunflower", imageListSunflower)
    }

    private fun getMillet(): ItemModel {
        val imageListMillet = arrayListOf<Int>()
        imageListMillet.add(R.drawable.millet_1)
        imageListMillet.add(R.drawable.millet_2)
        return ItemModel("Millet", imageListMillet)
    }

    private fun getTea(): ItemModel {
        val imageListTea = arrayListOf<Int>()
        imageListTea.add(R.drawable.tea_1)
        imageListTea.add(R.drawable.tea_1)
        return ItemModel("Tea", imageListTea)
    }

    private fun getCoffee(): ItemModel {
        val imageListCoffee = arrayListOf<Int>()
        imageListCoffee.add(R.drawable.coffee_1)
        imageListCoffee.add(R.drawable.coffee_2)
        return ItemModel("Coffee", imageListCoffee)
    }

    private fun getCoconut(): ItemModel {
        val imageListCoconut = arrayListOf<Int>()
        imageListCoconut.add(R.drawable.coconut_1)
        imageListCoconut.add(R.drawable.coconut_2)
        return ItemModel("Coconut", imageListCoconut)
    }

    private fun getCotton(): ItemModel {
        val imageListCotton = arrayListOf<Int>()
        imageListCotton.add(R.drawable.cotton_1)
        imageListCotton.add(R.drawable.cotton_2)
        return ItemModel("Cotton", imageListCotton)
    }

    private fun getSugarcane(): ItemModel {
        val imageListSugarcane = arrayListOf<Int>()
        imageListSugarcane.add(R.drawable.sugarcane_1)
        imageListSugarcane.add(R.drawable.sugarcane_2)
        return ItemModel("Sugarcane", imageListSugarcane)
    }

    private fun getGroundnut(): ItemModel {
        val imageListGroundnut = arrayListOf<Int>()
        imageListGroundnut.add(R.drawable.groundnut_1)
        imageListGroundnut.add(R.drawable.groundnut_2)
        return ItemModel("Groundnut", imageListGroundnut)
    }

    private fun getTobacco(): ItemModel {
        val imageListTobacco = arrayListOf<Int>()
        imageListTobacco.add(R.drawable.tabacco_1)
        imageListTobacco.add(R.drawable.tabacco_2)
        return ItemModel("Tobacco", imageListTobacco)

    }

    private fun getChiily(): ItemModel {
        val imageListChilly = arrayListOf<Int>()
        imageListChilly.add(R.drawable.chilli_1)
        imageListChilly.add(R.drawable.chilli_2)
        return ItemModel("Chilly", imageListChilly)
    }

    private fun getMango(): ItemModel {
        val imageListMango = arrayListOf<Int>()
        imageListMango.add(R.drawable.mango_1)
        imageListMango.add(R.drawable.mango_2)
        return ItemModel("Mango", imageListMango)
    }

    private fun getCocoa(): ItemModel {
        val imageListCocoa = arrayListOf<Int>()
        imageListCocoa.add(R.drawable.cocoa_1)
        imageListCocoa.add(R.drawable.cocoa_2)
        return ItemModel("Cocoa", imageListCocoa)
    }

    private fun getLemon(): ItemModel {
        val imageListLemon = arrayListOf<Int>()
        imageListLemon.add(R.drawable.lemon_1)
        imageListLemon.add(R.drawable.lemon_2)
        return ItemModel("Lemon", imageListLemon)
    }

    private fun getGuava(): ItemModel {
        val imageListGuava = arrayListOf<Int>()
        imageListGuava.add(R.drawable.guava_1)
        imageListGuava.add(R.drawable.guava_2)
        return ItemModel("Guava", imageListGuava)
    }

    private fun getPomegranate(): ItemModel {
        val imageListPomegranate = arrayListOf<Int>()
        imageListPomegranate.add(R.drawable.pomengranate_1)
        imageListPomegranate.add(R.drawable.pomengranate_2)
        return ItemModel("Pomegranate", imageListPomegranate)
    }

    private fun getTomato(): ItemModel {
        val imageListTomato = arrayListOf<Int>()
        imageListTomato.add(R.drawable.tomato_1)
        imageListTomato.add(R.drawable.tomato_2)
        return ItemModel("Tomato", imageListTomato)
    }

    private fun getSorghum(): ItemModel {
        val imageListSorghum = arrayListOf<Int>()
        imageListSorghum.add(R.drawable.sorghum_1)
        imageListSorghum.add(R.drawable.sorghum_2)
        return ItemModel("Sorghum", imageListSorghum)
    }

//    private fun getSericultureCrops(): ItemModel {
//        val imageListSericultureCrops = arrayListOf<Int>()
//        imageListSericultureCrops.add(R.drawable.sorghum_1)
//        imageListSericultureCrops.add(R.drawable.sorghum_2)
//        return ItemModel("Sericulture Crops", imageListSericultureCrops)
//    }
//    1.
//    2.	Medicinal crops

}