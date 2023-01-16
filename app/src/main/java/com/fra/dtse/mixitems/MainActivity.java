package com.fra.dtse.mixitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.fra.dtse.mixitems.ui.expand.ExpandListAdapter;
import com.fra.dtse.mixitems.ui.expand.ExpandListValues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        ExpandableListView expandableListView;
        ExpandableListAdapter expandableListAdapter;
        List<String> expandableListTitle;
        HashMap<String, List<String>> expandableListDetail;

        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = ExpandListValues.getData(getBaseContext());
        expandableListTitle = new ArrayList<>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
//        expandableListView.setOnGroupExpandListener(groupPosition -> Toast.makeText(getApplicationContext(),
//                expandableListTitle.get(groupPosition) + " List Expanded.",
//                Toast.LENGTH_SHORT).show());


//        expandableListView.setOnGroupCollapseListener(groupPosition -> Toast.makeText(getApplicationContext(),
//                expandableListTitle.get(groupPosition) + " List Collapsed.",
//                Toast.LENGTH_SHORT).show());
//


    }
}