fun main() {
    val button = "A"
    // Write your code here
    val result =  when(button)
    {
        "A" -> "Yes"
        "B" -> "No"
        "X" -> "Menu"
        "Y" -> "Nothing"
        else -> "There is no such button"
    }
    println(result)
}