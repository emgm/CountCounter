package emgm.countcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA=0;
    int pointsB=0;

    TextView teamA;
    TextView teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = (TextView) findViewById(R.id.team_a_score);
        teamB = (TextView) findViewById(R.id.team_b_score);

    }

    public void reset (View view){

        teamA.setText("0");
        teamB.setText("0");

        pointsA=0;
        pointsB=0;


    }




    public void treePointTeamA(View view){

        pointsA = pointsA + 3;


        teamA.setText(String.valueOf(pointsA));

    }

    public void treePointTeamB(View view){

        pointsB = pointsB + 3;

        teamB.setText(String.valueOf(pointsB));

    }

    public void twoPointTeamA(View view){

        pointsA = pointsA + 2;

        teamA.setText(String.valueOf(pointsA));

    }

    public void twoPointTeamB(View view){

        pointsB = pointsB + 2;

        teamB.setText(String.valueOf(pointsB));

    }

    public void onePointTeamA(View view){

        pointsA = pointsA + 1;

        teamA.setText(String.valueOf(pointsA));

    }
    public void onePointTeamB(View view){

        pointsB = pointsB + 1;

        teamB.setText(String.valueOf(pointsB));

    }


}
