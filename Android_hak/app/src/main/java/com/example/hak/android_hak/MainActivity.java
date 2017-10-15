package com.example.hak.android_hak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstview);

        ExpandableListView mainListView = (ExpandableListView)findViewById(R.id.main_list);

        BaseExpandableAdapter adapter = new BaseExpandableAdapter(this);

        ArrayList<String> child = new ArrayList<String>();
        child.add(0, "first");
        child.add(1, "second");
        adapter.addTest("One", child, 0);

        ArrayList<String> child2 = new ArrayList<String>();
        child2.add(0, "dul");
        child2.add(1, "set");
        adapter.addTest("Two", child2, 1);

        mainListView.setAdapter(adapter);


        final Intent intent = new Intent(this, StartActivity.class);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }

}
