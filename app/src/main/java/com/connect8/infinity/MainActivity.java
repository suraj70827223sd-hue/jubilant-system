package com.connect8.infinity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;

public class MainActivity extends Activity {
    private static final String CONNECT8_URL =
        "https://connect8-infinity.suraj70827223sd.workers.dev/";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri url = Uri.parse(CONNECT8_URL);
        try {
            CustomTabsIntent tab = new CustomTabsIntent.Builder()
                .setShowTitle(true)
                .setShareState(CustomTabsIntent.SHARE_STATE_OFF)
                .build();
            tab.launchUrl(this, url);
        } catch (Exception exception) {
            startActivity(new Intent(Intent.ACTION_VIEW, url));
        }
        finish();
    }
}
