package com.example.lista_ex5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.pow

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

        val btnenviar = findViewById<Button>(R.id.btn_enviar)

        btnenviar.setOnClickListener{

        mostrar()

        }
    }





    fun mostrar() {


        val raio = findViewById<EditText>(R.id.edt_raio)
        val base = (raio.getText().toString().toDouble())
        val area = base.pow(2)*3.14
        val txt_area = findViewById<TextView>(R.id.txt_area)
        txt_area.setText("A área é ${area}")


    }

}