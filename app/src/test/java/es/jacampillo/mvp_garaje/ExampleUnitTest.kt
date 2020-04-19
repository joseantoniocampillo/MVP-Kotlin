package es.jacampillo.mvp_garaje

import org.hamcrest.core.Is.`is`
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun elrepositorioContieneLaLista() {
        val repo = Injection.provideRespositorio()
        val lista = repo.dameListaJornadas()
        val cantidad = lista.size
        assertThat(5, `is` (cantidad))
    }


}
