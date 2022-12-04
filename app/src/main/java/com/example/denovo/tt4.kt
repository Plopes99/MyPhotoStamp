package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tt2.*
import kotlinx.android.synthetic.main.tt4.*

class tt4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tt4)

        sg4.setOnClickListener {
            startActivity(Intent(this,tt5::class.java))
            finish()
        }
    }
}
