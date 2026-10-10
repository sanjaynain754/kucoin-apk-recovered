package com.tencent.trtc.hardwareearmonitor.honor;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34748m;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorHonor implements IHonorAudioServiceCallback {
    private static final String TAG = "HardwareEarMonitorHonor";
    private HonorAudioClient mHnAudioClient;
    private HonorEarReturnClient mHnEarReturnClient;
    private long mNativeHardwareEarMonitorHandle;
    private Object mLock = new Object();
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private Context mContext = ContextUtils.getApplicationContext();
    private C34748m mTaskRunner = new C34748m();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeHandleResult(long j11, int i11);

    public static HardwareEarMonitorHonor create(long j11) {
        return new HardwareEarMonitorHonor(j11);
    }

    public void createKaraokeService() {
        this.mHnEarReturnClient = (HonorEarReturnClient) this.mHnAudioClient.createService(HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    public void destroy() {
        synchronized (this.mLock) {
            this.mNativeHardwareEarMonitorHandle = 0L;
        }
        HonorAudioClient honorAudioClient = this.mHnAudioClient;
        if (honorAudioClient != null) {
            honorAudioClient.destroy();
            this.mHnAudioClient = null;
        }
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient != null) {
            honorEarReturnClient.destroy();
            this.mHnEarReturnClient = null;
        }
    }

    public int enableKaraoke(boolean z11) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.enableEarReturn(z11);
    }

    public int getKaraokeLatency() {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return -1;
        }
        try {
            return honorEarReturnClient.getEarReturnLatency();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public int[] getKaraokeSupportedServices() {
        List<Integer> supportedServices = this.mHnAudioClient.getSupportedServices();
        if (supportedServices == null) {
            return null;
        }
        int[] iArr = new int[supportedServices.size()];
        for (int i11 = 0; i11 < supportedServices.size(); i11++) {
            iArr[i11] = supportedServices.get(i11).intValue();
        }
        return iArr;
    }

    public boolean isHardwareEarMonitorSupported() {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return false;
        }
        return honorEarReturnClient.isServiceSupported();
    }

    public boolean isKaraokeServiceSupport() {
        return this.mHnAudioClient.isServiceSupported(HonorAudioClient.ServiceType.HNAUDIO_SERVICE_EARRETURN);
    }

    @Override // com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioServiceCallback
    public void onResult(final int i11) {
        this.mTaskRunner.mo76133a(new Runnable() { // from class: com.tencent.trtc.hardwareearmonitor.honor.HardwareEarMonitorHonor.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (HardwareEarMonitorHonor.this.mLock) {
                    HardwareEarMonitorHonor.nativeHandleResult(HardwareEarMonitorHonor.this.mNativeHardwareEarMonitorHandle, i11);
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

    public int setEqualizer(int i11) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_VOCAL_EQUALIZER_MODE, i11);
    }

    public int setReverberation(int i11) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_AUDIO_EFFECT_MODE_BASE, i11);
    }

    public int setVolume(int i11) {
        HonorEarReturnClient honorEarReturnClient = this.mHnEarReturnClient;
        if (honorEarReturnClient == null) {
            return 1806;
        }
        return honorEarReturnClient.setParameter(HonorEarReturnClient.ParameName.CMD_SET_VOCAL_VOLUME_BASE, i11);
    }

    public HardwareEarMonitorHonor(long j11) {
        this.mNativeHardwareEarMonitorHandle = j11;
        HonorAudioClient honorAudioClient = new HonorAudioClient(this.mContext, this);
        this.mHnAudioClient = honorAudioClient;
        honorAudioClient.initialize();
    }

    public static boolean isAudioKitSupport() {
        return HonorAudioClient.isDeviceSupported(ContextUtils.getApplicationContext());
    }
}
