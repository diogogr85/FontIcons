package com.diogo.ribeiro.fonticons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.recyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)

        val icons = resources.getStringArray(R.array.icons)
        recyclerView.adapter = TextViewAdapter(icons = icons)

    }
}