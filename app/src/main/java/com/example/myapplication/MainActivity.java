package com.example.myapplication;

import static android.app.ProgressDialog.show;
import static androidx.core.content.PackageManagerCompat.LOG_TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;
    private EditText editTextX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextA = findViewById(R.id.mainer);
        editTextA = findViewById(R.id.mainer);

    }
    public void click(View view){
        String a = editTextA.getText().toString();
        Toast.makeText(this, a,  Toast.LENGTH_SHORT).show();
    }

}