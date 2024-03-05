fun <T> reverse(lista: List<T>): List<T> {
    val reversedList = mutableListOf<T>()
    val iterator = lista.iterator()

    while (iterator.hasNext()) {
        reversedList.add(0, iterator.next())
    }

    return reversedList
}

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val numbersRev = reverse(numbers)

    if (listOf("four", "three", "two", "one") != numbersRev)
        println("Error")
    else
        println("Correcto")

    println(numbersRev)
}