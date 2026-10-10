package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39925g extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39925g(TUIRoomDefine.UserInfo userInfo, TUIRoomDefine.UserInfo userInfo2) {
        super(1);
        this.f88744a = userInfo;
        this.f88745b = userInfo2;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onOwnerChanged(AbstractC39939m0.m88368a(this.f88744a), AbstractC39939m0.m88368a(this.f88745b));
        return Unit.INSTANCE;
    }
}
