package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.animais.*
import kotlinx.android.synthetic.main.pin.*

class animais : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animais)

        bkani.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homeani.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }


        x21.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x21")
            startActivity(intent)
        }

        x22.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x22")
            startActivity(intent)
        }

        x23.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x23")
            startActivity(intent)
        }

        x24.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x24")
            startActivity(intent)
        }

        x25.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x25")
            startActivity(intent)
        }

        x26.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x26")
            startActivity(intent)
        }

        x27.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x27")
            startActivity(intent)
        }

    }
}
