open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiget from $origin says: grrrhhh!")
    }
}

class SiberianTiger : Tiger("siberian")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}