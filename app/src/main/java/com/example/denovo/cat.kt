package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.cat.*
import kotlinx.android.synthetic.main.pin.*

class cat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cat)

        almofadass.setOnClickListener {
            startActivity(Intent(this,almofadas::class.java))
            finish()
        }

        bebidaz.setOnClickListener {
            startActivity(Intent(this,bebidass
            ::class.java))
            finish()
        }

        homealmo.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        bkalmo.setOnClickListener {
            startActivity(Intent(this,c::class.java))
            finish()
        }

        animaiss.setOnClickListener {
            startActivity(Intent(this,animais::class.java))
            finish()
        }

        animes.setOnClickListener {
            startActivity(Intent(this,anim::class.java))
            finish()
        }

        autoo.setOnClickListener {
            startActivity(Intent(this,autoculantes::class.java))
            finish()
        }

        bask.setOnClickListener {
            startActivity(Intent(this,baskket::class.java))
            finish()
        }

        caneecas.setOnClickListener {
            startActivity(Intent(this,canecas::class.java))
            finish()
        }

        fillm.setOnClickListener {
            startActivity(Intent(this,filmes::class.java))
            finish()
        }

        gaame.setOnClickListener {
            startActivity(Intent(this,games::class.java))
            finish()
        }

        gyym.setOnClickListener {
            startActivity(Intent(this,gym::class.java))
            finish()
        }

        pinn.setOnClickListener {
            startActivity(Intent(this,pin::class.java))
            finish()
        }



    }
}
