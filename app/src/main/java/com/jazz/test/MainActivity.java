package com.jazz.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void b1_onClick(View view) {
        TextView t1 = (TextView) findViewById(R.id.t1);
                t1.setText("Нажал кнопку in");
    }
    public void b2_onClick(View view) {
        TextView t1 = (TextView) findViewById(R.id.t1);
        t1.setText("Нажал кнопку Out");
    }
}