package io.trtc.tuikit.atomicxcore.impl.view.live;

import io.trtc.tuikit.atomicxcore.api.device.MirrorType;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.M0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40068M0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f89133a;

    static {
        int[] iArr = new int[MirrorType.values().length];
        try {
            iArr[MirrorType.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MirrorType.ENABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MirrorType.DISABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f89133a = iArr;
    }
}
