package ch02.FizzBuzz
/*
코틀린에는 자바의 for 루프와 같은 초깃값, 증가값, 최종값 등의 요소가 없다.
범위(range) 만을 사용한다.
 */
fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
}
