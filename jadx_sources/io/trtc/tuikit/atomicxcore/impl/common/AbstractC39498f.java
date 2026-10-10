package io.trtc.tuikit.atomicxcore.impl.common;

import io.trtc.tuikit.atomicxcore.api.message.MessageType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.common.f */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39498f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f87696a;

    static {
        int[] iArr = new int[MessageType.values().length];
        try {
            iArr[MessageType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageType.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageType.SOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessageType.FILE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f87696a = iArr;
    }
}
