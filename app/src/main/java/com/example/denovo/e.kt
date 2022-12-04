package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.b.*
import kotlinx.android.synthetic.main.e.*
import kotlinx.android.synthetic.main.forum1.*

class e : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.e)

        bke.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        homee.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        sig.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

    }
}
