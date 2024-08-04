package com.example.viewmodelbasics

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(val counter:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(counter) as T
    }
}
//jb bhi humein apne ViewModel mai parameters pass krne hnge to uske liye humein ViewModelFactory lgani pare gi, Factory humse data
//legi aur uske according humein viewModel object bna k degi, so we follow above syntax ko create factory aur is factory ko hum apne
//ViewModelProvider k andr use krte hain, so VMProvider k andr hm factor ka instance use krte hain aur jo bhi data apko pass krna
// h ap yahan pass krdo gy

//Q: why we use viewModelFactory?
// kyu k ye jo ViewModel wale objects hain ye hm khud se nahi bnate, hm log viewModelProvider class ka use krte hain,
// hm usse kehte hain k bhai yelo hamari class iska object bna k dedo
// so wo behind the scenes is factory ka use kre ga in objects ko bnane k liye