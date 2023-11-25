package com.example.a14_firebaseaccess.ui.Sales

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.example.a14_firebaseaccess.R
import com.example.a14_firebaseaccess.entities.cls_Category
import com.google.firebase.storage.FirebaseStorage
import com.example.a14_firebaseaccess.entities.cls_OrderDetails


class showSaleScreen
    (context: Context, dataModalArrayList: ArrayList<cls_OrderDetails?>?) :
    ArrayAdapter<cls_OrderDetails?>(context, 0, dataModalArrayList!!){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listitemView = convertView
        if (listitemView == null) {
            listitemView =
                LayoutInflater.from(context).inflate(R.layout.activity_show_sale, parent, false)
        }

        val dataModal: cls_OrderDetails? = getItem(position)

        val categoryID = listitemView!!.findViewById<TextView>(R.id.IdCategory)
        val categoryName = listitemView!!.findViewById<TextView>(R.id.NameCategory)
        val description = listitemView.findViewById<TextView>(R.id.DescriptionCategory)

        val imageCategory = listitemView.findViewById<ImageView>(R.id.imgCategory)

        if (dataModal != null) {
//            categoryID.setText(dataModal.CategoryID.toString())
//            categoryName.setText(dataModal.CategoryName)
//            description.setText(dataModal.Description)
//            Glide.with(context).load(dataModal.urlImage).into(imageCategory)
        }

        listitemView.setOnClickListener { // on the item click on our list view.
            // we are displaying a toast message.
            if (dataModal != null) {
//                val intent = Intent(this,CategoryScreen::class.java)
//                intent.putExtra()
//                startActivity(intent)
            }
        }
        return listitemView
    }
    }





























