package com.can_erysr.wondersoftheworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.can_erysr.wondersoftheworld.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Wonders selectedWonders = (Wonders) intent.getSerializableExtra("wondersoftheworld");

        binding.imageView.setImageResource(selectedWonders.image);
        binding.nameText.setText(selectedWonders.name);
        binding.countryText.setText(selectedWonders.country);
        binding.detailsText.setText(selectedWonders.details);

    }
}