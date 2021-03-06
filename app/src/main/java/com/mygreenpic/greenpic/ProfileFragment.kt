package com.mygreenpic.greenpic

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        todaychallenge_button.setOnClickListener {
            val intent = Intent(this.context, TodayChallengeMain::class.java)

            startActivity(intent)
        }

        shopping_button.setOnClickListener {
            val intent = Intent(this.context, MarketFragment::class.java)

            startActivity(intent)
        }

        communication_button.setOnClickListener {
            val intent = Intent(this.context, CommunicationActivity::class.java)

            startActivity(intent)
        }
    }



    }





