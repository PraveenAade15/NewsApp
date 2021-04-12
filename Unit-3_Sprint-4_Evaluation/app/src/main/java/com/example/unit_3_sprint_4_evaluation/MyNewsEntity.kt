package com.example.unit_3_sprint_4_evaluation

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "news_table")
data class MyNewsEntity(
    @field:SerializedName("title")
    val title: String? = null,
    @field:SerializedName("content")
    val content: String? = null,
    @field:SerializedName("imageUrl")
    val imageUrl: String? = null
) {
    @PrimaryKey(autoGenerate = true)@ColumnInfo(name = "id") var id:Int?=null

}