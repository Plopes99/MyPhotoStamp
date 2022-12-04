package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.canecas.*
import kotlinx.android.synthetic.main.games.*

class games : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.games)

        bkgm.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homegm.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x81.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x81")
            startActivity(intent)
        }

        x82.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x82")
            startActivity(intent)
        }

        x83.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x83")
            startActivity(intent)
        }

        x84.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x84")
            startActivity(intent)
        }

        x85.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x85")
            startActivity(intent)
        }

        x86.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x86")
            startActivity(intent)
        }

        x87.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x87")
            startActivity(intent)
        }

    }
}
