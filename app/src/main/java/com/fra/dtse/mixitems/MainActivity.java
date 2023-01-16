package com.fra.dtse.mixitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.fra.dtse.mixitems.ui.EnvironmentFragment;
import com.fra.dtse.mixitems.ui.FaqFragment;
import com.fra.dtse.mixitems.ui.IssuesWarningFragment;
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
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void showIssuesFragment(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.id_container,
                new IssuesWarningFragment()).addToBackStack("").commit();
    }

    public void showFaqHelp(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.id_container,
                new FaqFragment()).addToBackStack("").commit();
    }

    public void showEnv(View view){
        getSupportFragmentManager().beginTransaction().replace(R.id.id_container,
                new EnvironmentFragment()).addToBackStack("").commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        getSupportFragmentManager().popBackStack();
    }
}