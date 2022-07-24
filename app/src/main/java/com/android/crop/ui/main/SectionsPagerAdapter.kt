package com.android.crop.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.android.crop.R

private val TAB_TITLES = arrayOf(
    R.string.seasons,
    R.string.all_crops
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        val list = if (position == 0) getSeasons() else getCrops()
        return PlaceholderFragment.newInstance(list)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }

    private fun getSeasons(): ArrayList<String> {
        return arrayListOf<String>().apply {
            add("Kharif")
            add("Rabi")
            add("Summer")
        }
    }

    private fun getCrops(): ArrayList<String> {
        return arrayListOf<String>().apply {
            add("Field Crops")
            add("Plantation Crops")
            add("Commercial Crops")
            add("Horticulture")
            add("Forage and Grass")
            add("Miscellaneous Crops")
        }
    }
}