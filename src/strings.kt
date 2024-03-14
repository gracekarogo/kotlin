fun main() {
    var greetings = "Hello world"
    var firstname = "Grace"
    var lastname = "Karogo"

    //string concatination
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    //Accessing an element in a string
    println(greetings[6])

    //determining an index position of an element
    println(greetings.indexOf( "world"))
    println(greetings.indexOf( 'H'))

    //Modifying a string
    println(greetings.uppercase())

    //string interpolation
    println("Hello there,my name is $firstname")

    //determining the size of a string
    println(greetings.length)
}
