package com.tencent.qcloud.tim.push.p143ue;

import com.tencent.qcloud.tim.push.TIMPushListener;
import com.tencent.qcloud.tim.push.TIMPushMessage;
import com.tencent.qcloud.tim.push.utils.TIMPushLog;

/* JADX INFO: loaded from: classes56.dex */
public class UEPushListener extends TIMPushListener {
    private long nativePtr;

    private native void nativeOnNotificationClicked(long j11, String str);

    private native void nativeOnRecvPushMessage(long j11, TIMPushMessage tIMPushMessage);

    private native void nativeOnRevokePushMessage(long j11, String str);

    @Override // com.tencent.qcloud.tim.push.TIMPushListener
    public void onNotificationClicked(String str) {
        long j11 = this.nativePtr;
        if (j11 != 0) {
            nativeOnNotificationClicked(j11, str);
        }
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushListener
    public void onRecvPushMessage(TIMPushMessage tIMPushMessage) {
        long j11 = this.nativePtr;
        if (j11 != 0) {
            nativeOnRecvPushMessage(j11, tIMPushMessage);
        }
    }

    @Override // com.tencent.qcloud.tim.push.TIMPushListener
    public void onRevokePushMessage(String str) {
        long j11 = this.nativePtr;
        if (j11 != 0) {
            nativeOnRevokePushMessage(j11, str);
        }
    }

    public UEPushListener(long j11) {
        if (j11 == 0) {
            TIMPushLog.m77017e("UEPushListener", "invalid Native pointer");
        }
        this.nativePtr = j11;
    }
}
