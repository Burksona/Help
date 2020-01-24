package com.example.kargiaplikacia

import android.app.AppComponentFactory
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)

        loging_button_login.setOnClickListener{
            val email = email_edittext_registration.text.toString()
            val password= password_edittext_registration.text.toString()

            Log.d("Login", "Attempt login with email and password: $email/*** ")

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
              //  .addOnCompleteListener()


        }


        }




    }

