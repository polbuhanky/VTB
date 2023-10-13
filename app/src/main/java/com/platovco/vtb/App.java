package com.platovco.vtb;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String MAPKIT_API_KEY = "968b0dcb-fb73-4147-9608-d24dd932dbe1";
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
