package geometry.shapes

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

// 클래스 바깥의 최상의 메서드를 정의할 수 있다.
// 이 메서드를 다른 패키지에서 사용하려면 'import geometry.shapes.createRandomRectangle' 해야한다.
fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
