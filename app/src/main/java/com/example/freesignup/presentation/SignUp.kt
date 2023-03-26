package com.example.freesignup.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.freesignup.databinding.SignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: SignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        credentialCheck()
    }

    private fun credentialCheck() {
        binding.verifyBt.setOnClickListener {
            if(binding.userNameEt.text.isNotEmpty() && binding.passwordEt.text.isNotEmpty() && binding.emailEt.text.isNotEmpty()){
                val emailAddress = binding.emailEt.text.toString()
                val standardAddress = "@gmail.com"
                if(emailAddress.contains(standardAddress)){
                    val intent = Intent(this, Welcome::class.java).apply {
                        putExtra("username",binding.userNameEt.text.toString())
                    }
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this,"Please enter valid emailID",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Please fill all fieldsD",Toast.LENGTH_SHORT).show()
            }

        }
    }

}