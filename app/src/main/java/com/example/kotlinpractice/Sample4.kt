package com.example.kotlinpractice

fun main(){
println(square(12))
    println(nameAge("kim", 12))
    val a = "pizza"
    println(a.foodGood()) //확장함수

    val ticketA=Ticket("a","b","c",4)
}
//9. Lamda
// 람다식은 우리가 value처럼 다룰 수 있는 익명 함수
/**
 * 1.) 메소드에 파라미터로 넘겨줄 수 있다.
 * 2.) 리턴값을 사용할 수 있다.
 *
 */
val square : (Int) -> (Int) = { number  -> number*number}
val nameAge : (String, Int) -> String ={name: String, age:Int -> "my name is $name and my age is$age"}


//10. 확장함수
val foodGood : String.() -> String = {
    this + "is good"
}

// data class
data class Ticket(val company: String, val name: String, var date: String, var seatNumb: Int)