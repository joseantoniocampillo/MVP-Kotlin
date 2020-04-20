package es.jacampillo.mvp_garaje.platform.di

import es.jacampillo.mvp_garaje.data.source.local.LocalSourcePosts

object Injection {
    fun provideRespositorio(): LocalSourcePosts {
        return LocalSourcePosts()
    }
}
