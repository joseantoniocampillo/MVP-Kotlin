package es.jacampillo.mvp_garaje.presentation.utils

import es.jacampillo.mvp_garaje.domain.Post

fun List<Post>.toListaDeStrings(): String {
    var cadena = ""
    this.forEach {
        cadena += "${it.autor} \n"
    }
    return cadena
}