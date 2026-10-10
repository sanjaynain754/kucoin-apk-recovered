package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.V */
/* JADX INFO: loaded from: classes61.dex */
public final class C39907V implements TUIRoomDefine.GetUserInfoCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39934k0 f88716a;

    public C39907V(C39934k0 c39934k0) {
        this.f88716a = c39934k0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserInfoCallback
    public final void onError(TUICommonDefine.Error error, String message) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(message, "message");
        C39937a c39937a = this.f88716a.f88776j;
        String message2 = "initLocalUserInfo onError: " + error + ", " + message;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39937a.m88357a(2, message2);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.GetUserInfoCallback
    public final void onSuccess(TUIRoomDefine.UserInfo userInfo) {
        Object value;
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        RoomParticipant roomParticipantM88367a = AbstractC39939m0.m88367a(userInfo, RoomParticipantStatus.IN_ROOM);
        InterfaceC41669n interfaceC41669n = this.f88716a.f88775i;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, roomParticipantM88367a));
    }
}
