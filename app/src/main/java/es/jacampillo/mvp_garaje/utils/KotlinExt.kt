package es.jacampillo.mvp_garaje.utils

import es.jacampillo.mvp_garaje.data.Jornada

fun List<Jornada>.toListaDeStrings(): String {
    var cadena = ""
    this.forEach {
        cadena += "desayuno: ${it.desayuno.territorio}, valor: ${it.desayuno.valor},\n"
    }
    return cadena
}