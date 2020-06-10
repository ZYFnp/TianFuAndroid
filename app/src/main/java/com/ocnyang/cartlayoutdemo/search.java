package com.ocnyang.cartlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class search extends AppCompatActivity {

    private ImageView imageView16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        imageView16=findViewById(R.id.imageView16);
        imageView16.setOnClickListener(v->{
            Intent intent=new Intent(this,Home.class);
            startActivity(intent);
        });
    }
}