package com.tencent.trtc.hardwareearmonitor.daisy;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes2.dex */
public class DaisyFeatureKitManager {
    private static final String ENGINE_PACKAGE_NAME = "com.huawei.multimedia.audioengine";
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final String TAG = "DaisyAudioKit.DaisyFeatureKitManager";
    private static DaisyFeatureKitManager sInstance;
    private IDaisyAudioKitCallback mCallBack = null;
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();

    public static boolean isAudioKitSupport(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            return packageManager.getPackageInfo(ENGINE_PACKAGE_NAME, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            LiteavLog.m76083e(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    public <T extends DaisyAudioFeaturesKit> T createFeatureKit(int i11, Context context) {
        if (context == null || i11 != 1) {
            return null;
        }
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = new DaisyAudioKaraokeFeatureKit(context);
        daisyAudioKaraokeFeatureKit.initialize(context);
        return daisyAudioKaraokeFeatureKit;
    }

    public static DaisyFeatureKitManager getInstance() {
        DaisyFeatureKitManager daisyFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new DaisyFeatureKitManager();
                }
                daisyFeatureKitManager = sInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return daisyFeatureKitManager;
    }

    public void bindService(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (BIND_SERVICE_LOCK) {
            try {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(ENGINE_PACKAGE_NAME, str);
                try {
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e11) {
                    LiteavLog.m76085e(TAG, "bindService, SecurityException, %s", e11.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public IDaisyAudioKitCallback getCallBack() {
        return this.mCallBack;
    }

    public void onCallBack(int i11) {
        synchronized (SET_CALL_BACK_LOCK) {
            try {
                if (getCallBack() != null) {
                    getCallBack().onResult(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setCallBack(IDaisyAudioKitCallback iDaisyAudioKitCallback) {
        this.mCallBack = iDaisyAudioKitCallback;
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        synchronized (UNBIND_SERVICE_LOCK) {
            if (context != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
