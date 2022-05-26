package com.example.shoppinglistclarch.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglistclarch.data.ShopListRepositoryImpl
import com.example.shoppinglistclarch.data.ShopListRepositoryImpl.getShopList
import com.example.shoppinglistclarch.domain.DeleteShopItemUseCase
import com.example.shoppinglistclarch.domain.EditShopItemUseCase
import com.example.shoppinglistclarch.domain.GetShopListUseCase
import com.example.shoppinglistclarch.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl //I know it's wrong but idk dagger

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}