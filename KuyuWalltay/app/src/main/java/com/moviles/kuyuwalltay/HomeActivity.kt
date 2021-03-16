package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun onClickButtonPeliculas(view: View) {
        var intent = Intent(this,PrincipalActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia MenuPeliculas")
        startActivity(intent)
    }

    fun onClickButtonCines(view: View) {
        var intent = Intent(this,CinesActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Cines")
        startActivity(intent)
    }

    fun onClickButtonMapa(view: View) {
        var intent = Intent(this,MapsActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia peliculas")
        startActivity(intent)
    }

    fun onClickButtonModificarDatos(view: View) {
        var intent = Intent(this,ActulizarDatosUssActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Modificar Datos")
        startActivity(intent)
    }
}