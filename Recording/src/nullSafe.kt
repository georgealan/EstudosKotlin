fun main() {
    /**
     * O Kotlin utiliza o null safe para assegurar que não ocorra o Null Pointer Exception.
     */
    val str: String? = null

    println(str?.length) // null safe
    println(str!!.length) // Assumindo o risco, vai dar erro de KotlinNullPointerException
}