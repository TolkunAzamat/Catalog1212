package com.example.catalog1212.Fragments

import android.os.Bundle
import android.provider.SyncStateContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.catalog1212.Adapters.AdapterGrid
import com.example.catalog1212.Constants
import com.example.catalog1212.databinding.FragmentGridBinding

class GridFragment : Fragment() {
//private var _binding: FragmentGridBinding?=null
private lateinit var binding: FragmentGridBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentGridBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recGrid.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.recGrid.adapter = AdapterGrid(Constants.array, requireActivity())
    }


}