package com.tia.blogf

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    lateinit var count :MutableLiveData<Int>

    fun increment(){
        count.value = 2
    }

}