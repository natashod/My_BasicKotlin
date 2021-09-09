package com.natashazahr.mybasickotlin

fun main() {
    var berat = 58.5
    var tinggi = 1.45

    val bmi = berat / (tinggi * tinggi)
    println("Sekarang beratmu $bmi")

    if (bmi > 28) {
        println("Haduh ! Kamu Obesitas, ayo diet !")
    } else if (bmi > 23 && bmi < 28) {
        println("Kamu Overweight, pola makannya di atur ya!")
    } else if (bmi > 17 && bmi < 23) {
        println("Kamu Normal kok! tetap makanan sehat ok!")
    } else if (bmi < 17){
        println("Haduh ! kamu Underweight, ayo perbanyak makan daging!")
    }
}








