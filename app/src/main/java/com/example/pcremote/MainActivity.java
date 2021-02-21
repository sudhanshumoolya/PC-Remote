package com.example.pcremote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CardView shutDown;
    private CardView refresh;
    private CardView music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shutDown = findViewById(R.id.shutdown_cardView);
        refresh = findViewById(R.id.refresh_cardView);
        music = findViewById(R.id.music_cardView);

        shutDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Client myClient = new Client("shutdown");
                Toast.makeText(MainActivity.this, "Shutdown", Toast.LENGTH_SHORT).show();
                myClient.execute();
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Client myClient = new Client("restart");
                Toast.makeText(MainActivity.this, "restart", Toast.LENGTH_SHORT).show();
                myClient.execute();
            }
        });

        music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Client myClient = new Client("music");
                Toast.makeText(MainActivity.this, "music", Toast.LENGTH_SHORT).show();
                myClient.execute();
            }
        });
    }
}