package es.jacampillo.mvp_garaje.domain

import es.jacampillo.mvp_garaje.presentation.BasePresenter
import es.jacampillo.mvp_garaje.presentation.BaseView

class Contrato { //todo ver donde ubicar en clean

    interface View : BaseView<Presenter> {
        fun show(posts: List<Post>)
    }

    interface Presenter : BasePresenter {
        fun loadPosts()
    }
}