package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {
    private String coin;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();
            bitcoinDataModel.coin = jsonObject.getString("bid");


            return bitcoinDataModel;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getCoin() {
        return coin;
    }
}
