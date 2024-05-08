package com.chinhdev.kotlin_buoi1.ui.theme

fun main() {
    var a = 0.0
    var b = 0.0
    var s: String?
    while (true) {
        println("Mời nhập a: ")
        s = readLine()
        if (s != null) {
            try {
                a = s.toDouble();
                break;
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
    while (true) {
        println("Mời nhập b: ")
        s = readLine()
        if (s != null) {
            try {
                b = s.toDouble();
                if (b != 0.0) {
                    break
                } else {
                    println("Lỗi")
                }
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thuong: " + String.format("%.2f",(a / b)))
}