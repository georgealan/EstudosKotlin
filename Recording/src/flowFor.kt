fun main() {
    // For - loop

    val str = "George Alan"
    for (c in str){
        print("$c ")
    }

    for (i in 1..50){
        println(i)
    }

    // Usando step para pular valores
    for (i in 0..100 step 10){
        println("$i ")
    }

    // For com decremento
    for (j in 10 downTo 0){
        print("Decremento = ")
        println("$j ")
    }
}