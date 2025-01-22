package study.`class`

fun main() {

    val person = Person("캡틴", 99)
    person.printName()
}

// java로 따지면
// final로 name, age를 선언, 매개변수 전부 받는 생성자를 만들고, getter를 만드는 걸 아래처럼 간단히 구현할 수 있음
class Person(val name : String, val age : Int) {
    fun printName() {
        println("Hi, my name is $name and I am $age years old.")
    }
}

class Car(val brand : String, val year : Int) {
    var color : String  = "white"
}