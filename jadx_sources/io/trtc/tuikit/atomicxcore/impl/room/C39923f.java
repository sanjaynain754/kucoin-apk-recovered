package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39923f extends TUIConferenceInvitationManager.Observer {

    /* JADX INFO: renamed from: a */
    public final String f88741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39934k0 f88742b;

    public C39923f(C39934k0 c39934k0, String roomID) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        this.f88742b = c39934k0;
        this.f88741a = roomID;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationAdded(String roomID, TUIConferenceInvitationManager.Invitation invitation) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        if (Intrinsics.areEqual(this.f88741a, roomID)) {
            C39934k0 c39934k0 = this.f88742b;
            TUIRoomDefine.UserInfo invitee = invitation.invitee;
            Intrinsics.checkNotNullExpressionValue(invitee, "invitee");
            TUIConferenceInvitationManager.InvitationStatus status = invitation.status;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            RoomParticipant participant = AbstractC39939m0.m88366a(invitee, status);
            c39934k0.getClass();
            Intrinsics.checkNotNullParameter(participant, "participant");
            if (c39934k0.f88781o.containsKey(participant.getUserID())) {
                return;
            }
            c39934k0.f88782p.put(participant.getUserID(), participant);
            AbstractC39913a.m88341a(c39934k0.f88772f, participant, C39880H.f88635a);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationRemoved(String roomID, TUIConferenceInvitationManager.Invitation invitation) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        if (Intrinsics.areEqual(this.f88741a, roomID)) {
            C39934k0 c39934k0 = this.f88742b;
            String userID = invitation.invitee.userId;
            Intrinsics.checkNotNullExpressionValue(userID, "userId");
            c39934k0.getClass();
            Intrinsics.checkNotNullParameter(userID, "userID");
            c39934k0.f88782p.remove(userID);
            InterfaceC41669n interfaceC41669n = c39934k0.f88772f;
            do {
                value = interfaceC41669n.getValue();
                arrayList = new ArrayList();
                for (Object obj : (List) value) {
                    if (!Intrinsics.areEqual(((RoomParticipant) obj).getUserID(), userID)) {
                        arrayList.add(obj);
                    }
                }
            } while (!interfaceC41669n.compareAndSet(value, arrayList));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager.Observer
    public final void onInvitationStatusChanged(String roomID, TUIConferenceInvitationManager.Invitation invitation) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(invitation, "invitation");
        if (Intrinsics.areEqual(this.f88741a, roomID)) {
            C39934k0 c39934k0 = this.f88742b;
            TUIRoomDefine.UserInfo invitee = invitation.invitee;
            Intrinsics.checkNotNullExpressionValue(invitee, "invitee");
            TUIConferenceInvitationManager.InvitationStatus status = invitation.status;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            RoomParticipant participant = AbstractC39939m0.m88366a(invitee, status);
            c39934k0.getClass();
            Intrinsics.checkNotNullParameter(participant, "participant");
            if (c39934k0.f88781o.containsKey(participant.getUserID())) {
                return;
            }
            c39934k0.f88782p.put(participant.getUserID(), participant);
            AbstractC39913a.m88341a(c39934k0.f88772f, participant, C39880H.f88635a);
        }
    }
}
