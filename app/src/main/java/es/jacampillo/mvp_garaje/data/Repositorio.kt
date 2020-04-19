package es.jacampillo.mvp_garaje.data

class Repositorio {
    fun damePosts(): List<Post> {
        return listOf(
            Post("juanito", "todo esta genial"),
            Post("menganito", "todo esta genial"),
            Post("felipe ferreras", "todo esta genial"),
            Post("andrés", "todo esta genial"),
            Post("pablo", "todo esta genial")
        )
    }
}