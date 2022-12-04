package com.example.denovo.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM ProductFromDatabase")
    fun getAll(): List<ProductFromDatabase>

    @Insert
    fun insertAll(vararg products: ProductFromDatabase)

}
