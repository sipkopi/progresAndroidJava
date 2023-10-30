package com.first.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void launchIntent1(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
    public void launchIntent2(View view) {
        Intent intent1 = new Intent(this, editprofil.class);
        startActivity(intent1);

        Intent intent2 = new Intent(this, editprofil.class);
        startActivity(intent2);

    }
}