package es.jacampillo.mvp_garaje.principal

import es.jacampillo.mvp_garaje.data.Post
import es.jacampillo.mvp_garaje.data.Repositorio

class MainActivityPresenter(
    private val repositorio: Repositorio,
    private val vista: Contrato.View
) : Contrato.Presenter {

    lateinit var listPost: List<Post>

    init {
        vista.presenter = this
    }

    override fun loadPosts() {
        listPost = repositorio.damePosts()
        vista.show(listPost)
    }

    override fun start() {
        loadPosts()
    }


}