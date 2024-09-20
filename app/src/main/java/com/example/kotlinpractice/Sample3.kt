package com.example.kotlinpractice

fun main(){
    val human = Human() //Human 객체 생성
    println("${human.name}")


    val animal = Animal(name = "cat")
    println(animal.bark())

    val korean = Korean()
    korean.eatCake()// 오버라이딩된 eatCake
}
//8. class

open class Human{
    val name = "kim"
    init {
        println("휴먼 생성할거야")
    }
    open fun eatCake(){
        println("케이크 섭취")
    }
}

class Animal constructor(name: String = "동물"){
    val name = name
    fun bark(){
        println("야옹")
    }
}

class Korean : Human(){
    override fun eatCake(){
        println("케이크를 오버 섭취")
    }
}