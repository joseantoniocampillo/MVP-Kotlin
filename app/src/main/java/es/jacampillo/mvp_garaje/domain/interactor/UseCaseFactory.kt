package es.jacampillo.mvp_garaje.domain.interactor

import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.PostsRepository

class UseCaseFactory    //@Inject se inyectaria con `di`
                        constructor(private val repository: PostsRepository) {

    fun getPosts(): UseCase<List<Post>> {
        return GetPosts(repository)
    }
}