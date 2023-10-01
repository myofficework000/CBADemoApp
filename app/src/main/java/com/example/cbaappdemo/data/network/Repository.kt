package com.example.cbaappdemo.data.network

import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) : IRepository {

    override suspend fun fetchData() = apiService.getData()
}