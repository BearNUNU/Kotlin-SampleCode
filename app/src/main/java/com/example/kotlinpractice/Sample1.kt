package com.example.kotlinpractice

fun main(){
    helloWorld()
    println(add(1,2))
}

//1. 함수
fun helloWorld(): Unit{
    println("hellow world")
}

fun add(a:Int, b:Int) : Int{
    return  a + b
}

//2. val vs var
fun hi(){
    val a: Int = 10
    var b: Int = 9

//    a = 100 오류 발생 val는 재할당이 불가능함
    b = 100
}

//3. String Template
fun printName(a: String): Unit{
    println("my name is $a ")
}

//4. 조건식
fun maxBy(a: Int,b: Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a: Int, b: Int) : Int = if (a>b) a else b //maxBy와 maxBy2는 같은 함수

fun checkNum(score: Int){
    when(score){
        0 -> println("점수는 $score")
        1 -> println("점수는 $score")
        2 -> println("점수는 $score")
        3 -> println("점수는 $score")
        else -> println("점수는 $score")
    }
}

fun checkNum2(score: Int){
    when(score){
        in 0..100 -> println("점수는 $score")
        else -> println("점수는 $score")
    }
}

//5. Expression vs Statement
/**
 * Expression - 무언가 값을 만들면 표현식
 * Statement - 어떤 동작을 하면 Statement
 * 근데 코틀린의 모든 함수는 표현식, 왜냐면 결국 모든 함수는 Unit을 반환하기 때문이다.
 */

//6. Array & List
fun array(){
    val array: Array<Int> = arrayOf(1,2,3) // 읽기 쓰기
    val list:List<Int> = listOf(1,2,3) // 읽기만 가능함
    val mutablelist:MutableList<Int> = mutableListOf(1,2,3) //읽기 쓰기
    array[0] = 5
//    list[0] = 4 오류 발생, 읽기만 가능하기 때문
    mutablelist[0] = 5

    var result = list.get(2)
}

//6. for & while
fun forAndWhile(){
    val student : ArrayList<String> = arrayListOf("a", "b", "c", "d")
    for(name in student){
        println("$name")
    }
    var index =0
    val maxIndex = student.lastIndex
    while (index<maxIndex)
        println("$index")
    index++
}