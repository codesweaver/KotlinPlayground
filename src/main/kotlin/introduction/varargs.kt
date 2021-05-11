package introduction

fun printAll(vararg messages: String) {
    for (message in messages) {
        println(message)
    }
}


fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (message in messages) {
        println(prefix + message)
    }
}

fun main () {
    printAll("Hello", "Hallo", "Salut", "Hola", "Nihao")
    printAllWithPrefix (
        "Hello", "Hallo", "Salut", "Hola", "Nihao",
        prefix = "Greeting: "
    )
}

fun log(vararg entries: String) {
    printAll(*entries)
}