package com.example.vmac.WatBot;


import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class FoodAPI {
    private String mTitle;

    public String getTitle() {
        return mTitle;
    }

    public static FoodAPI fromJSON(JSONObject jsonObject){
        FoodAPI foodAPI=new FoodAPI();

        try{
            Log.d("ChefBot","Enter");
            foodAPI.mTitle=jsonObject.getJSONArray("recipe").getJSONObject(0).getString("title");
            Log.d("ChefBot",foodAPI.mTitle);

        }catch(JSONException e){
            e.printStackTrace();
            return null;
        }

        return foodAPI;
    }
}
