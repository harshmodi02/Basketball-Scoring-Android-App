package com.example.android.practiseset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onSubmita3(View view) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    public void onSubmita2(View view) {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void onSubmita1(View view) {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onSubmitb3(View view) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void onSubmitb2(View view) {
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void onSubmitb1(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
