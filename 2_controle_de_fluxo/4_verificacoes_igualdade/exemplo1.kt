/**
 * Verificações de igualdade.
 *
 * @see [Equality Checks](https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks)
 */
fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
 }
