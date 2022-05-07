package ch03.ex3_4_2_NoOverridingForExtensionFunctions1

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

/**
 * 확장함수는 정적메서드이기 때문에 수신객체의 정적 타입에 의해 호출이 결정된다.
 */

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff()
}
