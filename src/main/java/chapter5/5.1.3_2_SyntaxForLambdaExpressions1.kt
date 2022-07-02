package ch05.ex1_3_2_SyntaxForLambdaExpressions1

fun main(args: Array<String>) {
    val test=  { println(42) }
    test();

    { println(42) }()
}
