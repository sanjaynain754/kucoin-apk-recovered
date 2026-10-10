package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.f0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39924f0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.Request f88743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39924f0(TUIRoomDefine.Request request) {
        super(1);
        this.f88743a = request;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onDeviceRequestTimeout(AbstractC39939m0.m88361a(this.f88743a));
        return Unit.INSTANCE;
    }
}
