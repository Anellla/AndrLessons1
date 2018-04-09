package com.example.p0121_logandmess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tvOut;
    Button btnOk;
    Button btnCancel;
    Button button2;
    Button button3;

    private static final String TAG = "myLogs";


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // найдем View-элементы
        Log.d(TAG, "найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        // создаем обработчик нажатия
        Log.d(TAG, "присваиваем обработчик кнопкам");
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "ok");
                try {
                    int i = 6/0;
                    tvOut.setText("Результат деления" + i);
                    
                } catch (Exception e) {
                    Log.d(TAG, "на ноль делить нельзя", e);
                }

            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "кнопка Cancel");

                tvOut.setText("Нажата кнопка cancel");

            }


        });

        Log.d(TAG, "кнопка 21");
        button2.setOnClickListener(this);


    }

    public void var3 (View view) {
        Log.d(TAG, "кнопка 3");
        tvOut.setText("Нажата кнопка 3");
        Toast.makeText(this, "Нажата кнопка 2", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        Log.d(TAG, "кнопка 2");
        button2.setText("Нажата кнопка 2");
    }}

