package com.android.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SingupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)

        val btnBack = findViewById<Button>(R.id.btn_back)

        fun isValidPassword(etpassword: String): Boolean {
            val regex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,16}$")
            return regex.matches(etpassword)
        }

        btnBack.setOnClickListener {
            val etname = findViewById<EditText>(R.id.et_name)
            val etid = findViewById<EditText>(R.id.et_id)
            val etpassword = findViewById<EditText>(R.id.et_Password)
            val etpassword2 = findViewById<EditText>(R.id.et_Password2)




            if (etname.text.isEmpty()) {
                Toast.makeText(this, "이름을 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (etid.text.isEmpty()) {
                Toast.makeText(this, "아이디를 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (etpassword.text.isEmpty()) {
                Toast.makeText(this, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (etpassword.text.toString() != etpassword2.text.toString()) {
                Toast.makeText(this, "비밀번호가 다릅니다!! 다시 입력해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (!isValidPassword(etpassword.text.toString())) {
                Toast.makeText(
                    this,
                    "비밀번호 형식이 올바르지 않습니다. 특수문자, 대소문자, 숫자의 조합을 사용해주세요",
                    Toast.LENGTH_LONG
                ).show()
                return@setOnClickListener
            } else {
                Toast.makeText(this, "회원가입 성공", Toast.LENGTH_SHORT).show()
            }


            val intent = Intent(this, SignInActivity::class.java).apply {
                putExtra("ID", etid.text.toString())
                putExtra("pw", etpassword.text.toString())

            }

                setResult(RESULT_OK, intent)
                if (!isFinishing) finish()


            }

        }
    }

