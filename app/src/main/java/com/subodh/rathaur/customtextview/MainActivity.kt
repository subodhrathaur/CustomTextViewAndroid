package com.subodh.rathaur.customtextview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var tvFirst: TextView? = null
    var tvSecond: TextView? = null
    var tvThird: TextView? = null
    var tvFourth: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFirst = findViewById(R.id.tv_first)
        tvSecond = findViewById(R.id.tv_second)
        tvThird = findViewById(R.id.tv_third)
        tvFourth = findViewById(R.id.tv_fourth)
    }
}