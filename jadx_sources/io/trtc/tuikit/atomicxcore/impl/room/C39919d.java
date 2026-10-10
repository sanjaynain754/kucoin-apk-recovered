package io.trtc.tuikit.atomicxcore.impl.room;

import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C39919d extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f88735a;

    /* JADX INFO: renamed from: b */
    public final String f88736b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39919d(int i11, String errorMessage) {
        super(i11 + " : " + errorMessage);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f88735a = i11;
        this.f88736b = errorMessage;
    }
}
