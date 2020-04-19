package es.jacampillo.mvp_garaje.principal

import es.jacampillo.mvp_garaje.BasePresenter
import es.jacampillo.mvp_garaje.BaseView
import es.jacampillo.mvp_garaje.data.Post

class Contrato {

    interface View : BaseView<Presenter> {
        fun show(posts: List<Post>)
    }

    interface Presenter : BasePresenter {
        fun loadPosts()
    }
}