package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables used to store the total score for Team A and Team B
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle scores) {
        super.onCreate(scores);
        setContentView(R.layout.activity_main);

        // Restores the scores of each team if the activity is destroyed and recreated
        if(scores != null) {
            teamAScore = scores.getInt("teamAScore");
            teamBScore = scores.getInt("teamBScore");

            displayForTeamA(teamAScore);
            displayForTeamB(teamBScore);
        }

        // Test functionality of below method(s)
        // displayForTeamA(8);

        // Set the value of teamAScore to the text value of the
        // team_a_score TextView
        // TextView teamAScoreTextView = findViewById(R.id.team_a_score);
        // teamAScore = Integer.parseInt(teamAScoreTextView.getText().toString());
    }

    /**
     * Saves the scores of each team to the scores Bundles to be
     * restored if the activity is destroyed
     */
    protected void onSaveInstanceState(Bundle scores) {
        super.onSaveInstanceState(scores);
        scores.putInt("teamAScore", teamAScore);
        scores.putInt("teamBScore", teamBScore);
    }

    /**
     * Overrides back button to not completely exit the app
     */
    public void onBackPressed(){
        moveTaskToBack(true);
    }

    /**
     * Displays the total score for Team A in the team_a_score TextView
     */
    public void displayForTeamA(int score) {
        TextView teamAScoreTextView = (findViewById(R.id.team_a_score));
        teamAScoreTextView.setText(String.valueOf(score));
    }

    /**
     * Increases teamAScore by 3 then updates the team_a_score TextView
     * by calling the displayForTeamA method
     */
    public void teamAThreePoints(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /**
     * Increases teamAScore by 2 then updates the team_a_score TextView
     * by calling the displayForTeamA method
     */
    public void teamATwoPoints(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /**
     * Increases teamAScore by 1 then updates the team_a_score TextView
     * by calling the displayForTeamA method
     */
    public void teamAFreeThrow(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Displays the total score for Team B in the team_a_score TextView
     */
    public void displayForTeamB(int score) {
        TextView teamAScoreTextView = (findViewById(R.id.team_b_score));
        teamAScoreTextView.setText(String.valueOf(score));
    }

    /**
     * Increases teamBScore by 3 then updates the team_b_score TextView
     * by calling the displayForTeamB method
     */
    public void teamBThreePoints(View view) {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    /**
     * Increases teamBScore by 2 then updates the team_b_score TextView
     * by calling the displayForTeamB method
     */
    public void teamBTwoPoints(View view) {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }

    /**
     * Increases teamBScore by 1 then updates the team_b_score TextView
     * by calling the displayForTeamB method
     */
    public void teamBFreeThrow(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }
}
