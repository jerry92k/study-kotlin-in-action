package chapter4

/**
 * 1. 초기화 블록을 이용한 주 생성자.
 */
class User5 constructor(_name: String, _age: Int){
    val name: String
    var age: Int
    var height = 150

    /**
     * 인스턴스 초기화 시 실행
     * 자바에서는 init 키워드 없이 중괄호{}로 표현한다.
     */
    init{
        name=_name
        age=_age + 200
    }

    /**
     * 주 생성자에 위임하게 되어 init 실행으로 age가 201이 되었다가,
     * 부 생성자 constructor가 실행되면서 101로 변경된다.
     */

    constructor(_name: String, _age: Int, _height: Int ) : this(_name,_age) {
        height =_height
        age= _age + 100
    }

    override fun toString(): String {
        return "User5(name='$name', age=$age)"
    }


}

fun main(args: Array<String>){

    val user5 =User5("jerry",1,190)
    println(user5) // age는 101 출력
}
