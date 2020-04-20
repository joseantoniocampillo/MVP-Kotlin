package es.jacampillo.mvp_garaje.data.source.local

import es.jacampillo.mvp_garaje.domain.Post

class LocalSourcePosts {
    fun damePosts(): List<Post> {
        return listOf(
            Post(
                "juanito",
                "todo esta genial"
            ),
            Post(
                "menganito",
                "todo esta genial"
            ),
            Post(
                "felipe ferreras",
                "todo esta genial"
            ),
            Post(
                "andrés",
                "todo esta genial"
            ),
            Post(
                "pablo",
                "todo esta genial"
            )
        )
    }
}