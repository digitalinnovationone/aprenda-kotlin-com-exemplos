/**
 * Funções de Escopo: [run].
 *
 * @see [run](https://play.kotlinlang.org/byExample/06_scope_functions/02_run)
 */

fun main() {

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {                                                  // 1
            println("\tis empty? " + isEmpty())                    // 2
            println("\tlength = $length")                           
            length                                                 // 3
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}