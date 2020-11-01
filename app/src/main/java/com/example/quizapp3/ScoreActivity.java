package com.example.quizapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    public static  final String TAG = "ScoreActivity";

    private TextView scoreView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        backButton = findViewById(R.id.back_button);
        scoreView = findViewById(R.id.score_tv);

        Intent intent = getIntent();
        int score = intent.getIntExtra("SCORE", 0);
        scoreView.setText(""+score);

        Log.d(TAG, "score: "+ score);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(ScoreActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
