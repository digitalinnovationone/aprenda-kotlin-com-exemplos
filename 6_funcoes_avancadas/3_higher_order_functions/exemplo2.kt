/**
 * Retornando funções.
 *
 * @see [Higher-Order Functions](https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions)
 */

fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun square(x: Int) = x * x                                          // 2

fun main() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}