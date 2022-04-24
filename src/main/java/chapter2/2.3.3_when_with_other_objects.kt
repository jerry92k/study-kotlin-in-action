package chapter2

// 동등성을 비교한다 (equals)
fun mix(c1: Color, c2: Color) = when(setOf(c1,c2)){
    setOf(Color.RED,Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW,Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE,Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirt color")
}

// set 원소의 순서는 상관없다.
fun main(args: Array<String>) {
    println(mix(Color.BLUE, Color.YELLOW))
}

