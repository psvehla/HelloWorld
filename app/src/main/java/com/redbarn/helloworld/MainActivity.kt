package com.redbarn.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.redbarn.helloworld.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun functionClick(view: View) {
        var button : Button = findViewById(R.id.button)
        button.text = "thanks!"
    }
}