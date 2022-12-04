package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tt2.*
import kotlinx.android.synthetic.main.tt5.*

class tt5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tt5)

        sg5.setOnClickListener {
            startActivity(Intent(this,tt6::class.java))
            finish()
        }
    }
}
