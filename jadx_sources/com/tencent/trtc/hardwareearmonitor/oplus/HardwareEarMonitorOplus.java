package com.tencent.trtc.hardwareearmonitor.oplus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import androidx.core.provider.FontsContractCompat;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.qcloud.tuicore.TUIConstants;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorOplus {
    private static final int AUTHENTICATE_FAIL = 1002;
    private static final String AUTH_URI = "content://com.oplus.ocs.out.OpenCapabilityThirdProvider/oplus";
    private static final int KARAOKE_MESSAGE_CODE = 3000;
    private static final int KARAOKE_SUCCESS = 1000;
    private static final int ON_BIND_EXCEPTION = 1012;
    private static final int OPEN_CAPABILITY_THIRD_PROVIDER_NOT_FOUND = 1013;
    private static final String TAG = "HardwareEarMonitorOplus";
    private OplusKaraokeServiceAidlInterface mKaraokeServiceInterface;
    private long mNativeHardwareEarMonitorHandle;
    private Intent mServiceIntent;
    private Object mLock = new Object();
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private Context mContext = ContextUtils.getApplicationContext();
    private KaraokeServiceConnection mConnection = new KaraokeServiceConnection();
    private C34748m mTaskRunner = new C34748m();

    public class KaraokeServiceConnection implements ServiceConnection {
        private String mDescName;

        public KaraokeServiceConnection() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OplusKaraokeServiceAidlInterface.Stub.setDESCRIPTOR(this.mDescName);
            HardwareEarMonitorOplus.this.mKaraokeServiceInterface = OplusKaraokeServiceAidlInterface.Stub.asInterface(iBinder);
            if (HardwareEarMonitorOplus.this.mKaraokeServiceInterface != null) {
                LiteavLog.m76087i(HardwareEarMonitorOplus.TAG, "mKaraokeServiceInterface Create Success");
                HardwareEarMonitorOplus.this.notifyResult(1000);
            } else {
                LiteavLog.m76087i(HardwareEarMonitorOplus.TAG, "mKaraokeServiceInterface Create Failed");
                HardwareEarMonitorOplus.this.notifyResult(1012);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            HardwareEarMonitorOplus.this.mKaraokeServiceInterface = null;
            LiteavLog.m76087i(HardwareEarMonitorOplus.TAG, "onServiceDisconnected");
            HardwareEarMonitorOplus.this.notifyResult(1012);
        }

        public void setDescName(String str) {
            this.mDescName = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleResult(long j11, int i11);

    public int getOplusOSVersionInt() {
        try {
            Class<?> cls = Class.forName("com.oplus.os.OplusBuild");
            return ((Integer) cls.getDeclaredMethod("getOplusOSVERSION", new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (Throwable th2) {
            LiteavLog.m76087i(TAG, "getOplusOSVersionInt ex:" + th2.getMessage());
            return 0;
        }
    }

    public int getUidFromPackage() {
        try {
            return this.mContext.getPackageManager().getPackageUid(this.mContext.getPackageName(), 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static HardwareEarMonitorOplus create(long j11) {
        return new HardwareEarMonitorOplus(j11);
    }

    public void authCheck(String str) {
        Bundle bundleCall;
        Uri uri = Uri.parse(AUTH_URI);
        Messenger messenger = new Messenger(new Handler(this.mContext.getMainLooper()) { // from class: com.tencent.trtc.hardwareearmonitor.oplus.HardwareEarMonitorOplus.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                try {
                    super.handleMessage(message);
                    HardwareEarMonitorOplus.this.notifyResult(message.getData().getInt(FontsContractCompat.Columns.RESULT_CODE));
                } catch (Throwable th2) {
                    LiteavLog.m76087i(HardwareEarMonitorOplus.TAG, "authCheck ex:" + th2.getMessage());
                    HardwareEarMonitorOplus.this.notifyResult(1002);
                }
            }
        });
        Bundle bundle = new Bundle();
        bundle.putBinder(TUIConstants.TUIChat.CALL_BACK, messenger.getBinder());
        try {
            bundleCall = this.mContext.getContentResolver().call(uri, "auth", str, bundle);
        } catch (Throwable th2) {
            LiteavLog.m76083e(TAG, "component is not exist or not visible ex:" + th2.getMessage());
            notifyResult(1013);
            bundleCall = null;
        }
        if (bundleCall == null) {
            LiteavLog.m76083e(TAG, "retBundle is null");
            notifyResult(1013);
        }
    }

    public void bindKaraokeService(String str, String str2, String str3) {
        this.mServiceIntent = new Intent();
        LiteavLog.m76087i(TAG, "bindKaraokeService service package name:" + str + " service name:" + str2 + " android os:" + Build.VERSION.SDK_INT + " oplus os:" + getOplusOSVersionInt());
        this.mServiceIntent.setPackage(str);
        this.mServiceIntent.setAction(str2);
        this.mConnection.setDescName(str3);
        try {
            this.mContext.bindService(this.mServiceIntent, this.mConnection, 1);
        } catch (Throwable th2) {
            LiteavLog.m76087i(TAG, "bindKaraokeService ex:" + th2.getMessage());
            notifyResult(1012);
        }
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        try {
            this.mContext.unbindService(this.mConnection);
        } catch (Throwable th2) {
            LiteavLog.m76087i(TAG, "destroy ex:" + th2.getMessage());
        }
        this.mConnection = null;
        this.mKaraokeServiceInterface = null;
    }

    public String getManifestMeta(String str) {
        try {
            return this.mContext.getPackageManager().getApplicationInfo(this.mContext.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th2) {
            LiteavLog.m76087i(TAG, "getManifestMeta ex:" + th2.getMessage());
            return "";
        }
    }

    public void notifyResult(final int i11) {
        this.mTaskRunner.mo76133a(new Runnable() { // from class: com.tencent.trtc.hardwareearmonitor.oplus.HardwareEarMonitorOplus.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HardwareEarMonitorOplus.this.mLock) {
                    HardwareEarMonitorOplus.nativeHandleResult(HardwareEarMonitorOplus.this.mNativeHardwareEarMonitorHandle, i11);
                }
            }
        });
    }

    public void setActiveClient(String str) {
        OplusKaraokeServiceAidlInterface oplusKaraokeServiceAidlInterface = this.mKaraokeServiceInterface;
        if (oplusKaraokeServiceAidlInterface != null) {
            try {
                oplusKaraokeServiceAidlInterface.setActiveClient(str);
            } catch (Throwable th2) {
                LiteavLog.m76087i(TAG, "setActiveClient ex:" + th2.getMessage());
            }
        }
    }

    public boolean setAudioParams(String str) {
        try {
            this.mAudioManager.setParameters(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean systemFeatureSupported(String str) {
        try {
            return this.mContext.getPackageManager().hasSystemFeature(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public HardwareEarMonitorOplus(long j11) {
        this.mNativeHardwareEarMonitorHandle = j11;
    }
}
