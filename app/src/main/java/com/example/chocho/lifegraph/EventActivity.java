package com.example.chocho.lifegraph;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by chocho on 2015-01-25.
 */
public class EventActivity extends Activity {
    ArrayList<String> ageList = new ArrayList<String>();
    ArrayList<String> scoreList = new ArrayList<String>();
    ArrayList<String> categoryList = new ArrayList<String>();

    Button event_done;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        Spinner age_spinner = (Spinner) findViewById(R.id.age_spinner);
        Spinner score_spinner = (Spinner) findViewById(R.id.score_spinner);
        Spinner category_spinner = (Spinner) findViewById(R.id.category_spinner);

        for (int i = 0; i<=100; i++) {
            ageList.add(Integer.toString(i));
        }

        for (int i = 10; i>=0; i--) {
            scoreList.add(Integer.toString(i));
        }
        for (int i = 1; i<=10; i++) {
            scoreList.add("-"+Integer.toString(i));
        }

        categoryList.add("학업");
        categoryList.add("여행");
        categoryList.add("만남");

        //Create the ArrayAdapter
        ArrayAdapter<String> ageAdapter = new ArrayAdapter<String>(EventActivity.this, android.R.layout.simple_spinner_item, ageList);
        ArrayAdapter<String> scoreAdapter = new ArrayAdapter<String>(EventActivity.this, android.R.layout.simple_spinner_item, scoreList);
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<String>(EventActivity.this, android.R.layout.simple_spinner_item, categoryList);

        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        scoreAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Set the Adapter
        age_spinner.setAdapter(ageAdapter);
        score_spinner.setAdapter(scoreAdapter);
        category_spinner.setAdapter(categoryAdapter);

        //Set the ClickListener for Spinner
        age_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(EventActivity.this, "You Selected : " + ageList.get(position)+" Level ",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        score_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(EventActivity.this, "You Selected : " + ageList.get(position)+" Level ",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        category_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(EventActivity.this, "You Selected : " + ageList.get(position)+" Level ",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        event_done = (Button) findViewById(R.id.event_done);
        event_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
