/**
 * Variáveis: [var] e [val].
 *
 * @see [Variables](https://play.kotlinlang.org/byExample/01_introduction/03_Variables)
 */

fun someCondition() = true 

fun main() {

    val d: Int  // 1
    
    if (someCondition()) {
        d = 1   // 2
    } else {
        d = 2   // 2
    }
    
    println(d) // 3

}