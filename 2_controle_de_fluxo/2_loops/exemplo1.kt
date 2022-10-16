/**
 * Estrutura de repetição/loop [for].
 *
 * @see [Loops](https://play.kotlinlang.org/byExample/02_control_flow/02_Loops)
 */
fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate")
    
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}