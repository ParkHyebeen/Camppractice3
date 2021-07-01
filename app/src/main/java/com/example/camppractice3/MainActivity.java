package com.example.camppractice3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.btnCall);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callMainActivity2();
            }
        });

        b2 =findViewById(R.id.btnMsg);
        et1 = findViewById(R.id.etMsg);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                callMainActivity2WithMsg();
            }
        });
    }

    private void callMainActivity2(){
        //명시적 intent
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    private void callMainActivity2WithMsg(){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("msg",et1.getText().toString());
        startActivity(intent);
    }
}