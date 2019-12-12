package com.example.minipro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bntStartOnclick(view: View)
    {
        var gameActivity = Intent(this,GameActivity::class.java)
        startActivity(gameActivity)
    }
}
