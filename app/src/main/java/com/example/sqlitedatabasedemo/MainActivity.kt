package com.example.sqlitedatabasedemo

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit = findViewById<Button>(R.id.btnSubmit)
        val edName = findViewById<EditText>(R.id.ed_name)
        val edAge = findViewById<EditText>(R.id.ed_age)
        val edCity = findViewById<EditText>(R.id.ed_city)


        val helper = MyDbHelper(applicationContext)
        val db = helper.readableDatabase
       // val rs = db.rawQuery("SELECT * FROM USERS",null)

        /*if (rs.moveToNext())
        {
            Toast.makeText(this,rs.getString(1),Toast.LENGTH_LONG).show()
        }*/


        submit.setOnClickListener{
            val cv = ContentValues()
            cv.put("NAME",edName.text.toString())
            cv.put("NUMBER",edAge.text.toString())
            cv.put("COUNT",edCity.text.toString())
            db.insert("USERSA",null,cv)
            edName.setText("")
            edAge.setText("")
            edCity.setText("")
            edName.requestFocus()
        }

    }
}