package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.p */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39852p {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88579a;

    static {
        int[] iArr = new int[MessageType.values().length];
        try {
            iArr[MessageType.TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageType.IMAGE.ordinal()] = 2;
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
        try {
            iArr[MessageType.VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MessageType.FACE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[MessageType.CUSTOM.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f88579a = iArr;
    }
}
