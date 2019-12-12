package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*
import kotlin.random.Random

class GameActivity : AppCompatActivity() {
    var Answer:Boolean = false
    var Temp:Float =0.0F
    var Ans:Float=0.0F
    var Num1 = Random.nextInt(1,99)
    var Num2 = Random.nextInt(1,99)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        btnChoose.setOnClickListener {
            chooseOperator()
        }
    }
    fun checkAnsOnclick(view: View)
    {
        checkAnswer()
        var check = Intent(this,checkAnswer::class.java)
        check.putExtra("answer",Answer.toString())
        startActivity(check)
    }
    fun chooseOperator()
    {
        var operator = Random.nextInt(1,4)
        when(operator){
            1-> addition()
            2-> subtraction()
            3-> multiple()
            4-> divide()
        }
    }
    fun addition(){
        txtoperator.text = "+"
        txtnum1.text = Num1.toString()
        txtnum2.text = Num2.toString()
        Temp=Num1.toFloat()+Num2
    }
    fun subtraction(){
        txtoperator.text = "-"
        txtnum1.text = Num1.toString()
        txtnum2.text = Num2.toString()
        Temp=Num1.toFloat()-Num2
    }
    fun multiple(){
        txtoperator.text = "*"
        txtnum1.text = Num1.toString()
        txtnum2.text = Num2.toString()
        Temp=Num1.toFloat()*Num2
    }
    fun divide(){
        txtoperator.text = "/"
        txtnum1.text = Num1.toString()
        txtnum2.text = Num2.toString()
        Temp=Num1.toFloat()/Num2
    }
    fun checkAnswer(){
        var tempAns = txtans.text
        Ans= tempAns.toString().toFloat()+0.0F
       //ans = temp1.toFloat()
        if(Temp==Ans){
            Answer = true
        }else{
            Answer = false
        }
    }
}
