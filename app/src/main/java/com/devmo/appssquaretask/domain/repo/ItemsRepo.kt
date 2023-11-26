package com.devmo.appssquaretask.domain.repo

import com.devmo.appssquaretask.domain.model.Item

interface ItemsRepo {
    fun getItems(): List<Item>
    fun getItemById(id:Int): Item
}