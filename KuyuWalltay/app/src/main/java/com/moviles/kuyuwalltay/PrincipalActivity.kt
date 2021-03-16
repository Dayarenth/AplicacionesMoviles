package com.moviles.kuyuwalltay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.FirebaseFirestore

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    fun onClickButtonVerMasAccion(view: View) {
        var intent = Intent(this,ListaPelisActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Peliculas")
        startActivity(intent)
    }
    fun onClickButtonVerMasAnimado(view: View) {
        var intent = Intent(this,ListaPelisActivity::class.java)
        intent.putExtra("MENSAJE", "Hacia Lista")
        startActivity(intent)
    }
}