package ch02.ex5_1_TryCatchAndFinally

import java.io.BufferedReader
import java.io.StringReader

/*
자바와 가장 큰 차이는, 체크 예외 'IOException'을 명시적으로 처리하지 않는다.
'IOException'을 try - catch에서 잡지 않았으면 메서드 시그니처 옆에 throws IOException 선언하여야 하는데, 없다.
코틀린에서는 체크 예외와 언체크 예외를 구별하지 않는다.
- 자바에서는 체크 예외 처리를 강제하지만, 예외를 다시 던지거나 그냥 무시하는 등 실제로 처리를 제대로 하지 않는다. 이런 특성을 보고 코틀린에서는
언체크 예외와 구별하지 않았다.
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
