fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++}

    //incrementing values
    var x = 100
    while (x >= 95){
        println ("counter is $x")
        x-- }

    //do while loop
    var num = 20
    do {
        println(num)
        num ++ }
    while (num <= 25)

    //For loop
    var furniture = arrayOf ("Table", "Chair" ,"Desk")
    for (z in furniture)
        println(z)

    var marks = arrayOf(10 ,20 ,30)
    for (mark in marks)
        println("Mark is $mark")

    //range
    for (number in 30 .. 35){
        println(number)
    }
    for (letter in 'a'..'d') {
        println(letter)
    }


    }


