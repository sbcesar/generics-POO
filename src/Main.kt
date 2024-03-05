fun <T> reverse(lista: List<T>): MutableList<T> {
    val pila = Pila<T>()
    val reversedList = mutableListOf<T>()

    lista.forEach { pila.push(it) }

    while (!pila.isEmpty()) {
        val cosa = pila.top()

        if (cosa != null) {
            reversedList.add(cosa)
            pila.pop()
        } else {
            break
        }
    }

    return reversedList
}

fun main() {
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers)

    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")

    println(numbersRev)

    println()
    println("***************************************")
    println()

    val tiposDatosRandom = listOf(1,-2,"hola",true,0.25,Usuario("César",20))

    val reversedTiposDatosRandom = reverse(tiposDatosRandom)

    //Creo que sale error porque las clases, al revertirlas, nunca son las mismas porque el id de la clase cambia
    if (!listOf(1,-2,"hola",true,0.25,Usuario("César",20)).equals(reversedTiposDatosRandom)) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(reversedTiposDatosRandom)

    println()
    println("***************************************")
    println()

    val listaProductos = listOf(
        Producto("Tomate",2.20),
        Producto("Sardinas",4.40),
        Producto("Albondigas",4.0)
    )

    val reversedListaProductos = reverse(listaProductos)

    if (!listOf(
            Producto("Tomate",2.20),
            Producto("Sardinas",4.40),
            Producto("Albondigas",4.0)
        ).equals(reversedListaProductos)) {
        println("Error")
    } else {
        println("Correcto")
    }

    println(reversedListaProductos)
}