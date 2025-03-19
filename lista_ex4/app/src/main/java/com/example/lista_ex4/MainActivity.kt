package com.example.lista_ex4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnenviar =   findViewById<Button>(R.id.btn_enviar)

        btnenviar.setOnClickListener{

            mostrar()

        }


    }
    fun mostrar() {

        val edtnota1 =   findViewById<EditText>(R.id.edt_nota1)
        val edtnota2 =   findViewById<EditText>(R.id.edt_nota2)
        val edtnota3 =   findViewById<EditText>(R.id.edt_nota3)
        val edtnota4 =   findViewById<EditText>(R.id.edt_nota4)
        val media = (edtnota1.getText().toString().toDouble() + edtnota2.getText().toString().toDouble() + edtnota3.getText().toString().toDouble() + edtnota4.getText().toString().toDouble())/4
        val txt_media = findViewById<TextView>(R.id.txt_media)
        txt_media.setText("A média é ${media}")
    }

}