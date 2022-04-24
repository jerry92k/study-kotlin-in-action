package ch02.ex5_2_2_TryAsAnExpression1

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    /*
    코틀린의 try는 if, when과 마찬가지로 식이다.
    따라서 try의 값을 변수에 대입할 수 있다.
    if와 달리 try 본문은 반드시 블록으로 감싸야 한다.
    내부에 여러 문장이 있으면 마지막 식의 값이 전체 결과 값이다.
     */
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}
