package com.example.mca.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mca.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager.adapter = TabAdapter(supportFragmentManager,this)

        tab_layout.setupWithViewPager(pager)

    }
}