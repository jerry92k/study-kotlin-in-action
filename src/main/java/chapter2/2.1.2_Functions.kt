package chapter2

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// 더 간결한 표현법
fun max2(a: Int, b: Int): Int = if (a > b) a else b

// 반환타입을 생략할 수도 있다. => 타입 추론으로 가능.
fun max3(a: Int, b: Int) = if (a > b) a else b

