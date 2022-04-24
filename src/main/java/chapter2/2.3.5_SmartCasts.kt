package ch02.ex3_5_SmartCasts

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    /*
    코틀린에서는 is로 변수의 타입을 검사한다. 자바의 instanceOf 와 유사하다.
    그렇지만 스마트캐스팅이 동작하여, 별도로 다시 타입을 변환해주지 않아도, is를 검사한 구문 안에서 타입이 자동으로 캐스팅된다.
    (참고 : 스마트캐스트는 is 로 확인하는 변수가 불변성을 지닌 경우에만 동작한다.
    val 선언이 아니거나, val 선언이어도 커스텀 접근자를 사용하는 경우에는 해당 프로퍼티에 대한 접근이 항상 같은 값을 반환할지 확신할 수 없기 때문에 스마트 캐스팅 되지 않는다.
    이 경우에는 명시적 타입 캐스팅으로 as 를 사용한다.
     */

    if (e is Num) {
        /*
        코틀린에서 함수 파라미터를 통해 입력되는 모든 값은 변하지 않는 immutable이다.
        따라서 함수 파라미터는 모두 val이 생략된 형태이고, 그래서 명시적 타입 캐스팅이 불필요하다.
        */
        val n = e as Num // 여기에선 Num이
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
