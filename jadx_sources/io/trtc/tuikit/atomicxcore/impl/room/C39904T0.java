package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager;
import com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.ListResultCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39395e;
import io.trtc.tuikit.atomicxcore.api.room.CallRejectionReason;
import io.trtc.tuikit.atomicxcore.api.room.CallUserToRoomCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.CreateRoomOptions;
import io.trtc.tuikit.atomicxcore.api.room.GetRoomInfoCompletionHandler;
import io.trtc.tuikit.atomicxcore.api.room.RoomInfo;
import io.trtc.tuikit.atomicxcore.api.room.RoomListener;
import io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore;
import io.trtc.tuikit.atomicxcore.api.room.RoomState;
import io.trtc.tuikit.atomicxcore.api.room.RoomStore;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import io.trtc.tuikit.atomicxcore.api.room.ScheduleRoomOptions;
import io.trtc.tuikit.atomicxcore.api.room.UpdateRoomOptions;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.room.log.C39937a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.T0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39904T0 extends RoomStore {

    /* JADX INFO: renamed from: k */
    public static final Lazy f88694k = LazyKt.lazy(C39947q0.f88813a);

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88695a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88696b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88697c;

    /* JADX INFO: renamed from: d */
    public final C39937a f88698d;

    /* JADX INFO: renamed from: e */
    public final int f88699e;

    /* JADX INFO: renamed from: f */
    public final TUIRoomEngine f88700f;

    /* JADX INFO: renamed from: g */
    public final TUIConferenceListManager f88701g;

    /* JADX INFO: renamed from: h */
    public final TUIConferenceInvitationManager f88702h;

    /* JADX INFO: renamed from: i */
    public final C39509q f88703i;

    /* JADX INFO: renamed from: j */
    public final RoomState f88704j;

    public C39904T0() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88695a = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a("");
        this.f88696b = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(new RoomInfo(null, null, null, 0, 0L, null, 0L, 0L, 0, null, null, false, false, false, false, 32767, null));
        this.f88697c = interfaceC41669nM91009a3;
        Intrinsics.checkNotNullParameter("RoomStoreImpl", "file");
        this.f88698d = new C39937a("RoomStoreImpl");
        this.f88699e = 20;
        TUIRoomEngine tUIRoomEngineSharedInstance = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(tUIRoomEngineSharedInstance, "sharedInstance(...)");
        this.f88700f = tUIRoomEngineSharedInstance;
        Object extension = tUIRoomEngineSharedInstance.getExtension(TUICommonDefine.ExtensionType.CONFERENCE_LIST_MANAGER);
        Intrinsics.checkNotNull(extension, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceListManager");
        TUIConferenceListManager tUIConferenceListManager = (TUIConferenceListManager) extension;
        this.f88701g = tUIConferenceListManager;
        Object extension2 = tUIRoomEngineSharedInstance.getExtension(TUICommonDefine.ExtensionType.CONFERENCE_INVITATION_MANAGER);
        Intrinsics.checkNotNull(extension2, "null cannot be cast to non-null type com.tencent.cloud.tuikit.engine.extension.TUIConferenceInvitationManager");
        TUIConferenceInvitationManager tUIConferenceInvitationManager = (TUIConferenceInvitationManager) extension2;
        this.f88702h = tUIConferenceInvitationManager;
        C39879G0 c39879g0 = new C39879G0(this);
        C39877F0 c39877f0 = new C39877F0(this);
        C39963y0 c39963y0 = new C39963y0(this);
        this.f88703i = new C39509q();
        tUIRoomEngineSharedInstance.addObserver(c39879g0);
        tUIConferenceListManager.addObserver(c39877f0);
        tUIConferenceInvitationManager.addObserver(c39963y0);
        this.f88704j = new RoomState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2), C41636g.m90907c(interfaceC41669nM91009a3));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void acceptCall(String roomID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        this.f88702h.accept(roomID, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void addRoomListener(RoomListener roomListener) {
        this.f88703i.m88248a(roomListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void addScheduledAttendees(String roomID, List userIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        this.f88701g.addAttendeesByAdmin(roomID, userIDList, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void callUserToRoom(String roomID, List userIDList, int i11, String str, CallUserToRoomCompletionHandler callUserToRoomCompletionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        this.f88702h.inviteUsers(roomID, userIDList, i11, str, new C39885J0(callUserToRoomCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void cancelCall(String roomID, List userIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        this.f88702h.cancelInvitation(roomID, userIDList, new C39495c(null, null, null, 7));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void cancelScheduledRoom(String roomID, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        this.f88701g.cancelConference(roomID, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void createAndJoinRoom(String roomID, CreateRoomOptions options, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(options, "options");
        TUIRoomEngine tUIRoomEngine = this.f88700f;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(options, "options");
        TUIRoomDefine.RoomInfo roomInfo = new TUIRoomDefine.RoomInfo();
        roomInfo.roomId = roomID;
        roomInfo.name = options.getRoomName();
        roomInfo.password = options.getPassword();
        roomInfo.isMicrophoneDisableForAllUser = options.isAllMicrophoneDisabled();
        roomInfo.isCameraDisableForAllUser = options.isAllCameraDisabled();
        roomInfo.isScreenShareDisableForAllUser = options.isAllScreenShareDisabled();
        roomInfo.isMessageDisableForAllUser = options.isAllMessageDisabled();
        tUIRoomEngine.createRoom(roomInfo, new C39887K0(this, roomID, options, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void endRoom(CompletionHandler completionHandler) {
        this.f88700f.destroyRoom(new C39889L0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void getPendingCalls(String roomID, String str, ListResultCompletionHandler listResultCompletionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (str == null) {
            str = "";
        }
        this.f88702h.getInvitationList(roomID, str, this.f88699e, new C39891M0(listResultCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void getRoomInfo(String roomID, GetRoomInfoCompletionHandler getRoomInfoCompletionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        this.f88701g.fetchConferenceInfo(roomID, new C39893N0(getRoomInfoCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void getScheduledAttendees(String roomID, String str, ListResultCompletionHandler listResultCompletionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (str == null) {
            str = "";
        }
        this.f88701g.fetchAttendeeList(roomID, str, this.f88699e, new C39895O0(roomID, this, listResultCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void getScheduledRoomList(String str, ListResultCompletionHandler listResultCompletionHandler) {
        if (str == null) {
            str = "";
        }
        this.f88701g.fetchScheduledConferenceList(CollectionsKt.listOf((Object[]) new TUIConferenceListManager.ConferenceStatus[]{TUIConferenceListManager.ConferenceStatus.NOT_STARTED, TUIConferenceListManager.ConferenceStatus.RUNNING}), str, this.f88699e, new C39897P0(str, this, listResultCompletionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final RoomState getState() {
        return this.f88704j;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void joinRoom(String roomID, String str, CompletionHandler completionHandler) {
        Object obj;
        Object objPutIfAbsent;
        RoomParticipantStore roomParticipantStore;
        Object objPutIfAbsent2;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (str == null) {
            str = "";
        }
        TUIRoomDefine.EnterRoomOptions enterRoomOptions = new TUIRoomDefine.EnterRoomOptions();
        enterRoomOptions.password = str;
        Lazy lazy = C39945p0.f88810b;
        C39945p0 c39945p0M88369a = AbstractC39943o0.m88369a();
        c39945p0M88369a.getClass();
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        if (Intrinsics.areEqual(RoomStore.class.getName(), RoomStore.class.getName())) {
            obj = (C39904T0) f88694k.getValue();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomStore");
            }
        } else {
            ConcurrentHashMap concurrentHashMap = c39945p0M88369a.f88811a;
            Object concurrentHashMap2 = concurrentHashMap.get(roomID);
            if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(roomID, (concurrentHashMap2 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap2 = objPutIfAbsent;
            }
            Map map = (Map) concurrentHashMap2;
            String strM88224a = AbstractC39395e.m88224a(map, RoomStore.class, "getName(...)");
            Object c39934k0 = map.get(strM88224a);
            if (c39934k0 == null) {
                if (!Intrinsics.areEqual(RoomStore.class.getName(), RoomParticipantStore.class.getName())) {
                    throw new Exception("type is not supported");
                }
                c39934k0 = new C39934k0(roomID);
                map.put(strM88224a, c39934k0);
            }
            obj = (RoomStore) c39934k0;
        }
        InterfaceC39917c interfaceC39917c = obj instanceof InterfaceC39917c ? (InterfaceC39917c) obj : null;
        if (interfaceC39917c != null) {
            C39934k0 c39934k1 = (C39934k0) interfaceC39917c;
            Intrinsics.checkNotNullParameter(roomID, "roomID");
            c39934k1.f88767a.addObserver(c39934k1.f88788v);
            c39934k1.f88765A.addObserver(c39934k1.f88790x);
            c39934k1.f88792z.addObserver(c39934k1.f88789w);
        }
        if (Intrinsics.areEqual(RoomParticipantStore.class.getName(), RoomStore.class.getName())) {
            Object obj2 = (C39904T0) f88694k.getValue();
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.room.RoomParticipantStore");
            }
            roomParticipantStore = (RoomParticipantStore) obj2;
        } else {
            ConcurrentHashMap concurrentHashMap3 = c39945p0M88369a.f88811a;
            Object concurrentHashMap4 = concurrentHashMap3.get(roomID);
            if (concurrentHashMap4 == null && (objPutIfAbsent2 = concurrentHashMap3.putIfAbsent(roomID, (concurrentHashMap4 = new ConcurrentHashMap()))) != null) {
                concurrentHashMap4 = objPutIfAbsent2;
            }
            Map map2 = (Map) concurrentHashMap4;
            String strM88224a2 = AbstractC39395e.m88224a(map2, RoomParticipantStore.class, "getName(...)");
            Object c39934k2 = map2.get(strM88224a2);
            if (c39934k2 == null) {
                if (!Intrinsics.areEqual(RoomParticipantStore.class.getName(), RoomParticipantStore.class.getName())) {
                    throw new Exception("type is not supported");
                }
                c39934k2 = new C39934k0(roomID);
                map2.put(strM88224a2, c39934k2);
            }
            roomParticipantStore = (RoomParticipantStore) c39934k2;
        }
        InterfaceC39917c interfaceC39917c2 = roomParticipantStore instanceof InterfaceC39917c ? (InterfaceC39917c) roomParticipantStore : null;
        if (interfaceC39917c2 != null) {
            C39934k0 c39934k3 = (C39934k0) interfaceC39917c2;
            Intrinsics.checkNotNullParameter(roomID, "roomID");
            c39934k3.f88767a.addObserver(c39934k3.f88788v);
            c39934k3.f88765A.addObserver(c39934k3.f88790x);
            c39934k3.f88792z.addObserver(c39934k3.f88789w);
        }
        this.f88700f.enterRoom(roomID, TUIRoomDefine.RoomType.CONFERENCE, enterRoomOptions, new C39899Q0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void leaveRoom(CompletionHandler completionHandler) {
        this.f88700f.exitRoom(true, new C39900R0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void rejectCall(String roomID, CallRejectionReason reason, CompletionHandler completionHandler) {
        TUIConferenceInvitationManager.RejectedReason rejectedReason;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        TUIConferenceInvitationManager tUIConferenceInvitationManager = this.f88702h;
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = AbstractC39936l0.f88802h[reason.ordinal()];
        if (i11 == 1) {
            rejectedReason = TUIConferenceInvitationManager.RejectedReason.REJECT_TO_ENTER;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rejectedReason = TUIConferenceInvitationManager.RejectedReason.IN_OTHER_CONFERENCE;
        }
        tUIConferenceInvitationManager.reject(roomID, rejectedReason, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void removeRoomListener(RoomListener roomListener) {
        this.f88703i.m88250b(roomListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void removeScheduledAttendees(String roomID, List userIDList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(userIDList, "userIDList");
        this.f88701g.removeAttendeesByAdmin(roomID, userIDList, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void reset() {
        C39937a c39937a = this.f88698d;
        c39937a.getClass();
        Intrinsics.checkNotNullParameter("reset", "message");
        c39937a.m88357a(0, "reset");
        this.f88695a.setValue(CollectionsKt.emptyList());
        this.f88696b.setValue("");
        this.f88697c.setValue(new RoomInfo(null, null, null, 0, 0L, null, 0L, 0L, 0, null, null, false, false, false, false, 32767, null));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void scheduleRoom(String roomID, ScheduleRoomOptions options, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f88701g.scheduleConference(AbstractC39939m0.m88358a(roomID, options), new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void updateRoomInfo(String roomID, UpdateRoomOptions options, List modifyFlagList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        if (modifyFlagList.isEmpty()) {
            if (completionHandler != null) {
                completionHandler.onFailure(TUICommonDefine.Error.INVALID_PARAMETER.getValue(), "modifyFlagList is empty");
            }
        } else {
            if (modifyFlagList.size() > 1) {
                if (completionHandler != null) {
                    completionHandler.onFailure(TUICommonDefine.Error.INVALID_PARAMETER.getValue(), "only one modification is allowed");
                    return;
                }
                return;
            }
            int i11 = AbstractC39881H0.f88636a[((UpdateRoomOptions.ModifyFlag) modifyFlagList.get(0)).ordinal()];
            if (i11 == 1) {
                this.f88700f.updateRoomNameByAdmin(options.getRoomName(), new C39495c(completionHandler, null, null, 6));
            } else {
                if (i11 != 2) {
                    return;
                }
                this.f88700f.updateRoomPasswordByAdmin(options.getPassword(), new C39495c(completionHandler, null, null, 6));
            }
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.room.RoomStore
    public final void updateScheduledRoom(String roomID, ScheduleRoomOptions options, List modifyFlagList, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        TUIConferenceListManager tUIConferenceListManager = this.f88701g;
        TUIConferenceListManager.ConferenceInfo conferenceInfoM88358a = AbstractC39939m0.m88358a(roomID, options);
        Intrinsics.checkNotNullParameter(modifyFlagList, "modifyFlagList");
        ArrayList arrayList = new ArrayList();
        if (modifyFlagList.contains(ScheduleRoomOptions.ModifyFlag.ROOM_NAME)) {
            arrayList.add(TUIConferenceListManager.ConferenceModifyFlag.ROOM_NAME);
        }
        if (modifyFlagList.contains(ScheduleRoomOptions.ModifyFlag.SCHEDULE_START_TIME)) {
            arrayList.add(TUIConferenceListManager.ConferenceModifyFlag.SCHEDULE_START_TIME);
        }
        if (modifyFlagList.contains(ScheduleRoomOptions.ModifyFlag.SCHEDULE_END_TIME)) {
            arrayList.add(TUIConferenceListManager.ConferenceModifyFlag.SCHEDULE_END_TIME);
        }
        tUIConferenceListManager.updateConferenceInfo(conferenceInfoM88358a, arrayList, new C39495c(completionHandler, null, null, 6));
    }

    /* JADX INFO: renamed from: a */
    public static final List m88340a(C39904T0 c39904t0, ArrayList arrayList, ArrayList arrayList2) {
        c39904t0.getClass();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((RoomUser) it.next()).getUserID());
        }
        Set set = CollectionsKt.toSet(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!set.contains(((RoomUser) obj).getUserID())) {
                arrayList4.add(obj);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList4);
    }
}
