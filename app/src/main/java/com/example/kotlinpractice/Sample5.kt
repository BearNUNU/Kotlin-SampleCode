package com.example.kotlinpractice

fun main(){
    val book = Book.create()

    println("${book.id}")
}

class Book private constructor(val id: Int , name: String){
    companion object BookFactory{
        fun create() = Book(0,"animal farm")
    }
}