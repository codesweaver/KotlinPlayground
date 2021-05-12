package specialclasses

class BigBen {
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                println("Bong ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(5)
}