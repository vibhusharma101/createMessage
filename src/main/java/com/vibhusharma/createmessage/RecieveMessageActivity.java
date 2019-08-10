package com.vibhusharma.createmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveMessageActivity extends AppCompatActivity {


    private TextView messageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve_message);
        messageTextView = (TextView)findViewById(R.id.messageTextView);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        messageTextView.setText(message);






    }
}
