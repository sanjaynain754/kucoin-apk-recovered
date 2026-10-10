package com.tencent.cloud.tuikit.engine.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes59.dex */
public class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "AppStateMonitor";
    private volatile WeakReference<Activity> mActivity;
    private volatile BackgroundStateListener mBackgroundStateListener;
    private volatile Boolean mIsBackground;
    private final Set<Integer> mPausedActivitySet;
    private final Set<Integer> mStartedActivitySet;

    public interface BackgroundStateListener {
        void onStateChanged(boolean z11);
    }

    public static class Holder {
        private static final AppStateMonitor INSTANCE = new AppStateMonitor();

        private Holder() {
        }
    }

    private synchronized void setBackground(boolean z11) {
        try {
            if (this.mIsBackground == null || this.mIsBackground.booleanValue() != z11) {
                this.mIsBackground = Boolean.valueOf(z11);
                if (this.mBackgroundStateListener != null) {
                    this.mBackgroundStateListener.onStateChanged(this.mIsBackground.booleanValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isBackground() {
        return this.mIsBackground.booleanValue();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onActivityDestroyed, activity=");
            sb2.append(activity);
            sb2.append(" mActivity=");
            sb2.append(this.mActivity != null ? this.mActivity.get() : "null");
            Log.m76034i(TAG, sb2.toString(), new Object[0]);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        this.mPausedActivitySet.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        handleActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        handleActivityStarted(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onActivityStopped, activity=");
            sb2.append(activity);
            sb2.append(" mActivity=");
            sb2.append(this.mActivity != null ? this.mActivity.get() : "null");
            Log.m76034i(TAG, sb2.toString(), new Object[0]);
            int iHashCode = activity.hashCode();
            if (this.mStartedActivitySet.contains(Integer.valueOf(iHashCode))) {
                this.mStartedActivitySet.remove(Integer.valueOf(iHashCode));
                setBackground(this.mStartedActivitySet.size() == 0);
                if (this.mActivity != null && this.mActivity.get() == activity) {
                    this.mActivity = null;
                }
            } else if (this.mStartedActivitySet.size() != 0) {
                setBackground(false);
            } else if (this.mPausedActivitySet.contains(Integer.valueOf(iHashCode))) {
                setBackground(true);
            }
            this.mPausedActivitySet.remove(Integer.valueOf(iHashCode));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setActivityFromUser(Activity activity) {
        if (activity == null) {
            return;
        }
        if (getActivity() != null) {
            Log.m76034i(TAG, "activity is exists, don't need activity from user", new Object[0]);
            return;
        }
        this.mActivity = new WeakReference<>(activity);
        Log.m76034i(TAG, "update activity to " + activity + " from user", new Object[0]);
    }

    public synchronized void setBackgroundStateListener(BackgroundStateListener backgroundStateListener) {
        this.mBackgroundStateListener = backgroundStateListener;
    }

    private AppStateMonitor() {
        this.mActivity = null;
        this.mIsBackground = null;
        this.mStartedActivitySet = new HashSet();
        this.mPausedActivitySet = new HashSet();
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.m76033e(TAG, "AppStateMonitor init failed. Context is null", new Object[0]);
        } else {
            ((Application) applicationContext.getApplicationContext()).registerActivityLifecycleCallbacks(this);
            this.mIsBackground = Boolean.valueOf(checkBackground(ContextUtils.getApplicationContext()));
        }
    }

    private static boolean checkBackground(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                Log.m76033e(TAG, "activityManager is null.", new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.m76033e(TAG, "processInfoList is null.", new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            Log.m76033e(TAG, "Get App background state failed. " + e11, new Object[0]);
            return false;
        }
    }

    private void handleActivityStarted(Activity activity) {
        this.mStartedActivitySet.add(Integer.valueOf(activity.hashCode()));
        this.mActivity = new WeakReference<>(activity);
        setBackground(false);
        Log.m76034i(TAG, "update activity to " + activity, new Object[0]);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static AppStateMonitor getInstance() {
        return Holder.INSTANCE;
    }

    public static void setAppIsInBackgroundFromUser(boolean z11) {
        getInstance().mIsBackground = Boolean.valueOf(z11);
    }
}
