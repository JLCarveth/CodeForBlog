/**
 * Created by John on 10/20/2017.
 */

fun main(args : Array<String>) {
    // Let's start out simple
    println("Hello World!")

    /**
        val denotes a read-only, immutable variable
        var denotes a mutable variable

        Best practice is to try to have most of your variables use val.
     */
    val a : Int = 100;
    val b = 250;

    /**
        Notice you can either explicitly state the type, or let Kotlin infer it
     */
    var c : String = "John"
    var d = "Smith"

    val fullName = "$c $d"

    println("$fullName, you have ${c+d} points.")

    val balance : Double = 2562.42;

    println("$fullName, you have a balance of \$$balance.")


    /**
     * A function with arguments name of type String, and id of type int.
     * Returns a boolean value
     */
    fun validate(name : String, id : Int): Boolean {
        return false;
    }


    // Kotlin doesn't have void, so we use Kotlin's Unit class
    fun func1(): Unit {
        println("No need to return stuff!")
    }

    // Unit doesn't need to be explicitly stated!
    fun func2() {
        println("No need to return stuff!")
    }

    var bool = true;
    var whileCount = 10;

    while (bool) {
        if (whileCount == 0) {
            bool = false;
        }
        whileCount--
    }

    // Loop over range
    for (i in 1..10) {
        println((i*i).toString())
    }
}