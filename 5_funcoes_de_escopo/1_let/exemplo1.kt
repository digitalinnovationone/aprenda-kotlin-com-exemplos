/**
 * Funções de Escopo: [let].
 *
 * @see [let](https://play.kotlinlang.org/byExample/06_scope_functions/01_let)
 */

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" is empty: $empty")


    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }
    
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5 
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    
    printNonNull(null)
    printNonNull("my string") 
    printIfBothNonNull("First","Second") 

}