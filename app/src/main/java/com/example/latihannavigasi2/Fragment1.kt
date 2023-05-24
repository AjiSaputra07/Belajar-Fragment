package com.example.latihannavigasi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihannavigasi2.databinding.Fragment1Binding


class Fragment1 : Fragment() {

    private lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Memberikan aksi pada btnToFragment2
        binding.btnToFragment2.setOnClickListener {
            val action = Fragment1Directions.actionFragment1ToFragment2("Aji Saputra")
            this.findNavController()
                .navigate(action)
        }
        // Memberikan aksi pada btnToFragment3
        binding.btnToFragment3.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment1_to_fragment3)
        }
    }
}