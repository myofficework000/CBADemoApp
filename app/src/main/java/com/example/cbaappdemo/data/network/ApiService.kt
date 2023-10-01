package com.example.cbaappdemo.data.network

import com.example.cbaappdemo.data.dto.CBADataModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("endpoint")
    suspend fun getData(): Response<CBADataModel>
}