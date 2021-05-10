class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val Customer = Customer()
    val contact = Contact(1, "codetrain999@gmail.com")

    println(contact.email)
    contact.email = "codesweaver@gmail.com"

    println(contact.email)
}