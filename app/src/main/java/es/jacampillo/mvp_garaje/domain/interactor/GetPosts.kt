package es.jacampillo.mvp_garaje.domain.interactor

import es.jacampillo.mvp_garaje.domain.Handler
import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.PostsRepository

class GetPosts(private val repository: PostsRepository) : UseCase<List<Post>> {

    override fun execute(handler: Handler<List<Post>>) {
        repository.getPosts(object : Handler<List<Post>> {
            override fun handle(posts: List<Post>) {
                handler.handle(posts)
            }

            override fun error(exception: String) {
                handler.error(exception)
            }
        })
    }
}