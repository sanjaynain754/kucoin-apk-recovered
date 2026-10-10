package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.v0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39957v0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TUIRoomDefine.RoomInfo f88830a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TUIConferenceInvitationManager.Invitation f88831b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TUIRoomDefine.UserInfo f88832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39957v0(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation, TUIRoomDefine.UserInfo userInfo) {
        super(1);
        this.f88830a = roomInfo;
        this.f88831b = invitation;
        this.f88832c = userInfo;
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RoomListener notify = (RoomListener) obj;
        Intrinsics.checkNotNullParameter(notify, "$this$notify");
        notify.onCallRevokedByAdmin(AbstractC39939m0.m88365a(this.f88830a, RoomStatus.RUNNING), AbstractC39939m0.m88363a(this.f88831b), AbstractC39939m0.m88368a(this.f88832c));
        return Unit.INSTANCE;
    }
}
