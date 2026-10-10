package com.sensorsdata.abtest.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AppStateManager implements Application.ActivityLifecycleCallbacks {
    private int mActivityCount;
    private boolean mAppInForeground;
    private boolean mResumeFromBackground;
    private boolean isActivityFinishing = false;
    private List<AppStateChangedListener> mAppStateChangedListener = new ArrayList();

    public interface AppStateChangedListener {
        void onEnterBackground();

        void onEnterForeground(boolean z11);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.isActivityFinishing = false;
    }

    public void addAppStateChangedListener(AppStateChangedListener appStateChangedListener) {
        if (appStateChangedListener == null || this.mAppStateChangedListener.contains(appStateChangedListener)) {
            return;
        }
        this.mAppStateChangedListener.add(appStateChangedListener);
    }

    public boolean isActivityFinishing() {
        return this.isActivityFinishing;
    }

    public boolean isAppInForeground() {
        return this.mAppInForeground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.mActivityCount++;
        if (!this.mAppInForeground) {
            this.mAppInForeground = true;
            Iterator<AppStateChangedListener> it = this.mAppStateChangedListener.iterator();
            while (it.hasNext()) {
                it.next().onEnterForeground(this.mResumeFromBackground);
            }
        }
        if (this.mResumeFromBackground) {
            return;
        }
        this.mResumeFromBackground = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i11 = this.mActivityCount - 1;
        this.mActivityCount = i11;
        if (i11 <= 0) {
            this.mAppInForeground = false;
            Iterator<AppStateChangedListener> it = this.mAppStateChangedListener.iterator();
            while (it.hasNext()) {
                it.next().onEnterBackground();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.isActivityFinishing = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
