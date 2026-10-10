package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.I0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39883I0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public static final C39883I0 f88638a = new C39883I0();

    public C39883I0() {
        super(1);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomInfo it = (RoomInfo) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRoomID();
    }
}
