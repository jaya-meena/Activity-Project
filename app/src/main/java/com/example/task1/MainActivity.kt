package com.example.task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("Activity a", "on create")

    }

    fun openActivity2(view: View) {
        val intent= Intent(this, Activityb::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity a", "on start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity a", "on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity a", "on pause")
        name= findViewById<EditText>(R.id.editTextTextPersonName).editableText.toString()
        Toast.makeText(this@MainActivity, "$name", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity a", "on stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("Activity a", "on restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity a", "on destroy")
    }

}