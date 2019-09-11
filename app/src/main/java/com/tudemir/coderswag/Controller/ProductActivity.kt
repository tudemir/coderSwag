package com.tudemir.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.tudemir.coderswag.R
import com.tudemir.coderswag.Services.DataService
import com.tudemir.coderswag.Utilities.EXTRA_CATEGORY
import com.tudemir.coderswag.adapters.ProductsAdapter
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this,2)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter
    }
}
