package com.example.unit_3_sprint_4_evaluation

import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyRepository(val myDao:MyDao) {
    private val CONTENT_TYPE = "application/json"

    val api:ApiClient=NetworkGenerater.getInstance()
        .create(ApiClient::class.java)


    fun insertTask(){

        CoroutineScope(Dispatchers.IO).launch {
            val result= api.getTask(CONTENT_TYPE)
            val myNewsEntity= MyNewsEntity(result?.data?.get(0)?.title,result?.data?.get(0)?.content,result?.data?.get(0)?.imageUrl)
                myDao.addTask( myNewsEntity)

        }
    }
    fun getTask(): LiveData<List<MyNewsEntity>> {
        return myDao.getTask()
    }
}