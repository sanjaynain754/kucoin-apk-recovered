package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.G */
/* JADX INFO: loaded from: classes61.dex */
public final class C39878G extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C39878G f88633a = new C39878G();

    public C39878G() {
        super(1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipant it = (RoomParticipant) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getUserID();
    }
}
