package com.myapp.mobileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button otpBtn;
    Button submitBtn;
    Button signupBtn;
    TextView forgotBtn;
    TextView loginBtn;
    EditText passWord;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        otpBtn = (Button) findViewById(R.id.otp);
        otpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOtpActivity();
            }
        });
        forgotBtn = (TextView)  findViewById(R.id.forgot);
        forgotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editActivity();
            }
        });
        signupBtn = (Button) findViewById(R.id.signup);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccountActivity();
            }
        });
        submitBtn = (Button) findViewById(R.id.submit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitActivity();
            }
        });

        passWord = (EditText) findViewById(R.id.password);
       passWord.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onSubmitActivity();
               Toast.makeText(getApplicationContext(),"try more char",Toast.LENGTH_LONG).show();
           }
       });



    }

    private void editActivity() {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openOtpActivity(){
        Intent otp = new Intent(this,MainActivity2.class);
        startActivity(otp);
    }
    public void createAccountActivity(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void submitActivity(){
        Intent submit = new Intent(this,MainActivity3.class);
        startActivity(submit);


    }

    public void onSubmitActivity(){
        Intent submit = new Intent(this,MainActivity3.class);
        startActivity(submit);
        String password = passWord.getText().toString();
        if (TextUtils.isEmpty(password) || password.length() < 8) {
            passWord.setError("Limit Not met ");
            Log.v("Not Word","");
            return;

        }

    }


}