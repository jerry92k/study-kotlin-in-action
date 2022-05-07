package ch03.ex4_2_Varargs

/**
 * 스프레드 연산자를 사용하면 배열을 가변길이 인자로 넘길 수 있다.
 * 자바에서는 배열을 그냥 넘기면 되지만 코틀린에서는 배열을 명시적으로 풀어서 배열의 각 원소가 인자로 전달되게 해야한다.
 */

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    println(list)
}
