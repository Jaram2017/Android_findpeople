package com.example.good9.example2_7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button toastButton;
    Button homeButton;
    RadioGroup imageRadioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        toastButton = (Button) findViewById(R.id.toastButton);
        homeButton = (Button) findViewById(R.id.homeButton);
        imageRadioGroup = (RadioGroup) findViewById(R.id.imageRadioGroup);
        imageView = (ImageView) findViewById(R.id.imageView);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
                startActivity(mIntent);
            }
        });

        imageRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.kitkatRadio:
                        imageView.setImageResource(R.drawable.kitkat);
                        break;
                    case R.id.lollipopRadio:
                        imageView.setImageResource(R.drawable.lollipop);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "라디오 선택 안됨", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
