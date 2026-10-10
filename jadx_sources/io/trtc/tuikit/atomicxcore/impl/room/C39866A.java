package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.A */
/* JADX INFO: loaded from: classes61.dex */
public final class C39866A extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.Request f88615a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39866A(TUIRoomDefine.Request request) {
        super(1);
        this.f88615a = request;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        DeviceType deviceType = DeviceType.SCREEN_SHARE;
        TUIRoomDefine.UserInfo fromUser = this.f88615a.fromUser;
        Intrinsics.checkNotNullExpressionValue(fromUser, "fromUser");
        notify.onParticipantDeviceClosed(deviceType, AbstractC39939m0.m88368a(fromUser));
        return Unit.INSTANCE;
    }
}
