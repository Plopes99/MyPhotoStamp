package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.b.*
import kotlinx.android.synthetic.main.b.btn_back
import kotlinx.android.synthetic.main.c.*
import kotlinx.android.synthetic.main.d.*

class d : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d)


        infz.setOnClickListener {
            startActivity(Intent(this,e::class.java))
            finish()
        }

        tres.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        btn_back.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        cat2.setOnClickListener {
            startActivity(Intent(this,animais::class.java))
            finish()
        }

        cat3.setOnClickListener {
            startActivity(Intent(this,baskket::class.java))
            finish()
        }

        cat4.setOnClickListener {
            startActivity(Intent(this,bebidass::class.java))
            finish()
        }

        cat5.setOnClickListener {
            startActivity(Intent(this,filmes::class.java))
            finish()
        }

        cat6.setOnClickListener {
            startActivity(Intent(this,games::class.java))
            finish()
        }

        cat7.setOnClickListener {
            startActivity(Intent(this,gym::class.java))
            finish()
        }

    }
}
