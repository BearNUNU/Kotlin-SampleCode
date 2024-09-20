package com.example.kotlinpractice

import android.hardware.camera2.CameraExtensionSession.StillCaptureLatency

fun main(){

}

//7. Nullable, NonNull
fun nullCheck(){
    var name: String = "kim"
//    var nullNAme: String = null 오류 발생
    var nullName: String? = null
    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase() // 이렇게 아니면 if문으로 처리해야한다 또는 엘비스
    var lastName: String? = null
    val fullNAme = name+""+(lastName ?: "") //엘비스 연산자

    //!! nullable이지만 null이 아님을 알려주는것
    fun ignoreNull(str: String?){
        val mNotNull: String = str!! //null이 아님을 확인
        val email:String? = "abc@naver.com"
        email?.let{
            println("$email")
            println(it) //it은 email
        }
        //let은 email을 람다식 안으로 넣우준다
    }
}



