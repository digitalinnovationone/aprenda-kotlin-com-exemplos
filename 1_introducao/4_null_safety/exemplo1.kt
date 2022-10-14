/**
 * Nulidade no Kotlin.
 *
 * @see [Null Safety](https://play.kotlinlang.org/byExample/01_introduction/04_Null%20Safety)
 */

fun main() {

    var neverNull: String = "This can't be null"            // 1
    
    neverNull = null                                        // 2
    
    var nullable: String? = "You can keep a null here"      // 3
    
    nullable = null                                         // 4
    
    var inferredNonNull = "The compiler assumes non-null"   // 5
    
    inferredNonNull = null                                  // 6
    
    fun strLength(notNull: String): Int {                   // 7
        return notNull.length
    }
    
    strLength(neverNull)                                    // 8
    strLength(nullable)                                     // 9

}