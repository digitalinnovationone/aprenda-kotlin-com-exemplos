/**
 * Funções de Escopo: [also].
 *
 * @see [also](https://play.kotlinlang.org/byExample/06_scope_functions/05_also)
 */

data class Person(var name: String, var age: Int, var about: String) {
             constructor() : this("", 0, "")
}
         
fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")              
}
         
fun main() {

    val jake = Person("Jake", 30, "Android developer")   // 1
        .also {                                          // 2 
            writeCreationLog(it)                         // 3
    }

}