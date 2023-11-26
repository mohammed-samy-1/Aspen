package com.devmo.appssquaretask.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.devmo.appssquaretask.R
import com.devmo.appssquaretask.databinding.FragmentLoginBinding
import com.devmo.appssquaretask.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {
    private lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        binding.materialButtonSignup.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_homeFragment)
        }
        binding.textView4.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.imgBack.setOnClickListener{
            findNavController().popBackStack()
        }
        return binding.root
    }

}