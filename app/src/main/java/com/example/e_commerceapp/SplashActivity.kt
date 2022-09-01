package com.example.e_commerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  button with intent

        val btn = findViewById<Button>(R.id.button_intent)

        btn.setOnClickListener {
            val try_intent = Intent(this, HomeActivity::class.java)
            startActivity(try_intent)
        }
    }
}


//A view group is an invinsible container of other views
//(child views) and other viewGroups

// view- is a basic building block of UI (user interface)in android

//explicit intent- transitioning is done from one activity to another on the same app.
//implicit intent- one application to another application.