package repository

import com.google.gson.Gson
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.core.Single
import model.Product
import java.net.URL

class ProductRepository {

    fun getAllProducts(): Single<List<Product>> {
        return Single.create<List<Product>> {
            it.onSuccess(fetchProducts())
        }
    }

    fun getProductByName(name: String): Single<Product>{
        return Single.create<Product> {
            val product = fetchProducts().first { it.title == name }
            it.onSuccess(product)
        }
    }


    fun fetchProducts(): List<Product>{
        val json = URL("https://api.npoint.io/67bf2c75dd8b1e896741").readText()
        return Gson().fromJson(json, Array<Product>::class.java).toList()
    }
}