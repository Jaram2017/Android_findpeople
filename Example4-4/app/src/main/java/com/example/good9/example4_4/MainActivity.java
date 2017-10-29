package com.example.good9.example4_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton startToggle;
    TextView likeText;
    RadioGroup versionGroup;
    ImageView versionImage;
    Button exitButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startToggle = findViewById(R.id.startToggle);
        likeText = findViewById(R.id.likeText);
        versionGroup = findViewById(R.id.versionButtonGroup);
        versionImage = findViewById(R.id.versionImage);
        exitButton = findViewById(R.id.exit);
        resetButton = findViewById(R.id.reset);

        startToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    likeText.setVisibility(android.view.View.VISIBLE);
                    versionGroup.setVisibility(android.view.View.VISIBLE);
                    versionImage.setVisibility(android.view.View.VISIBLE);
                    resetButton.setVisibility(android.view.View.VISIBLE);
                } else {
                    likeText.setVisibility(android.view.View.INVISIBLE);
                    versionGroup.setVisibility(android.view.View.INVISIBLE);
                    versionImage.setVisibility(android.view.View.INVISIBLE);
                    resetButton.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        versionGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i)
                {
                    case R.id.lollipop:
                        versionImage.setImageResource(R.drawable.lollipop);
                        break;
                    case R.id.marshmallow:
                        versionImage.setImageResource(R.drawable.marshmallow);
                        break;
                    case R.id.nougat:
                        versionImage.setImageResource(R.drawable.nougat);
                        break;
                    default:
                        versionImage.setImageDrawable(null);
                }
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                versionGroup.clearCheck();
            }
        });
    }
}
