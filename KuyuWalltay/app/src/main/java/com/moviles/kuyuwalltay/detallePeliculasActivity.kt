package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class detallePeliculasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_peliculas)
    }

    fun onClickButtonHome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Home")
        startActivity(intent)
    }
}