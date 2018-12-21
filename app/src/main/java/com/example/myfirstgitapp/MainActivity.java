package com.example.myfirstgitapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String INTENT_KEY = "inputText";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputText = (EditText)findViewById(R.id.editText);
                Intent intent = new Intent(MainActivity.this,com.example.myfirstgitapp
                        .SecondActivity.class);
                intent.putExtra(INTENT_KEY,inputText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
