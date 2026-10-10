package com.tencent.qcloud.tuicore.push;

import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public class OfflinePushExtInfo implements Serializable {
    public static final int REDIRECT_ACTION_CALL = 2;
    public static final int REDIRECT_ACTION_CHAT = 1;
    private OfflinePushExtBusinessInfo entity = new OfflinePushExtBusinessInfo();
    private OfflinePushExtConfigInfo timPushFeatures = new OfflinePushExtConfigInfo();

    public OfflinePushExtBusinessInfo getBusinessInfo() {
        return this.entity;
    }

    public OfflinePushExtConfigInfo getConfigInfo() {
        return this.timPushFeatures;
    }

    public void setBusinessInfo(OfflinePushExtBusinessInfo offlinePushExtBusinessInfo) {
        if (offlinePushExtBusinessInfo == null) {
            offlinePushExtBusinessInfo = new OfflinePushExtBusinessInfo();
        }
        this.entity = offlinePushExtBusinessInfo;
    }
}
