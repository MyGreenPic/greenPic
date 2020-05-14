package com.mygreenpic.greenpic

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.profile_main.*
import kotlinx.android.synthetic.main.profile_main.view.*

class ProfileActivity : AppCompatActivity() {
    var colorCode: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_main)
        toolbar.title = ("Profile")

       /* val images = listOf(
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = "Tab ${position +1}"
        }.attach()

          tabLayout.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@ProfileActivity, "Reselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@ProfileActivity, "Unselected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@ProfileActivity, "Selected ${tab?.text}", Toast.LENGTH_SHORT).show()
            }
        })*/



    }
}