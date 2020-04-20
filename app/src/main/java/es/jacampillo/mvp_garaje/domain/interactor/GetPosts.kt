package es.jacampillo.mvp_garaje.domain.interactor

import es.jacampillo.mvp_garaje.domain.Handler
import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.PostsRepository

class GetPosts (private val repository: PostsRepository): UseCase<List<Post>, Unit> {

    override fun execute(handler: Handler<List<Post>>, sin_uso: Unit) {
        repository.getPosts(object : Handler<List<Post>> {
            override fun handle(posts: List<Post>) {
                handler.handle(posts)
            }

            override fun error(exception: Exception) {
                handler.error(exception)
            }
        })
    }
}