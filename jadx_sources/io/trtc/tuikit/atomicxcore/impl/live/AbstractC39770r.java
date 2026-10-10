package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.r */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39770r {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88376a;

    static {
        int[] iArr = new int[TUIRoomDefine.RequestAction.values().length];
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_TO_TAKE_SEAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TUIRoomDefine.RequestAction.REQUEST_REMOTE_USER_ON_SEAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f88376a = iArr;
    }
}
