package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.KickedOutOfRoomReason;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantListener;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.l */
/* JADX INFO: loaded from: classes61.dex */
public final class C39935l extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.KickedOutOfRoomReason f88793a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f88794b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39935l(TUIRoomDefine.KickedOutOfRoomReason kickedOutOfRoomReason, String str) {
        super(1);
        this.f88793a = kickedOutOfRoomReason;
        this.f88794b = str;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KickedOutOfRoomReason kickedOutOfRoomReason;
        RoomParticipantListener notify = (RoomParticipantListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        TUIRoomDefine.KickedOutOfRoomReason reason = this.f88793a;
        Intrinsics.checkNotNullParameter(reason, "reason");
        switch (AbstractC39936l0.f88798d[reason.ordinal()]) {
            case 1:
                kickedOutOfRoomReason = KickedOutOfRoomReason.KICKED_BY_ADMIN;
                break;
            case 2:
                kickedOutOfRoomReason = KickedOutOfRoomReason.REPLACED_BY_ANOTHER_DEVICE;
                break;
            case 3:
                kickedOutOfRoomReason = KickedOutOfRoomReason.KICKED_BY_SERVER;
                break;
            case 4:
                kickedOutOfRoomReason = KickedOutOfRoomReason.CONNECTION_TIMEOUT;
                break;
            case 5:
                kickedOutOfRoomReason = KickedOutOfRoomReason.INVALID_STATUS_ON_RECONNECT;
                break;
            case 6:
                kickedOutOfRoomReason = KickedOutOfRoomReason.ROOM_LIMIT_EXCEEDED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        notify.onKickedFromRoom(kickedOutOfRoomReason, this.f88794b);
        return Unit.INSTANCE;
    }
}
