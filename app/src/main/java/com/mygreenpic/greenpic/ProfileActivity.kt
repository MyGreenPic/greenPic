package com.mygreenpic.greenpic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.profile_main.*

class ProfileActivity : AppCompatActivity() {
    var colorCode: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_main)

        toolbar.title = ("프로필")
        setSupportActionBar(toolbar)

        appbar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, i ->

            colorCode = -i
            if (colorCode > 255) colorCode = 255

            toolbar.background.alpha = colorCode
            toolbar.alpha = colorCode / 256f

        })
    }
}