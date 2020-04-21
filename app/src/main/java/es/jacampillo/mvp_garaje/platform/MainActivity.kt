package es.jacampillo.mvp_garaje.platform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.jacampillo.mvp_garaje.platform.di.Injection
import es.jacampillo.mvp_garaje.R
import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.presentation.PostListaView
import es.jacampillo.mvp_garaje.presentation.presenters.MainActivityPresenter
import es.jacampillo.mvp_garaje.presentation.utils.toListaDeStrings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), PostListaView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Simulamos la di
        Injection.providePresenter(this)
    }

    override fun muestrame(lista: List<Post>) {
        textview.text = lista.toListaDeStrings()
    }

    override fun showErrorMessage(message: String) {
        textview.text = "Error: ${message}"
    }

}
