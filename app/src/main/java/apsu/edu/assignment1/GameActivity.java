package apsu.edu.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean random = true;
    private boolean x = true;
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_game);
        Random r = new Random();
        int rand = r.nextInt(10) + 1;

        if(rand%2 == 0) {
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
            if(x == true)
                ((ImageButton) findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_x);
            else
                ((ImageButton) findViewById(R.id.imageButton)).setImageResource(R.drawable.letter_o);

        }
        else if(random){

        }
        else if(random){

        }
        else if(random){

        }
        else if(random){

        }
        else if(random){

        }
        else if(random){

        }
        else if(random){

        }
        else if(random){

        }
    }

}
