package com.kason_zhang.myndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView)findViewById(R.id.textview);
        MyNDK myNDK = new MyNDK();
        textView.setText("RESULT IS "+myNDK.add(11,12));
    }
}
