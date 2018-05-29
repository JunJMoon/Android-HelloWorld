package com.android.jun.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display_Activity_Message extends AppCompatActivity {

    private final String HELLO_WORLD_MSG_STR = "Hello World. My message is";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display___message);

        Intent intent = getIntent();
        String message_str = intent.getStringExtra(MainActivity.MESSAGE);

        TextView textView = findViewById(R.id.displayMSG);
        textView.setText(message_str);
    }
}
