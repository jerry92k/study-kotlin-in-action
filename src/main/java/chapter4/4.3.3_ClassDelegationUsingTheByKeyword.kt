package ch04.ex3_3_ClassDelegationUsingTheByKeyword

import java.util.HashSet

/**
 * by는 상속대신 데코레이터 패턴으로 새로운 클래스를 만든다.
 */

class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
    /**
     * CountingSet은 MutableCollection<T> 을 직접 extends, implements 하지 않고,
     * innerSet으로 composition하여 위임한다.
     * CountingSet은 MutableCollection<T>에 의존관계가 생기지 않는다.
     */

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}
