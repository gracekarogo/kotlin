fun main() {
    //arithmetic operators
    var num1 = 45
    var num2 = 34
    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)

    //comparison operator
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)//equal to
    println(num1 != num2)//not equal to

    //logic operators -  and ,or and not
    println( num1 < num2 && num1  != num2) //and
    println( num1 < num2 || num1  != num2) //or
    println(!(num1 < num2 || num1  != num2)) //not

    //Assingment operators
    var x = 23
    x += 2
    println(x)

    var y = 45
    y %= 2
    println(y)

}