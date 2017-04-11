package com.tony.sample.app;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;
import com.tony.sample.R;

/**
 * Created by tony on 2017/4/11.
 */

public class AppApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize the Mobile Ads SDK.
        MobileAds.initialize(this, getString(R.string.application_id));
    }
}
