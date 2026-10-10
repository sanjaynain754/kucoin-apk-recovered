package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.k1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39751k1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88335a;

    static {
        int[] iArr = new int[LoginStatus.values().length];
        try {
            iArr[LoginStatus.LOGINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoginStatus.UNLOGIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f88335a = iArr;
    }
}
