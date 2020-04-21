package es.jacampillo.mvp_garaje.platform.di

import es.jacampillo.mvp_garaje.data.PostRepositoryImp
import es.jacampillo.mvp_garaje.data.source.local.LocalSourcePosts
import es.jacampillo.mvp_garaje.domain.PostsRepository
import es.jacampillo.mvp_garaje.domain.interactor.UseCaseFactory
import es.jacampillo.mvp_garaje.presentation.PostListaView
import es.jacampillo.mvp_garaje.presentation.presenters.MainActivityPresenter

object Injection {  // vamos a simular una di en la medida de lo posible
    private fun provideRespositorio(): PostsRepository {
        return PostRepositoryImp(LocalSourcePosts())
    }

    fun providePresenter(vista: PostListaView): MainActivityPresenter {
        return MainActivityPresenter(
            UseCaseFactory(provideRespositorio()), vista
        )
    }
}
