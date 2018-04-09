package com.example.p0111_resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.drawable.t3:
//                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.u7));
//                        break;
//                    case R.drawable.u7:
//                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.i6));
//                        break;
//                    case R.drawable.i6:
//                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.t3));
//                        break;
//                }

                imageView.setImageDrawable(getResources().getDrawable(R.drawable.i6));
            }
        });



    }
}
