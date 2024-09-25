fun main() {
    println("Task1:\n")
    task1()
    println("\nTask2:\n")
    task2()
    println("\nTask3:\n")
    task3()
    println("\nTask4:\n")
    task4()
    println("\nTask5:\n")
    task5()
    println("\nTask6, Step1:\n")
    task6step1()
    println("\nTask6, Step2 and Step3:\n")
    task6step2and3()
    println("\nTask7, Step1 and Step2:\n")
    task7step1and2()
    println("\nTask8:\n")
    task8()
    println("\nTask9:\n")
    task9()
    print("\nTask10:\n")
    task10()
}

fun task1(){
    println("Use the val keyword when the value doesnt change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

fun task2(){
    println("New chat message from a friend")
}

fun task3(){
    var discountPercentage: Int = 0
    var offer: String = ""
    var item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

fun task4(){
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun task5() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun task6step1() {
    val firstNumber = 10
    val secondNumber = 5
    var result = 0
    result = firstNumber + secondNumber

    println("$firstNumber + $secondNumber = $result")
}

fun task6step2and3() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun task7step1and2() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun task8() {
    val Steps = 4000
    val caloriesBurned = pedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(NumberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val TotalCaloriesBurned = NumberOfSteps * caloriesBurnedForEachStep
    return TotalCaloriesBurned
}

fun task9() {
    val firstTimeSpentToday = 300
    val firstTimeSpentYesterday = 250
    println(comparison(firstTimeSpentToday, firstTimeSpentYesterday))
    println()

    val secondTimeSpentToday = 300
    val secondTimeSpentYesterday = 300
    println(comparison(secondTimeSpentToday, secondTimeSpentYesterday))
    println()

    val thirdTimeSpentToday = 200
    val thirdTimeSpentYesterday = 220
    println(comparison(thirdTimeSpentToday, thirdTimeSpentYesterday))
    println()

}

fun comparison(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun task10() {
    println(weather("Ankara", 27, 31, 82))
    println(weather("Tokyo", 32, 36, 10))
    println(weather("Cape Town", 59, 64, 2))
    println(weather("Guatemala City", 50, 55, 7))
}

fun weather(city: String, lowTemperature: Int, highTemperature: Int, rainChance: Int): String {
    return "\nCity: $city \nLow temperature: $lowTemperature \nHigh temperature: $highTemperature \nChance of rain: $rainChance%"
}
//test 2