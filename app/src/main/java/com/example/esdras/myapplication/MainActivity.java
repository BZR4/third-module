package com.example.esdras.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder alert = new AlertDialog.Builder(this)
                .setTitle("Alert")
                .setMessage("Hello World!")
                .setPositiveButton("Ok",null);
                alert.create()
                .show();

    }
}
