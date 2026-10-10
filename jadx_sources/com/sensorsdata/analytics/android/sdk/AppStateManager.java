package com.sensorsdata.analytics.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.sensorsdata.analytics.android.sdk.visual.ViewTreeStatusObservable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"NewApi"})
public class AppStateManager implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "AppStateManager";
    private static volatile AppStateManager mSingleton;
    private WeakReference<Activity> mForeGroundActivity = new WeakReference<>(null);
    private int mCurrentRootWindowsHashCode = -1;
    private String mCurrentFragmentName = null;

    public static AppStateManager getInstance() {
        if (mSingleton == null) {
            synchronized (AppStateManager.class) {
                try {
                    if (mSingleton == null) {
                        mSingleton = new AppStateManager();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return mSingleton;
    }

    private void monitorViewTreeChange(View view) {
        try {
            int i11 = C27650R.id.sensors_analytics_tag_view_tree_observer_listeners;
            if (view.getTag(i11) == null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(ViewTreeStatusObservable.getInstance());
                view.getViewTreeObserver().addOnScrollChangedListener(ViewTreeStatusObservable.getInstance());
                view.getViewTreeObserver().addOnGlobalFocusChangeListener(ViewTreeStatusObservable.getInstance());
                view.setTag(i11, Boolean.TRUE);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private void setForegroundActivity(Activity activity) {
        this.mForeGroundActivity = new WeakReference<>(activity);
    }

    private void unRegisterViewTreeChange(View view) {
        try {
            int i11 = C27650R.id.sensors_analytics_tag_view_tree_observer_listeners;
            if (view.getTag(i11) != null) {
                ViewTreeStatusObservable viewTreeStatusObservable = ViewTreeStatusObservable.getInstance();
                view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeStatusObservable);
                view.getViewTreeObserver().removeOnGlobalFocusChangeListener(viewTreeStatusObservable);
                view.getViewTreeObserver().removeOnScrollChangedListener(viewTreeStatusObservable);
                view.setTag(i11, null);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public int getCurrentRootWindowsHashCode() {
        WeakReference<Activity> weakReference;
        Activity activity;
        Window window;
        if (this.mCurrentRootWindowsHashCode == -1 && (weakReference = this.mForeGroundActivity) != null && weakReference.get() != null && (activity = this.mForeGroundActivity.get()) != null && (window = activity.getWindow()) != null && window.isActive()) {
            this.mCurrentRootWindowsHashCode = window.getDecorView().hashCode();
        }
        return this.mCurrentRootWindowsHashCode;
    }

    public Activity getForegroundActivity() {
        return this.mForeGroundActivity.get();
    }

    public String getFragmentScreenName() {
        return this.mCurrentFragmentName;
    }

    private AppStateManager() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        setForegroundActivity(activity);
        if (!activity.isChild()) {
            this.mCurrentRootWindowsHashCode = -1;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window != null && window.isActive()) {
            unRegisterViewTreeChange(window.getDecorView());
        }
        if (!activity.isChild()) {
            this.mCurrentRootWindowsHashCode = -1;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        View decorView;
        setForegroundActivity(activity);
        Window window = activity.getWindow();
        if (window != null && window.isActive()) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        if (SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled() && decorView != null) {
            monitorViewTreeChange(decorView);
        }
        if (!activity.isChild() && decorView != null) {
            this.mCurrentRootWindowsHashCode = decorView.hashCode();
        }
    }

    public void setFragmentScreenName(Object obj, String str) {
        try {
            Method method = obj.getClass().getMethod("getParentFragment", new Class[0]);
            if (method != null) {
                if (method.invoke(obj, new Object[0]) == null) {
                    this.mCurrentFragmentName = str;
                    SALog.m68589i(TAG, "setFragmentScreenName | " + str + " is not nested fragment and set");
                    return;
                }
                SALog.m68589i(TAG, "setFragmentScreenName | " + str + " is nested fragment and ignored");
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
