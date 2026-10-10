package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.MoveSeatPolicy;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.O0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39697O0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88211a;

    static {
        int[] iArr = new int[MoveSeatPolicy.values().length];
        try {
            iArr[MoveSeatPolicy.ABORT_WHEN_OCCUPIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MoveSeatPolicy.FORCE_REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MoveSeatPolicy.SWAP_POSITION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f88211a = iArr;
    }
}
