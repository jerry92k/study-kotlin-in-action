package chapter2

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


internal class VariableTest{

    @Test
    @DisplayName("초기화가 한번만 가능하기 때문에 아래 구문은 컴파일 될 수 없다.")
    fun valTest(){
        val message: String
        message="first"

//        message="second" // 초기화가 한번만 가능하기 때문에 아래 구문은 컴파일 될 수 없다.
    }

    @Test
    @DisplayName("val 타입이여도 객체 내부는 변경할 수 있다.")
    fun valObjectTest(){
        val person = Person("jerry",31)
        person.age=20
    }

    @Test
    fun varTest(){
        var message: String
        message="first"
        message="second" // 여러번도 가능하다
    }

    data class Person(val name: String, var age: Int)

}
