package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ListaPelisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_pelis)
    }

    fun onClickButtonListaPelis(view: View) {
        var intent = Intent(this,detallePeliculasActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Peliculas")
        startActivity(intent)
    }
}