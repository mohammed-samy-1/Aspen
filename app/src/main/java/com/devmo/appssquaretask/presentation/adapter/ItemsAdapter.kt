package com.devmo.appssquaretask.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.devmo.appssquaretask.databinding.ListItemBinding
import com.devmo.appssquaretask.domain.model.Item

class ItemsAdapter(private val onItemClicked: (Item) -> Unit): ListAdapter<Item, ItemsAdapter.ItemViewHolder>(Companion) {


    companion object: DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
            return true // usually we should compare the attributes that can change and effect the ui
        }

    }

    class ItemViewHolder(private val binding: ListItemBinding, private val onItemClicked: (Item) -> Unit): RecyclerView.ViewHolder(binding.root){
        fun bind(item: Item){
            binding.item = item
            binding.imageView4.setImageResource(item.img)
            binding.root.setOnClickListener {
                onItemClicked(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            onItemClicked = onItemClicked
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))

    }
}