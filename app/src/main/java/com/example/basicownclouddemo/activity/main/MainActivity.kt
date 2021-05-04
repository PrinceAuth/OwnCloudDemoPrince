package com.example.basicownclouddemo.activity.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.basicownclouddemo.R

class MainActivity : AppCompatActivity() {
    private var viewModel: MainViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = MainViewModel()
        viewModel?.setCloud(this)
    }
}