package ch02.ex2_2_CustomAccessors

// kotlin은 프로퍼티 접근자를 기본으로 제공하지만 아래와 같이 커스텀할 수도 있다.
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}
