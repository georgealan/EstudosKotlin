fun main() {
    var index: Int = 0
    while (index < 100) {
        println(index)
        index++

        if (index == 50) {
            break
        }

    }

    // do while
    var l: Int = 10
    do {
        println(l)
        l += 10
    }while (l <= 50)
}