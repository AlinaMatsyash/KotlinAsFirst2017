package lesson1.task1


import java.lang.Math.*

fun main(args: Array<String>){
    println("Malina")
    //itog()
    println("a,b,c")

}

fun sqr2(x: Double) = x * x



fun disc(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

fun itog(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1*x2
}
