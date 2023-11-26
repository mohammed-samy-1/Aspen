package com.devmo.appssquaretask.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.devmo.appssquaretask.R
import com.devmo.appssquaretask.databinding.FragmentSpashBinding
import com.devmo.appssquaretask.presentation.MainViewModel


class SplashFragment : Fragment() {
    val binding by lazy{ FragmentSpashBinding.inflate(layoutInflater) }
    val viewModel by viewModels<MainViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding.materialButton.setOnClickListener {
            findNavController().navigate(R.id.action_spashFragment_to_loginFragment)
        }
        return binding.root
    }

}