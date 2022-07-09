package com.example.haircutremainder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.haircutremainder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnCount.setOnClickListener {
            binding.tvCount.text = count++.toString()
        }

        binding.btnDownloadUserData.setOnClickListener {
            downloadUserData()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun downloadUserData() {
        for (i in 1..20000) {
            Log.d("MyTag", "Downloading user $i in ${Thread.currentThread().name}")
        }
    }
}