package com.example.tesk5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btncnc;
    Button btnnum;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncnc = (Button) findViewById(R.id.btncnc);
        btnnum = (Button) findViewById(R.id.btnnum);
        tv = findViewById(R.id.tv);
    }

    public void rn(View view) {
        int num = (int) (Math.random() * 100 +0);
        tv.setText("Number= "+num);
    }

    public void cancel(View view) {
        tv.setText("Number not found");
    }
}
