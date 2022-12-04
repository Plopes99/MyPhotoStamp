package com.example.denovo

import android.content.ContentValues
import android.content.Context
import android.content.res.Resources
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import com.example.denovo.Utilizador


val DATABASE_NAME="Museu"
val TABLE_USER="utilizador"

val COL_USERNAME="username"
val COL_PASSWORD="password"
val COL_ID="id"

class DatabaseHandler(var context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, 6){
    override fun onCreate(db: SQLiteDatabase?) {
     val tableUser = "CREATE TABLE " + TABLE_USER + " (" + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
             COL_USERNAME + " VARCHAR(250)," + COL_PASSWORD + " VARCHAR(250))"

        db?.execSQL(tableUser)


        var cv = ContentValues()


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}