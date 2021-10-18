package com.tia.blogf.viewModel

import androidx.lifecycle.MutableLiveData

class HomeViewModel {
    private val name :MutableLiveData<String> = MutableLiveData()
    private val status :MutableLiveData<String> = MutableLiveData()
}