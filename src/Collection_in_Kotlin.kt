fun main() {
    list_collection()//list collection]
    set_collection()
    map_collection()
}

//list collection
fun list_collection() {
    // non mutable list cant be changed
    //mutable list
    var mutableList = mutableListOf("Apple", "Orange", "Papaya", "Grapes", "Mango");
    println("Original List \n $mutableList")
    mutableList[2] = "Peaches"  //changing the data to next list
    //printing the list
    println("After modificaton  \n $mutableList")

    //explicityly declaraing the mutable list
    var nextMutableList: MutableList<String> = mutableListOf("Ram", "Shyam", "Anju", "Sabnam")
    println(nextMutableList)

    //read only list
    var readOnlyList: List<String> = listOf("Apple", "Mango", "Orange")
    println("Read only List : $readOnlyList")

    //casting
    // preventing the modification of the list
    var castingList: MutableList<String> =
        mutableListOf("Maths", "Science", "Social", "English", "DBMD", "Java")  // the list is mutabl;e
    var castingListLocked: List<String> = castingList  // now the list is not mutable and is read only
    println("Casting List : $castingListLocked")

    //accessing the  varibale list
    //access the 3rd item form the casting list
    var item = castingList[2]
    println("The Item in 3rd  position is $item and in 5th position is ${castingList[4]}")

    //removing the last element.
    castingList.remove("Java")
    println("After Removing the Java  : \n $castingList")

    // checking if the item exists in the list
    if("Scripting" in castingListLocked)
        println("Scripting is Existed in the list")
    else
        println("Scripting is not exist in the list ")

    // counting the total number of items
    var count = castingListLocked.count()
    println("Total number of count is $count")

}

//function set
fun set_collection(){
    var mutableSet = mutableSetOf("Apple","Orange", "Mango")
    println(mutableSet)
}

fun map_collection(){
    val readMap = mapOf("Name" to "Sunil", "age " to 12)
    println(readMap)
}
