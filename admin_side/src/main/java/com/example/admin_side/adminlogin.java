package com.example.admin_side;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class adminlogin extends AppCompatActivity {
EditText emailid, password;
Button login;
DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);

        emailid=findViewById(R.id.emailid);
        password=findViewById(R.id.password);
        login=findViewById(R.id.login_button);

        databaseHelper = new DatabaseHelper(adminlogin.this);


    login.setOnClickListener(new View.OnClickListener(){
    public void onClick(View view){
            boolean isExist = databaseHelper.checkUserExist(emailid.getText().toString(),password.getText().toString());
//            String emailidvalue = emailid.getText().toString();
//            String passwordvalue = password.getText().toString();

        if(isExist){
            Intent intent = new Intent(adminlogin.this, admin_main.class);
            startActivity(intent);
            Toast.makeText(adminlogin.this, "Login Successful", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(adminlogin.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
        }
        }

        /*if (databaseHelper.isloginValid(emailidvalue, passwordvalue)) {
                Intent intent = new Intent(adminlogin.this, admin_main.class);
                startActivity(intent);
                Toast.makeText(adminlogin.this, "Login Successful", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(adminlogin.this, "Invalid Credentials", Toast.LENGTH_LONG).show();
            }*/

    });
}
}