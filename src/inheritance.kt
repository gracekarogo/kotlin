//parent class/super class/base class
open class Animal{
    var age =2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}
//child class /sub class /derived class
open class Duck:Animal(){
    var color="white"
    fun sound(){
        println("Duck is quacking")
    }
}
class Fish:Duck(){
    var hasscales = true
    var hasfins = true

    fun eat(){
        println("Fish is eating")
    }
}

fun main() {
    var a = Animal()

    var d = Duck()
    println(d.gender)
    d.move("swim")

    var nileperch=Fish()
}