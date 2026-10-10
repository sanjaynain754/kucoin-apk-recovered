package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipant;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39927h extends TUIConferenceListManager.Observer {

    /* JADX INFO: renamed from: a */
    public final String f88749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39934k0 f88750b;

    public C39927h(C39934k0 c39934k0, String roomID) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        this.f88750b = c39934k0;
        this.f88749a = roomID;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceOwnerChanged(TUIConferenceListManager.ConferenceInfo conferenceInfo, TUIRoomDefine.UserInfo newOwner, TUIRoomDefine.UserInfo oldOwner) {
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(oldOwner, "oldOwner");
        if (Intrinsics.areEqual(this.f88749a, conferenceInfo.basicRoomInfo.roomId)) {
            this.f88750b.f88787u.m88249a((Function1) new C39925g(newOwner, oldOwner));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onScheduleAttendeesUpdated(TUIConferenceListManager.ConferenceInfo conferenceInfo, List leftUsers, List joinedUsers) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        Intrinsics.checkNotNullParameter(leftUsers, "leftUsers");
        Intrinsics.checkNotNullParameter(joinedUsers, "joinedUsers");
        if (Intrinsics.areEqual(this.f88749a, conferenceInfo.basicRoomInfo.roomId)) {
            C39934k0 c39934k0 = this.f88750b;
            Iterator it = leftUsers.iterator();
            while (it.hasNext()) {
                String userID = ((TUIRoomDefine.UserInfo) it.next()).userId;
                Intrinsics.checkNotNullExpressionValue(userID, "userId");
                c39934k0.getClass();
                Intrinsics.checkNotNullParameter(userID, "userID");
                c39934k0.f88783q.remove(userID);
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
            C39934k0 c39934k1 = this.f88750b;
            Iterator it2 = joinedUsers.iterator();
            while (it2.hasNext()) {
                RoomParticipant participant = AbstractC39939m0.m88367a((TUIRoomDefine.UserInfo) it2.next(), RoomParticipantStatus.SCHEDULED);
                c39934k1.getClass();
                Intrinsics.checkNotNullParameter(participant, "participant");
                if (!c39934k1.f88781o.containsKey(participant.getUserID()) && !c39934k1.f88782p.containsKey(participant.getUserID())) {
                    c39934k1.f88783q.put(participant.getUserID(), participant);
                    AbstractC39913a.m88341a(c39934k1.f88772f, participant, C39878G.f88633a);
                }
            }
        }
    }
}
