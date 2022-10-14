/**
 * Palavra reservada [object]: Classes e Objetos (relembrando os coneitos)
 *
 * @see [Object Keyword](https://play.kotlinlang.org/byExample/03_special_classes/04_Object)
 */

import java.util.Random

class LuckDispatcher {                    //1 
    fun getNumber() {                     //2 
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()             //3
    val d2 = LuckDispatcher()
    
    d1.getNumber()                        //4 
    d2.getNumber()
}