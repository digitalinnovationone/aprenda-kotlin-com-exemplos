/**
 * Herança.
 *
 * @see [Inheritance](https://play.kotlinlang.org/byExample/01_introduction/07_Inheritance)
 */

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}