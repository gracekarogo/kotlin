fun main() {
    //break statement
    for (x in 50 .. 55){
        if (x == 54){
            break
        }
        println(x)
    }
    //continue statement
    for (character in 'd' .. 'h'){
        if (character == 'e'){
            continue
        }
        println("Character is $character")
    }
}