package chapter4

/**
 * 1. 초기화 블록을 이용한 주 생성자.
 */
class User1 constructor(_name: String, _age: Int){
    val name: String
    val age: Int

    /**
     * 인스턴스 초기화 시 실행
     * 자바에서는 init 키워드 없이 중괄호{}로 표현한다.
     */
    init{
        name=_name
        age=_age
    }
    override fun toString(): String {
        return "User1(name='$name', age=$age)"
    }
}

/**
 * 2. constructor는 생략 가능하다.
 */

class User2(_name: String, _age: Int){
    val name: String
    val age: Int

    init{
        name=_name
        age=_age
    }
    override fun toString(): String {
        return "User2(name='$name', age=$age)"
    }
}

/**
 * 3. init block 대신 프로퍼티를 바로 초기화
 */

class User3(_name: String, _age: Int){
    val name = _name
    val age = _age

    override fun toString(): String {
        return "User3(name='$name', age=$age)"
    }
}

/**
 * 4. 가장 간단한 주 생성자
 * val 키워드를 사용함으로서 파라미터에 상응하는 프로퍼티가 생성된다는 뜻을 나타낸다.
 */
class User4(val name: String, val age: Int)

fun main(args: Array<String>){

    val user1 =User1("jerry",1)
    val user2 =User2("jerry",2)
    val user3 =User3("jerry",3)
    val user4 =User4("jerry",4)
    println(user1)
    println(user2)
    println(user3)
    println(user4)
}
