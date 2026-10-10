package com.tencent.imsdk.p128v2;

/* JADX INFO: loaded from: classes59.dex */
public abstract class V2TIMOfflinePushManager {
    public abstract void doBackground(int i11, V2TIMCallback v2TIMCallback);

    public abstract void doForeground(V2TIMCallback v2TIMCallback);

    public abstract void setOfflinePushConfig(V2TIMOfflinePushConfig v2TIMOfflinePushConfig, V2TIMCallback v2TIMCallback);

    public static V2TIMOfflinePushManager getInstance() {
        return V2TIMOfflinePushManagerImpl.getInstance();
    }
}
