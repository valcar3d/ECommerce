package com.dimensiva.ecommerce.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dimensiva.ecommerce.R
import com.dimensiva.ecommerce.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}