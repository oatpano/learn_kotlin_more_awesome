package learnkotlinmoreawesome.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.oatrice.learnkotlinmoreawesome.R
import kotlinx.android.synthetic.main.activity_main.*
import learnkotlinmoreawesome.adapter.DemoAdapter
import learnkotlinmoreawesome.utils.getJson
import model.ModelKotlin

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // infix

        // get json
        val data = getJson<ModelKotlin>(R.raw.json_data)



        // for

        //recyclerview, adapter
        val adapter = DemoAdapter(data)
        adapter.setListener { Toast.makeText(this, it, Toast.LENGTH_SHORT).show() }

        val layoutmanager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutmanager
        recyclerview.adapter = adapter

        // higher order fn
    }
}
