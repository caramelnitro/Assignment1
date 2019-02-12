package apsu.edu.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean random = true;
    private boolean x = true;
    private Random r = new Random();
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_game);
        int rand = r.nextInt(10) + 1;
        if(rand % 2 == 0) {
            x = true;
        }
        else {
            x = false;
        }
    }

    @Override
    public void onClick(View v){
        final int buttonId = v.getId();

        if(random && findViewById(R.id.imageButton).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton2).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton2)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton2)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton3).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton3)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton3)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton4).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton4)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton4)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton5).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton5)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton5)).setImageResource(R.drawable.letter_o);
            }
        }
        if(random && findViewById(R.id.imageButton6).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton6)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton6)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton7).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton7)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton7)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton8).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton8)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton8)).setImageResource(R.drawable.letter_o);
            }
        }
        else if(random && findViewById(R.id.imageButton9).getId() == buttonId){
            if(x) {
                ((ImageButton) findViewById(R.id.imageButton9)).setImageResource(R.drawable.letter_x);
            }
            else {
                ((ImageButton) findViewById(R.id.imageButton9)).setImageResource(R.drawable.letter_o);
            }
        }
        int rand = r.nextInt(10) + 1;
        if(rand % 2 == 0) {
            x = true;
        }
        else {
            x = false;
        }
    }
}
