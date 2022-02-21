package com.example.catalog1212

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.catalog1212.Adapters.AdapterLinear
import com.example.catalog1212.databinding.FragmentLinearBinding

class LinearFragment : Fragment() {
//    private var _binding: FragmentLinearBinding? = null
    private lateinit var binding: FragmentLinearBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLinearBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lrecycler.adapter = AdapterLinear(Constants.array, requireActivity())
    }

}