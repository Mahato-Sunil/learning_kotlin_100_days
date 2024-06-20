//// function to convert the text to upper case using normal function
//fun convertUpperCase(text : String ) : String {
//    return text.uppercase();
//}
//fun main() {
//    var myText = convertUpperCase("this is the uppercase string")
//    println(myText)
//}

// same function can be carried out using the lambda expression
fun main() {
    val convertUpperCase = { text: String -> text.uppercase() }
    println(convertUpperCase("this is the uppercase string"))

    println("Using lambda in filtering +ve and -ve in array or list ")
    val myList = listOf(12, -3, 3, -32, -23, 45, 23)
    val positve = myList.filter { pos: Int -> pos > 0 }
    val negative = myList.filter { neg: Int -> neg < 0 }
    println("Positive List : $positve")
    println("Negative List : $negative")
}

