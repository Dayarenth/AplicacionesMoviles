package com.moviles.kuyuwalltay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_actulizar_datos_uss.*

class ActulizarDatosUssActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actulizar_datos_uss)
        /* lateinit var listViewUsuario: ListView
        lateinit var editTextUserId: EditText
        lateinit var editTextNombre: EditText
        lateinit var editTextApellido: EditText
        lateinit var editTextCorreo: EditText
        lateinit var editTextContraseña: EditText
        var idDocumentoUsuarioSeleccionado : String = ""
        var usuario = arrayListOf<UsuarioModelClass>()
        var usuarioIdDocumentos = ArrayList<String>()

        //inicizalizar variables
        listViewUsuario = findViewById(R.id.)
        editTextUserId = findViewById(R.id.editTextIdUsuario)
        editTextNombre = findViewById(R.id.editTextNombre)
        editTextApellido = findViewById(R.id.editTextApellido)
        editTextCorreo = findViewById(R.id.editTextCorreo)
        editTextContraseña = findViewById(R.id.editTextContraseña)

        lateinit var db: FirebaseFirestore

        consultarUsuario()

        btnActualizarReg.setOnClickListener {
            val id = editTextUserId.text.toString().toInt()
            val nombre = editTextNombre.text.toString()
            val apellido = editTextApellido.text.toString()
            val email = editTextCorreo.text.toString()
            val contraseña = editTextContraseña.text.toString()
            actualizarContacto(UsuarioModelClass(id,nombre,apellido,email, contraseña), idDocumentoUsuarioSeleccionado)
            consultarUsuario()
        }

    }

    fun actualizarContacto(usuario: UsuarioModelClass, idDocumentoSeleccionado:String){
        val db = Firebase.firestore
        db.collection("Usuario")
            .document(idDocumentoSeleccionado)
            //.update(contactoHashMap)
            .set(usuario) //otra forma de actualizar
            .addOnSuccessListener {
                Toast.makeText(this,"Usuario actualizado exitosamente", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this,"Error al actualizar el Usuario:-> {$e.message}" , Toast.LENGTH_LONG).show()
            }
    }

    fun consultarUsuario() {
        val db = Firebase.firestore
        db.collection("contactos")
            .orderBy("userId", Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { result ->
                usuario.clear()
                usuarioIdDocumentos.clear()
                for (document in result) {
                    val contacto = document.toObject(UsuarioModelClass::class.java)
                    usuario.add(contacto)
                    usuarioIdDocumentos.add(document.id)
                }
                //Poblar en ListView información usando mi adaptador
                val contactoAdaptador = UsuarioAdapter(this, usuario)
                listViewUsuario.adapter = contactoAdaptador
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Error al obtener datos de contactos:-> {$e.message}", Toast.LENGTH_LONG).show()
            }
    }*/
    }
}