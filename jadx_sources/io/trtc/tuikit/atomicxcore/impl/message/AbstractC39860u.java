package io.trtc.tuikit.atomicxcore.impl.message;

import io.trtc.tuikit.atomicxcore.api.message.MessageFetchDirection;
import io.trtc.tuikit.atomicxcore.api.message.MessageListType;
import io.trtc.tuikit.atomicxcore.api.message.MessageMediaFileType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.u */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39860u {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88603a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f88604b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f88605c;

    static {
        int[] iArr = new int[MessageListType.values().length];
        try {
            iArr[MessageListType.HISTORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageListType.MERGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageListType.PINNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessageListType.REPLIED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f88603a = iArr;
        int[] iArr2 = new int[MessageFetchDirection.values().length];
        try {
            iArr2[MessageFetchDirection.OLDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MessageFetchDirection.NEWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f88604b = iArr2;
        int[] iArr3 = new int[MessageMediaFileType.values().length];
        try {
            iArr3[MessageMediaFileType.THUMB_IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[MessageMediaFileType.LARGE_IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[MessageMediaFileType.ORIGINAL_IMAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[MessageMediaFileType.VIDEO_SNAPSHOT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[MessageMediaFileType.VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[MessageMediaFileType.SOUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[MessageMediaFileType.FILE.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        f88605c = iArr3;
    }
}
