package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_sign_up
import kotlinx.android.synthetic.main.activity_main.tv_password
import kotlinx.android.synthetic.main.activity_main.tv_username
import kotlinx.android.synthetic.main.b.*
import java.util.regex.Pattern

class b : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.b)
        auth = FirebaseAuth.getInstance()

        btn_sign_up.setOnClickListener {
            signUpUser()

        }

        btn_back.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }


   private fun signUpUser(){
        if(tv_username.text.toString().isEmpty()){
            tv_username.error = "Please enter email"
            tv_username.requestFocus()
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(tv_username.text.toString()).matches()){
            tv_username.error = "Please enter a valid email"
            tv_username.requestFocus()
            return
        }

        if(tv_password.text.toString().isEmpty()){
            tv_password.error = "Please enter password"
            tv_password.requestFocus()
            return
        }

       auth.createUserWithEmailAndPassword(tv_username.text.toString(), tv_password.text.toString())
           .addOnCompleteListener(this) { task ->
               if (task.isSuccessful) {
                   val user = auth.currentUser
                   user!!.sendEmailVerification()
                       .addOnCompleteListener { task ->
                           if (task.isSuccessful) {startActivity(Intent(this,MainActivity::class.java))
                               finish()
                           }
                       }

               } else {
                   Toast.makeText(baseContext, "Sign Up failed.",
                       Toast.LENGTH_SHORT).show()

               }


           }
    }
}
