package es.jacampillo.mvp_garaje.principal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.jacampillo.mvp_garaje.Injection
import es.jacampillo.mvp_garaje.R
import es.jacampillo.mvp_garaje.data.Post
import es.jacampillo.mvp_garaje.utils.toListaDeStrings
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Contrato.View {

    // Vamos a requerir una instancia de la interface que implementa nuestro presenter     1º
    override lateinit var presenter: Contrato.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // La inicializamos con una clase que implementa esta interface                    2º
        presenter = MainActivityPresenter(Injection.provideRespositorio(), this)
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
