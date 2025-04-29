package com.example.advancedandroidbootcamp2025

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.advancedandroidbootcamp2025.databinding.ActivityNaactivityBinding

class NAActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNaactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_naactivity)


    }
}