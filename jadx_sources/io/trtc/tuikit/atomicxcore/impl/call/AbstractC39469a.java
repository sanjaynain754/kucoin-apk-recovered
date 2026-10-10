package io.trtc.tuikit.atomicxcore.impl.call;

import com.tencent.cloud.tuikit.engine.call.TUICallDefine;
import io.trtc.tuikit.atomicxcore.api.call.CallMediaType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.a */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39469a {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f87625a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f87626b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f87627c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f87628d;

    static {
        int[] iArr = new int[CallMediaType.values().length];
        try {
            iArr[CallMediaType.Audio.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CallMediaType.Video.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f87625a = iArr;
        int[] iArr2 = new int[TUICallDefine.MediaType.values().length];
        try {
            iArr2[TUICallDefine.MediaType.Audio.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TUICallDefine.MediaType.Video.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f87626b = iArr2;
        int[] iArr3 = new int[TUICallDefine.CallRecords.Result.values().length];
        try {
            iArr3[TUICallDefine.CallRecords.Result.Unknown.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[TUICallDefine.CallRecords.Result.Missed.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[TUICallDefine.CallRecords.Result.Incoming.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TUICallDefine.CallRecords.Result.Outgoing.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f87627c = iArr3;
        int[] iArr4 = new int[TUICallDefine.CallEndReason.values().length];
        try {
            iArr4[TUICallDefine.CallEndReason.HANGUP.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.LINE_BUSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.REJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.NO_RESPONSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.OFFLINE.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.CANCELED.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.OTHER_DEVICE_ACCEPTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.OTHER_DEVICE_REJECT.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[TUICallDefine.CallEndReason.END_BY_SERVER.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        f87628d = iArr4;
    }
}
