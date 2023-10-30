package com.first.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class editprofil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofil);
    }
    public void launchIntent1(View view) {
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }
}