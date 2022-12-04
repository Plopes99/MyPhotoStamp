package com.example.denovo

import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.product_details.*
import kotlinx.android.synthetic.main.product_details.photo
import kotlinx.android.synthetic.main.product_row.*
import repository.ProductRepository

class ProductDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.product_details)

        val title = intent.getStringExtra("title")


        val product = ProductRepository().getProductByName(title)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                product_name.text = it.title
                Picasso.get().load(it.photoUrl).into(photo)
                thePriceOfProduct.text = "${it.price}€"
            },{})


        addToCartButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("$title não se encontra disponivel de momento")
                .setPositiveButton("OK") { dialog, which -> }
                .create()
                .show()
        }



        availability.setOnClickListener{
            AlertDialog.Builder(this)
                .setMessage("$title fora de stock!")
                .setPositiveButton("OK") { dialog, which -> }
                .create()
                .show()
        }
    }

}