package com.tencent.ugc;

import android.content.Context;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.SoLoader;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCAudioRecorderJni extends TXUGCAudioRecorder {
    private static final String TAG = "UGCRecorderJni";
    private TXUGCAudioRecorder.ITXAudioRecorderListener mAudioRecordListener;
    private final long mNativeUGCRecorderJni;

    private static native long nativeCreate(UGCAudioRecorderJni uGCAudioRecorderJni);

    private static native void nativeDestroy(long j11);

    private static native int nativeStartRecord(long j11, String str, int i11, int i12, int i13, boolean z11, int i14, int i15);

    private static native void nativeStopRecord(long j11);

    public void onRecordComplete(int i11, String str, String str2) {
        synchronized (this) {
            try {
                TXUGCAudioRecorder.ITXAudioRecorderListener iTXAudioRecorderListener = this.mAudioRecordListener;
                if (iTXAudioRecorderListener == null) {
                    return;
                }
                TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
                tXRecordResult.retCode = i11;
                tXRecordResult.descMsg = str;
                tXRecordResult.videoPath = str2;
                iTXAudioRecorderListener.onRecordComplete(tXRecordResult);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onRecordProgress(long j11) {
        synchronized (this) {
            try {
                TXUGCAudioRecorder.ITXAudioRecorderListener iTXAudioRecorderListener = this.mAudioRecordListener;
                if (iTXAudioRecorderListener == null) {
                    return;
                }
                iTXAudioRecorderListener.onRecordProgress(j11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.ugc.TXUGCAudioRecorder
    public void setAudioRecordListener(TXUGCAudioRecorder.ITXAudioRecorderListener iTXAudioRecorderListener) {
        synchronized (this) {
            this.mAudioRecordListener = iTXAudioRecorderListener;
        }
    }

    @Override // com.tencent.ugc.TXUGCAudioRecorder
    public int startRecord(String str, TXRecordCommon.TXUGCAudioConfig tXUGCAudioConfig) {
        synchronized (this) {
            try {
                if (!UGCLicenseChecker.isStandardFunctionSupport() && !UGCLicenseChecker.isIMPluginFunctionSupport() && tXUGCAudioConfig.enableAIDeNoise) {
                    LiteavLog.m76083e(TAG, "You've enabled the ai denoise feature, but failed the permission verification.");
                    return -5;
                }
                if (tXUGCAudioConfig == null) {
                    tXUGCAudioConfig = new TXRecordCommon.TXUGCAudioConfig();
                }
                return nativeStartRecord(this.mNativeUGCRecorderJni, str, tXUGCAudioConfig.bitrateBps, tXUGCAudioConfig.channel, tXUGCAudioConfig.sampleRate, tXUGCAudioConfig.enableAIDeNoise, tXUGCAudioConfig.minDurationMs, tXUGCAudioConfig.maxDurationMs);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.ugc.TXUGCAudioRecorder
    public void stopRecord() {
        synchronized (this) {
            nativeStopRecord(this.mNativeUGCRecorderJni);
        }
    }

    static {
        SoLoader.loadAllLibraries();
    }

    public UGCAudioRecorderJni(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        UGCInitializer.initialize();
        this.mNativeUGCRecorderJni = nativeCreate(this);
    }

    public void finalize() throws Throwable {
        super.finalize();
        stopRecord();
        nativeDestroy(this.mNativeUGCRecorderJni);
        UGCInitializer.uninitialize();
    }
}
