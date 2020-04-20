package es.jacampillo.mvp_garaje.domain

interface PostsRepository {

    fun getPosts(handler: Handler<List<Post>>)

    fun getPost(postId : Int, handler: Handler<Post>)
}