package com.example.mca.View

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mca.R

/**
 * ViewHolder
 * アイテムのViewを保持
 * */
class ViewHolder (view: View) :RecyclerView.ViewHolder(view){
    val title : TextView? = view.findViewById(R.id.list_title)

    /*
    // Listアイテムのクリック
    interface ItemClickListener{
        fun onItemClick(view:View,position:Int)
        fun onItemLongClick(view:View,position:Int)
    }*/
}