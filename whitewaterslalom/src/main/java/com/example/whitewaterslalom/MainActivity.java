package com.example.whitewaterslalom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button compets;
    Button otbor;
    Button sbornaya;
    Button pravila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compets = (Button) findViewById(R.id.compets);
        otbor = (Button) findViewById(R.id.otbor);
        sbornaya = (Button) findViewById(R.id.sbornaya);
        pravila = (Button) findViewById(R.id.pravila);

        compets.setOnClickListener(this);
        otbor.setOnClickListener(this);
        sbornaya.setOnClickListener(this);
        pravila.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.compets:
                Intent intent = new Intent(this,Competits.class);
                startActivity(intent);
                break;
            case R.id.otbor:
                intent = new Intent(this,otbor.class);
                startActivity(intent);
                break;
            case R.id.sbornaya:
                intent = new Intent(this,sbornaya.class);
                startActivity(intent);
                break;
            case R.id.pravila:
                intent = new Intent(this,rules.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.about) {
            Toast.makeText(this, "Olena Us, v.1.0.0.", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
