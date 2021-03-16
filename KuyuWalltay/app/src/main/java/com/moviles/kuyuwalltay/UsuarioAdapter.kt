package com.moviles.kuyuwalltay

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class UsuarioAdapter  (private val context: Activity, private val usuario: ArrayList<UsuarioModelClass>)   : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_actulizar_datos_uss, null, true)

        val textViewUserId = rowView.findViewById<TextView>(R.id.editTextIdUsuario)
        val textViewFirstName = rowView.findViewById<TextView>(R.id.editTextNombre)
        val textViewLastName = rowView.findViewById<TextView>(R.id.editTextApellido)
        val textViewEmailAddress = rowView.findViewById<TextView>(R.id.editTextCorreo)
        val textViewContraseña = rowView.findViewById<TextView>(R.id.editTextContraseña)

        textViewUserId.text = "Id: ${usuario[position].userId}"
        textViewFirstName.text = "Name: ${usuario[position].firstName}"
        textViewLastName.text = "LastName: ${usuario[position].lastName}"
        textViewEmailAddress.text = "Email: ${usuario[position].emailAddress}"
        textViewContraseña.text = "Phone: ${usuario[position].password}"

        return rowView
    }

    override fun getItem(position: Int): Any? {
        return usuario.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return usuario.size
    }
}