package com.kim.pizzaorderapp_kim2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

//        버튼 클릭 등의 이벤트 관련 코드 모음

    }
    override fun setValues() {

//        화면에 데이터를 표기하기 위한 코드 모음
    }


}