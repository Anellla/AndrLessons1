package com.example.p0141_menuadv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1, ch2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (CheckBox) findViewById(R.id.checkBox);
        ch2 = (CheckBox) findViewById(R.id.checkBox2);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
//        MenuItem grass4 = menu.findItem(R.id.grass4);

//        if (ch1.isChecked()) {
//            grass4.setVisible(true);
//        }
//        else {
//            grass4.setVisible(false);
//        }


        menu.setGroupVisible(R.id.fruits,ch2.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
                getMenuInflater().inflate(R.menu.my_menu,menu);
        menu.add( 2, 2, 2, "grass4" ).isCheckable();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }


}
