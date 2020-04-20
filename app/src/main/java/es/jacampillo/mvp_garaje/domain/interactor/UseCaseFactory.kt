package es.jacampillo.mvp_garaje.domain.interactor

import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.PostsRepository

class UseCaseFactory    //@Inject se inyectaria con `di`
                        constructor(private val repository: PostsRepository) {

    fun getPost(): UseCase<Post, GetPost.Params> {
        return GetPost(repository)
    }

    fun getPosts(): UseCase<List<Post>, Unit> {
        return GetPosts(repository)
    }
}