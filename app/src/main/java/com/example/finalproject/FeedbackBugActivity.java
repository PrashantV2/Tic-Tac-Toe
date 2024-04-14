package com.example.finalproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.finalproject.databinding.ActivityFeedbackBugBinding;

import java.util.Objects;

public class FeedbackBugActivity extends AppCompatActivity {
    public ActivityFeedbackBugBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityFeedbackBugBinding.inflate(getLayoutInflater());
        Bundle intent = getIntent().getExtras();
        String check = intent.getString("Check");

        if(Objects.equals(check, "Bug")){
            binding.btnSubmit.setText("Bug Report");
            binding.box.setHint("Enter the problem");
        }
        else {
            binding.btnSubmit.setText("Submit");
            binding.box.setHint("Enter the Feedback");

        }

        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Objects.equals(check, "Bug")){
                    binding.box.setHint("Enter the problem");
                    Toast.makeText(getApplicationContext(),"Log sent",Toast.LENGTH_SHORT).show();
                }
                else {
                    binding.box.setHint("Enter the Feedback");
                    Toast.makeText(getApplicationContext(),"Feedback Sent",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}