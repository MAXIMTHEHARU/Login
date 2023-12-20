package com.android.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Home2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)


        val id2 = intent.getStringExtra("id2")
        val getId2 = findViewById<TextView>(R.id.get_ID2)
        val name = intent.getStringExtra("name")
        val getName = findViewById<TextView>(R.id.get_name)
        val mbti = intent.getStringExtra("mbti")
        val getMbti = findViewById<TextView>(R.id.get_MBTI)
        val music = intent.getStringExtra("music")
        val getMusic = findViewById<TextView>(R.id.get_music)
        val gender = intent.getStringExtra("gender")
        val getGender = findViewById<TextView>(R.id.get_Gender)
        val motto = intent.getStringExtra("motto")
        val getMotto = findViewById<TextView>(R.id.get_motto)
        val birthday = intent.getStringExtra("birthday")
        val getBirthday = findViewById<TextView>(R.id.get_birthday)
        val moive = intent.getStringExtra("movie")
        val getMoive = findViewById<TextView>(R.id.get_movie)
        val country = intent.getStringExtra("country")
        val getCountry = findViewById<TextView>(R.id.get_country)
        val food = intent.getStringExtra("food")
        val getFood = findViewById<TextView>(R.id.get_food)
        val age = intent.getStringExtra("age")
        val getAge = findViewById<TextView>(R.id.get_age)
        getId2.setText(id2)
        getName.setText(name)
        getMbti.setText(mbti)
        getMusic.setText(music)
        getGender.setText(gender)
        getMotto.setText(motto)
        getBirthday.setText(birthday)
        getMoive.setText(moive)
        getCountry.setText(country)
        getFood.setText(food)
        getAge.setText(age)


        //mbti 별 사진, 글 교체//
        val iv_image = findViewById<ImageView>(R.id.img_mbti)
        val iv_image2 = findViewById<ImageView>(R.id.img_mbti2)
        val iv_image3 = findViewById<ImageView>(R.id.img_mbti3)
        val resultText = findViewById<TextView>(R.id.tv_mbti)
        val resultText2 = findViewById<TextView>(R.id.tv_mbti2)

        //팀장님의 피드백으로 다시 만들어봄. fun으로 iv_image.setImageResource가 반복되는 걸 줄이는게 좋을 것 같다
        //fun으로 함수 설정해서 만들면 간결해질 것 같다.
        //when을 더 많이 사용함.
        //확실히 보기 편안해짐. 개쩜. 굳!!
        fun changeImage(imageRes: Int, imageRes2: Int, imageRes3: Int) {
            iv_image.setImageResource(imageRes)
            iv_image2.setImageResource(imageRes2)
            iv_image3.setImageResource(imageRes3)
        }

        fun changeText(text: String, text2: String) {
            resultText.text = text
            resultText2.text = text2
        }

        when (mbti) {
            "INTP" -> {
                changeImage(R.drawable.intp, R.drawable.intp_bill, R.drawable.intp_sorc)
                changeText("아인슈타인", "소크라테스")
            }

            "INTJ" -> {
                changeImage(R.drawable.intj, R.drawable.intj_lii, R.drawable.intj_facebook)
                changeText("일론머스크", "마크 저크 버그")
            }

            "INFP" -> {
                changeImage(R.drawable.infp, R.drawable.infp_joni, R.drawable.infp_jo)
                changeText("조니 뎁", "최고의 배우 조승우!!")
            }

            "INFJ" -> {
                changeImage(R.drawable.infj, R.drawable.infj_mother, R.drawable.infj_king)
                changeText("마더 테레사", "마틴루터 킹")
            }

            "ISTP" -> {
                changeImage(R.drawable.istp_image, R.drawable.istp_bear, R.drawable.istp_tom)
                changeText("베어 그릴스", "톰 크루즈")
            }

            "ISTJ" -> {
                changeImage(
                    R.drawable.isty,
                    R.drawable.istj_edanhok,
                    R.drawable.istj_warrenbuffffit
                )
                changeText("에단 호크", "워렌버핏")
            }

            "ISFJ" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ISFP" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ENFP" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ENFJ" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ENTJ" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ENTP" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ESFP" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ESFJ" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ESTJ" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }

            "ESTP" -> {
                changeImage(R.drawable.isfj, R.drawable.isfj_anseragny, R.drawable.istp_tom)
                changeText("앤서니", "장도연")
            }
        }

//수정전.. else if를 이용해서 하나씩 하나씩 다 사용함.
//        if (mbti == "INTP") {
//            iv_image.setImageResource(R.drawable.intp)
//            iv_image2.setImageResource(R.drawable.intp_bill)
//            iv_image3.setImageResource(R.drawable.intp_sorc)
//            resultText.text = "아인슈타인"
//            resultText2.text = "소크라테스"
//        } else if (mbti == "INTJ") {
//
//            iv_image.setImageResource(R.drawable.intj)
//            iv_image2.setImageResource(R.drawable.intj_facebook)
//            iv_image3.setImageResource(R.drawable.intj_lii)
//            resultText.text = "마크 저크 버그"
//            resultText2.text = "일론 머스크"
//        } else if (mbti == "INFP") {
//            iv_image.setImageResource(R.drawable.infp)
//            iv_image2.setImageResource(R.drawable.infp_jo)
//            iv_image3.setImageResource(R.drawable.infp_joni)
//            resultText.text = "최고의 배우 조승우!!!!"
//            resultText2.text = "조니 뎁"
//        } else if (mbti == "INFJ") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//            //////////여기까지///////////
//        } else if (mbti == "ISTP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ISTJ") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ISFJ") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
        //////////////겁나 많네//////////////
//        } else if (mbti == "ISFP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ISTP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ENFJ") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ENTP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ESTP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ESFP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ESFJ") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ESTJ") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        } else if (mbti == "ESTP") {
//            iv_image.setImageResource(R.drawable.infj)
//            iv_image2.setImageResource(R.drawable.infj_king)
//            iv_image3.setImageResource(R.drawable.infj_mother)
//            resultText.text = "마틴 루터 킹"
//            resultText2.text = "마더 테레사"
//        }


        val btnChange = findViewById<Button>(R.id.btn_change)
        btnChange.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        val btnFinish = findViewById<Button>(R.id.btn_finish)

        btnFinish.setOnClickListener {
            finish()


        }
    }
}
