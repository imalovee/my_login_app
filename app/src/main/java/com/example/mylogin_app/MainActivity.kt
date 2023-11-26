package com.example.mylogin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var joinNowButton : Button = findViewById(R.id.join_button)

        joinNowButton.setOnClickListener{
            val intent = Intent(this,LoginActivity::class.java )

            startActivity(intent)
        }
    }
}