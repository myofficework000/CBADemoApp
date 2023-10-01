package com.example.cbaappdemo.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cbaappdemo.data.dto.CBADataModel
import com.example.cbaappdemo.data.network.IRepository

@HiltViewModel
class CBADataViewModel(private val repository: IRepository) : ViewModel() {

    private val dataFromNetwork = MutableLiveData<CBADataModel>()
    val _dataFromNetwork: LiveData<CBADataModel> = dataFromNetwork

    init {
        fetchDataFromNetwork()
    }

    private fun fetchDataFromNetwork() {

    }
}