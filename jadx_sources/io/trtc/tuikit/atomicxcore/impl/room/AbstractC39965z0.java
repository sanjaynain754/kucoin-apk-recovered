package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.z0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39965z0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f88843a;

    static {
        int[] iArr = new int[TUIConferenceListManager.ConferenceCancelReason.values().length];
        try {
            iArr[TUIConferenceListManager.ConferenceCancelReason.CANCELLED_BY_ADMIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TUIConferenceListManager.ConferenceCancelReason.REMOVED_FROM_ATTENDEES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f88843a = iArr;
    }
}
