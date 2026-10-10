package io.trtc.tuikit.atomicxcore.impl.contact;

import io.trtc.tuikit.atomicxcore.api.contact.GroupMemberRole;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.contact.P */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC39540P {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f87811a;

    static {
        int[] iArr = new int[GroupMemberRole.values().length];
        try {
            iArr[GroupMemberRole.OWNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GroupMemberRole.ADMIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GroupMemberRole.MEMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GroupMemberRole.ALL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f87811a = iArr;
    }
}
