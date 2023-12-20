package com.android.loginpage

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    private lateinit var activityResultLauncher: ActivityResultLauncher<Intent>
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val signupbtn = findViewById<Button>(R.id.btn_Signup)
        val btnLog = findViewById<Button>(R.id.btn_LogIn)
        val editid = findViewById<EditText>(R.id.ET_ID)
        val editPw = findViewById<EditText>(R.id.ET_Password)



        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode == RESULT_OK) {
                    val receiveID = it.data?.getStringExtra("ID") ?: ""
                    val receivePW = it.data?.getStringExtra("pw") ?: ""

                    editid.setText(receiveID)
                    editPw.setText(receivePW)
                }
            }
        signupbtn.setOnClickListener {
            val intent = Intent(this, SingupActivity::class.java)

            activityResultLauncher.launch(intent)
        }


        btnLog.setOnClickListener {


            if (editid.text.isEmpty()) {
                Toast.makeText(this, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (editPw.text.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else {
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_SHORT).show()
            }

            val etId = editid.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("ID", etId)


            startActivity(intent)
        }
    }
}