package com.example.drawblexmlpractice_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

//    액션바에 있는 UI를 담아줄 변수
//    변수 : 멤버변수 -> 담아주는 행위 : onCreate()안에서
    lateinit var toastBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        기본 액션바를 불러오자. 절대 null값이 아닐테니 끝에 !! 추가
        val defaultActionBar = supportActionBar!!
//        모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

//        실제로 어떤 커스텀뷰를 사용할건지? R. -> res폴더에서 찾아줘라 이런 의미였음~!~!
//        여기까지만 하면 액션바를 불러오지만 부자연스럽다ㅇㅇ. 양옆이 안채워짐.
        defaultActionBar.setCustomView(R.layout.my_cutom_actionbar)

//        커스텀뷰를 들고 있는 툴바를 변수에 저장.
        val toolbar = defaultActionBar.customView.parent as Toolbar
//        절대값으로 설정하는 기능을 불러와 양 옆의 여백을 각각 0으로 설정한다.
        toolbar.setContentInsetsAbsolute(0 , 0)

//        커스텀 액션바에 달아둔 버튼 찾아오
        toastBtn = defaultActionBar.customView.findViewById(R.id.toastBtn)

        toastBtn.setOnClickListener {
            Toast.makeText(this, "액션바를 통한 토스트", Toast.LENGTH_SHORT).show()
        }

    }
}