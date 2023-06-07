package com.example.totalsumapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grocerry_items")

data class GroceryItems(

@ColumnInfo(name = "itemName")
var itemName: String,

@ColumnInfo(name = "itemQuantity")
var itemQuality: Int,

@ColumnInfo(name = "itemPrice")
var item: Int,

){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
