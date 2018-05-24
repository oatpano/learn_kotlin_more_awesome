package com.example.oatrice.learnkotlinmoreawesome.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.oatrice.learnkotlinmoreawesome.MainKotlinActivity;
import com.example.oatrice.learnkotlinmoreawesome.R;
import com.example.oatrice.learnkotlinmoreawesome.adapter.AdapterJava;
import com.example.oatrice.learnkotlinmoreawesome.model.ModelJava;
import com.example.oatrice.learnkotlinmoreawesome.utils.GsonJavaUtils;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainJavaActivity.this, MainKotlinActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ModelJava data = GsonJavaUtils.getJsonFixModelClass(this, R.raw.json_data);

        for (ModelJava.Data data2 : data.getDatalist()) {

            Log.d("TAG", data2.getName());
        }


        for (int index = 0; index < data.getDatalist().size(); index++) {

            Log.d("TAG", data.getDatalist().get(index).getName());

        }

        AdapterJava adapter = new AdapterJava(data);
        adapter.setListener(new AdapterJava.MyListener() {
            @Override
            public void onItemClilck(String name) {
                Toast.makeText(MainJavaActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
