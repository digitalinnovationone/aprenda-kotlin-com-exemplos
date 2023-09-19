/**
 * Definições mais comuns de intervalos (ranges) no Kotlin.
 *
 * @see [Ranges](https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges)
 */
fun main() {
    for(i in 0..3) {             // 1
    print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")
 }
