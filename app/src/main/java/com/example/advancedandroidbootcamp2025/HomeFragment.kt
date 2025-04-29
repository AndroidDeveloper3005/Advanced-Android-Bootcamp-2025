package com.example.advancedandroidbootcamp2025

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.advancedandroidbootcamp2025.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.submitBtn.setOnClickListener {
            //transfer data between destinations
            var inputData = binding.editTextText.text.toString()
            if (!TextUtils.isEmpty(inputData)) {
                val bundle = bundleOf("user_data" to inputData)
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)

            }else{
                Toast.makeText(context, "Please enter input>>>", Toast.LENGTH_SHORT).show()
            }

        }

        return binding.root
    }



}