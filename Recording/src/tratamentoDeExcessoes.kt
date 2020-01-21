import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    try {
        println("fdfdf".toInt())
    }catch (e: NumberFormatException){
        println("Esse valor não é um número")
    } catch (e: Exception){
        println("Algo de errado ocorreu")
    } finally {
        println("Garantindo o fechamento de arquivos, ou tratamento de execução após um erro")
    }
}