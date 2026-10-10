package com.tencent.trtc.hardwareearmonitor.vivo;

import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorVivo {
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private long mNativeHardwareEarMonitorHandle;

    public static HardwareEarMonitorVivo create(long j11) {
        return new HardwareEarMonitorVivo(j11);
    }

    public String getParameters(String str) {
        try {
            return this.mAudioManager.getParameters(str);
        } catch (Throwable unused) {
            return "";
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

    public HardwareEarMonitorVivo(long j11) {
        this.mNativeHardwareEarMonitorHandle = j11;
    }
}
