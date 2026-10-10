package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.t */
/* JADX INFO: loaded from: classes61.dex */
public final class C39952t extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.Request f88821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88822b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39952t(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88821a = request;
        this.f88822b = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onDeviceRequestProcessed(AbstractC39939m0.m88361a(this.f88821a), AbstractC39939m0.m88368a(this.f88822b));
        return Unit.INSTANCE;
    }
}
