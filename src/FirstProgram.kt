fun main() {
    println("Hello World This is Sunil")
    println("I love kotlin")
    var sum = 0
    var num1 = 12
    var num2 = 13
    sum = num1 + num2
    println("The sum of number is " + sum)

    // calling the string template function
    string_template()
}

fun string_template() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}
