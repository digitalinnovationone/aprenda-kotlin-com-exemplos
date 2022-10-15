/**
 * Extension Function [nullSafeToString].
 *
 * @see [Extension Functions and Properties](https://play.kotlinlang.org/byExample/04_functional/03_extensionFunctions)
 */

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1

fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}