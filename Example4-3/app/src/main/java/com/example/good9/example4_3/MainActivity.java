package com.example.good9.example4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber = (EditText)findViewById(R.id.first);
        final EditText secondNumber = (EditText)findViewById(R.id.second);
        final Button addButton = (Button)findViewById(R.id.addButton);
        final Button subtractButton = (Button)findViewById(R.id.subtractButton);
        final Button multiplyButton = (Button)findViewById(R.id.multiplyButton);
        final Button divideButton = (Button)findViewById(R.id.divideButton);
        final Button modButton = (Button)findViewById(R.id.modButton);
        final TextView result = (TextView)findViewById(R.id.result);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton.setBackgroundResource(R.color.Orange);
                subtractButton.setBackgroundResource(R.color.CornflowerBlue);
                multiplyButton.setBackgroundResource(R.color.CornflowerBlue);
                divideButton.setBackgroundResource(R.color.CornflowerBlue);
                modButton.setBackgroundResource(R.color.CornflowerBlue);

                String getStr1 = firstNumber.getText().toString();
                String getStr2 = secondNumber.getText().toString();

                if (getStr1.equals("") || getStr2.equals("")) {
                    Toast.makeText(getApplicationContext(), "두 수를 전부 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText("계산 결과: "
                            + (Integer.parseInt(getStr1) + Integer.parseInt(getStr2)));
                }
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton.setBackgroundResource(R.color.CornflowerBlue);
                subtractButton.setBackgroundResource(R.color.Orange);
                multiplyButton.setBackgroundResource(R.color.CornflowerBlue);
                divideButton.setBackgroundResource(R.color.CornflowerBlue);
                modButton.setBackgroundResource(R.color.CornflowerBlue);

                String getStr1 = firstNumber.getText().toString();
                String getStr2 = secondNumber.getText().toString();

                if (getStr1.equals("") || getStr2.equals("")) {
                    Toast.makeText(getApplicationContext(), "두 수를 전부 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText("계산 결과: "
                            + (Integer.parseInt(getStr1) - Integer.parseInt(getStr2)));
                }
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton.setBackgroundResource(R.color.CornflowerBlue);
                subtractButton.setBackgroundResource(R.color.CornflowerBlue);
                multiplyButton.setBackgroundResource(R.color.Orange);
                divideButton.setBackgroundResource(R.color.CornflowerBlue);
                modButton.setBackgroundResource(R.color.CornflowerBlue);

                String getStr1 = firstNumber.getText().toString();
                String getStr2 = secondNumber.getText().toString();

                if (getStr1.equals("") || getStr2.equals("")) {
                    Toast.makeText(getApplicationContext(), "두 수를 전부 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText("계산 결과: "
                            + (Integer.parseInt(getStr1) * Integer.parseInt(getStr2)));
                }
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton.setBackgroundResource(R.color.CornflowerBlue);
                subtractButton.setBackgroundResource(R.color.CornflowerBlue);
                multiplyButton.setBackgroundResource(R.color.CornflowerBlue);
                divideButton.setBackgroundResource(R.color.Orange);
                modButton.setBackgroundResource(R.color.CornflowerBlue);

                String getStr1 = firstNumber.getText().toString();
                String getStr2 = secondNumber.getText().toString();

                if (getStr1.equals("") || getStr2.equals("")) {
                    Toast.makeText(getApplicationContext(), "두 수를 전부 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(getStr2) == 0) {
                    Toast.makeText(getApplicationContext(), "나누기에선 두 번째 인자가 0이 될 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText("계산 결과: "
                            + (Integer.parseInt(getStr1) / Integer.parseInt(getStr2)));
                }
            }
        });

        modButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButton.setBackgroundResource(R.color.CornflowerBlue);
                subtractButton.setBackgroundResource(R.color.CornflowerBlue);
                multiplyButton.setBackgroundResource(R.color.CornflowerBlue);
                divideButton.setBackgroundResource(R.color.CornflowerBlue);
                modButton.setBackgroundResource(R.color.Orange);

                String getStr1 = firstNumber.getText().toString();
                String getStr2 = secondNumber.getText().toString();

                if (getStr1.equals("") || getStr2.equals("")) {
                    Toast.makeText(getApplicationContext(), "두 수를 전부 입력해야 합니다.", Toast.LENGTH_SHORT).show();
                } else if (Integer.parseInt(getStr2) == 0) {
                    Toast.makeText(getApplicationContext(), "나머지연산에선 두 번째 인자가 0이 될 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    result.setText("계산 결과: "
                            + (Integer.parseInt(getStr1) % Integer.parseInt(getStr2)));
                }
            }
        });
    }
}
