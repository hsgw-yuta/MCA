package com.example.mca.View

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(
    fm: FragmentManager, private val context: Context):
    FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> { return MainFragment() }
            else ->  { return SubFragment() }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> { return "HOME" }
            else ->  { return "LIST" }
        }
    }

    override fun getCount(): Int {
        return 2
    }


}