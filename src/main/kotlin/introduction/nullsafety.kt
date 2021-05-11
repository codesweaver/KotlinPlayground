package introduction

fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null;

    var nullable: String?  = "You can keep a null here"
    nullable = null;

    var inferredNonNull = "the compiler assumes non-null"
    // inferredNonNull = null

    println(strLength(neverNull))
    // strLength(nullable) // Type mismatch

    println(strLengthWithNull(nullable))

}

fun strLength(notNull: String): Int {
    return notNull.length
}

fun strLengthWithNull(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "empty or null string"
    }
}