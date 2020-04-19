package es.jacampillo.mvp_garaje.data

import java.util.*

sealed class Dieta {
    class Desayuno(val territorio: Territorio) : Dieta() {
        val valor = when(territorio) {
            Territorio.NACIONAL -> 10
            Territorio.EXTRANJERO -> 15
            Territorio.EXENTO -> 0
        }
    }
    class Comida(val territorio: Territorio) : Dieta() {
        val valor = when(territorio) {
            Territorio.NACIONAL -> 12
            Territorio.EXTRANJERO -> 16
            Territorio.EXENTO -> 0
        }
    }
    class Cena(val territorio: Territorio) : Dieta() {
        val valor = when(territorio) {
            Territorio.NACIONAL -> 18
            Territorio.EXTRANJERO -> 14
            Territorio.EXENTO -> 0
        }
    }
}

enum class Territorio(definicion: String) {
    NACIONAL("nacional"),
    EXTRANJERO("extranjero"),
    EXENTO("exenta") }

data class Jornada(var desayuno: Dieta.Desayuno, var comida: Dieta.Comida, var cena: Dieta.Cena, var fecha: Date)

fun ejemplo() {
    val jornada = Jornada(
        Dieta.Desayuno(Territorio.EXTRANJERO),
        Dieta.Comida(Territorio.NACIONAL),
        Dieta.Cena(Territorio.EXENTO),
        Date()
    )
}