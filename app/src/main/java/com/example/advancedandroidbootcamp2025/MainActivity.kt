package com.example.advancedandroidbootcamp2025

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.advancedandroidbootcamp2025.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    internal lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding object
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.button.setOnClickListener {
            greetingText()
        }


    }
}

private fun MainActivity.greetingText() {
    binding.apply { greetingTV.text = "Hi! "+editTextText.text}
    //binding.greetingTV.text = "Hi! "+ binding.editTextText.text


}
