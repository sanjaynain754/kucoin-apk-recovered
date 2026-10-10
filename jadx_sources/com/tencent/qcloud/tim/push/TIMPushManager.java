package com.tencent.qcloud.tim.push;

import android.content.Context;
import com.tencent.qcloud.tim.push.impl.TIMPushManagerImpl;

/* JADX INFO: loaded from: classes56.dex */
public abstract class TIMPushManager {
    public abstract void addPushListener(TIMPushListener tIMPushListener);

    public abstract void callExperimentalAPI(String str, Object obj, TIMPushCallback tIMPushCallback);

    public abstract void disablePostNotificationInForeground(boolean z11);

    public abstract void forceUseFCMPushChannel(boolean z11);

    public abstract void getRegistrationID(TIMPushCallback tIMPushCallback);

    public abstract void registerPush(Context context, int i11, String str, TIMPushCallback tIMPushCallback);

    public abstract void removePushListener(TIMPushListener tIMPushListener);

    public abstract void setRegistrationID(String str, TIMPushCallback tIMPushCallback);

    public abstract void unRegisterPush(TIMPushCallback tIMPushCallback);

    public static TIMPushManager getInstance() {
        return TIMPushManagerImpl.m76884c();
    }
}
