package com.example.unit_3_sprint_4_evaluation

import android.app.Application

class MyApplication: Application() {
    val myAgeDAO: MyDao by lazy {
        val roomDatabase =MyDatabase.getDatabase(this)
        roomDatabase.getMyDao()
    }
    val repository :MyRepository by lazy {
        MyRepository(myAgeDAO)
    }

}