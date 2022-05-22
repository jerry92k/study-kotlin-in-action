package chapter4

class Client(val name:String, val postalCode: Int){
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>){
    val client = Client("jerry",123542)
    println(client)
}
