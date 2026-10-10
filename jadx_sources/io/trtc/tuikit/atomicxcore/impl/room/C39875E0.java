package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.E0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39875E0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RoomInfo f88630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39875E0(RoomInfo roomInfo) {
        super(1);
        this.f88630a = roomInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onScheduledRoomStartingSoon(this.f88630a);
        return Unit.INSTANCE;
    }
}
