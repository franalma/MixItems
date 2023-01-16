package com.fra.dtse.mixitems.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.fra.dtse.mixitems.R;
import com.fra.dtse.mixitems.databinding.FragmentFaqBinding;
import com.fra.dtse.mixitems.ui.expand.ExpandListAdapter;
import com.fra.dtse.mixitems.ui.expand.ExpandListValues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FaqFragment extends Fragment {

    FragmentFaqBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_faq, container, false);
        binding = FragmentFaqBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init(){
        ExpandableListView expandableListView;
        ExpandableListAdapter expandableListAdapter;
        List<String> expandableListTitle;
        HashMap<String, List<String>> expandableListDetail;

        expandableListView = (ExpandableListView) requireActivity().findViewById(R.id.expandableListView);
        expandableListDetail = ExpandListValues.getData(getContext());
        expandableListTitle = new ArrayList<>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandListAdapter(getContext(), expandableListTitle, expandableListDetail);
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