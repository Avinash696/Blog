package com.tia.blogf.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel :ViewModel(){
     val name :MutableLiveData<String> = MutableLiveData()
    private val status :MutableLiveData<String> = MutableLiveData()

    fun updateText(){
         name.value="New Name"
    }
}