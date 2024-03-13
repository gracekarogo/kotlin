import java.util.Scanner
fun main(){
    var input = Scanner(System.`in`)

    print("Enter first number: ")
    var first = input.nextInt()


    print("Enter second number: ")
    var second = input.nextInt()

    println("To add select 1")
    println("To subtract select 2")
    println("To multiply select 3")
    println("To divide select 4")
    println("Select preferred operators: ")

    var operator = input.nextInt()
    var result = when(operator){
        1 -> first + second
        2 -> first - second
        3 -> first * second
        4 -> first / second

        else -> "invalid operator"
    }
    println("The answer is $result")



    }
