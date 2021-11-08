package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv3);
        Intent intent = this.getIntent();
        String Str = intent.getStringExtra("Str");
        if (Str != null) {
            textView.setText(Str);

        }
    }


    public void sB(View view){

        EditText editText = findViewById(R.id.EditText01);


            Intent intent = new Intent();
            intent.setClass(MainActivity.this, MainActivity2.class);

        intent.putExtra("Str",editText.getText().toString());




        startActivity(intent);

        MainActivity.this.finish();
        }

}





















