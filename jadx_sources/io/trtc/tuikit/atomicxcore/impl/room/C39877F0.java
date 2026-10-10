package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomStatus;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.F0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39877F0 extends TUIConferenceListManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39904T0 f88632a;

    public C39877F0(C39904T0 c39904t0) {
        this.f88632a = c39904t0;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceDidCancelled(TUIConferenceListManager.ConferenceInfo conferenceInfo, TUIConferenceListManager.ConferenceCancelReason reason, TUIRoomDefine.UserInfo operateUser) {
        Object value;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        String roomID = ((RoomInfo) this.f88632a.f88697c.getValue()).getRoomID();
        String str = conferenceInfo.basicRoomInfo.roomId;
        boolean zAreEqual = Intrinsics.areEqual(roomID, str);
        C39904T0 c39904t0 = this.f88632a;
        Intrinsics.checkNotNull(str);
        InterfaceC41669n interfaceC41669n = c39904t0.f88695a;
        do {
            value = interfaceC41669n.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                if (!Intrinsics.areEqual(((RoomInfo) obj).getRoomID(), str)) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        if (zAreEqual && reason == TUIConferenceListManager.ConferenceCancelReason.CANCELLED_BY_ADMIN) {
            this.f88632a.f88697c.setValue(new RoomInfo(null, null, null, 0, 0L, null, 0L, 0L, 0, null, null, false, false, false, false, 32767, null));
            this.f88632a.f88703i.m88249a((Function1) new C39867A0(conferenceInfo));
            Lazy lazy = C39945p0.f88810b;
            AbstractC39943o0.m88369a().m88370a(str);
            return;
        }
        if (zAreEqual) {
            return;
        }
        int i11 = AbstractC39965z0.f88843a[reason.ordinal()];
        if (i11 == 1) {
            this.f88632a.f88703i.m88249a((Function1) new C39869B0(conferenceInfo, operateUser));
        } else {
            if (i11 != 2) {
                return;
            }
            this.f88632a.f88703i.m88249a((Function1) new C39871C0(conferenceInfo, operateUser));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceInfoChanged(TUIConferenceListManager.ConferenceInfo conferenceInfo, List modifyFlagList) {
        Object value;
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        C39904T0 c39904t0 = this.f88632a;
        RoomInfo roomInfoM88364a = AbstractC39939m0.m88364a(conferenceInfo);
        c39904t0.getClass();
        modifyFlagList.contains(TUIConferenceListManager.ConferenceModifyFlag.ROOM_NAME);
        String roomName = roomInfoM88364a.getRoomName();
        modifyFlagList.contains(TUIConferenceListManager.ConferenceModifyFlag.SCHEDULE_START_TIME);
        long scheduledStartTime = roomInfoM88364a.getScheduledStartTime();
        modifyFlagList.contains(TUIConferenceListManager.ConferenceModifyFlag.SCHEDULE_END_TIME);
        RoomInfo roomInfoCopy = roomInfoM88364a.copy((32319 & 1) != 0 ? roomInfoM88364a.roomID : null, (32319 & 2) != 0 ? roomInfoM88364a.roomName : roomName, (32319 & 4) != 0 ? roomInfoM88364a.roomOwner : null, (32319 & 8) != 0 ? roomInfoM88364a.participantCount : 0, (32319 & 16) != 0 ? roomInfoM88364a.createTime : 0L, (32319 & 32) != 0 ? roomInfoM88364a.roomStatus : null, (32319 & 64) != 0 ? roomInfoM88364a.scheduledStartTime : scheduledStartTime, (32319 & 128) != 0 ? roomInfoM88364a.scheduledEndTime : roomInfoM88364a.getScheduledEndTime(), (32319 & 256) != 0 ? roomInfoM88364a.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoM88364a.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfoM88364a.password : null, (32319 & 2048) != 0 ? roomInfoM88364a.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoM88364a.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoM88364a.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoM88364a.isAllScreenShareDisabled : false);
        if (Intrinsics.areEqual(roomInfoM88364a.getRoomID(), ((RoomInfo) c39904t0.f88697c.getValue()).getRoomID())) {
            InterfaceC41669n interfaceC41669n = c39904t0.f88697c;
            do {
                value = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value, roomInfoCopy));
        }
        AbstractC39913a.m88342b(c39904t0.f88695a, roomInfoCopy, C39902S0.f88691a);
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceOwnerChanged(TUIConferenceListManager.ConferenceInfo conferenceInfo, TUIRoomDefine.UserInfo newOwner, TUIRoomDefine.UserInfo oldOwner) {
        Object value;
        RoomInfo roomInfoCopy;
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(oldOwner, "oldOwner");
        InterfaceC41669n interfaceC41669n = this.f88632a.f88697c;
        do {
            value = interfaceC41669n.getValue();
            roomInfoCopy = (RoomInfo) value;
            if (Intrinsics.areEqual(roomInfoCopy.getRoomID(), conferenceInfo.basicRoomInfo.roomId)) {
                roomInfoCopy = roomInfoCopy.copy((32319 & 1) != 0 ? roomInfoCopy.roomID : null, (32319 & 2) != 0 ? roomInfoCopy.roomName : null, (32319 & 4) != 0 ? roomInfoCopy.roomOwner : AbstractC39939m0.m88368a(newOwner), (32319 & 8) != 0 ? roomInfoCopy.participantCount : 0, (32319 & 16) != 0 ? roomInfoCopy.createTime : 0L, (32319 & 32) != 0 ? roomInfoCopy.roomStatus : null, (32319 & 64) != 0 ? roomInfoCopy.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfoCopy.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfoCopy.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoCopy.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfoCopy.password : null, (32319 & 2048) != 0 ? roomInfoCopy.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoCopy.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoCopy.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoCopy.isAllScreenShareDisabled : false);
            }
        } while (!interfaceC41669n.compareAndSet(value, roomInfoCopy));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceScheduled(TUIConferenceListManager.ConferenceInfo conferenceInfo) {
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        RoomInfo roomInfoM88364a = AbstractC39939m0.m88364a(conferenceInfo);
        AbstractC39913a.m88341a(this.f88632a.f88695a, roomInfoM88364a, C39883I0.f88638a);
        this.f88632a.f88703i.m88249a((Function1) new C39873D0(roomInfoM88364a));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceStatusUpdated(TUIConferenceListManager.ConferenceInfo conferenceInfo, TUIConferenceListManager.ConferenceStatus status) {
        Object value;
        RoomInfo roomInfoCopy;
        Object obj;
        ArrayList arrayList;
        TUIConferenceListManager.ConferenceInfo conferenceInfo2 = conferenceInfo;
        Intrinsics.checkNotNullParameter(conferenceInfo2, "conferenceInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status, "status");
        RoomStatus roomStatus = AbstractC39936l0.f88801g[status.ordinal()] == 1 ? RoomStatus.RUNNING : RoomStatus.SCHEDULED;
        InterfaceC41669n interfaceC41669n = this.f88632a.f88695a;
        while (true) {
            Object value2 = interfaceC41669n.getValue();
            List<RoomInfo> list = (List) value2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (RoomInfo roomInfoCopy2 : list) {
                if (Intrinsics.areEqual(roomInfoCopy2.getRoomID(), conferenceInfo2.basicRoomInfo.roomId)) {
                    arrayList = arrayList2;
                    obj = value2;
                    roomInfoCopy2 = roomInfoCopy2.copy((32319 & 1) != 0 ? roomInfoCopy2.roomID : null, (32319 & 2) != 0 ? roomInfoCopy2.roomName : null, (32319 & 4) != 0 ? roomInfoCopy2.roomOwner : null, (32319 & 8) != 0 ? roomInfoCopy2.participantCount : 0, (32319 & 16) != 0 ? roomInfoCopy2.createTime : 0L, (32319 & 32) != 0 ? roomInfoCopy2.roomStatus : roomStatus, (32319 & 64) != 0 ? roomInfoCopy2.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfoCopy2.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfoCopy2.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoCopy2.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfoCopy2.password : null, (32319 & 2048) != 0 ? roomInfoCopy2.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoCopy2.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoCopy2.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoCopy2.isAllScreenShareDisabled : false);
                } else {
                    obj = value2;
                    arrayList = arrayList2;
                }
                arrayList.add(roomInfoCopy2);
                arrayList2 = arrayList;
                value2 = obj;
                conferenceInfo2 = conferenceInfo;
            }
            if (interfaceC41669n.compareAndSet(value2, arrayList2)) {
                break;
            } else {
                conferenceInfo2 = conferenceInfo;
            }
        }
        InterfaceC41669n interfaceC41669n2 = this.f88632a.f88697c;
        do {
            value = interfaceC41669n2.getValue();
            roomInfoCopy = (RoomInfo) value;
            if (Intrinsics.areEqual(roomInfoCopy.getRoomID(), conferenceInfo.basicRoomInfo.roomId)) {
                roomInfoCopy = roomInfoCopy.copy((32319 & 1) != 0 ? roomInfoCopy.roomID : null, (32319 & 2) != 0 ? roomInfoCopy.roomName : null, (32319 & 4) != 0 ? roomInfoCopy.roomOwner : null, (32319 & 8) != 0 ? roomInfoCopy.participantCount : 0, (32319 & 16) != 0 ? roomInfoCopy.createTime : 0L, (32319 & 32) != 0 ? roomInfoCopy.roomStatus : roomStatus, (32319 & 64) != 0 ? roomInfoCopy.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfoCopy.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfoCopy.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoCopy.scheduleAttendees : null, (32319 & 1024) != 0 ? roomInfoCopy.password : null, (32319 & 2048) != 0 ? roomInfoCopy.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoCopy.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoCopy.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoCopy.isAllScreenShareDisabled : false);
            }
        } while (!interfaceC41669n2.compareAndSet(value, roomInfoCopy));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onConferenceWillStart(TUIConferenceListManager.ConferenceInfo conferenceInfo) {
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        this.f88632a.f88703i.m88249a((Function1) new C39875E0(AbstractC39939m0.m88364a(conferenceInfo)));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager.Observer
    public final void onScheduleAttendeesUpdated(TUIConferenceListManager.ConferenceInfo conferenceInfo, List leftUsers, List joinedUsers) {
        Object value;
        ArrayList arrayList;
        Object value2;
        RoomInfo roomInfoCopy;
        Intrinsics.checkNotNullParameter(conferenceInfo, "conferenceInfo");
        Intrinsics.checkNotNullParameter(leftUsers, "leftUsers");
        Intrinsics.checkNotNullParameter(joinedUsers, "joinedUsers");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(leftUsers, 10));
        Iterator it = leftUsers.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TUIRoomDefine.UserInfo) it.next()).userId);
        }
        Set set = CollectionsKt.toSet(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(joinedUsers, 10));
        Iterator it2 = joinedUsers.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC39939m0.m88368a((TUIRoomDefine.UserInfo) it2.next()));
        }
        C39904T0 c39904t0 = this.f88632a;
        InterfaceC41669n interfaceC41669n = c39904t0.f88695a;
        do {
            value = interfaceC41669n.getValue();
            List<RoomInfo> list = (List) value;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (RoomInfo roomInfoCopy2 : list) {
                if (Intrinsics.areEqual(roomInfoCopy2.getRoomID(), conferenceInfo.basicRoomInfo.roomId)) {
                    List<RoomUser> scheduleAttendees = roomInfoCopy2.getScheduleAttendees();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj : scheduleAttendees) {
                        if (!set.contains(((RoomUser) obj).getUserID())) {
                            arrayList4.add(obj);
                        }
                    }
                    roomInfoCopy2 = roomInfoCopy2.copy((32319 & 1) != 0 ? roomInfoCopy2.roomID : null, (32319 & 2) != 0 ? roomInfoCopy2.roomName : null, (32319 & 4) != 0 ? roomInfoCopy2.roomOwner : null, (32319 & 8) != 0 ? roomInfoCopy2.participantCount : 0, (32319 & 16) != 0 ? roomInfoCopy2.createTime : 0L, (32319 & 32) != 0 ? roomInfoCopy2.roomStatus : null, (32319 & 64) != 0 ? roomInfoCopy2.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfoCopy2.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfoCopy2.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoCopy2.scheduleAttendees : C39904T0.m88340a(c39904t0, arrayList4, arrayList3), (32319 & 1024) != 0 ? roomInfoCopy2.password : null, (32319 & 2048) != 0 ? roomInfoCopy2.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoCopy2.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoCopy2.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoCopy2.isAllScreenShareDisabled : false);
                }
                arrayList.add(roomInfoCopy2);
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
        C39904T0 c39904t1 = this.f88632a;
        InterfaceC41669n interfaceC41669n2 = c39904t1.f88697c;
        do {
            value2 = interfaceC41669n2.getValue();
            roomInfoCopy = (RoomInfo) value2;
            if (Intrinsics.areEqual(roomInfoCopy.getRoomID(), conferenceInfo.basicRoomInfo.roomId)) {
                List<RoomUser> scheduleAttendees2 = roomInfoCopy.getScheduleAttendees();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : scheduleAttendees2) {
                    if (!set.contains(((RoomUser) obj2).getUserID())) {
                        arrayList5.add(obj2);
                    }
                }
                roomInfoCopy = roomInfoCopy.copy((32319 & 1) != 0 ? roomInfoCopy.roomID : null, (32319 & 2) != 0 ? roomInfoCopy.roomName : null, (32319 & 4) != 0 ? roomInfoCopy.roomOwner : null, (32319 & 8) != 0 ? roomInfoCopy.participantCount : 0, (32319 & 16) != 0 ? roomInfoCopy.createTime : 0L, (32319 & 32) != 0 ? roomInfoCopy.roomStatus : null, (32319 & 64) != 0 ? roomInfoCopy.scheduledStartTime : 0L, (32319 & 128) != 0 ? roomInfoCopy.scheduledEndTime : 0L, (32319 & 256) != 0 ? roomInfoCopy.startReminderInSeconds : 0, (32319 & 512) != 0 ? roomInfoCopy.scheduleAttendees : C39904T0.m88340a(c39904t1, arrayList5, arrayList3), (32319 & 1024) != 0 ? roomInfoCopy.password : null, (32319 & 2048) != 0 ? roomInfoCopy.isAllMicrophoneDisabled : false, (32319 & 4096) != 0 ? roomInfoCopy.isAllCameraDisabled : false, (32319 & 8192) != 0 ? roomInfoCopy.isAllMessageDisabled : false, (32319 & 16384) != 0 ? roomInfoCopy.isAllScreenShareDisabled : false);
            }
        } while (!interfaceC41669n2.compareAndSet(value2, roomInfoCopy));
    }
}
