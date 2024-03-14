import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("Enter room temperature :")
    var temprature = reader.nextInt()

    if (temprature < 25){
        println("it is cold")
    }
    else{
        println("it is hot")
    }

}