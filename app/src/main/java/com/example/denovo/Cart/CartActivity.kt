package com.example.denovo.Cart

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.denovo.R
import kotlinx.android.synthetic.main.activity_cart.*
import kotlinx.android.synthetic.main.product_details.*

class CartActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        Submit.setOnClickListener{
            AlertDialog.Builder(this)
                .setMessage("Adicione itens ao carrinho")
                .setPositiveButton("OK") { dialog, which -> }
                .create()
                .show()
        }

    }
}
