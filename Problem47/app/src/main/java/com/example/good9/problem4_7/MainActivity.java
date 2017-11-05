package com.example.good9.problem4_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox ckb1;
    CheckBox ckb2;
    CheckBox ckb3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ckb1 = findViewById(R.id.ckb1);
        ckb2 = findViewById(R.id.ckb2);
        ckb3 = findViewById(R.id.ckb3);
        btn = findViewById(R.id.btn);

        ckb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    btn.setEnabled(true);
                } else {
                    btn.setEnabled(false);
                }
            }
        });

        ckb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    btn.setClickable(true);
                } else {
                    btn.setClickable(false);
                }
            }
        });

        ckb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    btn.setRotation(45);
                } else {
                    btn.setRotation(0);
                }
            }
        });
    }
}
