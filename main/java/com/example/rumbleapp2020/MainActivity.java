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
                sand++;
            } else {
                score++;
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
    public void arraySet(String submission[], String location[][]) {
        for (int x = 0; x < 6; x++) {
            if (location[x] == null || Integer.parseInt((location[x])[0]) <= (Integer.parseInt(submission[0]) - 6)) {
                location[x] = submission;
            }
        }
    }
    public void rocketSet(int score1, int score2, int score3) {
        if (rocketLevel1 == true) {
            score1++;
        }
        else if (rocketLevel2 == true) {
            score2++;
        }
        else if (rocketLevel3 == true) {
            score3++;
        }
    }
    public void displaySet(String array[]) {
        settingsDisplay = array[settingsDisplayNum];
    }
    public void submitButton() {
        String info[] = {mainName, Integer.toString(mainTeam), Integer.toString(mainMatch), mainAlliance, extrasNotes};
        Intent intent = new Intent(this, page2.class);
        startActivity(intent);
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
