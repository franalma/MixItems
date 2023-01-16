package com.fra.dtse.mixitems.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fra.dtse.mixitems.databinding.FragmentIssuesWarningBinding;
import com.fra.dtse.mixitems.ui.model.List4RowModel;
import com.fra.dtse.mixitems.ui.model.ListIssuesAdapter;

import java.util.ArrayList;
import java.util.List;

public class IssuesWarningFragment extends Fragment {
    private FragmentIssuesWarningBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentIssuesWarningBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setup();
    }

    public void setup(){
        loadIssues();
    }

    private void loadIssues(){
        System.out.println("--loading issues");
        List<List4RowModel> values = new ArrayList<>();
        values.add(new List4RowModel("R1","r2","R3", "R4"));
        values.add(new List4RowModel("R1","r2","R3", "R4"));
        values.add(new List4RowModel("R1","r2","R3", "R4"));

        ListIssuesAdapter adapter = new ListIssuesAdapter(values,
                pos -> System.out.println("---item:"+values.get(pos).getRow3()));
        binding.idListIssue.setAdapter(adapter);
    }
}