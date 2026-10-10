package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.CallRejectionReason;
import io.trtc.tuikit.atomicxcore.api.room.RoomCall;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.u0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39955u0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.RoomInfo f88826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIConferenceInvitationManager.Invitation f88827b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUIConferenceInvitationManager.RejectedReason f88828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39955u0(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation, TUIConferenceInvitationManager.RejectedReason rejectedReason) {
        super(1);
        this.f88826a = roomInfo;
        this.f88827b = invitation;
        this.f88828c = rejectedReason;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CallRejectionReason callRejectionReason;
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        RoomInfo roomInfoM88365a = AbstractC39939m0.m88365a(this.f88826a, RoomStatus.RUNNING);
        RoomCall roomCallM88363a = AbstractC39939m0.m88363a(this.f88827b);
        TUIConferenceInvitationManager.RejectedReason reason = this.f88828c;
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = AbstractC39936l0.f88803i[reason.ordinal()];
        if (i11 == 1) {
            callRejectionReason = CallRejectionReason.REJECTED;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            callRejectionReason = CallRejectionReason.IN_OTHER_ROOM;
        }
        notify.onCallRejected(roomInfoM88365a, roomCallM88363a, callRejectionReason);
        return Unit.INSTANCE;
    }
}
