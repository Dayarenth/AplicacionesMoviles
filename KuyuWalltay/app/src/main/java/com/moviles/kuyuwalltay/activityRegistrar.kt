package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class activityRegistrar : AppCompatActivity() {
    var toolBar: Toolbar? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrar)

        toolBar = findViewById(R.id.toolBar)
        toolBar?.setTitle(R.string.app_name)
        setSupportActionBar(toolBar)

        var bt_continuar = findViewById<Button>(R.id.btnActualizarReg)
        bt_continuar.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("MENSAJE", "Hacia lista")
            startActivity(intent)
        }
    }
}
