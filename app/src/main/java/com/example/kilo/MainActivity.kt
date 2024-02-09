package com.example.kilo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View.OnClickListener

class MainActivity : AppCompatActivity(), OnClickListener {
    lateinit var btnAdd : Button
    lateinit var btnSubtract : Button
    lateinit var btnMultiply : Button
    lateinit var btnDivide : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var resultTv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)
        btnDivide = findViewById(R.id.btn_divide)
        btnMultiply = findViewById(R.id.btn_multiply)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv= findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSubtract.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivide.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        println(a)
        when(v?.id){
            R.id.btn_add ->{
                println(a+b)
                result = a+b
            }
            R.id.btn_subtract ->{
                result = a-b
            }
            R.id.btn_divide ->{
                result = a*b
            }
            R.id.btn_multiply ->{
                result = a/b
            }
        }
        R.id.result_tv
        resultTv= findViewById(R.id.result_tv)
        resultTv.text = "Result is $result"
}}