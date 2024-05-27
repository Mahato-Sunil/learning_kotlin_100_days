import kotlin.time.times

fun main()
{
    println("Functions Definitions:")
    noReturnType()
    val text = stringType() //string type
    println(text)

    val num = intType() // int type
    println(num)

    val sum = add(23,34)
    println("Sum of number is $sum")

    //named arguments
    namedArg(Name = "Sunil Mahato", age = 21)
}

//function without return type
fun noReturnType() : Unit {
    println("This doesn't return value")
}

//function with string as return type
fun stringType () : String {
    val text0 = "Hello Sunill "
    val text1 = "This is called using the return type function"
    return "${text0 + text1}"
}

//integer type
fun intType () : Int {
    val num1 = 10
    val num2 = 30
    return num1+num2
}

//function with paramenter
 fun square(num1:Int) : Int{
     return num1*num1
 }

//function with multiple parameters
fun add (num1 : Int, num2:Int) : Int {
    return num1 + num2
}

//named arguments
fun namedArg (age : Int, Name : String)
{
    println("Name is $Name and Age is $age")
}