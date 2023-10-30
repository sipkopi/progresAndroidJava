package com.first.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akundetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akundetail);
    }

    // Deklarasikan metode launchIntent di luar metode onCreate
    public void launchIntent(View view) {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
