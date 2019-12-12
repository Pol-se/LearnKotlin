package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_answer.*

class checkAnswer : AppCompatActivity() {
    var Sum = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_answer)
        var dataFromgame = intent.extras
        if(dataFromgame.getString("answer")=="true"){
            Sum+=100
            txtScore.text = "Your score is: $Sum"
            txtView.text = "Congratulations you are very smart."
        }else{
            txtScore.text = "Your score is: $Sum"
            txtView.text = "You wrong answer. Try again."
        }
    }
    fun tryAgainOnclick(view:View){
        var gameActivity = Intent(this,GameActivity::class.java)
        startActivity(gameActivity)
    }
}
