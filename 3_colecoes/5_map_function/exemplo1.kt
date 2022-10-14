/**
 * Função [map].
 *
 * @see [map](https://play.kotlinlang.org/byExample/05_Collections/04_map)
 */

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1
    
    val doubled = numbers.map { x -> x * 2 }      // 2
    
    val tripled = numbers.map { it * 3 }          // 3

    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}