package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public class HonorAdvancedRecordClient extends HonorAudioFeaturesKit {
    private static final String ENGINE_CLASS_NAME = "com.hihonor.android.magicx.media.audioengine.HnAdvancedRecordServiceImpl";
    private static final String TAG = "HnAudioService.HnAdvancedRecordClient";
    private Context mContext;
    private HonorFeatureKitManager mFeatureKitManager;
    private boolean mIsServiceConnected = false;
    private IHonorAdvancedRecordService mHnAdvancedRecordService = null;
    private IBinder mService = null;
    private final IBinder mClientBinder = new Binder();
    private ServiceConnection mConnection = new ServiceConnection() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HonorAdvancedRecordClient.this.mHnAdvancedRecordService = IHonorAdvancedRecordService.Stub.asInterface(iBinder);
            HonorLogUtils.info(HonorAdvancedRecordClient.TAG, "HnAdvancedRecordClient onServiceConnected");
            if (HonorAdvancedRecordClient.this.mHnAdvancedRecordService != null) {
                HonorAdvancedRecordClient.this.mIsServiceConnected = true;
                HonorLogUtils.info(HonorAdvancedRecordClient.TAG, "HnAdvancedRecordClient onServiceConnected, mIHnAdvancedRecordService is not null");
                HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(2000);
                HonorAdvancedRecordClient honorAdvancedRecordClient = HonorAdvancedRecordClient.this;
                honorAdvancedRecordClient.serviceInit(honorAdvancedRecordClient.mContext.getPackageName());
                HonorAdvancedRecordClient.this.serviceLinkToDeath(iBinder);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HonorLogUtils.info(HonorAdvancedRecordClient.TAG, "HnAdvancedRecordClient onServiceDisconnected");
            HonorAdvancedRecordClient.this.mHnAdvancedRecordService = null;
            HonorAdvancedRecordClient.this.mIsServiceConnected = false;
            HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(2001);
        }
    };
    private IBinder.DeathRecipient mDeathRecipient = new IBinder.DeathRecipient() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HonorAdvancedRecordClient.2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            HonorAdvancedRecordClient.this.mService.unlinkToDeath(HonorAdvancedRecordClient.this.mDeathRecipient, 0);
            HonorAdvancedRecordClient.this.mFeatureKitManager.onCallBack(6);
            HonorLogUtils.error(HonorAdvancedRecordClient.TAG, "service binder died");
            HonorAdvancedRecordClient.this.mService = null;
        }
    };

    public enum DenoiseLevel {
        DENOISE_DEFAULT_LEVEL(1);

        private final int mDenoiseLevel;

        public final int getLevel() {
            return this.mDenoiseLevel;
        }

        DenoiseLevel(int i11) {
            this.mDenoiseLevel = i11;
        }
    }

    public enum DenoiseMode {
        DENOISE_NN_MODE(1);

        private final int mDenoiseMode;

        public final int getMode() {
            return this.mDenoiseMode;
        }

        DenoiseMode(int i11) {
            this.mDenoiseMode = i11;
        }
    }

    public enum DenoiseScene {
        DENOISE_SPEAK_SCENE(1);

        private final int mDenoiseScene;

        public final int getScene() {
            return this.mDenoiseScene;
        }

        DenoiseScene(int i11) {
            this.mDenoiseScene = i11;
        }
    }

    private void bindService(Context context) {
        HonorLogUtils.info(TAG, "HnAdvancedRecordClient bindService");
        HonorFeatureKitManager honorFeatureKitManager = this.mFeatureKitManager;
        if (honorFeatureKitManager == null || this.mIsServiceConnected) {
            return;
        }
        honorFeatureKitManager.bindService(context, this.mConnection, ENGINE_CLASS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceInit(String str) {
        HonorLogUtils.info(TAG, "HnAdvancedRecordClient serviceInit");
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return;
            }
            iHonorAdvancedRecordService.init(str);
        } catch (Throwable th2) {
            HonorLogUtils.error(TAG, "HnAdvancedRecordClient isSupported,RemoteException ex :" + th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serviceLinkToDeath(IBinder iBinder) {
        this.mService = iBinder;
        if (iBinder != null) {
            try {
                iBinder.linkToDeath(this.mDeathRecipient, 0);
            } catch (Throwable unused) {
                this.mFeatureKitManager.onCallBack(2002);
                HonorLogUtils.error(TAG, "serviceLinkToDeath, RemoteException");
            }
        }
    }

    public boolean disableAdvancedRecord(Context context) {
        HonorLogUtils.info(TAG, "HnAdvancedRecordClient disableAdvancedRecord mIsServiceConnected=" + this.mIsServiceConnected);
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHonorAdvancedRecordService.disableAdvancedRecord();
        } catch (Throwable th2) {
            HonorLogUtils.error(TAG, "disableAdvancedRecord failed, RemoteException ex : " + th2.getMessage());
            return false;
        }
    }

    public boolean enableAdvancedRecord(Context context) {
        HonorLogUtils.info(TAG, "HnAdvancedRecordClient enableAdvancedRecord");
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return false;
            }
            return iHonorAdvancedRecordService.enableAdvancedRecord();
        } catch (Throwable th2) {
            HonorLogUtils.error(TAG, "enableAdvancedRecord failed, RemoteException ex : " + th2.getMessage());
            return false;
        }
    }

    public int enableRecordDenoise(boolean z11, DenoiseMode denoiseMode, DenoiseScene denoiseScene, DenoiseLevel denoiseLevel) {
        if (HonorFeatureKitManager.mMinVersion < 1000001) {
            HonorLogUtils.error(TAG, "enable record denoise fail, mix version is " + HonorFeatureKitManager.mMinVersion);
            return 2004;
        }
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService == null || !this.mIsServiceConnected) {
                return -2;
            }
            return iHonorAdvancedRecordService.enableRecordDenoise(z11, denoiseMode.getMode(), denoiseScene.getScene(), denoiseLevel.getLevel(), this.mClientBinder);
        } catch (Throwable th2) {
            HonorLogUtils.error(TAG, "enableRecordDenoise,RemoteException ex : " + th2.getMessage());
            return -2;
        }
    }

    public void initialize(Context context) {
        HonorLogUtils.info(TAG, "HnAdvancedRecordClient initialize");
        if (context == null) {
            HonorLogUtils.info(TAG, "initialize, context is null");
        } else if (HonorFeatureKitManager.isAudioKitSupport(context)) {
            bindService(context);
        } else {
            this.mFeatureKitManager.onCallBack(2);
            HonorLogUtils.info(TAG, "initialize, not install AudioEngine");
        }
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public boolean isServiceSupported() {
        StringBuilder sb2 = new StringBuilder("HnAdvancedRecordClient isSupported, type = ");
        HonorAudioClient.ServiceType serviceType = HonorAudioClient.ServiceType.HNAUDIO_SERVICE_ADVANCEDRECORD;
        sb2.append(serviceType.getServiceType());
        sb2.append(",mIsServiceConnected=");
        sb2.append(this.mIsServiceConnected);
        HonorLogUtils.info(TAG, sb2.toString());
        try {
            IHonorAdvancedRecordService iHonorAdvancedRecordService = this.mHnAdvancedRecordService;
            if (iHonorAdvancedRecordService != null && this.mIsServiceConnected) {
                return iHonorAdvancedRecordService.isSupported(serviceType.getServiceType());
            }
        } catch (Throwable th2) {
            HonorLogUtils.error(TAG, "isSupported,RemoteException ex : " + th2.getMessage());
        }
        return super.isServiceSupported();
    }

    public HonorAdvancedRecordClient(Context context) {
        this.mFeatureKitManager = null;
        this.mFeatureKitManager = HonorFeatureKitManager.getInstance();
        this.mContext = context;
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.HonorAudioFeaturesKit
    public void destroy() {
        super.destroy();
        HonorLogUtils.info(TAG, "destroy, HnAdvancedRecordClient mIsServiceConnected = " + this.mIsServiceConnected);
        if (this.mIsServiceConnected) {
            this.mIsServiceConnected = false;
            this.mFeatureKitManager.unbindService(this.mContext, this.mConnection);
        }
    }
}
