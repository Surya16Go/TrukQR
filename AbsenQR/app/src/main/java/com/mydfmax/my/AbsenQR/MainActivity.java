package com.mydfmax.my.AbsenQR;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkPermission();
        init();
    }
    void init(){
        Button profile = findViewById(R.id.btn_profile);
        Button login = findViewById(R.id.btn_login);
        Button sign_up = findViewById(R.id.btn_sign_up);
        Button home = findViewById(R.id.btn_home);
        PrefManager prefManager = PrefManager.getInstance(MainActivity.this);
        if(prefManager.isLoggedIn()) {
            login.setVisibility(View.GONE);
            sign_up.setVisibility(View.GONE);
            home.setVisibility(View.GONE);
            profile.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, ProfileActivity.class));
                }
            });
        } else {
            profile.setVisibility(View.GONE);
            login.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                }
            });
            sign_up.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, SignUpActivity.class));
                }
            });
            home.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }
            });
        }
    }

    public static boolean hasPermisiion(Context context, String... permissions){
        if (context != null && permissions != null){
            for (String permission : permissions)
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
        }
        return true;
    }

    private void checkPermission() {
        int PERMISIION_ALL = 1;
        String[] PERMISIION = {
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA,
                Manifest.permission.INTERNET
        };
        if (!hasPermisiion(this, PERMISIION)){
            ActivityCompat.requestPermissions(this, PERMISIION, PERMISIION_ALL);
        }
    }

}