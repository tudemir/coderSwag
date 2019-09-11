package com.tudemir.coderswag.Services

import com.tudemir.coderswag.Model.Category
import com.tudemir.coderswag.Model.Product

// Singleton object creation

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Graphic Beanier","$18","hat1"),
            Product("Hat Black","$20","hat2"),
            Product("Hat White","$18","hat3"),
            Product("Hat Snapback","$22","hat4")
    )

    val hoodies = listOf(
            Product("Hoodie Gray","$28","hoodie1"),
            Product("Hoodie Red","$32","hoodie2"),
            Product("Hoodie Gr","$28","hoodie3"),
            Product("Black Hoodie","$32","hoodie4")
    )

    val shirts = listOf(
            Product("Shirt Black","$18","shirt1"),
            Product("Badge Light Gray","$20","shirt2"),
            Product("Logo Shirt Red","$22","shirt3"),
            Product("Hustle","$22","shirt4"),
            Product("Kickflip Studios","$18","shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category:String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}