package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.room.Room
import com.example.denovo.database.AppDatabase
import com.example.denovo.database.CartModel
import com.example.denovo.database.ProductFromDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()

        btn_sign_up.setOnClickListener {
            startActivity(Intent(this,b::class.java))
            finish()
        }

        btn_log_in.setOnClickListener {
            doLogin()
        }
        doAsync {
            val db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java, "com.example.denovo.database-name"
            ).build()

            db.productDao().insertAll(ProductFromDatabase(null, "Almofada", 10.99))
            val products = db.productDao().getAll()

            val cart = db.cartDao()
            cart.insertAll(CartModel(null, "Test product", 12.99, 3))

            val allCartItems = cart.getAll()

            uiThread {

                allCartItems.forEach {

                }

            }

        }

    }


    private fun doLogin(){
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

        auth.signInWithEmailAndPassword(tv_username.text.toString(), tv_password.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    updateUI(user)
                } else {

                    updateUI(null)
                }

            }


    }



    private fun updateUI(currentUser: FirebaseUser?){

        if(currentUser !=null){
            if(currentUser.isEmailVerified){
            startActivity(Intent(this,c::class.java))
            }else{
                Toast.makeText(
                    baseContext, "Please verify your email address.",
                    Toast.LENGTH_SHORT
                ).show()

            }
        }else{Toast.makeText(
            baseContext, "Login failed.",
            Toast.LENGTH_SHORT
        ).show()

        }


    }

}
