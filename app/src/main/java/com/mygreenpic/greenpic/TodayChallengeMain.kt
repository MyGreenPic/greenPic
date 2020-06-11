package com.mygreenpic.greenpic

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.today_challenge_main.*

class TodayChallengeMain : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.today_challenge_main)

        tumbler_button.setOnClickListener {
            val intent = Intent(this, TodayChallengeSample::class.java)

            startActivity(intent)
        }
    }
}