/**
 * Enum tradicional.
 *
 * @see [Enum Classes](https://play.kotlinlang.org/byExample/03_special_classes/02_Enum)
 */

enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

fun main() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)
}