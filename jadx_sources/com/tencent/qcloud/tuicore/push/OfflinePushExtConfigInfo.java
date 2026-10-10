package com.tencent.qcloud.tuicore.push;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes56.dex */
public class OfflinePushExtConfigInfo implements Serializable {
    public static final int FCM_NOTIFICATION_TYPE_PASS_THROUGH = 1;
    public static final int FCM_NOTIFICATION_TYPE_TIMPUSH = 0;
    public static final int FCM_PUSH_TYPE_DATA = 0;
    public static final int FCM_PUSH_TYPE_NOTIFICATION = 1;
    private int fcmPushType = -1;
    private int fcmNotificationType = -1;

    public int getFCMNotificationType() {
        return this.fcmNotificationType;
    }

    public void setFCMNotificationType(int i11) {
        this.fcmNotificationType = i11;
    }

    public void setFCMPushType(int i11) {
        this.fcmPushType = i11;
    }

    @NonNull
    public String toString() {
        return "OfflinePushExtConfigInfo{fcmPushType=" + this.fcmPushType + ", fcmNotificationType='" + this.fcmNotificationType + '}';
    }
}
