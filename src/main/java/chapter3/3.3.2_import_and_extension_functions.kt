package chapter3

/**
 * 확장함수.
 * 어떤 클래스의 멤버 메서드인 것처럼 호출할 수 있다.
 */

fun String.lastChar(): Char = this.get(this.length -1)

/**
 * 자바에서는 내부적으로 정적 메서드로 변환되므로 다음과 같다.
 * public static char lastChar(String word){
 *  return word.get(word.length-1);
 * }
 */

fun main(args: Array<String>) {
    val word = "jerry"
    println(word.lastChar())
    /** 자바에서는 다음과 같다
     * Chapter3Kt.lastChar(word);
     */
}
