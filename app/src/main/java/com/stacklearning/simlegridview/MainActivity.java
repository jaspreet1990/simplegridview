package com.stacklearning.simlegridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    List<String> gridValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.grid);

        gridValue = new ArrayList<>();
        gridValue.add("First Column Grid View");
        gridValue.add("Second Column Grid View");
        gridValue.add("Third Column Grid View");
        gridValue.add("Forth Column Grid View");
        gridValue.add("Fifth Column Grid View");
        gridValue.add("Sixth Column Grid View");
        gridValue.add("Seventh Column Grid View");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, gridValue);

        gridView.setAdapter(adapter);

        // GridView Item Click Listener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                int itemPosition = position;
                String itemValue = (String) gridView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Position clicked:" + itemPosition + "  Grid Item is : " + itemValue, Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}