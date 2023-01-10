package com.packageDeneme.androidjavadeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add, update;
    int sayi=0;
    TextView selam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add= findViewById(R.id.main_btn_add);
        update= findViewById(R.id.main_btn_update);
        selam = findViewById(R.id.mainTxtSelam);
        selam.setVisibility(View.INVISIBLE);
        add.setText("Arttır");
        update.setText("Eksilt");

    }

    public void mainBtnClick(View view) {
        switch (view.getId()){
            case R.id.main_btn_add:sayi++;
            selam.setVisibility((View.VISIBLE));
            selam.setText(String.valueOf(sayi));
            break;
            case R.id.main_btn_update:sayi--;
            selam.setVisibility(View.VISIBLE);
            selam.setText(String.valueOf(sayi));
            break;
        }
    }
}