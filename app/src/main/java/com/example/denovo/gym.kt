package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.games.*
import kotlinx.android.synthetic.main.gym.*

class gym : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gym)

        bkgym.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homegym.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x91.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x91")
            startActivity(intent)
        }

        x92.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x92")
            startActivity(intent)
        }

        x93.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x93")
            startActivity(intent)
        }

        x94.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x94")
            startActivity(intent)
        }

        x95.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x95")
            startActivity(intent)
        }

        x96.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x96")
            startActivity(intent)
        }

        x97.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x97")
            startActivity(intent)
        }
    }
}
