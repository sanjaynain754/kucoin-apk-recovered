package io.trtc.tuikit.atomicxcore.impl.device;

import io.trtc.tuikit.atomicxcore.api.device.AudioChangerType;
import io.trtc.tuikit.atomicxcore.api.device.AudioReverbType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.device.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39644a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88065a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f88066b;

    static {
        int[] iArr = new int[AudioChangerType.values().length];
        try {
            iArr[AudioChangerType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioChangerType.CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudioChangerType.LITTLE_GIRL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AudioChangerType.MAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AudioChangerType.HEAVY_METAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AudioChangerType.COLD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AudioChangerType.FOREIGNER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AudioChangerType.TRAPPED_BEAST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AudioChangerType.FATSO.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[AudioChangerType.STRONG_CURRENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[AudioChangerType.HEAVY_MACHINERY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[AudioChangerType.ETHEREAL.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f88065a = iArr;
        int[] iArr2 = new int[AudioReverbType.values().length];
        try {
            iArr2[AudioReverbType.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[AudioReverbType.KTV.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[AudioReverbType.SMALL_ROOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[AudioReverbType.AUDITORIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[AudioReverbType.DEEP.ordinal()] = 5;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[AudioReverbType.LOUD.ordinal()] = 6;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[AudioReverbType.METALLIC.ordinal()] = 7;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[AudioReverbType.MAGNETIC.ordinal()] = 8;
        } catch (NoSuchFieldError unused20) {
        }
        f88066b = iArr2;
    }
}
