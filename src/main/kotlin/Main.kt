fun main(args: Array<String>) {
/*
/* Условные операторы:
 1. Пользователь вводит в консоли число. Если оно больше 10, выдаем в консоли сообщение
“Число больше десяти”, если меньше – “Число меньше десяти”*/

    var num = readLine()!!.toInt()
    if (num>=10) {
        println("Число больше десяти")
    } else {
        println("Число меньше десяти")
    }

/* 2. Пользователь вводит в консоли два числа, выводим сообщение “первое число
больше/меньше, чем второе” в зависимости от результата их сравнения */

    var num_1 = readLine()!!.toInt()
    var num_2 = readLine()!!.toInt()
    if (num_1>num_2) {
        println("Первое число больше второго")
    } else {
        println("Второе число больше первого")
    }
/* 3. Пользователь вводит в консоли длины сторон треугольника (три числа), выводим
сообщение, является ли треугольник равнобедренным, равносторонним или
разносторонним. */

    var long_1 = readLine()!!.toInt()
    var long_2 = readLine()!!.toInt()
    var long_3 = readLine()!!.toInt()
    if (long_1==long_2 && long_1==long_3 && long_2==long_3 ) {
        println("Треугольник равносторонний")
    } else if ((long_1==long_2 || long_1==long_3) || (long_2==long_3 || long_2==long_1) || (long_3==long_1 || long_3==long_2)) {
        println("Треугольник равнобедренный")
    } else {
        println("Треугольник разносторонний")
    }

/*4. Пользователь вводит в консоли четыре числа. Рассчитываем и выводим в консоль
количество отрицательных и положительных чисел*/

    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    var c = readLine()!!.toInt()

    var plus = 0
    var minus = 0

    val t = if (a > 0) plus++ else minus++
    val g = if (b > 0) plus++ else minus++
    val n = if (c > 0) plus++ else minus++
    println("количество отрицательных чисел: $minus")
    println("количество положительных чисел: $plus")

/*5. Пользователь вводит в консоли три числа, выводим самое большое из них. */

    var number_1 = readLine()!!.toInt()
    var number_2 = readLine()!!.toInt()
    var number_3 = readLine()!!.toInt()
    if (number_1>number_2 && number_1>number_3) {
        println("Самое большое число $number_1")
    } else if (number_2>number_1 && number_2>number_3) {
        println("Самое большое число $number_2")
    } else {
        println("Самое большое число $number_3")
    }

/*6. Пользователь вводит в консоли три числа. Рассчитываем и выводим в консоль сумму
наибольшего и наименьшего из них*/

    var n_1 = readLine()!!.toInt()
    var n_2 = readLine()!!.toInt()
    var n_3 = readLine()!!.toInt()
    if (n_1>n_2 && n_2>n_3) {
        println(n_1+n_3)
    } else if (n_1>n_2 && n_3>n_2) {
        println(n_1+n_2)
    }
    else if (n_2>n_1 && n_3>n_1) {
        println(n_2+n_1)
    } else if (n_2>n_1 && n_1>n_3) {
        println(n_2+n_3)
    }
    else if (n_3>n_2 && n_2>n_1) {
        println(n_3+n_1)
    } else if (n_3>n_2 && n_1>n_2) {
        println(n_3+n_2)
    }

/*7. Пользователь вводит в консоли число. Выводим сообщение о том, четное число, или
нечетное*/


    print("Введите число: ")
    var num = readLine()!!.toInt()

    if (num % 2 == 0)
        println("$num четное число")
    else
        println("$num нечетное число")
*/
/*8. Программа “Магазин”, выводим меню из трех товаров с ценами. Пользователь выбирает
товар, вводит сумму денег. Если сумма меньше цены, выводим сообщение: “Денег не
хватает!”, если сумма равна цене – “Спасибо за покупку!”, если больше – “Ваша сдача:
[сумма сдачи]”*/
    /*println("Цена продукта на первый, второй и третьий продукты:")
    var product_1 = readLine()!!.toInt()
    var product_2 = readLine()!!.toInt()
    var product_3 = readLine()!!.toInt()
    println("Цена первого продукта $product_1 руб")
    println("Цена второго продукта $product_2 руб")
    println("Цена третьего продукта $product_3 руб")*/

    var price = intArrayOf(100, 50, 10)
    var namber_1 = price[0]
    var namber_2 = price[1]
    var nambe_3 = price[2]
    var product = listOf("Цена первого продукта: $namber_1", "Цена второго продукта: $namber_2", "Цена третьего продукта: nambe_3")
    println(product)
    var choice = product.get(0)
    var maney = readLine()!!.toInt()
    if (choice==true){
        if ()
    }
}