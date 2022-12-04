package com.example.denovo.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CartDao {
    @Query("SELECT * FROM CartModel")
    fun getAll(): List<CartModel>

    @Insert
    fun insertAll(vararg item:CartModel)

}
