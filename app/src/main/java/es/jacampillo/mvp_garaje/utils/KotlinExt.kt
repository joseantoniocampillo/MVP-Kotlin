package es.jacampillo.mvp_garaje.utils

import es.jacampillo.mvp_garaje.data.Post

fun List<Post>.toListaDeStrings(): String {
    var cadena = ""
    this.forEach {
        cadena += "${it.autor} \n"
    }
    return cadena
}