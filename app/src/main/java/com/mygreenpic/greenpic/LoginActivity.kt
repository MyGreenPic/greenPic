package com.mygreenpic.greenpic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.ClickableSpan

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        ClickableSpan("@+id/login_btn")
    }

    private fun ClickableSpan(s: String) {

    }
}