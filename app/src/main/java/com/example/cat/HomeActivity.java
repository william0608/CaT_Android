package com.example.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;


import com.example.cat.ui.login.LoginActivity;

public class HomeActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;
    private TextView tvContenName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent loginIntent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(loginIntent);

        mBottomNavigationView=findViewById(R.id.bottom_navigation);
        tvContenName=findViewById(R.id.content_name);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.action_home) {
                    tvContenName.setText(R.string.tv_str_content_home);
                    return true;
                } else if (itemId == R.id.action_team) {
                    tvContenName.setText(R.string.bottom_navigation_menu_Team);
                    return true;
                } else if (itemId == R.id.action_files) {
                    tvContenName.setText(R.string.bottom_navigation_menu_files);
                    return true;
                } else if (itemId == R.id.action_evens) {
                    tvContenName.setText(R.string.bottom_navigation_menu_Evens);
                    return true;
                } else if (itemId == R.id.action_news) {
                    tvContenName.setText(R.string.bottom_navigation_menu_News);
                    return true;
                }
                return false;
            }
        });

    }
}