package specialclasses

import java.util.*

class LuckDispatcher {
    fun getNumber() {
        val objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
    println(d1 === d2)
}