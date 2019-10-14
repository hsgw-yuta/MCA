package com.example.mca.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mca.R
import com.example.mca.View.data.RowData
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view = inflater.inflate(R.layout.fragment_main,container,false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = recycler_list
        val adapter = ViewAdapter(createDataList(), object : ViewAdapter.ListListener {
            override fun onClickRow(tappedView: View, rowData: RowData) {
                this@MainFragment.onClickRow(tappedView, rowData)
            }
        })

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter
    }

    // sampledata
    private fun createDataList(): List<RowData> {
        val dataList = mutableListOf<RowData>()
        for (i in 0..49) {
            val data: RowData = RowData().also {
                it.title = "タイトル" + i + "だよ"
            }
            dataList.add(data)
        }
        return dataList
    }

    // click処理
    fun onClickRow(tappedView: View, rowModel: RowData) {
        Snackbar.make(tappedView, "Replace with your own action tapped ${rowModel.title}", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
    }
}