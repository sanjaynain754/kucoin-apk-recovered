package io.trtc.tuikit.atomicxcore.impl.device;

import io.trtc.tuikit.atomicxcore.api.device.DeviceFocusOwner;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.m */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39656m {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88092a;

    static {
        int[] iArr = new int[DeviceFocusOwner.values().length];
        try {
            iArr[DeviceFocusOwner.CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f88092a = iArr;
    }
}
