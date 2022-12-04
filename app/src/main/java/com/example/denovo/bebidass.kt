package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.baskket.*
import kotlinx.android.synthetic.main.bebidass.*

class bebidass : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bebidass)

        bkbeb.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homebeb.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x51.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x51")
            startActivity(intent)
        }

        x52.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x52")
            startActivity(intent)
        }

        x53.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x53")
            startActivity(intent)
        }

        x54.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x54")
            startActivity(intent)
        }

        x55.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x55")
            startActivity(intent)
        }

        x56.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x56")
            startActivity(intent)
        }
    }
}
