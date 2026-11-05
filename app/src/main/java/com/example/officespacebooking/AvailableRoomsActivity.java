package com.example.officespacebooking;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class AvailableRoomsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_available_rooms);
        findViewById(R.id.btnMeetingRoom1).setOnClickListener(v -> {
            startActivity(new Intent(this, RoomDetailsActivity.class));
        });
        findViewById(R.id.btnMyBookings).setOnClickListener(v -> {
            startActivity(new Intent(this, MyBookingsActivity.class));
        });
        findViewById(R.id.btnBack).setOnClickListener(v -> {
            finish();
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}