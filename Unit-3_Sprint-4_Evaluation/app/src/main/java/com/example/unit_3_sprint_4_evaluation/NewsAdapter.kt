package com.example.unit_3_sprint_4_evaluation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NewsAdapter (private val newsList:List<MyNewsEntity>): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itme_layout,parent,false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        Glide.with(holder.mIvImage).load(newsList[position].imageUrl).into(holder.mIvImage)
        holder.mTvTitle.text = newsList[position].title
        holder.mTvContent.text =newsList[position].content
    }

    class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val mTvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val mTvContent: TextView = itemView.findViewById(R.id.tvContent)
        val mIvImage: ImageView = itemView.findViewById(R.id.ivImage)
    }
}