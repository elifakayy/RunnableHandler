package com.elif.runnablehandler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
int number;
Runnable runnable;
Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        number=0;
    }


    public void start(View view)
    {
        handler=new Handler();

        runnable=new Runnable() {
            @Override
            public void run() {
                textView.setText("Time : "+number);
                number++;
                textView.setText("Time : "+number);
                handler.postDelayed(runnable,1000);
            }
        };

        handler.post(runnable);
    }


    public void stop(View view)
    {

    }
}