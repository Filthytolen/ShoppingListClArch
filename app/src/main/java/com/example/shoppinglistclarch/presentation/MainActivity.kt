package com.example.shoppinglistclarch.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.shoppinglistclarch.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel: MainViewModel by viewModels()
        viewModel.shopList.observe(this) {
            Log.d("MainActivity", it.toString())
        }
        viewModel.getShopList()
    }
}