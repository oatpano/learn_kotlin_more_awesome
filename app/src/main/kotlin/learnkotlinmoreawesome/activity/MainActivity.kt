package com.example.oatrice.learnkotlinmoreawesome

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.oatrice.learnkotlinmoreawesome.activity.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
