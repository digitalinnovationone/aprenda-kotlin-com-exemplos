/**
 * Iterators.
 *
 * @see [Loops](https://play.kotlinlang.org/byExample/02_control_flow/02_Loops)
 */

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion"));
    val zoo = Zoo(animals)

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }

}