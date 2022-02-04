package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log

class SplashScreenActivity : AppCompatActivity() {

    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this, MainActivity:: class.java)
                startActivity(intent)
                finish()
            },5000) // 5 seconds delay
    }

    override fun onStart() {
        super.onStart()
        Log.e("Splash", "on start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Splash", "on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Splash", "on pause")
        finish()
    }

    override fun onStop() {
        super.onStop()
        Log.e("Splash", "on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Splash", "on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Splash", "on destroy")
    }

}