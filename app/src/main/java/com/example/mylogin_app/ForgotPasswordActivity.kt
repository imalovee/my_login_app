package com.example.mylogin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)


        val loginText : TextView = findViewById(R.id.header5)

        loginText.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            startActivity(intent)
        }

        val sendButton : Button = findViewById(R.id.send)
        val userEmail : EditText = findViewById(R.id.email)


        sendButton.setOnClickListener {
            val emailEntered : String = userEmail.text.toString()
            var message = "";
            if (emailEntered.isEmpty()) {
                message =  "Enter your email address"
            } else {
                message = "An email has been sent to you"
            }

            Snackbar.make(
                this, findViewById(
                    R.id.layout1), message, Snackbar.LENGTH_LONG).show()

        }


    }
}