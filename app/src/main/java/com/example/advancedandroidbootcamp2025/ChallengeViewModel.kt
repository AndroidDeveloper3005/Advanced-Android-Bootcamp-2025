package com.example.advancedandroidbootcamp2025

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChallengeViewModel(startingTotal : Int ) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
        get() = total

    init {
        total.value = startingTotal
    }


    fun setTotal(input : Int){

        total.value = (total.value)?.plus(input)
    }

}