package ch02.EvalIf

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/*
if 분기에 식이 하나밖에 없다면 중괄호를 생략해도 된다.
 */
fun eval(e: Expr): Int =
    if (e is Num) {
        e.value // 스마트 캐스트 사용
    } else if (e is Sum) {
        eval(e.right) + eval(e.left) // 스마트 캐스트 사용
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}
