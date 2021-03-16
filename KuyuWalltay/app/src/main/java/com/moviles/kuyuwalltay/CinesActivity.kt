package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CinesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cines)
    }

    fun onClickButtonHome(view: View) {
        var intent = Intent(this,HomeActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Home")
        startActivity(intent)
    }

    fun onClickButtonPeliculas(view: View) {}
    fun onClickButtonModificarDatos(view: View) {}
    fun onClickButtonCines(view: View) {}
}