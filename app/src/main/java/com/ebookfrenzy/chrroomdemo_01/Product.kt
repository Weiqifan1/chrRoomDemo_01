package com.ebookfrenzy.chrroomdemo_01

import android.support.annotation.NonNull
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "products")

class Product {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "productId")
    var id: Int = 0
    @ColumnInfo(name = "productName")
    var productName: String? = null
    var quantity: Int = 0

    constructor(){}
    constructor(id: Int, productName: String, quantity: Int){
        this.id = id
        this.productName = productName
        this.quantity = quantity
    }

    constructor(productName: String, quantity: Int){
        this.productName = productName
        this.quantity = quantity
    }




}