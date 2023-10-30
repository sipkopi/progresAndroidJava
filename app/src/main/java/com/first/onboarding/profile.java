package com.first.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void launchIntent1(View view) {
        Intent intent = new Intent(this, akundetail.class);
        startActivity(intent);
    }

    public void launchIntent2(View view) {
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }
}
