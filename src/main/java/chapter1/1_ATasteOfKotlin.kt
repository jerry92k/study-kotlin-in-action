package chapter1

// class
data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {

    // collection
    val persons = listOf(
        Person("Alice"),
        Person("Bob", age = 29)
    )


    val oldest = persons.maxByOrNull { it.age?:0 } // 리스트의 element를 임의의 인자 it으로 명명하여 받아 사용할 수 있다.
    println("The oldest is : $oldest")
}
