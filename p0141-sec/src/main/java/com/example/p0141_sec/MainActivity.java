package com.example.p0141_sec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox grfr, grcherry, grvish;
    MenuItem fruits, pear, plum, tomato, cherry, vishnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grfr = (CheckBox) findViewById(R.id.grfr);
        grcherry = (CheckBox) findViewById(R.id.grcherry);
        grvish = (CheckBox) findViewById(R.id.grvish);

        fruits = (MenuItem) findViewById(R.id.fruits);
        cherry = (MenuItem) findViewById(R.id.cherry);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.grfr:
                        if (grfr.isChecked())
                            fruits.setVisible(true);
                        else
                            fruits.setVisible(false);
                    break;
                    case R.id.grcherry:
                        if (grcherry.isChecked())
                            cherry.setVisible(true);
                        else
                            cherry.setVisible(false);
                    break;
                }

            }
        };
        grfr.setOnClickListener(onClickListener);
        grcherry.setOnClickListener(onClickListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


}
