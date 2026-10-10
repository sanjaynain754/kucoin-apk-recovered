package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.D0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39873D0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RoomInfo f88628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39873D0(RoomInfo roomInfo) {
        super(1);
        this.f88628a = roomInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onAddedToScheduledRoom(this.f88628a);
        return Unit.INSTANCE;
    }
}
