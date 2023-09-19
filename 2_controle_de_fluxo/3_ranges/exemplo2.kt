/**
 * Intervalos (ranges) de caracteres.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    for (c in 'a'..'d') {        // 1
        print(c)
    }
    print(" ")

    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    print(" ")
 }
