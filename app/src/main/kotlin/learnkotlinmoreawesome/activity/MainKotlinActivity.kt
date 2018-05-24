package com.example.oatrice.learnkotlinmoreawesome

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.oatrice.learnkotlinmoreawesome.activity.MainJavaActivity
import kotlinx.android.synthetic.main.activity_main.*
import learnkotlinmoreawesome.adapter.Adapter
import learnkotlinmoreawesome.utils.getJson
import learnkotlinmoreawesome.utils.onClick
import model.ModelKotlin



class MainKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button onClick {
            val intent = Intent(this,  MainJavaActivity::class.java)
            startActivity(intent)
            finish()
        }

        val dataList = getJson<ModelKotlin>(R.raw.json_data)

        dataList.datalist.forEach {
            println(it.name)
        }

        dataList.datalist.forEachIndexed { index, data ->
            println("${data.name} position: $index")
        }

        val adapter = Adapter(dataList)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = adapter
    }

}
