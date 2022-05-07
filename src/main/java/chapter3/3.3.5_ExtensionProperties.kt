package chapter3

val String.lastChar: Char
    get() = get(length - 1)
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    println("jerry".lastChar)
    val sb = StringBuilder("jerry?")
    sb.lastChar = '!'
    println(sb)
}
