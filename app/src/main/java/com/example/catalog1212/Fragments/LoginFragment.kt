package com.example.catalog1212.Fragments

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.catalog1212.HomeActivity
import com.example.catalog1212.R
import com.example.catalog1212.databinding.FragmentLoginBinding
import com.example.catalog1212.services.SharedPreference

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val sharedPref = context?.let { SharedPreference(it) }
//        if(!sharedPref?.login.isNullOrBlank() && !sharedPref?.password.isNullOrBlank()){
//            startActivity(Intent(requireActivity(), HomeActivity::class.java))
//            }
        _binding = FragmentLoginBinding.inflate(inflater, container, false)


        binding.btn.setOnClickListener {
            sharedPref?.login = binding.login.text.toString()
            sharedPref?.password = binding.password.text.toString()
            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        return binding.root
    }

}