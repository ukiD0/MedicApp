package com.example.test.SplashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.test.R
import com.example.test.ViewPage.StartViewPager

class mysplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mysplash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, StartViewPager::class.java))
            finish()
        }, 2500)
    }
}