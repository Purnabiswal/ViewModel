package com.example.learningviewmodel

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.learningviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //change1

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        myViewModel= ViewModelProvider(this).get(MyViewModel::class.java)

        binding.textViewCounter.text=myViewModel.getInitialCountr().toString()
        binding.buttonIncrement.setOnClickListener {
            binding.textViewCounter.text=myViewModel.getUpdatedCounter().toString()
        }
    }
}