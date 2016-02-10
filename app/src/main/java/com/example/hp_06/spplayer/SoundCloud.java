package com.example.hp_06.spplayer;

import retrofit.RestAdapter;

/**
 * Created by HP-06 on 2/10/2016.
 */
public class SoundCloud {
    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private static final SCService SERVICE = REST_ADAPTER.create(SCService.class);

    public static SCService getService() {
        return SERVICE;
    }

}
