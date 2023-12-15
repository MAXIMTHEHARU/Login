package com.android.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSave = findViewById<Button>(R.id.btn_save)
        val sendName = findViewById<EditText>(R.id. answer_name)
        val sendMBTI = findViewById<EditText>(R.id.answer_MBTI)
        val sendMusic = findViewById<EditText>(R.id.answer_music)
        val sendGender = findViewById<EditText>(R.id.answer_gender)
        val sendMotto = findViewById<EditText>(R.id.answer_motto)
        val sendBirthday = findViewById<EditText>(R.id.answer_birthday)
        val sendMovie= findViewById<EditText>(R.id.answer_movie)
        val sendCountry = findViewById<EditText>(R.id.answer_country)
        val sendFood = findViewById<EditText>(R.id.answer_food)
        val sendAge = findViewById<EditText>(R.id.answer_age)

        fun isValidMbti(sendMBTI: String): Boolean {
            val regex2 = Regex("^[IN][NS][FT][PJ]$")
            return regex2.matches(sendMBTI)
        }


        btnSave.setOnClickListener {

            if(!isValidMbti(sendMBTI.text.toString())) {
                Toast.makeText(this, "E/I, N/S, T/F, J/P 의 조합으로 작성해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }




            val name = sendName.text.toString()
            val mbti = sendMBTI.text.toString()
            val music = sendMusic.text.toString()
            val gender = sendGender.text.toString()
            val motto = sendMotto.text.toString()
            val birthday = sendBirthday.text.toString()
            val movie = sendMovie.text.toString()
            val country = sendCountry.text.toString()
            val food = sendFood.text.toString()
            val age = sendAge.text.toString()
            val intent = Intent(this, Home2Activity::class.java)
            intent.putExtra("music", music)
            intent.putExtra("gender", gender)
            intent.putExtra("motto", motto)
            intent.putExtra("name", name)
            intent.putExtra("mbti", mbti)
            intent.putExtra("birthday", birthday)
            intent.putExtra("movie", movie)
            intent.putExtra("country", country)
            intent.putExtra("food", food)
            intent.putExtra("age", age)

            startActivity(intent)
        }
    }
}