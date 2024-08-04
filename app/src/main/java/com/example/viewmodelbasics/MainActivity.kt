package com.example.viewmodelbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelbasics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var textCounter:TextView
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this,ViewModelFactory(20)).get(MainViewModel::class.java)
        textCounter = findViewById(R.id.tv_Count)
        //yahan setText k fun k isliye call kiya h jb screen rotation hogi to jo viewModel class ne data hold kiya h wo
        //view ko usi state mai pass krde ga onCreate mai so view user ko 0 ki bjae wo value show krwaye ga jo screen rotation k waqt thi
        setText()

        binding.btnCounter.setOnClickListener {
            increment()
        }

    }
    fun setText(){
        textCounter.text = mainViewModel.count.toString()
    }
    fun increment(){
        mainViewModel.increment()
        //yahan py increment hone k baad jo next value thi wo user ko show hogi
        setText()

    }
}