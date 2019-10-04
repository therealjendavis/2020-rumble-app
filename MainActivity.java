package com.example.rumbleapp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int mainInfoMatch = 0;
    boolean sandStorm = false;
    int mainStartPosition = 0;
    int mainCSFH = 0;
    int mainCSFC = 0;
    int mainCSSH = 0;
    int mainCSSC = 0;
    int mainCSFHSS = 0;
    int mainCSFCSS = 0;
    int mainCSSHSS = 0;
    int mainCSSCSS = 0;
    int mainR1H = 0;
    int mainR1C = 0;
    int mainR2H = 0;
    int mainR2C = 0;
    int mainR3H = 0;
    int mainR3C = 0;
    int mainR1HSS = 0;
    int mainR1CSS = 0;
    int mainR2HSS = 0;
    int mainR2CSS = 0;
    int mainR3HSS = 0;
    int mainR3CSS = 0;
    boolean mainStart = false;
    boolean mainSSTimer = false;
    boolean mainDefense = false;
    boolean rocketLevel1 = false;
    boolean rocketLevel2 = false;
    boolean rocketLevel3 = false;
    boolean cargoFront = false;
    boolean cargoSide = false;
    int mainBlockedScores = 0;
    String mainName = "";
    int mainTeam = 0000;
    int mainMatch = mainInfoMatch;
    String mainHelpInfo = " ";
    String settingsHelpInfo = " ";
    boolean extrasRedCard = false;
    boolean extrasYellowCard = false;
    int extrasFinalScore = 0;
    String extrasNotes = " ";
    int mainEndgame = 0;
    char settingsInfoColumn = ' ';
    String cacheArray[][] = {null, null, null, null, null, null};
    String localArray[][] = {null, null, null, null, null, null};
    String settingsDisplay = " ";
    String mainAlliance = " ";
    int settingsDisplayNum = 0;
    public void allianceSet() {
        if ((settingsInfoColumn == 'a') || (settingsInfoColumn == 'b') || (settingsInfoColumn == 'c')) {
            mainAlliance = "Red";
        }
        else {mainAlliance = "Blue";
        }
    }
    public void addOne(int score) {
        if (mainStart = true) {
            score ++;
        }
    }
    public void setScoreTo(int num, int score) {
        if (mainStart = true) {
            score = num;
        }
    }
    public void booleanTrue(boolean boo) {
        boo = true;
    }
    public void booleanFalse(boolean boo) {
        boo = false;
    }
    public void allScores(int score, int sand) {
        if (mainStart = true) {
            if (sandStorm = true) {
                addOne(sand);
            } else {
                addOne(score);
            }
        }
    }
    public void stormDelay(int seconds) {
        Timer timer;
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds);
    }
    class RemindTask extends TimerTask {
        public void run() {
            booleanFalse(sandStorm);
        }
    }
    public void startPush() {
        booleanTrue(mainStart);
        booleanTrue(sandStorm);
        stormDelay(15);
    }
    public void arraySet(String[] submission, String[][] location) {
        for (int x = 0; x < 6; x++) {
            if (location[x] == null || Integer.parseInt((location[x])[0]) <= (Integer.parseInt(submission[0]) - 6)) {
                location[x] = submission;
            }
        }
    }
    public void rocketSet(int score1, int score1SS, int score2, int score2SS,  int score3, int score3SS) {
        if (rocketLevel1 == true) {
            allScores(score1, score1SS);
        }
        else if (rocketLevel2 == true) {
            allScores(score2, score2SS);
        }
        else if (rocketLevel3 == true) {
            allScores(score3, score3SS);
        }
    }
    public void displaySet(String[] array) {
        settingsDisplay = array[settingsDisplayNum];
    }
    public void cargoShipSet(int score1, int score1SS, int score2, int score2SS) {
        if (cargoSide == true) {
            allScores(score1, score1SS);
        }
        else if (cargoFront == true) {
            allScores(score2, score2SS);
        }
    }
    public void submitButton() {
        String[] info = {mainName, Integer.toString(mainTeam), Integer.toString(mainMatch), mainAlliance, extrasNotes};
        Intent intent = new Intent(this, page2.class);
        startActivity(intent);
    }

    public void csc(View view) {
        cargoShipSet(mainCSSC, mainCSSCSS, mainCSFC, mainCSFCSS);
    }
    public void csh(View view) {
        cargoShipSet(mainCSSH, mainCSSHSS, mainCSFH, mainCSFHSS);
    }
    public void csf(View view) {
        booleanTrue(cargoFront);
    }
    public void css(View view) {
        booleanTrue(cargoSide);
    }
    public void rl1(View view) {
        booleanTrue(rocketLevel3);
    }
    public void rl2(View view) {
        booleanTrue(rocketLevel2);
    }
    public void rl3(View view) {
        booleanTrue(rocketLevel3);
    }
    public void defense(View view) {
        booleanTrue(mainDefense);
    }
    public void start1(View view) {
        setScoreTo(1, mainStartPosition);
    }
    public void start2(View view) {
        setScoreTo(2, mainStartPosition);
    }
    public void end1(View view) {
        setScoreTo(1, mainEndgame);
    }
    public void end2(View view) {
        setScoreTo(2, mainEndgame);
    }
    public void end3(View view) {
        setScoreTo(3, mainEndgame);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                submitButton();

            }

        });
    }
}
