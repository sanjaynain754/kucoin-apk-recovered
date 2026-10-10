package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.w0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39959w0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.RoomInfo f88834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIConferenceInvitationManager.Invitation f88835b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39959w0(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation) {
        super(1);
        this.f88834a = roomInfo;
        this.f88835b = invitation;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCallTimeout(AbstractC39939m0.m88365a(this.f88834a, RoomStatus.RUNNING), AbstractC39939m0.m88363a(this.f88835b));
        return Unit.INSTANCE;
    }
}
