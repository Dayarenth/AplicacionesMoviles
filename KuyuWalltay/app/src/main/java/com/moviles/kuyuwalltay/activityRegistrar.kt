package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class activityRegistrar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        var bt_continuar = findViewById<Button>(R.id.btnIngresarReg)
        bt_continuar.setOnClickListener {
            var intent = Intent(this, activity_listaPeliculas::class.java)
            intent.putExtra("MENSAJE", "Hacia lista")
            startActivity(intent)
        }
    }
}
