package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.games.*
import kotlinx.android.synthetic.main.pin.*

class pin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pin)

        bkpin.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homepin.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        m1.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m1")
            startActivity(intent)
        }

        m2.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m2")
            startActivity(intent)
        }

        m3.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m3")
            startActivity(intent)
        }

        m4.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m4")
            startActivity(intent)
        }

        m5.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m5")
            startActivity(intent)
        }

        m6.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m6")
            startActivity(intent)
        }

        m7.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m7")
            startActivity(intent)
        }

        m8.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m8")
            startActivity(intent)
        }

        m9.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m9")
            startActivity(intent)
        }

        m10.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "m10")
            startActivity(intent)
        }
    }
}
