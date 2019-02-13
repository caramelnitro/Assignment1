package apsu.edu.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean random = true;
    private boolean x = true;
    private Random r = new Random();
    private char grid [][] = new char[3][3];

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_game);
        int rand = r.nextInt(10) + 1;
        //sets all onClickListeners
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
        ib = findViewById(R.id.imageButton8);
        ib.setOnClickListener(this);
        ib = findViewById(R.id.imageButton9);
        ib.setOnClickListener(this);
        //sets values for the grid so we can check for wins
        grid[0][0] = '0';
        grid[0][1] = '1';
        grid[0][2] = '2';
        grid[1][0] = '3';
        grid[1][1] = '4';
        grid[1][2] = '5';
        grid[2][0] = '6';
        grid[2][1] = '7';
        grid[2][2] = '8';

        TextView tv = findViewById(R.id.turnTv);
        //random # determines whose turn it is
        if(rand % 2 == 0) {
            x = true;
            tv.setText("Turn: X's");
        }
        else {
            x = false;
            tv.setText("Turn: O's");
        }
    }

    @Override
    public void onClick(View v){
        final int buttonId = v.getId();
        TextView tv = findViewById(R.id.turnTv);
        if(findViewById(R.id.trebleButton).getId() == buttonId){
            Intent intent = new Intent(getApplicationContext(), TrebleActivity.class);
            startActivity(intent);
        }
        //make sure we are playing the random game, check for which button is pressed and update the image accordingly
        else if(random && findViewById(R.id.imageButton).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_x);
                grid[0][0] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_o);
                grid[0][0] = 'o';
            }
            findViewById(R.id.imageButton).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton2).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton2)).setImageResource(R.drawable.letter_x);
                grid[0][1] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton2)).setImageResource(R.drawable.letter_o);
                grid[0][1] = 'o';
            }
            findViewById(R.id.imageButton2).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton3).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton3)).setImageResource(R.drawable.letter_x);
                grid[0][2] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton3)).setImageResource(R.drawable.letter_o);
                grid[0][2] = 'o';
            }
            findViewById(R.id.imageButton3).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton4).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton4)).setImageResource(R.drawable.letter_x);
                grid[1][0] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton4)).setImageResource(R.drawable.letter_o);
                grid[1][0] = 'o';
            }
            findViewById(R.id.imageButton4).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton5).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton5)).setImageResource(R.drawable.letter_x);
                grid[1][1] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton5)).setImageResource(R.drawable.letter_o);
                grid[1][1] = 'o';
            }
            findViewById(R.id.imageButton5).setClickable(false);
        }
        if(random && findViewById(R.id.imageButton6).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton6)).setImageResource(R.drawable.letter_x);
                grid[1][2] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton6)).setImageResource(R.drawable.letter_o);
                grid[1][2] = 'o';
            }
            findViewById(R.id.imageButton6).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton7).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton7)).setImageResource(R.drawable.letter_x);
                grid[2][0] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton7)).setImageResource(R.drawable.letter_o);
                grid[2][0] = 'o';
            }
            findViewById(R.id.imageButton7).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton8).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton8)).setImageResource(R.drawable.letter_x);
                grid[2][1] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton8)).setImageResource(R.drawable.letter_o);
                grid[2][1] = 'o';
            }
            findViewById(R.id.imageButton8).setClickable(false);
        }
        else if(random && findViewById(R.id.imageButton9).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton9)).setImageResource(R.drawable.letter_x);
                grid[2][2] = 'x';
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton9)).setImageResource(R.drawable.letter_o);
                grid[2][2] = 'o';
            }
            findViewById(R.id.imageButton9).setClickable(false);
        }

        checkWin();
        int rand = r.nextInt(10) + 1;
        if(rand % 2 == 0) {
            x = true;
            tv.setText("Turn: X's");
        }
        else {
            x = false;
            tv.setText("Turn: O's");
        }
    }

    public void checkWin(){
        TextView tv = findViewById(R.id.winnerTv);
        boolean win = false;
        //first row
        if((grid[0][0] == grid[0][1]) && (grid[0][1] == grid[0][2])){
            win = true;
        }
        //left to right diagonal
        else if((grid[0][0] == grid[1][1]) && (grid[1][1] == grid[2][2])){
            win = true;
        }
        //right to left diagonal
        else if((grid[0][2] == grid[1][1]) && (grid[1][1] == grid[2][0])){
            win = true;
        }
        //middle column
        else if((grid[0][1] == grid[1][1]) && (grid[1][1] == grid[2][1])){
            win = true;
        }
        //middle row
        else if((grid[1][0] == grid[1][1]) && (grid[1][1] == grid[1][2])){
            win = true;
        }
        //bottom row
        else if((grid[2][0] == grid[2][1]) && (grid[2][1] == grid[2][2])){
            win = true;
        }
        //right column
        else if((grid[0][2] == grid[1][2]) && (grid[1][2] == grid[2][2])){
            win = true;
        }
        //first column
        else if((grid[0][0] == grid[1][0]) && (grid[1][0] == grid[2][0])){
            win = true;
        }
        //check for win and set winner text
        if(win){
            if(x){
                tv.setText("X's win");
            }
            else
            {
                tv.setText("O's win");
            }
            //display winner text
            tv.setVisibility(View.VISIBLE);
            //turns off all buttons so game is no longer playable
            for(int i=0; i<9; i++){
                if(i==0)
                    findViewById(R.id.imageButton).setClickable(false);
                else
                    findViewById(R.id.imageButton + (char) i).setClickable(false);
            }
        }
    }
}
