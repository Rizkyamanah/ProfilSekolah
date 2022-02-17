package com.example.profilsekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profil(View view) {
        Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(MainActivity.this, guruActivity.class);
        startActivity(intent);
    }

    public void eskul(View view) {
        Intent intent = new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(MainActivity.this, fasilitasActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(MainActivity.this, perpusActivity.class);
        startActivity(intent);
    }

    public void galeri(View view) {
        Intent intent = new Intent(MainActivity.this, galeriActivity.class);
        startActivity(intent);
    }
}