package es.jacampillo.mvp_garaje.principal

import es.jacampillo.mvp_garaje.data.Jornada
import es.jacampillo.mvp_garaje.data.Repositorio

class MainActivityPresenter(
    private val repositorio: Repositorio,
    private val vista: Contrato.View
) : Contrato.Presenter {

    lateinit var listJornadas: List<Jornada>

    init {
        vista.presenter = this
    }

    override fun loadPosts() {
        listJornadas = repositorio.dameListaJornadas()
        vista.show(listJornadas)
    }

    override fun start() {
        loadPosts()
    }


}