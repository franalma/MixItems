package com.fra.dtse.mixitems.ui.expand;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;

import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ExpandListValues {
    private static String HELP_FILE_SP = "faq_sp.json";

    public static HashMap<String, List<String>> getData(Context context) {
        HashMap<String,  List<String>> expandableListDetail = new HashMap<>();
        try{
            InputStream is = context.getAssets().open(HELP_FILE_SP);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = "";
            StringBuilder contentBuilder = new StringBuilder();
            while((line = reader.readLine())!= null){
                contentBuilder.append(line);
            }
            JSONArray jsonArray = new JSONArray(contentBuilder.toString());
            for (int i = 0; i<jsonArray.length(); i++){
                JSONObject joc = jsonArray.getJSONObject(i);
                List<String> values =  new ArrayList();
                values.add(joc.getString("a"));
                expandableListDetail.put(joc.getString("q"), values);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return expandableListDetail;
    }
}

