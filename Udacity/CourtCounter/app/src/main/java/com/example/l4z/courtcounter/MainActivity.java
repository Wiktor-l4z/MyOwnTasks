package com.example.l4z.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsTeamA;
    int pointsTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPoints3(View view){
        pointsTeamA = pointsTeamA +3;
        displayForTeamA(pointsTeamA);
    }

    public void addPoints2(View view){
        pointsTeamA = pointsTeamA +2;
        displayForTeamA(pointsTeamA);
    }

    public void addPoint1(View view){
        pointsTeamA = pointsTeamA +1;
        displayForTeamA(pointsTeamA);
    }

    public void add1PointsTeamB(View view){
        pointsTeamB = pointsTeamB +1;
        displayForTeamB(pointsTeamB);
    }

    public void add2PointsTeamB(View view){
        pointsTeamB = pointsTeamB +2;
        displayForTeamB(pointsTeamB);
    }

    public void add3PointsTeamB(View view){
        pointsTeamB = pointsTeamB +3;
        displayForTeamB(pointsTeamB);
    }

    public void resetButton(View view){
        pointsTeamA = 0;
        pointsTeamB = 0;
        displayForTeamA(pointsTeamA);
        displayForTeamB(pointsTeamB);
    }

    public void displayForTeamA(int points) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTextTeamA);
        scoreView.setText(String.valueOf(points));
    }

    public void displayForTeamB(int points) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTextTeamB);
        scoreView.setText(String.valueOf(points));
    }


}
