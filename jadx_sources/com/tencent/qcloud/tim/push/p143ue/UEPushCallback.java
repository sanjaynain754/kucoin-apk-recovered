package com.tencent.qcloud.tim.push.p143ue;

import com.tencent.qcloud.tim.push.TIMPushCallback;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;

/* JADX INFO: loaded from: classes56.dex */
public class UEPushCallback<T> extends TIMPushCallback<T> {
    private long nativePtr;

    private native void nativeOnError(long j11, int i11, String str, Object obj);

    private native void nativeOnSuccess(long j11, Object obj);

    @Override // com.tencent.qcloud.tim.push.TIMPushCallback
    public void onError(int i11, String str, T t11) {
        long j11 = this.nativePtr;
        if (j11 != 0) {
            nativeOnError(j11, i11, str, t11);
        }
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushCallback
    public void onSuccess(T t11) {
        long j11 = this.nativePtr;
        if (j11 != 0) {
            nativeOnSuccess(j11, t11);
        }
    }

    public UEPushCallback(long j11) {
        if (j11 == 0) {
            TIMPushLog.m77017e("UEPushCallback", "invalid Native pointer");
        }
        this.nativePtr = j11;
    }
}
