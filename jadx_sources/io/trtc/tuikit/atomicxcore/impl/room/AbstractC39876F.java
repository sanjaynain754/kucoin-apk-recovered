package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.ParticipantRole;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.F */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39876F {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88631a;

    static {
        int[] iArr = new int[ParticipantRole.values().length];
        try {
            iArr[ParticipantRole.ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParticipantRole.GENERAL_USER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f88631a = iArr;
        int[] iArr2 = new int[EnumC39906U0.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            EnumC39906U0 enumC39906U0 = EnumC39906U0.AUDIO;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            EnumC39906U0 enumC39906U1 = EnumC39906U0.AUDIO;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
