package com.example.cbi27hasan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cbi27muntasir.R;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Button crudButton, imageButton, sensorButton, locationButton, logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crudButton = findViewById(R.id.buttonCRUD);
        imageButton = findViewById(R.id.buttonImage);
        sensorButton = findViewById(R.id.buttonSensor);
        locationButton = findViewById(R.id.buttonLocation);
        logoutButton = findViewById(R.id.buttonLogout);

 //      crudButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, NoteDetailActivity.class)));
        imageButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ImageActivity.class)));
        sensorButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, SensorActivity.class)));
        locationButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, LocationActivity.class)));

        logoutButton.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        });
    }
}