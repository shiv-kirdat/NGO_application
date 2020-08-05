package com.example.admin_side;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class adminActivity extends AppCompatActivity {

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        db = new DatabaseHelper(this);

        Button create_event = findViewById(R.id.create_event);

        create_event.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                openNew();

            }
        });

    }
    public void openNew(){
        Intent i = new Intent(this,Create_event.class);
        startActivity(i);
    }

}
