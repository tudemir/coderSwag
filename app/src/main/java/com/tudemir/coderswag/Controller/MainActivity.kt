package com.tudemir.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.tudemir.coderswag.R
import com.tudemir.coderswag.Services.DataService
import com.tudemir.coderswag.Utilities.EXTRA_CATEGORY
import com.tudemir.coderswag.adapters.CategoryAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,
                DataService.categories){ category ->
            val productIntent = Intent(this,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)

        }

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.adapter = adapter
        categoryListView.setHasFixedSize(true)



    }
}
