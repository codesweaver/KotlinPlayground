package introduction

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    val anotherStack = mutableStackOf(3, 4, 5, 6)
    println(anotherStack)
}