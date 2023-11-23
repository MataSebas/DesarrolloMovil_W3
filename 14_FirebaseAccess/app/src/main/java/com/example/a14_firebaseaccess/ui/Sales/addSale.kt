package com.example.a14_firebaseaccess.ui.Sales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a14_firebaseaccess.R
import android.util.Log
import com.example.a14_firebaseaccess.DBAdapter

class addSale : AppCompatActivity() {
    var db = DBAdapter(this)
    val TAG = "SQLite Demo"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_sale)

    }
    private fun addSale(){
        var id: Long
        db.open()


    }
}