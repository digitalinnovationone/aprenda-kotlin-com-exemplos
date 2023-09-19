/**
 * Intervalos (ranges) pode ser utilizados em estruturas condicionais, como o [if].
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    val x = 2
    if (x in 1..5) {            // 1
        print("x está no intervalo de 1 a 5")
    }
    println()

    if (x !in 6..10) {          // 2
        print("x não está no intervalo de 6 a 10")
    }
}
