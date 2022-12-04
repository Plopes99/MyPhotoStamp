package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.almofadas.*
import kotlinx.android.synthetic.main.bebidass.*
import kotlinx.android.synthetic.main.canecas.*

class canecas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.canecas)

        bkcan.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }

        homecan.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        x61.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x61")
            startActivity(intent)
        }

        x62.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x62")
            startActivity(intent)
        }

        x63.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x63")
            startActivity(intent)
        }

        x64.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x64")
            startActivity(intent)
        }

        x65.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x65")
            startActivity(intent)
        }

        x66.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x66")
            startActivity(intent)
        }

        x67.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x67")
            startActivity(intent)
        }

        x68.setOnClickListener{
            val intent = Intent(this,todos::class.java)
            intent.putExtra("image", "x68")
            startActivity(intent)
        }


    }
}
