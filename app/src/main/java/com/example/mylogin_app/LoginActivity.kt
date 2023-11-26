package com.example.mylogin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val newButton : Button = findViewById(R.id.Account_button)

        newButton.setOnClickListener{
            val intent = Intent(this, AccountActivity::class.java )

            startActivity(intent)
        }

        val passwordButton : Button = findViewById(R.id.forgot_password)

        passwordButton.setOnClickListener{
            val intent = Intent(this, ForgotPasswordActivity::class.java)

            startActivity(intent)
        }

        val loginButton : Button = findViewById(R.id.login)
        val usernameEdit : EditText = findViewById(R.id.username)
        val passwordEdit : EditText = findViewById(R.id.pass_word)

        loginButton.setOnClickListener {
            val usernameEntered : String = usernameEdit.text.toString()
            val passwordEntered : String = passwordEdit.text.toString()
            var message = "";

            if(usernameEntered.isEmpty() || passwordEntered.isEmpty()  ){
                message = "You need to enter your details"
            } else{
                startHomeActivity()
            }

            Snackbar.make( findViewById( R.id.layout_login), message, Snackbar.LENGTH_LONG).show()
        }

    }

    private fun startHomeActivity(){
        val intent = Intent(this, HomeActivity::class.java )

        startActivity(intent)
    }
}


