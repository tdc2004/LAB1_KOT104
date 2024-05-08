package com.chinhdev.kotlin_buoi1.ui.theme

fun main() {
    println("Lab1 - Tong Doanh Chinh")

    // khai bao bien: dung val,var
    val a = 1
    val b = 10
    val c = a + b

    print("Tong cua $a va $b la $c \n")

    // khai bao bien - ro kieu du lieu
    val sothunhat: Int = 3
    val sothuhai: Double = 4.0
    val ketqua: String = "Tich cua 2 so $sothunhat va $sothuhai la ${sothunhat * sothuhai}\n"
    println(ketqua)
    val kq = phepChia(10,5)
    println("Ket qua cua phep chia la: ${kq}")
    inThongBao("Xin chao cac ban")
    // 8 kieu du lieu nguyen thuy
//    intArrayOf();
//    charArrayOf();
//    shortArrayOf();
//    byteArrayOf();
//    floatArrayOf();
//    doubleArrayOf();
//    longArrayOf();
//    booleanArrayOf()
    
}

fun phepChia(a: Int, b: Int): Int {
    if (b == 0){
        return 0
    }
    val thuong = a / b
    return thuong
}
fun inThongBao(s: String): Unit{
    println(s)
}