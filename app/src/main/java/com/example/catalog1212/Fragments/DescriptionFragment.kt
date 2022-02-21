package com.example.catalog1212.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.catalog1212.Model
import com.example.catalog1212.R
import com.example.catalog1212.databinding.FragmentDescriptionBinding

class DetailFragment : Fragment() {
    private var _binding: FragmentDescriptionBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDescriptionBinding.inflate(inflater, container, false)

        val item = arguments?.getSerializable("KEY") as Model

        Glide.with(requireContext()).load(item.image).into(binding.dimage)
        binding.dntext.text = item.name
        binding.ddtext.text = item.description
        binding.text.text = item.detdescription



        return binding.root
    }
}
