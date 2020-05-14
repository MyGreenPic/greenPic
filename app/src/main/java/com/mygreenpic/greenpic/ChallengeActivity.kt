package com.mygreenpic.greenpic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.profile_main.*

class ChallengeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.today_challenge_main)
        toolbar.title = ("Today's Challenge")
    }
}
