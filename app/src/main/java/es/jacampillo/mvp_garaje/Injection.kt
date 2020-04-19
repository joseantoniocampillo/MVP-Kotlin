package es.jacampillo.mvp_garaje

import es.jacampillo.mvp_garaje.data.Repositorio

object Injection {
    fun provideRespositorio(): Repositorio {
        return Repositorio()
    }
}
