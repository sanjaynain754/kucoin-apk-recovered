package io.trtc.tuikit.atomicxcore.impl.view.room;

import io.trtc.tuikit.atomicxcore.api.view.VideoStreamType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.room.f */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40152f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89296a;

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
        f89296a = iArr;
    }
}
