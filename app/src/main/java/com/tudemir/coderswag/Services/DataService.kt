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
            Product("Graphic Beanier","$18","hat01"),
            Product("Hat Black","$20","hat02"),
            Product("Hat White","$18","hat03"),
            Product("Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
            Product("Hoodie Gray","$28","hoodie01"),
            Product("Hoodie Red","$32","hoodie02"),
            Product("Hoodie Gr","$28","hoodie03"),
            Product("Black Hoodie","$32","hoodie04")
    )

    val shirts = listOf(
            Product("Shirt Black","$18","shirt01"),
            Product("Badge Light Gray","$20","shirt02"),
            Product("Logo Shirt Red","$22","shirt03"),
            Product("Hustle","$22","shirt04"),
            Product("Kickflip Studios","$18","shirt05")
    )

}