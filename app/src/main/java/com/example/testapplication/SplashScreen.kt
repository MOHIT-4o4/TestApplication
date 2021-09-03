package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplication.ui.login.LoginActivity
import android.os.Handler as Handler1

@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_splash_screen))
        supportActionBar?.hide()
        WindowManager.LayoutParams.FLAG_FULLSCREEN

        Handler1().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }


}


