package com.example.cbaappdemo.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cbaappdemo.R
import com.example.cbaappdemo.databinding.ActivityDisplayListBinding

class DisplayListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDisplayListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        with(binding){
            recyclerView.layoutManager = LinearLayoutManager(this@DisplayListActivity)
        }
    }
}