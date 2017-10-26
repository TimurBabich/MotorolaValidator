package com.example.timurbabich.first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.os.Build;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    Button button;
//    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        button = (Button) findViewById(R.id.button);
//        button2 = (Button) findViewById(R.id.button2);

        OnClickListener ClickButton = new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String man;
                man = Build.MANUFACTURER;
//                textView.setText(man);
                if (man.equals("motorola")) textView2.setText("Motorola");
                else textView2.setText("Other");
//                textView.setText(Build.MANUFACTURER);
            }
        };

/*        OnClickListener oclbutton2 = new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textView.setText(Build.PRODUCT);
            }
        };*/

        button.setOnClickListener(ClickButton);
//        button2.setOnClickListener(oclbutton2);
    }
}
