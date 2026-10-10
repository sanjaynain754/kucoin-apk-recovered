package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.s */
/* JADX INFO: loaded from: classes61.dex */
public final class C39950s extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.Request f88817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39950s(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88817a = request;
        this.f88818b = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onDeviceRequestProcessed(AbstractC39939m0.m88361a(this.f88817a), AbstractC39939m0.m88368a(this.f88818b));
        return Unit.INSTANCE;
    }
}
