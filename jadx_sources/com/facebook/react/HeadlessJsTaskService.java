package com.facebook.react;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class HeadlessJsTaskService extends Service implements HeadlessJsTaskEventListener {

    @Nullable
    private static PowerManager.WakeLock sWakeLock;
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    @Nullable
    public HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @SuppressLint({"WakelockTimeout"})
    public static void acquireWakeLockNow(Context context) {
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) C38115a.m86047c((PowerManager) context.getSystemService("power"))).newWakeLock(1, HeadlessJsTaskService.class.getCanonicalName());
            sWakeLock = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int i11) {
        this.mActiveTasks.remove(Integer.valueOf(i11));
        if (this.mActiveTasks.size() == 0) {
            stopSelf();
        }
    }

    private void createReactContextAndScheduleTask(final HeadlessJsTaskConfig headlessJsTaskConfig) {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            final ReactHost reactHost = getReactHost();
            reactHost.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.2
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(@NonNull ReactContext reactContext) {
                    HeadlessJsTaskService.this.invokeStartTask(reactContext, headlessJsTaskConfig);
                    reactHost.removeReactInstanceEventListener(this);
                }
            });
            reactHost.start();
        } else {
            final ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
            reactInstanceManager.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.3
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(@NonNull ReactContext reactContext) {
                    HeadlessJsTaskService.this.invokeStartTask(reactContext, headlessJsTaskConfig);
                    reactInstanceManager.removeReactInstanceEventListener(this);
                }
            });
            reactInstanceManager.createReactContextInBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeStartTask(ReactContext reactContext, final HeadlessJsTaskConfig headlessJsTaskConfig) {
        final HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(reactContext);
        headlessJsTaskContext.addTaskEventListener(this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.HeadlessJsTaskService.1
            @Override // java.lang.Runnable
            public void run() {
                HeadlessJsTaskService.this.mActiveTasks.add(Integer.valueOf(headlessJsTaskContext.startTask(headlessJsTaskConfig)));
            }
        });
    }

    public ReactContext getReactContext() {
        if (ReactNativeFeatureFlags.enableBridgelessArchitecture()) {
            ReactHost reactHost = getReactHost();
            C38115a.m86048d(reactHost, "getReactHost() is null in New Architecture");
            return reactHost.getCurrentReactContext();
        }
        return getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
    }

    @Nullable
    public ReactHost getReactHost() {
        return ((ReactApplication) getApplication()).getReactHost();
    }

    public ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getApplication()).getReactNativeHost();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ReactContext reactContext = getReactContext();
        if (reactContext != null) {
            HeadlessJsTaskContext.getInstance(reactContext).removeTaskEventListener(this);
        }
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        HeadlessJsTaskConfig taskConfig = getTaskConfig(intent);
        if (taskConfig != null) {
            startTask(taskConfig);
            return 3;
        }
        return 2;
    }

    public void startTask(HeadlessJsTaskConfig headlessJsTaskConfig) {
        UiThreadUtil.assertOnUiThread();
        acquireWakeLockNow(this);
        ReactContext reactContext = getReactContext();
        if (reactContext == null) {
            createReactContextAndScheduleTask(headlessJsTaskConfig);
        } else {
            invokeStartTask(reactContext, headlessJsTaskConfig);
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int i11) {
    }
}
