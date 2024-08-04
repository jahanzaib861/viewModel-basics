package com.example.viewmodelbasics

import androidx.lifecycle.ViewModel

class MainViewModel(val initializeValue:Int):ViewModel() {

    var count:Int = initializeValue

    fun increment(){
        count++
    }
}