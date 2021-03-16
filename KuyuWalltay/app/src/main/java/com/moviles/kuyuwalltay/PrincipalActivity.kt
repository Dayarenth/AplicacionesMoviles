package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.FirebaseFirestore

class PrincipalActivity : AppCompatActivity() {
    var peliculas = arrayListOf<PeliculasModelClass>()
    var selectedContactPosition = 0
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        db = FirebaseFirestore.getInstance()
    }

    fun onClickButtonVerMasAccion(view: View) {
        /*var intent = Intent(this,PrincipalActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Peliculas")
        startActivity(intent)*/
    }
    fun onClickButtonVerMasAnimado(view: View) {
        var intent = Intent(this,ListaPelisActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Peliculas")
        startActivity(intent)
    }
}