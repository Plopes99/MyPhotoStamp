package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.canecas.*
import kotlinx.android.synthetic.main.filmes.*

class filmes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.filmes)

        bkfilm.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homefilm.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x71.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x71")
            startActivity(intent)
        }

        x72.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x72")
            startActivity(intent)
        }

        x73.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x73")
            startActivity(intent)
        }

        x74.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x74")
            startActivity(intent)
        }

        x75.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x75")
            startActivity(intent)
        }

        x76.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x76")
            startActivity(intent)
        }

        x77.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x77")
            startActivity(intent)
        }

        x78.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x78")
            startActivity(intent)
        }
    }
}
