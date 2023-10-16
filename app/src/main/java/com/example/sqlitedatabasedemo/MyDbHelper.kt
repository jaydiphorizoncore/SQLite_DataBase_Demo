package com.example.sqlitedatabasedemo

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper



class MyDbHelper(context: Context) : SQLiteOpenHelper(context, "USERDB", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {


        db?.execSQL("CREATE TABLE USERS(NAME TEXT,AGE INTEGER)")

        db?.execSQL("ALTER TABLE USERS RENAME AGE TO NUMBER") // Rename Column name

        db?.execSQL("ALTER TABLE USERS ADD COLUMN COUNTRY INTEGER") //Add New Column

        db?.execSQL("ALTER TABLE USERS DROP COLUMN COUNTRY") // Drop Column

        db?.execSQL("ALTER TABLE USERS ADD COLUMN COUNT INTEGER") //Add New Column


        db?.execSQL("ALTER TABLE USERS RENAME TO USERSA") //rename table name


    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {


    }
}
