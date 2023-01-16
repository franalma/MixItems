package com.fra.dtse.mixitems.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fra.dtse.mixitems.R;
import com.fra.dtse.mixitems.databinding.FragmentEnvironmentBinding;
import com.fra.dtse.mixitems.ui.pages.EnvCompromiseFragment;
import com.fra.dtse.mixitems.ui.pages.EnvContentFragment;
import com.google.android.material.tabs.TabLayout;


public class EnvironmentFragment extends Fragment {

    FragmentEnvironmentBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentEnvironmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setup();
    }

    public void setup(){
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                System.out.println("---tab pos: "+tab.getPosition());
                if (tab.getPosition() == 0){
                    requireActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.id_container_tab, new EnvContentFragment()).commit();
                }else{
                    requireActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.id_container_tab, new EnvCompromiseFragment()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        


    }


}