// Create a User data class with fields name, age, and address
data class User(var name : String, var age: Int, var address : Address)

// Create an Address data class with an overrided toString method
data class Address(val street : String, val streetNum : Int, val postalCode : String, val country : Country) {
    override fun toString(): String {
        return "$streetNum $street, $postalCode, ${country.name}"// We need curly braces to access country's variables
    }
}

// Another data class. Immutable name
data class Country(val name : String)

fun main(args : Array<String>) {
    // Here we can declare these just as we would with any regular object class
    val canada = Country("Canada")
    val address1 = Address("Anderson Road", 345, "K5M 8S7", canada)
    val jeff = User("Jeffrey Guy", 23, address1);

    val address2 = Address("Laurier Street", 80, "K1N 3S8", canada)

    // There is no .get() or .set(), instead you simply use dot notation.
    println(jeff.name)
    jeff.name = "Billy Mays"    // Equivalent to .setName("Billy Mays")
    println(jeff.name)

    val temp : Address = jeff.address     // Equivalent to .getAddress()

    // Let's define an extension function for our User class.
    fun User.happyBirthday() {
        this.age ++
    }

    fun User.getFirstName(): String {
        val index : Int = this.name.indexOf(" ")
        return this.name.subSequence(0, index).toString()
    }

    println("Before his birthday, he was " + jeff.age + ".")
    jeff.happyBirthday()
    println("Now, he is " + jeff.age + ".")

    println(jeff.address)
    jeff.address = address2
    println(jeff.address)

    println("Hello ${jeff.name}, or may I call you ${jeff.getFirstName()}?")
}