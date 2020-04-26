package com.kotlin.apprentice.kotlinbasics.operacoesaritmeticas

import kotlin.math.*

fun main() {

    fun calcularSenoCosceno() {
        println(sin(45 * PI / 180))
        println(cos(135 * PI / 180))
    }

    fun calcularRaizQuadrada(numero: Double) {
        val result = sqrt(numero)
        println(result)
    }

    fun calcularMaximo(first: Int, second: Int) {
        println("O maior número é: ${max(first, second)}")
    }

    fun calcularMinimo(first: Int, second: Int) {
        println("O menor número é: ${min(first, second)}")
    }

    // Combinando funções
    fun combinandoFuncoes() {
        println("Combinando funções: ${max(sqrt(2.0), PI / 2)}")
    }

    calcularSenoCosceno()
    calcularRaizQuadrada(4.0)
    calcularMaximo(2, 10)
    calcularMinimo(2, 10)
    combinandoFuncoes()
}