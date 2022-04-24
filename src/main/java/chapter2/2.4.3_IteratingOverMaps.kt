package chapter2

import java.util.*

fun main(args: Array<String>){
    val binaryReps = TreeMap<Char,String>()
    for(c in 'A' .. 'F'){
        val binary = Integer.toBinaryString(c.code)
        /*
        맵(Map) 자료구조를 get, put 대신 map[key] , map[key]=value 로 사용가능하다.
         */
        binaryReps[c]=binary // binaryReps.put(c,binary) 자바 코드와 같다.
    }

    for((letter,binary) in binaryReps){
        println("${letter} = ${binary}")
    }
}
