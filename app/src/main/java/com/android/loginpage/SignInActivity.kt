package com.android.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(intent.hasExtra("ID")) {
            val ID = intent.getStringExtra("ID")
            val idTextView = findViewById<TextView>(R.id.ET_ID)
            idTextView.text = "ID: $ID"
        }

        if(intent.hasExtra("pw")) {
            val pw = intent.getStringExtra("pw")
            val pwTextView = findViewById<TextView>(R.id.ET_Password)
            pwTextView.text = "Password: $pw"
        }

        val signupbtn = findViewById<Button>(R.id.btn_Signup)
        val btnLog = findViewById<Button>(R.id.btn_LogIn)



        btnLog.setOnClickListener {
            val etid = findViewById<EditText>(R.id.ET_ID)
            val etPassword = findViewById<EditText>(R.id.ET_Password)

            if (etid.text.isEmpty()) {
                Toast.makeText(this, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (etPassword.text.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        signupbtn.setOnClickListener {
            val intent = Intent(this, SingupActivity::class.java)
            startActivity(intent)
        }
    }
}