package apsu.edu.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TrebleActivity extends AppCompatActivity implements View.OnClickListener {
    private char grid[] = new char[7];
    private boolean win = false;
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
    }
    public void checkWin(){

    }
}
