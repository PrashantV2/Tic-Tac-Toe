package com.example.finalproject;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.finalproject.databinding.ActivityMultiPlayerBinding;
import com.example.finalproject.databinding.ActivitySinglePlayerBinding;

import java.util.ArrayList;
import java.util.Random;

public class SinglePlayerActivity extends AppCompatActivity {

    boolean playerTurnChooser = true;
    ArrayList<Integer> enterList = new ArrayList<Integer>();
    int player1WinCount = 0;
    int player2WinCount = 0;
    boolean box1 = false, box2 = false, box3 = false, box4 = false, box5 = false, box6 = false, box7 = false, box8 = false, box9 = false;
    int boxInput1 = 5, getBoxInput2 = 6, getBoxInput3 = 7, getBoxInput4 = 87, getBoxInput5 = 4, getBoxInput6 = 6, getBoxInput7 = 3, getBoxInput8 = 7, getBoxInput9 = 5;

    private ActivitySinglePlayerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivitySinglePlayerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding.turnNotifier.setText("Turn: O");
        binding.box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box1) {

                    box1 = true;

                    boxInput1 = 0;

                    enterList.add(1);
                    binding.box1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();


                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box2) {
                    box2 = true;


                    getBoxInput2 = 0;
                    enterList.add(2);
                    binding.box2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));
                    if (enterList.size() <= 9) machine();
                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box3) {
                    box3 = true;

                    enterList.add(3);
                    getBoxInput3 = 0;

                    binding.box3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();


                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box4) {
                    box4 = true;
                    enterList.add(4);
                    //  binding.box1.setText("0");
                    getBoxInput4 = 0;

                    binding.box4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();

                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box5) {
                    box5 = true;
                    enterList.add(5);

                    getBoxInput5 = 0;

                    binding.box5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();


                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box6) {
                    box6 = true;
                    getBoxInput6 = 0;
                    enterList.add(6);

                    binding.box6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();

                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box7) {
                    box7 = true;

                    getBoxInput7 = 0;
                    enterList.add(7);

                    binding.box7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();


                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box8) {

                    box8 = true;

                    getBoxInput8 = 0;
                    enterList.add(8);
                    binding.box8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();

                    winnerSelect();
                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!box9) {
                    box9 = true;

                    getBoxInput9 = 0;
                    enterList.add(9);

                    binding.box9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.circle));

                    if (enterList.size() <= 9) machine();


                    winnerSelect();

                } else {
                    Toast.makeText(getApplicationContext(), "Select Different", Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boardReset();
            }
        });

    }

    public void winnerSelect() {

        if ((boxInput1 == 0 && getBoxInput4 == 0 && getBoxInput7 == 0) ||
                (getBoxInput2 == 0 && getBoxInput5 == 0 && getBoxInput8 == 0) ||
                (getBoxInput3 == 0 && getBoxInput6 == 0 && getBoxInput9 == 0) ||
                (boxInput1 == 0 && getBoxInput2 == 0 && getBoxInput3 == 0) ||
                (getBoxInput4 == 0 && getBoxInput5 == 0 && getBoxInput6 == 0) ||
                (getBoxInput7 == 0 && getBoxInput8 == 0 && getBoxInput9 == 0) ||
                (boxInput1 == 0 && getBoxInput5 == 0 && getBoxInput9 == 0) ||
                (getBoxInput3 == 0 && getBoxInput5 == 0 && getBoxInput7 == 0)
        ) {
            Toast.makeText(getApplicationContext(), "Player 1 Winner", Toast.LENGTH_SHORT).show();
            player1WinCount++;
            binding.player1Score.setText("Player 1: " + player1WinCount);
            boardReset();
            enterList.clear();

        } else if ((boxInput1 == 1 && getBoxInput4 == 1 && getBoxInput7 == 1) ||
                getBoxInput2 == 1 && getBoxInput5 == 1 && getBoxInput8 == 1 ||
                getBoxInput3 == 1 && getBoxInput6 == 1 && getBoxInput9 == 1 ||
                boxInput1 == 1 && getBoxInput2 == 1 && getBoxInput3 == 1 ||
                getBoxInput4 == 1 && getBoxInput5 == 1 && getBoxInput6 == 1 ||
                getBoxInput7 == 1 && getBoxInput8 == 1 && getBoxInput9 == 1 ||
                boxInput1 == 1 && getBoxInput5 == 1 && getBoxInput9 == 1 ||
                getBoxInput3 == 1 && getBoxInput5 == 1 && getBoxInput7 == 1
        ) {
            Toast.makeText(getApplicationContext(), "Player 2 Winner", Toast.LENGTH_SHORT).show();
            player2WinCount++;
            binding.player2Score.setText("Player 2: " + player2WinCount);
            boardReset();
            enterList.clear();

        } else if (box1 && box2 && box3 && box4 && box5 && box6 && box7 && box8 && box9) {
            Toast.makeText(getApplicationContext(), "Match Draw", Toast.LENGTH_SHORT).show();
            boardReset();
            enterList.clear();

        }


    }

    public void boardReset() {
        boxInput1 = 9;
        getBoxInput2 = 8;
        getBoxInput3 = 8;
        getBoxInput4 = 8;
        getBoxInput5 = 8;
        getBoxInput6 = 8;
        getBoxInput7 = 8;
        getBoxInput8 = 8;
        getBoxInput9 = 8;


        binding.box1.setBackground(null);
        binding.box2.setBackground(null);
        binding.box3.setBackground(null);
        binding.box4.setBackground(null);
        binding.box5.setBackground(null);
        binding.box6.setBackground(null);
        binding.box7.setBackground(null);
        binding.box8.setBackground(null);
        binding.box9.setBackground(null);
        box1 = false;
        box2 = false;
        box3 = false;
        box4 = false;
        box5 = false;
        box6 = false;
        box7 = false;
        box8 = false;
        box9 = false;
        playerTurnChooser = true;
        binding.turnNotifier.setText("Turn: O");
        enterList.clear();


    }
    public void machine() {


        if (enterList.size() <= 8) {
            Random random = new Random();
            int number = random.nextInt(9 - 1) + 1;
            while (true) {
                if (enterList.contains(number)) {
                    number = random.nextInt(9 - 1) + 1;

                } else {
                    enterList.add(number);
                    draw(number);
                    break;
                }

            }


        }


    }

    public void delayFun() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 1000);
    }

    public void draw(int number) {
        switch (number) {
            case 1:
                boxInput1 = 1;
                box1 = true;

                binding.box1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));
                break;
            case 2:
                getBoxInput2 = 1;
                box2 = true;


                binding.box2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 3:
                getBoxInput3 = 1;
                box3 = true;

                binding.box3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 4:
                getBoxInput4 = 1;
                box4 = true;

                binding.box4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 5:
                getBoxInput5 = 1;
                box5 = true;

                binding.box5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 6:
                getBoxInput6 = 1;
                box6 = true;

                binding.box6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 7:
                getBoxInput7 = 1;
                box7 = true;

                binding.box7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 8:
                getBoxInput8 = 1;
                box8 = true;

                binding.box8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;
            case 9:
                getBoxInput9 = 1;
                box9 = true;

                binding.box9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.cross));

                break;

        }
        delayFun();
    }

}