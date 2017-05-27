package com.akashaarcher.android.mapmyfood.backend;

import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Akasha on 5/18/17.
 */

public interface YelpApi {

    @POST("oauth2/token?client_id=0XOVMcvzlfKRPqjbmCN5pQ&client_secret=Lx44Wbaib9KoQQnGhlerEZEw1VoDicBz8vVwLPKEWSff3GTbdnskN5gm9V0FLWPO")
    Call<User> createUser(@Body User user);
}
