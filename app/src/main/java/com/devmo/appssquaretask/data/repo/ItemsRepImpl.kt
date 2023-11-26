package com.devmo.appssquaretask.data.repo

import com.devmo.appssquaretask.domain.model.Item
import com.devmo.appssquaretask.domain.repo.ItemsRepo

class ItemsRepImpl: ItemsRepo {
    override fun getItems(): List<Item> {
        return Item.items
    }

    override fun getItemById(id: Int): Item {
        return Item.items[id] // usually we d a query on the database
    }

}