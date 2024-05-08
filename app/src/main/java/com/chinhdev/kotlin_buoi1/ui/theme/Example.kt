package com.chinhdev.kotlin_buoi1.ui.theme

fun main() {
    VD2()
    val o = Oto("i10", "Toyota")
    o.oto()

    cases("Hello")
    cases(1)
    cases(0L)
    cases("hello")

    VD1()
    println("\n")
    VD2()
    println("\n")
    VD3()
    println("\n")
    VD6()
    println("\n")
    VD7()
    println("\n")
    VD8("đây là ví dụ 8");
    println("\n")
    VD9()
    println("\n")
    VD10()
}

fun VD1() {
    println("Vi Du ve vong lap for")
    for (i in 1..10) {
        println("Gia tri cua i la: ${i}")
    }
}

fun VD2() {
    println("Vong lap while va do-while")
    var i = 10
    while (i > 0) {
        println("${i}")
        i--
    }
    println("\n")
    var j = 0
    do {
        println("${j}")
        j++
    } while (j < 5)

}

fun VD3() {
    println("when == switch case trong java")
    while (true) {
        println("Moi nhap so a: ")
        val a = readLine();
        if (a != null) {
            try {
                val number = a.toInt()
                when (number) {
                    1 -> println("a la so 1")
                    2 -> println("a la so 2")
                    else -> println("a khong phai so 1 va so 2")
                }
                break
            } catch (e: Exception) {
                e.message
            }
        } else {
            println("Loi")
        }
    }
}

class Oto(val tenOto: String, val hangOto: String) {
    fun oto() {
        println("Ten oto la ${tenOto} thuoc hang xe: ${hangOto}")
    }
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

fun VD6() {
    fun max(a: Int, b: Int) =
        if (a > b) a else b

    println(max(10, 42))
}

fun VD7() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}

fun VD8(s: String): Unit {
    println(s)
}

// Bài 9
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun VD9() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}

// Bài 10
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun VD10() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}

