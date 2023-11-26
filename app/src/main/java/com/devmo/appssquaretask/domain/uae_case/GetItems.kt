package com.devmo.appssquaretask.domain.uae_case

import com.devmo.appssquaretask.domain.model.Item
import com.devmo.appssquaretask.domain.repo.ItemsRepo

class GetItems(private val repo:ItemsRepo) {
    operator fun invoke(): List<Item>{
        return repo.getItems()
    }
}