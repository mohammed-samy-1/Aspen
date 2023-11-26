package com.devmo.appssquaretask.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.devmo.appssquaretask.R
import com.devmo.appssquaretask.databinding.FragmentDetailsBinding
import com.devmo.appssquaretask.presentation.MainViewModel


class DetailsFragment : Fragment() {
    private val binding by lazy { FragmentDetailsBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val id = arguments?.getInt("ITEM_ID")?: -1
        if (id == -1) {
            findNavController().popBackStack()
            Toast.makeText(requireContext(), "something went wrong", Toast.LENGTH_SHORT).show()
        }
        val viewModel by viewModels<MainViewModel>()
        val item = viewModel.getItem(id)
        binding.item = item
        binding.imageView.setImageResource(item.img)
        binding.imgBackD.setOnClickListener{
            findNavController().popBackStack()
        }
        return binding.root
    }

}