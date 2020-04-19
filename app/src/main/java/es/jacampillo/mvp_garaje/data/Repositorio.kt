package es.jacampillo.mvp_garaje.data

import java.util.*

class Repositorio {
    fun dameListaJornadas(): List<Jornada> {
        return listOf(
            Jornada(
                Dieta.Desayuno(Territorio.EXTRANJERO),
                Dieta.Comida(Territorio.NACIONAL),
                Dieta.Cena(Territorio.EXENTO),
                Date()
            ),
            Jornada(
                Dieta.Desayuno(Territorio.NACIONAL),
                Dieta.Comida(Territorio.NACIONAL),
                Dieta.Cena(Territorio.EXENTO),
                Date()
            ),
            Jornada(
                Dieta.Desayuno(Territorio.EXENTO),
                Dieta.Comida(Territorio.NACIONAL),
                Dieta.Cena(Territorio.EXENTO),
                Date()
            )
        )
    }
}