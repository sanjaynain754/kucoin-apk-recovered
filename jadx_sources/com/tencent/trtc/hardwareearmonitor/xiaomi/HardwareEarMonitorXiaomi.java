package com.tencent.trtc.hardwareearmonitor.xiaomi;

import android.media.AudioManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::extensions")
public class HardwareEarMonitorXiaomi {
    private AudioManager mAudioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    private long mNativeHardwareEarMonitorHandle;

    public static HardwareEarMonitorXiaomi create(long j11) {
        return new HardwareEarMonitorXiaomi(j11);
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

    public HardwareEarMonitorXiaomi(long j11) {
        this.mNativeHardwareEarMonitorHandle = j11;
    }
}
