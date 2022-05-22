package ch04.ex3_2_1_DataClassCopy

/**
 * data 클래스는 주 생성자에 정의된 property에 대하여 toString, equals, hashcode를 구현해준다.
 */
data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}
