package chapter2

// java와 달리 break를 사용하지 않는다.
fun getMnemonic(color: Color) = when(color){
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
}

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
}
