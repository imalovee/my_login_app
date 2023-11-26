package com.example.mylogin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class AccountActivity : AppCompatActivity() {
    private lateinit var signUpButton: Button
    private lateinit var usernameEdit: EditText
    private lateinit var emailIdEdit: EditText
    private lateinit var passwordEdit: EditText
    var message = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        signUpButton = findViewById(R.id.sign_up)
        usernameEdit = findViewById(R.id.username_id)
        emailIdEdit = findViewById(R.id.email_id)
        passwordEdit = findViewById(R.id.password_id)

        signUpButton.setOnClickListener {
            if (isInputValid()) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                message = "Input all your details"
            }

            Snackbar.make( findViewById( R.id.layout_singup), message, Snackbar.LENGTH_LONG).show()
        }



    }

    private fun isInputValid() : Boolean {
        val userName = usernameEdit.text.toString()
        val userEmail = emailIdEdit.text.toString()
        val userPassword = passwordEdit.text.toString()

        return userName.isNotEmpty() && userEmail.isNotEmpty() && userPassword.isNotEmpty()
    }


}