package com.example.advancedandroidbootcamp2025

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.jvm.Throws

class ChallengeViewModelFactory(private val startingTotal : Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChallengeViewModel::class.java)){
            return ChallengeViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")

    }
}