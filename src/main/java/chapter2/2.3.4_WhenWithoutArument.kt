package ch02.ex3_4_WhenWithoutArument

import chapter2.Color

fun mixOptimized(c1: Color, c2 : Color) =
    /*
    when의 분기조건에 있는 객체는 함수가 호출될 때 마다 매번 재생성된다.
    인자가 없는 when 식을 사용하여 비효율을 방지할 수 있다.
     */
    when { // when에 인자가 없다(set 인스턴스를 만들지 않는다.) 각 분기 조건이 boolean 결과를 계산하는 식이어야 한다.
        (c1 == Color.RED && c2 == Color.YELLOW) ||
        (c1 == Color.YELLOW && c2 == Color.RED) ->
            Color.ORANGE

        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
        (c1 == Color.BLUE && c2 == Color.YELLOW) ->
            Color.GREEN

        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
        (c1 == Color.VIOLET && c2 == Color.BLUE) ->
            Color.INDIGO

        else -> throw Exception("Dirty color")
    }

fun main(args: Array<String>) {
    println(mixOptimized(Color.BLUE, Color.YELLOW))
}
