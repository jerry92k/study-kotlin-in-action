package chapter4

class Client2(val name: String, val postalCode: Int)

fun main(args: Array<String>){
    val client1 = Client2("jerry",12312)
    val client2 = Client2("jerry",12312)
    println(client1==client2)
}
