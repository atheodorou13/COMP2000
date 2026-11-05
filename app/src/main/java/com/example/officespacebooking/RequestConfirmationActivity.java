package com.example.officespacebooking;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class RequestConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_request_confirmation);
        findViewById(R.id.btnMyBookings2).setOnClickListener(v -> {
            startActivity(new Intent(this, MyBookingsActivity.class));
        });

        findViewById(R.id.btnBack3).setOnClickListener(v -> {
            finish();
        });

        findViewById(R.id.btnReturntoHome).setOnClickListener(v -> {
            startActivity(new Intent(this, EmployeeHomeActivity.class));
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}