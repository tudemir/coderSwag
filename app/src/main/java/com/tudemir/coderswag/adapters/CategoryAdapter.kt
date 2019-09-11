package com.tudemir.coderswag.adapters

import android.content.Context
import android.database.sqlite.SQLiteMisuseException
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tudemir.coderswag.Model.Category
import com.tudemir.coderswag.R
import com.tudemir.coderswag.Services.DataService
import kotlinx.android.synthetic.main.category_list_item.view.*


class CategoryAdapter(val context: Context, val categories:List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryAdapter.CategoryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item,parent,false)
        return CategoryHolder(view,itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bindCategory(categories[position],context)
    }


    inner class CategoryHolder(itemView:View, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView){
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category:Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryName.text = category.title
            itemView.setOnClickListener {  itemClick(category) }
        }
    }


}