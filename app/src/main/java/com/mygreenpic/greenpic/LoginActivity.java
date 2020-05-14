package com.mygreenpic.greenpic;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    @SuppressLint("WrongViewCast")
    public void Login(View v){
        Toast.makeText(getApplicationContext(), "로그인 중입니다.",Toast.LENGTH_LONG).show();
        Intent intent= new Intent(this, homepageActivity.class);
        EditText editText= findViewById(R.id.login_btn);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
