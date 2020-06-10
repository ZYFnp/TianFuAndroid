package com.ocnyang.cartlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class person extends AppCompatActivity {

    private ImageView houtuo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        houtuo=findViewById(R.id.houtuo);
        houtuo.setOnClickListener(v->{
            Intent intent=new Intent(this,Home.class);
            startActivity(intent);
        });
    }
}