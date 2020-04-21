package es.jacampillo.mvp_garaje.presentation.presenters

import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.Handler
import es.jacampillo.mvp_garaje.domain.interactor.UseCaseFactory
import es.jacampillo.mvp_garaje.presentation.PostListaView

class MainActivityPresenter(
    private val useCaseFactory: UseCaseFactory,
    private val vista: PostListaView
) : Handler<List<Post>> { // desde el caso de uso en clean conseguimos la inversión de dependencias. (?)


    private fun laVistaEstaPreparada(){
        val useCase = useCaseFactory.getPosts()
        useCase.execute(this)
    }

    init {
        laVistaEstaPreparada()
    }

    override fun handle(result: List<Post>) {
        vista?.let {vista ->
            vista.muestrame(result)
        }
    }

    override fun error(exception: String) {
        vista?.let {
            it.showErrorMessage(exception)
        }
    }

}