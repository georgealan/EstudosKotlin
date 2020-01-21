// Uso de funções
fun calculaBonus(a: Int, b: Int, c: Int) {
    println("O bonus é: ${a + b * c * 2}")
}

// Função com retorno de String
fun hello(nome: String): String {
    return "Olá, $nome"
}

// Função em uma única linha
fun hello2(nome: String) = "Olá, $nome"

// Controle de fluxo com if e else
/*
No Kotlin o If é uma função portanto podemos aferir diretamente ao retorno.
 */
fun calculaSalario(cargo: String, salario: Float): Float {
    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

// Operador ternario não tem no Kotlin, mas podemos diminuir de forma semelhante
val valor = 10
// String str = valor == 10 ? "sim" : "não" -> Forma feita em Java
val str = if (valor == 10) "sim" else "não" // Escrito em Kotlin


// Função main responsável pela inicialização do programa.
fun main() {

    val a = 10
    val b = 20
    val c = 30

    // Operações numericas
    var numero = 10

    println("numero++ = ${numero++}")
    println("numero-- = ${numero--}")

    println("++numero = ${++numero}")
    println("--numero = ${--numero}")

    numero += 2
    println("numero+= 2 = $numero")

    numero -= 2
    println("numero-= 2 = $numero")

    numero /= 2
    println("numero/= 2 = $numero")

    numero *= 2
    println("numero*= 2 = $numero")

    numero %= 3
    println("numero%= 2 = $numero")
    //____________________________________

    // Chamada das funções.
    calculaBonus(a, b, c)
    println(hello("George"))

    // Variaveis mutáveis
    var nome = "George"

    // Variaveis imutáveis
    val nascimento = 2020

    // Declarando Variavel imutavel sem inicializar
    val x: Int

    // Formatação de Strings
    // Concatenação de Strings
    val caracteristica = "show!"
    println("Kotlin é uma linguagem $caracteristica")

    // Inserindo código junto
    println("Kotlin é uma linguagem ${caracteristica.length}")

    // Quebra de linha em Strings longas, utiliza-se 3 aspas.
    val texto = """Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce posuere, sapien quis facilisis 
        |finibus, ex felis imperdiet metus, vitae tempor est tellus eu orci. Orci varius natoque penatibus et 
        |magnis dis parturient montes, nascetur ridiculus mus. Proin vestibulum, enim sit amet volutpat aliquet, 
        |sapien nibh accumsan mi, facilisis suscipit ex dui dictum leo. In sit amet blandit libero. Praesent id 
        |malesuada erat, vel sagittis augue.
        |Praesent id tristique eros, at eleifend nisl. Nam dignissim in tortor quis lacinia. Donec lorem urna, iaculis 
        |eu mattis a, molestie a velit. Fusce dui purus, condimentum at suscipit eu, pulvinar quis ipsum. Mauris eu sem 
        |eu urna ornare mollis. Aliquam erat volutpat. Sed sit amet vehicula orci, vel euismod ligula.
    |""".trimMargin()

    println(texto)

    // Operador Elvis ?:
    val test: Int? = null

    // Se existe valor em test use se não use 100
    val op: Int = test ?: 100


}