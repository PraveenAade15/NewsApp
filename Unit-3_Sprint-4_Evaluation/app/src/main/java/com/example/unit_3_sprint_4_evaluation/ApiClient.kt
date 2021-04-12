package com.example.unit_3_sprint_4_evaluation

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiClient {
    @Headers("Accept:application/json")
    @GET("/news?category=politics")
    suspend fun getTask(
        @Header("Content-Type")contentType:String

    ):ResponseModel
}