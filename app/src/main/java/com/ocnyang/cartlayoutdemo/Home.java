package com.ocnyang.cartlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    private ImageView imageView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        imageView8=findViewById(R.id.imageView8);
        imageView8.setOnClickListener(v->{
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
        });


    }


}