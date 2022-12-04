package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.baskket.*
import kotlinx.android.synthetic.main.cat.*

class baskket : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baskket)

        bkbk.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homebk.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x41.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x41")
            startActivity(intent)
        }

        x42.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x42")
            startActivity(intent)
        }

        x43.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x43")
            startActivity(intent)
        }

        x44.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x44")
            startActivity(intent)
        }

        x45.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x45")
            startActivity(intent)
        }

        x46.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x46")
            startActivity(intent)
        }

        x47.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x47")
            startActivity(intent)
        }


    }
}
