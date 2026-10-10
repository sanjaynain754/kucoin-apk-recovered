package com.sensorsdata.analytics.android.sdk.aop.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.sensorsdata.analytics.android.sdk.SensorsDataActivityLifecycleCallbacks;

/* JADX INFO: loaded from: classes59.dex */
public class PushLifecycleCallbacks implements SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        PushProcess.getInstance().onNotificationClick(activity, activity.getIntent());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        PushProcess.getInstance().onNotificationClick(activity, activity.getIntent());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.SensorsDataActivityLifecycleCallbacks.SAActivityLifecycleCallbacks
    public void onNewIntent(Intent intent) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
