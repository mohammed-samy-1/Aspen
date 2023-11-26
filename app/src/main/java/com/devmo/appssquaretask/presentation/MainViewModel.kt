package com.devmo.appssquaretask.presentation

import androidx.lifecycle.ViewModel
import com.devmo.appssquaretask.data.repo.ItemsRepImpl
import com.devmo.appssquaretask.domain.model.Item
import com.devmo.appssquaretask.domain.uae_case.GetItem
import com.devmo.appssquaretask.domain.uae_case.GetItems

class MainViewModel : ViewModel() {
    private val getItems: GetItems = GetItems(ItemsRepImpl()) // usually should be passed via di
    private val getItem = GetItem(ItemsRepImpl()) // usually should be passed via di

    fun getItems(): List<Item> {
        return getItems.invoke()
    }

    fun getItem(id: Int): Item {
        return getItem.invoke(id)
    }
}