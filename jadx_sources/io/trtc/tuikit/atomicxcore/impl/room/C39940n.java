package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.n */
/* JADX INFO: loaded from: classes61.dex */
public final class C39940n extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88806a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39940n(TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88806a = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onParticipantLeft(AbstractC39939m0.m88368a(this.f88806a));
        return Unit.INSTANCE;
    }
}
