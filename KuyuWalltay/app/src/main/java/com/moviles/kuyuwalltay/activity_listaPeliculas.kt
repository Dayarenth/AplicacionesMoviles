package com.moviles.kuyuwalltay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class activity_listaPeliculas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_peliculas)

        var peliculas= ArrayList<Pelicula>()
        /* frutas.add("Manzana")
         frutas.add("Durazno")
         frutas.add("Sandía")
         frutas.add("Plátano")
         */


        peliculas.add(Pelicula("Terminator",R.drawable.img1))
        peliculas.add(Pelicula("Pokemon",R.drawable.img2))
        peliculas.add(Pelicula("Bullet",R.drawable.img3))
        peliculas.add(Pelicula("Espias 2",R.drawable.img4))
        peliculas.add(Pelicula("Pound of flesh",R.drawable.img5))


        var grid: GridView = findViewById(R.id.grid)
        // val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas)
        val adaptador=AdaptadorCustom(this,peliculas)
        grid.adapter= adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, peliculas.get(position).nombre, Toast.LENGTH_LONG).show()
        }
    }
}
