import kotlin.random.Random

fun Hello() {
    println("Hello World")
}

fun Hello2(name: String) {
    println("Hello $name")
}

fun randomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    return week[Random.nextInt(week.size)]
}

fun double(x: Int) = x * 2 // Compact function

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

//lambda

val square: (Int) -> Int = { number -> number * number }


fun main() {
    Hello2("Greater")
    println( randomDay())
    println(double(5))

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = filterEvenNumbers(numbers)
    println("Even Numbers: $evenNumbers")
    println(square(4))

    // Filter even numbers using a lambda
    val evenNumber = numbers.filter { it % 2 == 0 }
    println("Even Numbers: $evenNumber")

    val squaredNumbers = numbers.map { it * it }
    println("Squared Numbers: $squaredNumbers")

    // Sum all numbers using reduce
    val sum = numbers.reduce { acc, num -> acc + num }
    println("Sum of Numbers: $sum")
}