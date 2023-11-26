package com.devmo.appssquaretask.domain.uae_case

import com.devmo.appssquaretask.domain.model.Item
import com.devmo.appssquaretask.domain.repo.ItemsRepo

class GetItem(private val repo: ItemsRepo) {
    operator fun invoke(id: Int): Item {
        return repo.getItemById(id)
    }
}