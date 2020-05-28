package com.mygreenpic.greenpic

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TodayChallengeMain : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.today_challenge_main)

        val button_challenge_sample = findViewById<ImageButton>(R.id.tumbler_button)

        button_challenge_sample.setOnClickListener {
            val intent = Intent(this, TodayChallangeSample::class.java)

            startActivity(intent)
        }
    }
}