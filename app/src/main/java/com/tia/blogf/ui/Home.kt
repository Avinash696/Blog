package com.tia.blogf.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.tia.blogf.R
import com.tia.blogf.databinding.ActivityHomeBinding
import com.tia.blogf.viewModel.HomeViewModel

class Home : AppCompatActivity() {
    lateinit var bindingHome :ActivityHomeBinding
    lateinit var homeViewModel :HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingHome=DataBindingUtil.setContentView(this,R.layout.activity_home)
        homeViewModel =ViewModelProvider(this).get(HomeViewModel::class.java)

        bindingHome.viewModel=homeViewModel
        bindingHome.lifecycleOwner=this

    }
}