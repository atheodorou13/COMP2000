package com.example.officespacebooking;

import android.os.Bundle;
import android.content.Intent;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyBookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_bookings);
        findViewById(R.id.btnCancelBooking1).setOnClickListener(v -> {
            startActivity(new Intent(this, BookingDetailsActivity.class));
        });
        findViewById(R.id.btnBack4).setOnClickListener(v -> {
            finish();
        });

        findViewById(R.id.btnReturntoHome3).setOnClickListener(v -> {
            startActivity(new Intent(this, EmployeeHomeActivity.class));
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}