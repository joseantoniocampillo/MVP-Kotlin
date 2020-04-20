package es.jacampillo.mvp_garaje.domain.interactor

import es.jacampillo.mvp_garaje.domain.Handler

interface UseCase<T, P> {

    fun execute(handler: Handler<T>, params: P)

}