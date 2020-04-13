package com.tukma.askaway;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = findViewById(R.id.btn_ask);

        final ImageView imgAnswer = findViewById(R.id.image_answer);

        final int[] answerArray = {R.drawable.maybe, R.drawable.no, R.drawable.yes};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomAnswer = new Random();

                int answer = randomAnswer.nextInt(3);

                imgAnswer.setImageResource(answerArray[answer]);


                TextView tvMain = findViewById(R.id.tv_main);

                String text = "Ask Away!";

                SpannableStringBuilder ss = new SpannableStringBuilder(text);

                ForegroundColorSpan fcsWhite = new ForegroundColorSpan(Color.WHITE);

                ss.setSpan(fcsWhite, 1, 3, Spanned.SPAN_INCLUSIVE_INCLUSIVE);
                ss.setSpan(fcsWhite, 9, 9, Spanned.SPAN_INCLUSIVE_INCLUSIVE);

                tvMain.setText(ss);

            }
        });
    }
}
