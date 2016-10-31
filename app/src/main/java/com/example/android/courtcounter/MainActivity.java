package com.example.android.courtcounter;

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
    public void addThreeA(View view) {
        addPointsToA(3);
    }
    public void addTwoA(View view) {
        addPointsToA(2);
    }
    public void addOneA(View view) {
        addPointsToA(1);
    }
    private void addPointsToA(int num) {
        scoreTeamA += num;
        TextView view = (TextView) findViewById(R.id.scoreA);
        view.setText(""+scoreTeamA);
    }

    public void addThreeB(View view) {
        addPointsToB(3);
    }
    public void addTwoB(View view) {
        addPointsToB(2);
    }
    public void addOneB(View view) {
        addPointsToB(1);
    }
    private void addPointsToB(int num) {
        scoreTeamB += num;
        TextView view = (TextView) findViewById(R.id.scoreB);
        view.setText(""+scoreTeamB);
    }
    public void reset(View view) {
        addPointsToA(-scoreTeamA);
        addPointsToB(-scoreTeamB);
    }

}
