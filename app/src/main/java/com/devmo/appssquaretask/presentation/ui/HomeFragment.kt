package com.devmo.appssquaretask.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.devmo.appssquaretask.R
import com.devmo.appssquaretask.databinding.FragmentHomeBinding
import com.devmo.appssquaretask.presentation.MainViewModel
import com.devmo.appssquaretask.presentation.adapter.ItemsAdapter


class HomeFragment : Fragment() {
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel by viewModels<MainViewModel>()
        val adapter = ItemsAdapter {
            val bundle = Bundle()
            bundle.putInt("ITEM_ID", it.id)
            findNavController().navigate(
                R.id.action_homeFragment_to_detailsFragment,
                bundle
            )
        }.apply {
            submitList(viewModel.getItems())
        }
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            this.adapter = adapter
        }

        return binding.root
    }


}