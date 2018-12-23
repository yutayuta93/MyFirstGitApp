package com.example.myfirstgitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

        TextView textView = (TextView)findViewById(R.id.textView);
        String inputText = getIntent().getStringExtra(MainActivity.INTENT_KEY);
        textView.setText(inputText);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,com.example.myfirstgitapp
                        .MainActivity.class);
                startActivity(intent);
            }
        });

        //試験用コメントの挿入

    }
}
