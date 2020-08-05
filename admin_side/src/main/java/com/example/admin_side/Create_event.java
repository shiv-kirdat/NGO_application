package com.example.admin_side;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Create_event extends AppCompatActivity {
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        db=new DatabaseHelper(this);
        boolean insertevent=db.insertevent("gunj","kolhapur",20);
        if (insertevent==true){
            Toast.makeText(getApplicationContext(),"Succesfully inserted",Toast.LENGTH_SHORT).show();
        }
    }
}
