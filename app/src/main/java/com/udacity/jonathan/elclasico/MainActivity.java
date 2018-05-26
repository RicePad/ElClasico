package com.udacity.jonathan.elclasico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int teamRealMadrid = 0;
    int teamBarcelona = 0;
    int realMadridtotalFaults = 0;
    int barcelonadtotalFaults = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreOneGoalForRealMadrid(View view) {
        teamRealMadrid = teamRealMadrid + 1;
        displayForRealMadrid(teamRealMadrid);

    }


    public void scoreOneGoalForBarcelona(View view) {
        teamBarcelona = teamBarcelona + 1;
        displayForBarcelona(teamBarcelona);


    }

    public void realMadridfaultCounter(View view) {
        realMadridtotalFaults = realMadridtotalFaults + 1;
        displayRealMadridAllFaults(realMadridtotalFaults);


    }

    public void barcelonafaultCounter(View view) {
        barcelonadtotalFaults = barcelonadtotalFaults + 1;
        displayBarcelonaAllFaults(barcelonadtotalFaults);


    }

    public void resetCounter(View view) {
        teamRealMadrid = 0;
        teamBarcelona = 0;
        realMadridtotalFaults = 0;
        barcelonadtotalFaults = 0;
        displayForRealMadrid(teamRealMadrid);
        displayForBarcelona(teamBarcelona);
        displayRealMadridAllFaults(realMadridtotalFaults);
        displayBarcelonaAllFaults(barcelonadtotalFaults);

    }


    public void displayForRealMadrid(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRealMadridAllFaults(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_real_fault_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBarcelonaAllFaults(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_barcelona_fault_score);
        scoreView.setText(String.valueOf(score));
    }




}