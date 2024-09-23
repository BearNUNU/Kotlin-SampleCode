package com.example.kotlinpractice.fragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

class MainViewModel(application: Application) : AndroidViewModel(application) {
// 만약 ViewModel이 액티비티의 context를 쓰게 되면, 액티비티가 destroy 된 경우에는 메모리 릭이 발생할 수 있다.
// 따라서 Application Context를 사용하기 위해 Applicaion을 인자로 받는다.
}