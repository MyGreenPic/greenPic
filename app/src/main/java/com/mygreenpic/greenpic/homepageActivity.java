package com.mygreenpic.greenpic;

import android.content.Intent;
import android.drm.DrmStore;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuPresenter;

import static com.mygreenpic.greenpic.R.menu.homepage2;
import static com.mygreenpic.greenpic.R.menu.homepage_menu;

public class homepageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        Button button=findViewById(R.id.navigation_plus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                startActivity(new Intent(homepageActivity.this, Popup.class));
            }
        });
    }

        public void noti(View v){
        Intent intent=new Intent(this,NotiActivity.class);
        startActivity(intent);
        }
}



