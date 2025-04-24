package com.example.advancedandroidbootcamp2025

import androidx.lifecycle.ViewModel

class ChallengeViewModel(startingTotal : Int ) : ViewModel() {

    private var total = 0

    init {
        total = startingTotal
    }



    fun getTotal() : Int{
        return total
    }

    fun setTotal(input : Int){

        total = total + input
    }

}