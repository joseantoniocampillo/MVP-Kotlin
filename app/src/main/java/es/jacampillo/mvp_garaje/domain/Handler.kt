package es.jacampillo.mvp_garaje.domain

//Callback to comunicate between layers
interface Handler<T> {

    fun handle(result: T)

    fun error(exception: String)

}