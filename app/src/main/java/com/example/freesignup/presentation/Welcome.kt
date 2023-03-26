package com.example.freesignup.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freesignup.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //intent
        val userName = intent.getStringExtra("username")
        setUpUI(userName)
    }

    private fun setUpUI(userName: String?) {
        binding.welcomeTv.text = "Welcome ${userName!!}"
    }
}