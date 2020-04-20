package es.jacampillo.mvp_garaje.presentation

import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.data.source.local.LocalSourcePosts
import es.jacampillo.mvp_garaje.domain.Contrato

class MainActivityPresenter(
    private val localSourcePosts: LocalSourcePosts,
    private val vista: Contrato.View
) : Contrato.Presenter {

    lateinit var listPost: List<Post>

    init {
        vista.presenter = this
    }

    override fun loadPosts() {
        listPost = localSourcePosts.damePosts()
        vista.show(listPost)
    }

    override fun start() {
        loadPosts()
    }


}