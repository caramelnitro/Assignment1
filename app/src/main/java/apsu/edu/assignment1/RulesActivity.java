package apsu.edu.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RulesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        Button b = findViewById(R.id.backButton);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
