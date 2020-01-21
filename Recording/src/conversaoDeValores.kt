fun main() {
    /**
     * Podemos fazer conversão de valores facilmente com o to.
     *
     * Double 64
     * Float 32
     * Long 64
     * Int 32
     * Short 16
     * Byte 8
     */
    val numero1: Double = Double.MAX_VALUE
    val numero2: Byte = 100

    println(numero2.toShort())
    println(numero2.toLong())
    println(numero2.toFloat())
    println(numero2.toDouble())

    println("19".toInt())
    println("19".toFloat())
    println("19".toDouble())
    println("19".toInt())
}