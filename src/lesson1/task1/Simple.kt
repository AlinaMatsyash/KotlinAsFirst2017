@file:Suppress("UNUSED_PARAMETER")
package lesson1.task1

import java.lang.Math.*

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double) = x * x

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun sqRoot(a: Double, b: Double, c: Double) = (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

/**
 * Пример главной функции
 */
fun main(args: Array<String>) {
    // Решаем x^2 - 3*x + 2 = 0
    val x1x2 = quadraticRootProduct(1.0, -3.0, 2.0)
    println("Root product: $x1x2")
    thirdDigit(3801)

}

/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
   val s1= hours*60*60
    val s2= minutes*60
    val s3=seconds
    return s1+s2+s3
}
/**

 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
*/
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double {
    val m1= vershoks*0.04445
    val  m2=arshins*(48*0.04445/3)
    val m3=sagenes*48*0.04445
    return m1+m2+m3
}

/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(grad: Int, min: Int, sec: Int): Double{

   val r1= grad/57.295779513
   val r2= min/3437.747
   val r3=sec/206264.8
    return r1+r2+r3
}



/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */

fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    val s1=x2-x1
    val s2=y2-y1
    val s3=pow(s1,2.0)
    val s4=pow(s2,2.0)
    val s5=s3+s4
    val s6=sqrt(s5)
    return s6



}

/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit(number: Int): Int {
    val s1 =number/100
    val s2=s1%10
    return s2
}

/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int): Int {
    val s1=minutesArrive-minutesDepart
    val s2=hoursArrive-hoursDepart
    var s3: Int
    if (s1<0) {
         s3 = (s2 - 1) * 60 + 60-minutesDepart+minutesArrive
    }  else {
         s3 = s2 * 60 + 60-minutesDepart+minutesArrive
    }
    return s3

}

/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double {
    val s1=(initial*percent)/100.0
    val s2=initial+s1
    val s3=(s2*percent)/100.0
    val s4=s2+s3
    val s5=(s4*percent)/100.0
    val s6=s4+s5
    return s6
}

/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 *Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int {
    val s1=number%10
    val s2=s1*100
    val s3=number/10
    val s4=s3%10
    val s5=s4*10
    val s6=s3/10
    return s2+s5+s6
}
