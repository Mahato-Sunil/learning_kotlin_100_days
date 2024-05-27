fun main()
{
    val timeSpentToday =233
    val timeSpentYesterday = 150
    println(checkScreenTime(timeSpentToday, timeSpentYesterday))
}
fun checkScreenTime(today:Int, yesterday :Int) : Boolean
{
    return today > yesterday
}
