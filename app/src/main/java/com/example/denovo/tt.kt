package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.c.*
import kotlinx.android.synthetic.main.tt.*

class tt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tt)

        sim.setOnClickListener {
            startActivity(Intent(this,tt2::class.java))
            finish()
        }

        nao.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }
    }
}
