package com.android.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signupbtn = findViewById<Button>(R.id.btn_Signup)
        val btnLog = findViewById<Button>(R.id.btn_LogIn)
        val Etid = findViewById<EditText>(R.id.ET_ID)
        val EtPassword = findViewById<EditText>(R.id.ET_Password)

        signupbtn.setOnClickListener {
            val intent = Intent(this, SingupActivity::class.java)
            startActivity(intent)
        }





    }
}