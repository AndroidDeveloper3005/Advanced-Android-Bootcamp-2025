package com.example.advancedandroidbootcamp2025

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.advancedandroidbootcamp2025.databinding.ActivityViewModelChallenceBinding


class ViewModelChallenceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelChallenceBinding
    private lateinit var viewModel: ChallengeViewModel
    private lateinit var viewModelFactory: ChallengeViewModelFactory


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_model_challence)
        viewModelFactory = ChallengeViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory)[ChallengeViewModel::class.java]

        //live data
        viewModel.totalData.observe(this, Observer{ it->
            binding.dataTxt.text = it.toString()


        })


        binding.addBtn.setOnClickListener {
            viewModel.setTotal(binding.inputTxt.text.toString().toInt())

        }


    }
}