package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.denovo.Cart.CartActivity
import kotlinx.android.synthetic.main.c.*


class c : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c)

        catte.setOnClickListener {
            startActivity(Intent(this,cat::class.java))
            finish()
        }


        button6.setOnClickListener {
            startActivity(Intent(this,d::class.java))
            finish()
        }

        inf.setOnClickListener {
            startActivity(Intent(this,ShopActivity::class.java))
            finish()
        }

        button7.setOnClickListener {
            startActivity(Intent(this,tt::class.java))
            finish()
        }

        button3.setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
            finish()
        }


        forum.setOnClickListener {
            startActivity(Intent(this,forum1::class.java))
            finish()
        }

    }
}
