package ch03.ex3_3_3_UtilityFunctionsAsExtensions2

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

/**
 * 확장 함수에 구체적인 타입을 지정할 수 있다.
 * 이 경우 join 정적 메서드는 String 컬렉션에만 사용할 수 있다.
 */

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    println(listOf("one", "two", "eight").join(" "))
}
