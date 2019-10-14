package com.example.mca.View

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mca.R
import com.example.mca.View.data.RowData


/**
 * ViewAdapter
 * ViewHolderを生成したりに生成したViewHolderにViewModelをセットしたりする
 * 一つのLISTに対して一つ
 * */
class ViewAdapter(private val itemList:List<RowData>,
                  private val listlistener: ListListener
): RecyclerView.Adapter<ViewHolder>() {

    // list_itemのviewを生成しViewHolderを作る
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val rowView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(rowView)
    }

    // positionをListのindexとしてViewHolderにセット
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.let {
            it.title?.text = itemList[position].title
        }

        holder.itemView.setOnClickListener{
            listlistener.onClickRow(it,itemList[position])
        }
    }
    override fun getItemCount(): Int {
        return itemList.size
    }

    interface ListListener {
        fun onClickRow(tappedView: View, profileData: RowData)
    }

}