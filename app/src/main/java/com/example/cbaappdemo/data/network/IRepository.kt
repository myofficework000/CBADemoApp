package com.example.cbaappdemo.data.network

import com.example.cbaappdemo.data.dto.CBADataModel
import retrofit2.Response

interface IRepository {
    suspend fun fetchData(): Response<CBADataModel>
}