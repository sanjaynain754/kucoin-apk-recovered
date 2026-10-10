package cn.jiguang.privates.common.business.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import cn.jiguang.privates.common.api.JCommonPrivatesApi;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public class JLifecycleListener implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("activity", activity.getComponentName().getClassName());
        JCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), 1011, bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString("activity", activity.getComponentName().getClassName());
        JCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), 1016, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString("activity", activity.getComponentName().getClassName());
        JCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), 1014, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString("activity", activity.getComponentName().getClassName());
        JCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), 1013, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString("activity", activity.getComponentName().getClassName());
        bundle.putBoolean("state", true);
        JCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), 1008, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Bundle bundle = new Bundle();
        bundle.putString("activity", activity.getComponentName().getClassName());
        bundle.putBoolean("state", false);
        JCommonPrivatesApi.sendMessageToMainProcess(activity.getApplicationContext(), 1008, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
