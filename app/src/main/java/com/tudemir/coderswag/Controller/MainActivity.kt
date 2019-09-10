package com.tudemir.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tudemir.coderswag.R
import com.tudemir.coderswag.Services.DataService
import com.tudemir.coderswag.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories)

        categoryListView.adapter = adapter

    }
}
