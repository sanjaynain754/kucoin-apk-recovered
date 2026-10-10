package io.trtc.tuikit.atomicxcore.impl.room;

import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C39870C extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f88621a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39934k0 f88622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39870C(boolean z11, C39934k0 c39934k0) {
        super(1);
        this.f88621a = z11;
        this.f88622b = c39934k0;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onAllMessagesDisabled(this.f88621a, this.f88622b.f88786t.f88738a);
        return Unit.INSTANCE;
    }
}
