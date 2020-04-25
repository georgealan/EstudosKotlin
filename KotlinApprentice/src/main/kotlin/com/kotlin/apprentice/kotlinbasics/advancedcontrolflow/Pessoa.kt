package com.kotlin.apprentice.advancedcontrolflow

class Pessoa(
    private val nome: String,
    private val idade: Int
) {

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade)"
    }
}