package com.android.crop.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.crop.CropItemClickListener
import com.android.crop.ListAdapter
import com.android.crop.databinding.FragmentMainBinding
import com.android.crop.ui.details.DetailsActivity

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment(), CropItemClickListener {

    private lateinit var _binding: FragmentMainBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding
    private var list = arrayListOf<String>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = arguments?.getStringArrayList(ARG_SECTION_LIST) as ArrayList<String>
        val listAdapter = ListAdapter(list,this)
        binding.recyclerView.adapter = listAdapter
    }

    companion object {

        private const val ARG_SECTION_LIST = "section_list"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(list: ArrayList<String>): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putStringArrayList(ARG_SECTION_LIST, list)
                }
            }
        }
    }

    override fun onItemClicked(name: String) {
        val intent = Intent(activity,DetailsActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}