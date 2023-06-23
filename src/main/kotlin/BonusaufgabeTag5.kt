import kotlin.math.max

fun main() {

    var number1:Int
    var number2:Int
    var number3:Int

    println("Bitte gebe die erste Zahl ein")
    number1=readln().toInt()
    println("Bitte gebe nun die zweite Zahl ein")
    number2= readln().toInt()
    println("Bitte gebe nun deine dritte Zahl ein")
    number3= readln().toInt()

    var groessteZahl= maxOf(number1, number2, number3)

    println("Die größte Zahl lautet: $groessteZahl")



}