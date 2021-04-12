package com.example.unit_3_sprint_4_evaluation

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MyDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addTask(myNewsEntity: MyNewsEntity)

    @Query("SELECT * FROM news_table")
    fun getTask(): LiveData<List<MyNewsEntity>>
}