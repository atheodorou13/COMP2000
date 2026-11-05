package com.example.officespacebooking;

import android.os.Bundle;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class RoomDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_room_details);
        findViewById(R.id.btnRequestBooking).setOnClickListener(v -> {
            startActivity(new Intent(this, RequestConfirmationActivity.class));
        });

        findViewById(R.id.btnBack2).setOnClickListener(v -> {
            finish();
        });

        findViewById(R.id.btnReturntoHome2).setOnClickListener(v -> {
            startActivity(new Intent(this, EmployeeHomeActivity.class));
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}