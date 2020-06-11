package com.mygreenpic.greenpic

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 */
class MarketFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_market, container, false)

        val button = findViewById(R.id.imageButton);

        button.setOnClickListener {
            val intent = Intent(this, Market2::class.java)
        }

        val button = findViewById(R.id.imageButton_noti);

        button.setOnClickListener {
            val intent = Intent(this, NotiActivity::class.java)
        }
    }

    fun

}
