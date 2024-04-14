package com.example.finalproject;

import android.content.Intent;
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

public class MultiPlayerActivity extends AppCompatActivity {
    boolean playerTurnChooser = true;
    int player1WinCount = 0;
    int player2WinCount = 0;
    boolean box1=false,box2=false,box3=false,box4=false,box5=false,box6=false,box7=false,box8=false,box9=false;
    int boxInput1 =5,getBoxInput2=6,getBoxInput3=7,getBoxInput4=87,getBoxInput5=4,getBoxInput6=6,getBoxInput7=3,getBoxInput8=7,getBoxInput9=5;

    private ActivityMultiPlayerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMultiPlayerBinding.inflate(getLayoutInflater());
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
                if(!box1){

                    box1 = true;
                    if(playerTurnChooser){
                      //  binding.box1.setText("0");
                        boxInput1 = 0;

                        binding.box1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        boxInput1 = 1;

                        binding.box1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                      //  binding.box1.setText("x");
                        playerSelection();
                    }

                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box2){
                    box2 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput2 = 0;

                        binding.box2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput2 = 1;

                        binding.box2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box3){
                    box3 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput3 = 0;

                        binding.box3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput3 = 1;

                        binding.box3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box4){
                    box4 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput4 = 0;

                        binding.box4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput4 = 1;

                        binding.box4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box5){
                    box5 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput5 = 0;

                        binding.box5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput5 = 1;

                        binding.box5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.box6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box6){
                    box6 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput6 = 0;

                        binding.box6.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput6 = 1;

                        binding.box6.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }

            }
        });
        binding.box7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box7){
                    box7 = true;
                    if(playerTurnChooser){
                      //  binding.box7.setText("0");
                        getBoxInput7 = 0;

                        binding.box7.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));

                        playerSelection();

                    }
                    else {
                        getBoxInput7 = 1;

                        binding.box7.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box8){

                    box8 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput8 = 0;

                        binding.box8.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput8 = 1;

                        binding.box8.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
                }

            }
        });

        binding.box9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!box9){
                    box9 = true;
                    if(playerTurnChooser){
                        //  binding.box1.setText("0");
                        getBoxInput9 = 0;

                        binding.box9.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.circle));
                        playerSelection();

                    }
                    else {
                        getBoxInput9 = 1;

                        binding.box9.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.cross));

                        //  binding.box1.setText("x");
                        playerSelection();
                    }
                    winnerSelect();

                }
                else {
                    Toast.makeText(getApplicationContext(),"Select Different",Toast.LENGTH_SHORT).show();
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


    public void winnerSelect(){

        if((boxInput1 == 0 && getBoxInput4 ==0 && getBoxInput7 ==0) ||
                (getBoxInput2 ==0 && getBoxInput5 ==0 && getBoxInput8 ==0) ||
                ( getBoxInput3 ==0 && getBoxInput6 ==0 && getBoxInput9 ==0) ||
                        (boxInput1 ==0 && getBoxInput2 ==0 && getBoxInput3 ==0) ||
                                (getBoxInput4 ==0 && getBoxInput5 ==0 && getBoxInput6 ==0 )||
                                        (getBoxInput7 ==0 && getBoxInput8 ==0&& getBoxInput9 ==0 )||
                                                (boxInput1 ==0 && getBoxInput5 ==0 && getBoxInput9 ==0) ||
                                                        (getBoxInput3 ==0 && getBoxInput5 ==0 && getBoxInput7 ==0)
        ){
            Toast.makeText(getApplicationContext(),"Player 1 Winner",Toast.LENGTH_SHORT).show();
            player1WinCount++;
            binding.player1Score.setText("Player 1: "+ player1WinCount);
            boardReset();

        }
        else if((boxInput1 ==1 && getBoxInput4 ==1 && getBoxInput7 ==1) ||
                getBoxInput2 ==1 && getBoxInput5 ==1 && getBoxInput8 ==1 ||
                getBoxInput3 ==1 && getBoxInput6 ==1 && getBoxInput9 ==1 ||
                boxInput1 ==1  && getBoxInput2 ==1 && getBoxInput3 ==1 ||
                getBoxInput4 ==1 &&getBoxInput5 ==1 && getBoxInput6 ==1 ||
                getBoxInput7 ==1 && getBoxInput8 ==1 && getBoxInput9 ==1 ||
                boxInput1 ==1  && getBoxInput5 ==1 && getBoxInput9 ==1 ||
                getBoxInput3 ==1 && getBoxInput5 ==1 && getBoxInput7 ==1
        ){
            Toast.makeText(getApplicationContext(),"Player 2 Winner",Toast.LENGTH_SHORT).show();
            player2WinCount++;
            binding.player2Score.setText("Player 2: "+ player2WinCount);
            boardReset();

        } else if (box1 && box2 && box3 && box4 && box5 && box6 && box7 && box8 && box9) {
            Toast.makeText(getApplicationContext(),"Match Draw",Toast.LENGTH_SHORT).show();
            boardReset();

        }


    }

    public void boardReset(){
        boxInput1=9;
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
        box1=false;
        box2=false;
        box3=false;
        box4=false;
        box5=false;
        box6=false;
        box7=false;
        box8=false;
        box9=false;
        playerTurnChooser = true;
        binding.turnNotifier.setText("Turn: O");


    }

    public void delayFun(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, 1000);
    }

    public void  playerSelection(){
        if(playerTurnChooser){
            playerTurnChooser = false;
            binding.turnNotifier.setText("Turn: X");
        }
        else {

            playerTurnChooser = true;
            binding.turnNotifier.setText("Turn: O");
        }

    }
}