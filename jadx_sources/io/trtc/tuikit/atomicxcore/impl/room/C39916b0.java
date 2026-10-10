package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.b0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39916b0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RoomUser f88733a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39916b0(RoomUser roomUser) {
        super(1);
        this.f88733a = roomUser;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onAdminRevoked(this.f88733a);
        return Unit.INSTANCE;
    }
}
