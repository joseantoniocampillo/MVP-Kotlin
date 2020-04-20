package es.jacampillo.mvp_garaje.platform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.jacampillo.mvp_garaje.platform.di.Injection
import es.jacampillo.mvp_garaje.R
import es.jacampillo.mvp_garaje.domain.Post
import es.jacampillo.mvp_garaje.presentation.MainActivityPresenter
import es.jacampillo.mvp_garaje.presentation.utils.toListaDeStrings
import es.jacampillo.mvp_garaje.domain.Contrato
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
    Contrato.View {

    // Vamos a requerir una instancia de la interface que implementa nuestro presenter     1º
    override lateinit var presenter: Contrato.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // La inicializamos con una clase que implementa esta interface                    2º
        presenter = MainActivityPresenter(
            Injection.provideRespositorio(),
            this
        )
    }

    override fun show(posts: List<Post>) {
        textview.text = posts.toListaDeStrings()
    }

    override fun onResume() {
        super.onResume()
        // Llamamos al método de la interface                                              3º
        presenter.start()
    }

}
