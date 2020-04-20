package es.jacampillo.mvp_garaje.domain.interactor

import es.jacampillo.mvp_garaje.domain.Handler
import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.PostsRepository

class GetPost (private val repository: PostsRepository): UseCase<Post, GetPost.Params> {

    override fun execute(handler: Handler<Post>, params: Params) {
        repository.getPost(params.postId, object : Handler<Post>{
            override fun handle(post: Post) {
                handler.handle(post)
            }

            override fun error(exception: Exception) {
                handler.error(exception)
            }
        })
    }

    inner class Params(val postId: Int)
}