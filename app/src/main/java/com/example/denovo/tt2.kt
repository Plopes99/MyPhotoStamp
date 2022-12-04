package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tt.*
import kotlinx.android.synthetic.main.tt2.*

class tt2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tt2)

        sg1.setOnClickListener {
            startActivity(Intent(this,tt3::class.java))
            finish()
        }
    }
}
