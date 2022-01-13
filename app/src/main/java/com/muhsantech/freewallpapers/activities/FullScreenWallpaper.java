package com.muhsantech.freewallpapers.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.muhsantech.freewallpapers.databinding.ActivityFullScreenWallpaperBinding;

import java.util.Objects;

public class FullScreenWallpaper extends AppCompatActivity {

    ActivityFullScreenWallpaperBinding binding;
    String originalUrl = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullScreenWallpaperBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("back");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        originalUrl = intent.getStringExtra("originalUrl");

        Glide.with(this).load(originalUrl).into(binding.photoView);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}