package ch02.person

// 코틀린은 프로퍼티 접근자를 제공한다. val은 getter만, var는 getter, setter
class Person(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}
