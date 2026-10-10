package com.tencent.trtc.hardwareearmonitor.daisy;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34748m;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorDaisy implements IDaisyAudioKitCallback {
    private static final String TAG = "HardwareEarMonitorDaisy";
    private DaisyAudioKit mDaisyAudioKit;
    private DaisyAudioKaraokeFeatureKit mDaisyKaraokeKit;
    private long mNativeHardwareEarMonitorHandle;
    private Object mLock = new Object();
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private Context mContext = ContextUtils.getApplicationContext();
    private C34748m mTaskRunner = new C34748m();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleResult(long j11, int i11);

    public static HardwareEarMonitorDaisy create(long j11) {
        return new HardwareEarMonitorDaisy(j11);
    }

    private int setEqualizer(int i11) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i11);
    }

    private int setVolume(int i11) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i11);
    }

    public void createKaraokeService() {
        this.mDaisyKaraokeKit = (DaisyAudioKaraokeFeatureKit) this.mDaisyAudioKit.createFeature(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit != null) {
            daisyAudioKit.destroy();
            this.mDaisyAudioKit = null;
        }
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit != null) {
            daisyAudioKaraokeFeatureKit.destroy();
            this.mDaisyKaraokeKit = null;
        }
    }

    public int enableKaraoke(boolean z11) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.enableKaraokeFeature(z11);
    }

    public int getKaraokeLatency() {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return -1;
        }
        try {
            return daisyAudioKaraokeFeatureKit.getKaraokeLatency();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int[] getKaraokeSupportedServices() {
        List<Integer> supportedFeatures = this.mDaisyAudioKit.getSupportedFeatures();
        if (supportedFeatures == null) {
            return null;
        }
        int[] iArr = new int[supportedFeatures.size()];
        for (int i11 = 0; i11 < supportedFeatures.size(); i11++) {
            iArr[i11] = supportedFeatures.get(i11).intValue();
        }
        return iArr;
    }

    public boolean isHardwareEarMonitorSupported() {
        DaisyAudioKit daisyAudioKit = this.mDaisyAudioKit;
        if (daisyAudioKit == null) {
            return false;
        }
        return daisyAudioKit.isFeatureSupported(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    public boolean isKaraokeServiceSupport() {
        return this.mDaisyAudioKit.isFeatureSupported(DaisyAudioKit.FeatureType.HWAUDIO_FEATURE_KARAOKE);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKitCallback
    public void onResult(final int i11) {
        this.mTaskRunner.mo76133a(new Runnable() { // from class: com.tencent.trtc.hardwareearmonitor.daisy.HardwareEarMonitorDaisy.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HardwareEarMonitorDaisy.this.mLock) {
                    HardwareEarMonitorDaisy.nativeHandleResult(HardwareEarMonitorDaisy.this.mNativeHardwareEarMonitorHandle, i11);
                }
            }
        });
    }

    public boolean setAudioParams(String str) {
        try {
            this.mAudioManager.setParameters(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public int setReverberation(int i11) {
        DaisyAudioKaraokeFeatureKit daisyAudioKaraokeFeatureKit = this.mDaisyKaraokeKit;
        if (daisyAudioKaraokeFeatureKit == null) {
            return 1806;
        }
        return daisyAudioKaraokeFeatureKit.setParameter(DaisyAudioKaraokeFeatureKit.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i11);
    }

    public HardwareEarMonitorDaisy(long j11) {
        this.mNativeHardwareEarMonitorHandle = j11;
        DaisyAudioKit daisyAudioKit = new DaisyAudioKit(ContextUtils.getApplicationContext(), this);
        this.mDaisyAudioKit = daisyAudioKit;
        daisyAudioKit.initialize();
    }

    public static boolean isAudioKitSupport() {
        return DaisyFeatureKitManager.isAudioKitSupport(ContextUtils.getApplicationContext());
    }
}
