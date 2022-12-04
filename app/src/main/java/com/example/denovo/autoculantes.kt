package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.autoculantes.*
import kotlinx.android.synthetic.main.pin.*

class autoculantes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.autoculantes)

        bkauto.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homeauto.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x31.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x31")
            startActivity(intent)
        }

        x32.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x32")
            startActivity(intent)
        }

        x33.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x33")
            startActivity(intent)
        }

        x34.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x34")
            startActivity(intent)
        }

        x35.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x35")
            startActivity(intent)
        }

        x36.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x36")
            startActivity(intent)
        }

    }
}
