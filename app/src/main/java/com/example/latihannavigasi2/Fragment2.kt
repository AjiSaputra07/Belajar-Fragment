package com.example.latihannavigasi2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.latihannavigasi2.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    private lateinit var binding : Fragment2Binding
    // Menyimapkan argument
    val args: Fragment2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) : View? {
        // Inflate the layout for this fragment
        binding = Fragment2Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Memberikan aksi pada btnToFragment1
        binding.btnToFragment1.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment2_to_fragment1)
        }
        // Memberikan aksi pada btnToFragment3
        binding.btnToFragment3.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment2_to_fragment3)
        }
    }
}