package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.UpdateRoomOptions;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.H0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39881H0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88636a;

    static {
        int[] iArr = new int[UpdateRoomOptions.ModifyFlag.values().length];
        try {
            iArr[UpdateRoomOptions.ModifyFlag.ROOM_NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UpdateRoomOptions.ModifyFlag.PASSWORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f88636a = iArr;
    }
}
