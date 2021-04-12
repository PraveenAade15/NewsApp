package com.example.unit_3_sprint_4_evaluation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel(val repository : MyRepository): ViewModel() {
    fun insertData() {
        repository.insertTask()
        }

    fun getTask(): LiveData<List<MyNewsEntity>> {
        return repository.getTask()
    }
}