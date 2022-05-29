package com.example.shoppinglistclarch.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglistclarch.R

class ShopItemActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item)
val mode = intent.getStringExtra(EXTRA_SCREEN_MODE)
        Log.d("ShopItemActivity", mode.toString())
    }

    companion object {
        const val EXTRA_SHOP_ITEM_ID = "extra_shop_item_id"
        const val EXTRA_SCREEN_MODE = "extra_mode"
        const val MODE_EDIT = "mode_edit"
        const val MODE_ADD = "mode_add"
    }
}