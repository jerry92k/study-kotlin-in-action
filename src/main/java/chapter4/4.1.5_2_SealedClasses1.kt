package ch04.ex1_5_2_SealedClasses1

/**
 * sealed 로 선언한 클래스는 자동으로 open 클래스가 된다.
 */

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
    /**
     * 코틀린 1.0 : sealed를 선언하는 경우 모든 하위 클래스는 중첩클래스로 정의해야한다.
     * 코틀린 1.5 : 하위 클래스가 반드시 중첩클래스가 아니여도 되고, sealed 클래스가 정의된 패키지 안의 아무 위치(최상위, 다른 클래스나
     * 인터페이스에 내포된 위치)에 선언할 수 있게 됐다. sealed 인터페이스도 추가됐다.
     */
}

fun eval(e: Expr): Int =
    /**
     * when 절에서 모든 하위 클래스에 대해 is를 정의해주면 else를 정의하지 않아도된다.
     * 반대로, 하위 클래스가 is로 정의되지 않으면 컴파일 오류가 난다.
     */
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
