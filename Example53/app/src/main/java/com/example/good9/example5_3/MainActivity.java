package com.example.good9.example5_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);

        setContentView(baseLayout, params);

        final EditText editText = new EditText(this);

        Button btn  = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);

        final TextView text = new TextView(this);
        text.setTextColor(Color.BLUE);

        baseLayout.addView(editText);
        baseLayout.addView(btn);
        baseLayout.addView(text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(editText.getText());
            }
        });
    }
}
