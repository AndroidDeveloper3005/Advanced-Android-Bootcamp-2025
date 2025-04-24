package com.example.advancedandroidbootcamp2025

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.advancedandroidbootcamp2025.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding object
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding.button.setOnClickListener {
            greetingText()
        }

        binding.countTV.text = viewModel.getCurrentCount().toString()
        binding.clickMeBtn.setOnClickListener {
            binding.countTV.text = viewModel.getUpdateCount().toString()
        }

        binding.nextLayout.setOnClickListener {
            val intent = Intent(this, ViewModelChallenceActivity::class.java)
            startActivity(intent)
        }


    }

    private fun greetingText() {
        binding.apply { greetingTV.text = "Hi! "+editTextText.text}
        //binding.greetingTV.text = "Hi! "+ binding.editTextText.text

    }
}


