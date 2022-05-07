package ch03.ex3_4_1_NoOverridingForExtensionFunctions

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

/**
 * 확장 함수가 아닌 경우에는 오버라이딩이 적용된다.
 */

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
}
