package es.jacampillo.mvp_garaje.data

import es.jacampillo.mvp_garaje.data.source.local.LocalSourcePosts
import es.jacampillo.mvp_garaje.domain.Handler
import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.domain.PostsRepository

class PostRepositoryImp(
    localSourcePosts: LocalSourcePosts
) : PostsRepository {

    private val listaPosts = localSourcePosts.damePosts()

    override fun getPosts(handler: Handler<List<Post>>) {

        handler.handle(listaPosts)
    }

}