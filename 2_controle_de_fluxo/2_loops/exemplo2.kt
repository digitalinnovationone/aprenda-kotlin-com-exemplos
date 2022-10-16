/**
 * Estruturas de repetição/loop [while] e [do-while].
 *
 * @see [Loops](https://play.kotlinlang.org/byExample/02_control_flow/02_Loops)
 */
 
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0
    
    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten ++
    }
    
    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}