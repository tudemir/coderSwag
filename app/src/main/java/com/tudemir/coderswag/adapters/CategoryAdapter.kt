package com.tudemir.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.tudemir.coderswag.Model.Category
import com.tudemir.coderswag.R

class CategoryAdapter(context: Context, categories:List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView:View
        val holder: ViewHolder
        //First time the view is constructed
        if(convertView == null){
            categoryView= LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }


        val category = categories[position]

        //Convert image names to resource id
        val resourceId = context.resources.getIdentifier(category.image,"drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
     }
    //Unique id for each row
    override fun getItemId(position: Int): Long {
        return 0
     }

    override fun getCount(): Int {
        return categories.count()
    }

    //Holds reference to our category image and name
    private class ViewHolder {
        var categoryImage:ImageView?=null
        var categoryName:TextView?=null
    }
}