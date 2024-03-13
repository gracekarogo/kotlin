fun main() {
    var languages = arrayOf("Kotlin","javascript","python","C++")
    println(languages[6])

    //storing a new value or reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Looping through an array
    for (lang in languages){
        println(lang)
    }

    //Determining whether an element exist or does not exist
    if ("PHP" in languages){
        println("it does not exist")
    }
    else{
        println("it does not exist")
    }
}