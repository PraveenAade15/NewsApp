package com.example.unit_3_sprint_4_evaluation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var database: MyDatabase
    private lateinit var newsAdapter: NewsAdapter
    private val newsList = mutableListOf<MyNewsEntity>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val appObj: MyApplication = application as MyApplication
        val repository:MyRepository=appObj.repository
        val viewModelFactory=MyViewModelFactory(repository)
        val viewModel= ViewModelProviders.of(this,viewModelFactory).get(MyViewModel::class.java)


        newsAdapter= NewsAdapter(newsList)
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=newsAdapter

        viewModel.insertData()
        viewModel.getTask().observe(this, Observer {
            newsList.clear()
            newsList.addAll(it)
            newsAdapter.notifyDataSetChanged()
        })
    }
}