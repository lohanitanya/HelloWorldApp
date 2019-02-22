package com.example.tanya.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent = getIntent();
        String recieveMessage = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.display_message);
        textView.setText(recieveMessage);
    }

    public void openFinalActivity(View view) {
        startActivity(new Intent(this,FinalActivity.class));
        
    }
}
