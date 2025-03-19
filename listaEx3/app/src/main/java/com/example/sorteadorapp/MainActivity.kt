package com.example.sorteadorapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

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
        val btn_sortear = findViewById<Button>(R.id.btn_sortear)
        btn_sortear.setOnClickListener {
            sortear();
        }

    }
    fun sortear() {

    val tv_resultado = findViewById<TextView>(R.id.tv_numerosorteio)
    val numeroaleatorio0 = Random.nextInt(101)
        val numeroaleatorio1 = Random.nextInt(101)
        val numeroaleatorio2 = Random.nextInt(101)
        val numeroaleatorio3 = Random.nextInt(101)
        val numeroaleatorio4 = Random.nextInt(101)
        val numeroaleatorio5 = Random.nextInt(101)

        tv_resultado.setText("Números sorteados: ${numeroaleatorio0}, ${numeroaleatorio1}, ${numeroaleatorio2}, ${numeroaleatorio3}, ${numeroaleatorio4}, ${numeroaleatorio5}")




    }



}
