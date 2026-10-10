package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public class HonorFeatureKitManager {
    private static final String ENGINE_PACKAGE_NAME = "com.hihonor.android.magicx.media.audioengine";
    private static final int PACKAGE_INFO_FLAG = 0;
    private static final int SUB_VERSION_MASK = 1000;
    private static final String TAG = "HnAudioEngine.FeatureKitManager";
    public static long mMinVersion;
    private static HonorFeatureKitManager sInstance;
    private IHonorAudioServiceCallback mCallBack = null;
    private static final Object SET_CALL_BACK_LOCK = new Object();
    private static final Object NEW_FEATUREMANAGER_LOCK = new Object();
    private static final Object BIND_SERVICE_LOCK = new Object();
    private static final Object UNBIND_SERVICE_LOCK = new Object();

    public static boolean isAudioKitSupport(Context context) {
        if (context == null) {
            HonorLogUtils.error(TAG, "context is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager == null) {
                HonorLogUtils.error(TAG, "packageManager is null");
                return false;
            }
            int i11 = packageManager.getPackageInfo(ENGINE_PACKAGE_NAME, 0).versionCode / 1000;
            long j11 = i11;
            if (j11 > 1000001) {
                j11 = 1000001;
            }
            mMinVersion = j11;
            HonorLogUtils.info(TAG, " isDeviceSupport is true, enginVersionCode=" + i11 + " audioKitVersionCode=1000001");
            return true;
        } catch (Throwable unused) {
            HonorLogUtils.error(TAG, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    public static HonorFeatureKitManager getInstance() {
        HonorFeatureKitManager honorFeatureKitManager;
        synchronized (NEW_FEATUREMANAGER_LOCK) {
            try {
                if (sInstance == null) {
                    sInstance = new HonorFeatureKitManager();
                }
                honorFeatureKitManager = sInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return honorFeatureKitManager;
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
                    HonorLogUtils.info(TAG, "bindService");
                    context.bindService(intent, serviceConnection, 1);
                } catch (Throwable th2) {
                    HonorLogUtils.error(TAG, "bindService, SecurityException, " + th2.getMessage());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public <T extends HonorAudioFeaturesKit> T createFeatureKit(int i11, Context context) {
        HonorLogUtils.info(TAG, "createFeatureKit, type =".concat(String.valueOf(i11)));
        if (context == null) {
            return null;
        }
        if (i11 == 1) {
            HonorEarReturnClient honorEarReturnClient = new HonorEarReturnClient(context);
            honorEarReturnClient.initialize(context);
            return honorEarReturnClient;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                HonorAudioPlayClient honorAudioPlayClient = new HonorAudioPlayClient(context);
                honorAudioPlayClient.initialize(context);
                return honorAudioPlayClient;
            }
            if (i11 != 4) {
                HonorLogUtils.info(TAG, "createFeatureKit, type error");
                return null;
            }
        }
        HonorAdvancedRecordClient honorAdvancedRecordClient = new HonorAdvancedRecordClient(context);
        honorAdvancedRecordClient.initialize(context);
        return honorAdvancedRecordClient;
    }

    public IHonorAudioServiceCallback getCallBack() {
        return this.mCallBack;
    }

    public void onCallBack(int i11) {
        HonorLogUtils.info(TAG, "onCallBack, result =".concat(String.valueOf(i11)));
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

    public void setCallBack(IHonorAudioServiceCallback iHonorAudioServiceCallback) {
        this.mCallBack = iHonorAudioServiceCallback;
    }

    public void unbindService(Context context, ServiceConnection serviceConnection) {
        HonorLogUtils.info(TAG, "unbindService");
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

    private HonorFeatureKitManager() {
    }
}
