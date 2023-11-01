package com.example.a12_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class changes : AppCompatActivity() {
    private lateinit var lblContactName: EditText
    private lateinit var lblContactApellido: EditText
    private lateinit var lblCorreo: EditText
    private lateinit var lblContactNumber: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_changes)
        val nombre = intent.extras!!.get("nombre")!!.toString()
        val apellidos = intent.extras!!.get("apellidos")!!.toString()
        val correoElectronico = intent.extras!!.get("correoElectronico")!!.toString()
        val numeroTelefonico = intent.extras!!.get("numeroTelefonico")!!.toString()

        lblContactName = findViewById(R.id.lblNombre)
        lblContactApellido = findViewById(R.id.lblApellidos)
        lblCorreo = findViewById(R.id.lblCorreo)
        lblContactNumber = findViewById(R.id.lblNumber)

        lblContactName.setText(nombre)
        lblContactApellido.setText(apellidos)
        lblCorreo.setText(correoElectronico)
        lblContactNumber.setText(numeroTelefonico)
    }
}