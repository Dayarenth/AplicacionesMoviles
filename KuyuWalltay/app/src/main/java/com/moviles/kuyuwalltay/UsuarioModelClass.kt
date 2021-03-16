package com.moviles.kuyuwalltay

data class UsuarioModelClass (
    var userId:Int, var firstName: String, var lastName: String, var password: String, var emailAddress: String){
    constructor():this(0,"", "", "", "")
}

