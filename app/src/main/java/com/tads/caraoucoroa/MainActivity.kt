package com.tads.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    //Vinicius Espindola - 01/05/2020
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_jogar.setOnClickListener {
            val intent = Intent(applicationContext, ResultadoActivity::class.java)

            val numero = Random().nextInt(2)

            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}
