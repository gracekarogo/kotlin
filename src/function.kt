import java.util.*

fun main() {
    //Predefined Functions
    println("Hello kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(23,19)
    println("The maximum value is $y")

    var z = Math.round(45.98)
    println(z)

    name()
    product(num1 = 12, num2 = 30)
    product(num1 = 7, num2 = 9)
    details(name = "Joe", age = 19)
    details(name = "Mary", age = 18)

}
//user-defined Function
fun name(){
    println("Grace")
}
fun product(num1:Int,num2:Int){
    println(num1*num2)
}
fun details(name:String,age:Int){
    println("$name is $age years old")

}
}
