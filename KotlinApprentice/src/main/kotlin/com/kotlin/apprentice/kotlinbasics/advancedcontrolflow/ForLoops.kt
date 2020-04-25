package com.kotlin.apprentice.advancedcontrolflow

fun main() {

    fun forInline() {
        val count = 10
        var sum = 0

        // For inline
        for (i in 1..count) {
            sum += i
            println(sum)
        }
    }

    fun loopUsingRepeat(){

    }

    forInline()
}