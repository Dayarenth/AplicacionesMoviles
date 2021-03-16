package com.moviles.kuyuwalltay

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        var bt_continuar = findViewById<Button>(R.id.btnRegistrar)
        bt_continuar.setOnClickListener {
            var intent = Intent(this,activityRegistrar::class.java)
            intent.putExtra("MENSAJE", "Hacia registrar")
            startActivity(intent)
        }

        var bt_ingresar = findViewById<Button>(R.id.btnIngresar)
        bt_ingresar.setOnClickListener {
            var intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("MENSAJE", "Hacia lista")
            startActivity(intent)
        }



    }
}




