package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Activityb : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activityb)
        Log.e("Activity b", "on create")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity b", "on start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity b", "on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity b", "on pause")
        finish()
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity b", "on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity b", "on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity b", "on destroy")
    }

    fun openActivity1(view: View) {
        finish()
       // val intent= Intent(this, MainActivity::class.java)
        //startActivity(intent)
    }
}