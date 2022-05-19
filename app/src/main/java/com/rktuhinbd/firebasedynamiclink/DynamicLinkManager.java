package com.rktuhinbd.firebasedynamiclink;

import android.app.Activity;
import android.content.Intent;

public class DynamicLinkManager {

    public static void manageDynamicLink(Activity activity, String dynamicLink) {
        Intent intent = new Intent(activity, DynamicLinkActivity.class);
        intent.putExtra("DynamicLink", dynamicLink);
        activity.startActivity(intent);
    }
}
