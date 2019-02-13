package apsu.edu.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TrebleActivity extends AppCompatActivity implements View.OnClickListener {
    private char grid[] = new char[7];
    private boolean win = false;
    private boolean player1 = true;
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_treble);

        ImageButton ib = findViewById(R.id.imageButton);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton2);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton3);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton4);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton5);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton6);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton7);
        ib.setOnClickListener(this);

        TextView tv = findViewById(R.id.turnTv);
        tv.setText("Turn: Player 1");
        for(int i=0;i<7;i++){
            grid[i] = (char) i;
        }
    }
    @Override
    public void onClick(View v){
        TextView tv = findViewById(R.id.turnTv);
        final int buttonId = v.getId();
        if(buttonId == findViewById(R.id.imageButton).getId()){
            ((ImageButton)findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_x);
            grid[0] = 'x';
            findViewById(R.id.imageButton).setClickable(false);
        }
        else if(buttonId == findViewById(R.id.imageButton2).getId()){
            ((ImageButton)findViewById(R.id.imageButton2)).setImageResource(R.drawable.letter_x);
            grid[1] = 'x';
            findViewById(R.id.imageButton2).setClickable(false);
        }
        else if(buttonId == findViewById(R.id.imageButton3).getId()){
            ((ImageButton)findViewById(R.id.imageButton3)).setImageResource(R.drawable.letter_x);
            grid[2] = 'x';
            findViewById(R.id.imageButton3).setClickable(false);
        }
        else if(buttonId == findViewById(R.id.imageButton4).getId()){
            ((ImageButton)findViewById(R.id.imageButton4)).setImageResource(R.drawable.letter_x);
            grid[3] = 'x';
            findViewById(R.id.imageButton4).setClickable(false);
        }
        else if(buttonId == findViewById(R.id.imageButton5).getId()){
            ((ImageButton)findViewById(R.id.imageButton5)).setImageResource(R.drawable.letter_x);
            grid[4] = 'x';
            findViewById(R.id.imageButton5).setClickable(false);
        }
        else if(buttonId == findViewById(R.id.imageButton6).getId()){
            ((ImageButton)findViewById(R.id.imageButton6)).setImageResource(R.drawable.letter_x);
            grid[5] = 'x';
            findViewById(R.id.imageButton6).setClickable(false);
        }
        else if(buttonId == findViewById(R.id.imageButton7).getId()){
            ((ImageButton)findViewById(R.id.imageButton7)).setImageResource(R.drawable.letter_x);
            grid[5] = 'x';
            findViewById(R.id.imageButton7).setClickable(false);
        }
        checkWin();
        player1 = !player1;
        if(player1){
            tv.setText("Turn: Player 1");
        }
        else{
            tv.setText("Turn: Player 2");
        }
    }
    public void checkWin(){
        TextView tv = findViewById(R.id.winnerTv);
        if((grid[0] == grid[1]) && (grid[1] == grid[2])){
            win = true;
        }
        else if((grid[1] == grid[2]) && (grid[2] == grid[3])){
            win = true;
        }
        else if((grid[2] == grid[3]) && (grid[3] == grid[4])){
            win = true;
        }
        else if((grid[3] == grid[4]) && (grid[4] == grid[5])){
            win = true;
        }
        else if((grid[4] == grid[5]) && (grid[5] == grid[6])){
            win = true;
        }
        if(win) {
            if (player1) {
                tv.setText("Winner: player1");
            } else {
                tv.setText("Winner: player2");
            }
            tv.setVisibility(View.VISIBLE);
            findViewById(R.id.imageButton).setClickable(false);
            for(int i=1;i<7;i++){
                findViewById(R.id.imageButton + (char) i).setClickable(false);
            }
        }
    }
}
