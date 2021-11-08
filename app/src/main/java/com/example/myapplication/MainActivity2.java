package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = findViewById(R.id.tv3);
        Intent intent = this.getIntent();
        String Str = intent.getStringExtra("Str");
        if (Str != null) {
            textView.setText(Str);


        }
    }


        public void sA (View view){

            EditText editText = findViewById(R.id.EditText01);

            Intent intent = new Intent();
            intent.setClass(MainActivity2.this, MainActivity.class);
            intent.putExtra("Str", editText.getText().toString());
            startActivity(intent);

            MainActivity2.this.finish();

        }


}




