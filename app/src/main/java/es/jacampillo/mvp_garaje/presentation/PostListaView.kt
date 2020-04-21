package es.jacampillo.mvp_garaje.presentation

import es.jacampillo.mvp_garaje.domain.Post

interface PostListaView: BaseView {

    fun muestrame(lista: List<Post>)
}