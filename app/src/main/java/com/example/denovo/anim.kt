package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.anim.*
import kotlinx.android.synthetic.main.pin.*

class anim : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anim)

        bkan.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homean.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x10.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x10")
            startActivity(intent)
        }

        x11.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x11")
            startActivity(intent)
        }

        x12.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x12")
            startActivity(intent)
        }

        x13.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x13")
            startActivity(intent)
        }

        x14.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x14")
            startActivity(intent)
        }

        x15.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x15")
            startActivity(intent)
        }

        x16.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x16")
            startActivity(intent)
        }

        x17.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x17")
            startActivity(intent)
        }

    }
}
