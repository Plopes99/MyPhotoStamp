package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tt2.*
import kotlinx.android.synthetic.main.tt3.*

class tt3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tt3)

        sg3.setOnClickListener {
            startActivity(Intent(this,tt4::class.java))
            finish()
        }
    }
}
