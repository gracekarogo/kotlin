import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    print("Enter the firt number :")
    var first = input.nextInt()

    print("Enter the second number :")
    var second = input.nextInt()

    print("Enter the third number :")
    var third = input.nextInt()

    if (first < second && first < third){
        println("$ first is the smallest")
        }

        else if(second < first && second < third) {
            println("$ second is the smallest")
        }

        else{
            println("$ third the smallest number")
        }

    }
