/**
 * Lidando com valores nulos.
 *
 * @see [Null Safety](https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety)
 */
 
fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main() {
    println(describeString(null))
    println(describeString(""))
    println(describeString("dio.me"))
}