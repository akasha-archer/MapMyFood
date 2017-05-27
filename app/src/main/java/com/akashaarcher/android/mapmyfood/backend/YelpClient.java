package com.akashaarcher.android.mapmyfood.backend;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static okhttp3.internal.Internal.instance;

/**
 * Created by Akasha on 5/18/17.
 */

public class YelpClient {

    private final String API_URL = "https://api.yelp.com/";


    public YelpApi createAPI() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(YelpApi.class);
    }


    public String getAPIBaseUrl() {
        return API_URL;
    }

}
