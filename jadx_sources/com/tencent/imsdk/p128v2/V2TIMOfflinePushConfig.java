package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.offlinepush.OfflinePushToken;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMOfflinePushConfig implements Serializable {
    private OfflinePushToken offlinePushToken;

    public V2TIMOfflinePushConfig(long j11, String str) {
        OfflinePushToken offlinePushToken = new OfflinePushToken();
        this.offlinePushToken = offlinePushToken;
        offlinePushToken.setBusinessID((int) j11);
        this.offlinePushToken.setDeviceToken(str);
        this.offlinePushToken.setIsTPNSToken(false);
    }

    public OfflinePushToken getOfflinePushToken() {
        return this.offlinePushToken;
    }

    @Deprecated
    public V2TIMOfflinePushConfig(long j11, String str, boolean z11) {
        OfflinePushToken offlinePushToken = new OfflinePushToken();
        this.offlinePushToken = offlinePushToken;
        offlinePushToken.setBusinessID((int) j11);
        this.offlinePushToken.setDeviceToken(str);
        this.offlinePushToken.setIsTPNSToken(z11);
    }
}
