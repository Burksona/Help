package com.example.kargiaplikacia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        register_button_registration.setOnClickListener {
            val email = email_edittext_registration.text.toString()
            val password = password_edittext_registration.text.toString()


            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please enter email and password ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }

            mrgvali_fotos_archeva_gilaki.setOnClickListener {
                Log.d("MaincActivity", "Try to show photo selector")

                val intent = Intent(Intent.ACTION_PICK)
                intent.type = "image/*"

                startActivityForResult(intent, 0)








                Log.d("MainActivity", "Email is:" + email)
                Log.d("MainActivity", "Password: $password")


                //momxmareblis shekmna Firebaseshiiii


                FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener {
                        //!  ara aris

                        if (!it.isSuccessful) return@addOnCompleteListener

                        //tu magradaa yvelaferi
                        val d =
                            Log.d("Main", "Successfully created user with uid: ")





                    }





            }


            already_have_account_text_view.setOnClickListener{
                Log.d("MainActivity","Try to show login activity")

                //login activitize gadasvla ramenairad
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)








            }
            val intent = Intent(this, Dalsheraxdeba::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)


        }

    }

}
