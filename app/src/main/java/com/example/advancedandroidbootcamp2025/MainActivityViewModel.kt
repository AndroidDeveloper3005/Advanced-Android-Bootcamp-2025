package com.example.advancedandroidbootcamp2025

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private var count = 0

    fun getCurrentCount(): Int{
        return count
    }

    fun getUpdateCount(): Int{
        return count++
    }


}