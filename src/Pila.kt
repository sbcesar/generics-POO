class Pila<T> {

    private val cosas: MutableList<T> = mutableListOf()
    fun top(): T? {
        return cosas.lastOrNull()
    }

    fun push(cosa: T) {
        cosas.add(cosa)
    }

    fun pop(): T? {
        return if (!isEmpty()) {
            cosas.removeAt(cosas.size - 1)
        } else {
            null
        }
    }

    private fun isEmpty(): Boolean {
        return cosas.isEmpty()
    }

}