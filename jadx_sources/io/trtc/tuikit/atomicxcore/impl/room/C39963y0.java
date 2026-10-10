package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.y0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39963y0 extends TUIConferenceInvitationManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39904T0 f88841a;

    public C39963y0(C39904T0 c39904t0) {
        this.f88841a = c39904t0;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationAccepted(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        this.f88841a.f88703i.m88249a((Function1) new C39949r0(roomInfo, invitation));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationCancelled(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        this.f88841a.f88703i.m88249a((Function1) new C39951s0(roomInfo, invitation));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationHandledByOtherDevice(TUIRoomDefine.RoomInfo roomInfo, boolean z11) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        this.f88841a.f88703i.m88249a((Function1) new C39953t0(roomInfo, z11));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationRejected(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation, TUIConferenceInvitationManager.RejectedReason reason) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f88841a.f88703i.m88249a((Function1) new C39955u0(roomInfo, invitation, reason));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationRevokedByAdmin(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation, TUIRoomDefine.UserInfo admin) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        Intrinsics.checkNotNullParameter(admin, "admin");
        this.f88841a.f88703i.m88249a((Function1) new C39957v0(roomInfo, invitation, admin));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationTimeout(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        this.f88841a.f88703i.m88249a((Function1) new C39959w0(roomInfo, invitation));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onReceiveInvitation(TUIRoomDefine.RoomInfo roomInfo, TUIConferenceInvitationManager.Invitation invitation, String extensionInfo) {
        Intrinsics.checkNotNullParameter(roomInfo, "roomInfo");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        this.f88841a.f88703i.m88249a((Function1) new C39961x0(roomInfo, invitation, extensionInfo));
    }
}
