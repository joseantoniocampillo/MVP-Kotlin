package es.jacampillo.mvp_garaje.principal

import es.jacampillo.mvp_garaje.BasePresenter
import es.jacampillo.mvp_garaje.BaseView
import es.jacampillo.mvp_garaje.data.Jornada

class Contrato {

    interface View : BaseView<Presenter> {
        fun show(jornadas: List<Jornada>)
    }

    interface Presenter : BasePresenter {
        fun loadPosts()
    }
}