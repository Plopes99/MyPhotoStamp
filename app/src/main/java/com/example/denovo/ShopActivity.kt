package com.example.denovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.denovo.database.AppDatabase
import com.example.denovo.database.ProductFromDatabase
import com.google.gson.Gson
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shop.*
import kotlinx.android.synthetic.main.product_row.view.*
import model.Product
import org.jetbrains.anko.activityManager
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import repository.ProductRepository
import java.net.URL

class ShopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        val productRepository = ProductRepository().getAllProducts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("daniel", "success")

                recycler_view.apply {
                    layoutManager = GridLayoutManager(this@ShopActivity, 2)

                    adapter = ProductAdapter(it) { extraTitle, extraImageUrl, photoView ->
                        val intent = Intent(this@ShopActivity, ProductDetails::class.java)
                        intent.putExtra("title", extraTitle)
                        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this@ShopActivity as AppCompatActivity , photoView, "photoToAnimate")
                        startActivity(intent, options.toBundle())


                    }
                }
                progressBar.visibility = View.GONE
            }, {
                Log.d("daniel", "error: ( ${it.message}")
            })


//        doAsync {
//           val json = URL("https://api.npoint.io/67bf2c75dd8b1e896741").readText()
//
//           uiThread {
//               val products = Gson().fromJson(json, Array<Product>::class.java).toList()
//
//               recycler_view.apply {
//                    layoutManager = GridLayoutManager(this@ShopActivity, 2)
//                    adapter = ProductAdapter(products)
//                    progressBar.visibility = View.GONE
//                }
//            }
//        }
    }
}