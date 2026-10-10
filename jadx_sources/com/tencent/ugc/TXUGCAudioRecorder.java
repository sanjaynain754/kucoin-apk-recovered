package com.tencent.ugc;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TXUGCAudioRecorder {
    private static TXUGCAudioRecorder sInstance;

    public interface ITXAudioRecorderListener {
        void onRecordComplete(TXRecordCommon.TXRecordResult tXRecordResult);

        void onRecordProgress(long j11);
    }

    public abstract void setAudioRecordListener(ITXAudioRecorderListener iTXAudioRecorderListener);

    public abstract int startRecord(String str, TXRecordCommon.TXUGCAudioConfig tXUGCAudioConfig);

    public abstract void stopRecord();

    public static synchronized TXUGCAudioRecorder getInstance(Context context) {
        try {
            if (sInstance == null) {
                sInstance = new UGCAudioRecorderJni(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sInstance;
    }
}
