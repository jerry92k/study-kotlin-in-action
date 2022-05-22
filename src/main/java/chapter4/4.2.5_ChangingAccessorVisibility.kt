package ch04.ex2_5_ChangingAccessorVisibility

class LengthCounter {
    var counter: Int = 0
        private set // 기본으로 생성되는 set 메서드를 private으로 선언

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}

