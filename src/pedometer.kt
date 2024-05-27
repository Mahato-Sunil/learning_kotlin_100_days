fun main() {
    val Steps = 4000
    val caloriesBurned = caloriesBurned(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun caloriesBurned(steps: Int): Double {
    val caloriesBurned = 0.04
    val totalCaloriesBurned = steps * caloriesBurned
    return totalCaloriesBurned
}