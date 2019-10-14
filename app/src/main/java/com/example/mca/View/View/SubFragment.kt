package com.example.mca.View.View

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mca.R
import kotlinx.android.synthetic.main.fragment_sub.*
import kotlinx.android.synthetic.main.fragment_sub.view.*

class SubFragment: Fragment(){

    object ResData{
        var res :String? = ""

        fun get_res():String?{
            return this.res
        }
        fun set_res(init:String){
            this.res = init
        }

        fun add_res(add:String){
            this.res = this.res + add
        }

        fun get_size():Int{
            Log.d("res",this.res!!.length.toString())
            return this.res!!.length
        }

        fun remove_end(end:Int){
            if(end <= 1) {
                this.res = "0"
                return
            }
                var tmp = this.res
                Log.d("res", tmp)
                val res = tmp?.substring(0, end - 1)
                Log.d("res", res)
                this.res = res
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_sub,container,false)

        view.btn_0.setOnClickListener {
            ResData.add_res("0")
            result.setText(ResData.get_res())
        }

        view.btn_1.setOnClickListener {
            if(ResData.get_res() == "0"){
                ResData.set_res("1")
            }else {
                ResData.add_res("1")
            }
            result.setText(ResData.get_res())
        }

        view.dell_btn.setOnClickListener {
            val num = ResData.get_size()
            ResData.remove_end(num)
            result.setText(ResData.get_res())
        }
        return view
    }
}