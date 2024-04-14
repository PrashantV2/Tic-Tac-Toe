package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.finalproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    boolean backCheck = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.bugImage.setBackgroundResource(R.drawable.baseline_bug);
        binding.singlePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),SinglePlayerActivity.class);
                startActivity(intent);
            }
        });


        binding.multiPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MultiPlayerActivity.class);
                startActivity(intent);

            }
        });

        binding.bugImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(backCheck){
                    binding.singleMulti.setVisibility(View.GONE);
                    binding.bugFeedback.setVisibility(View.VISIBLE);
                    binding.bugImage.setBackgroundResource(R.drawable.baseline_arrow_back_24);
                    backCheck = false;

                }
                else {
                    binding.singleMulti.setVisibility(View.VISIBLE);
                    binding.bugFeedback.setVisibility(View.GONE);
                    binding.bugImage.setBackgroundResource(R.drawable.baseline_bug);

                    backCheck = true;
                }
            }
        });

        binding.reportBug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FeedbackBugActivity.class);
                intent.putExtra("Check","Bug");
                startActivity(intent);



            }
        });

        binding.reportFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FeedbackBugActivity.class);
                intent.putExtra("Check","Feedback");
                startActivity(intent);
            }
        });



    }
}