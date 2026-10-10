package io.trtc.tuikit.atomicxcore.impl.view.room;

import io.trtc.tuikit.atomicxcore.api.view.VideoStreamType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.room.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40147a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89291a;

    static {
        int[] iArr = new int[VideoStreamType.values().length];
        try {
            iArr[VideoStreamType.CAMERA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoStreamType.SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f89291a = iArr;
    }
}
