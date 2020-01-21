/*
O when (Quando) é parecido com o Switch do Java.
 */
fun operacao(a: Int, b: Int, c: String): Int {
    when (c) {
        "soma" -> return a + b
        "Subtracao" -> {
            return a - b
        }
        else -> {
            println("Operacao incorreta")
            return 0;
        }
    }
}

fun validaNumero(a: Int, b: Int, c: String) {
    when {
        a > 0 && b > 0 -> {
            println("Variaveis maiores que zero")
        }
    }

    // Range - Intervalo de valores ..
    when (a){
        in 1..99 -> {
            println("Século")
        }
    }

    when {
        a in 1..99 && b > 0 -> {
            println("Errado")
        }
    }
}

fun main() {

}