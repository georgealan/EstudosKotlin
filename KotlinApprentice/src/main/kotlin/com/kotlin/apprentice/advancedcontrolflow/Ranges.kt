package com.kotlin.apprentice.advancedcontrolflow

fun main() {

    // Intervalo fechado
    val closedRange = 0..5

    closedRange.forEach { i: Int ->
        println("Intervalo fechado $i")
    }
    println("\n")

    // Intervalo do meio aberto
    val halfOpenRange = 0 until 5

    halfOpenRange.forEach{i: Int ->
        println("Intervalo do meio aberto $i")
    }
    println("\n")

    // Intervalo decrescente
    val decreasingRange = 5 downTo 0

    decreasingRange.forEach { i: Int ->
        println("Intervalo decrescente $i")
    }
}

