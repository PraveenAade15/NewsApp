package com.example.unit_3_sprint_4_evaluation

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [MyNewsEntity::class],version = 2)
abstract class MyDatabase: RoomDatabase() {
    abstract fun getMyDao():MyDao
    companion object{
        var INSTANCE:MyDatabase? = null

        fun getDatabase(context: Context):MyDatabase{
            if (INSTANCE==null){
                val builder = Room.databaseBuilder(
                    context.applicationContext,
                    MyDatabase::class.java,
                    "news_database"
                )
                builder.fallbackToDestructiveMigration()
                INSTANCE = builder.build()
                return INSTANCE!!
            }else{
                return INSTANCE!!
            }
        }
    }
}