package com.example.learningviewmodel

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private var counter = 0

    fun getInitialCountr(): Int {
        return counter
    }

    fun getUpdatedCounter(): Int {
        return ++counter
    }
}