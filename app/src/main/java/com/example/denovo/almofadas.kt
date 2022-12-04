package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.c.*
import kotlinx.android.synthetic.main.cat.*
import kotlinx.android.synthetic.main.forum1.*
import kotlinx.android.synthetic.main.pin.*

class almofadas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.almofadas)

        bkalmof.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homealmof.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()

        }

        x1.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x1")
            startActivity(intent)
        }

        x2.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x2")
            startActivity(intent)
        }

        x3.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x3")
            startActivity(intent)
        }

        x4.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x4")
            startActivity(intent)
        }

        x5.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x5")
            startActivity(intent)
        }

        x6.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x6")
            startActivity(intent)
        }

        x7.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x7")
            startActivity(intent)
        }

        x8.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x8")
            startActivity(intent)
        }

        x9.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x9")
            startActivity(intent)
        }
    }
}
