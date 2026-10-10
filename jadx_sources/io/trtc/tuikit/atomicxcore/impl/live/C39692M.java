package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestState;
import io.trtc.tuikit.atomicxcore.api.live.CoGuestStore;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.HostListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.Role;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.SuspendStatus;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39506n;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39652i;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.M */
/* JADX INFO: loaded from: classes61.dex */
public final class C39692M extends CoGuestStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f88178a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f88179b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88180c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88181d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88182e;

    /* JADX INFO: renamed from: f */
    public final C39510r f88183f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f88184g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f88185h;

    /* JADX INFO: renamed from: i */
    public final C39509q f88186i;

    /* JADX INFO: renamed from: j */
    public final C39509q f88187j;

    /* JADX INFO: renamed from: k */
    public final C39785y f88188k;

    /* JADX INFO: renamed from: l */
    public TUIRoomDefine.Request f88189l;

    /* JADX INFO: renamed from: m */
    public TUIRoomDefine.Request f88190m;

    /* JADX INFO: renamed from: n */
    public final HashSet f88191n;

    /* JADX INFO: renamed from: o */
    public LiveInfo f88192o;

    /* JADX INFO: renamed from: p */
    public final CoGuestState f88193p;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88183f;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88192o = liveInfo;
        List<TUIRoomDefine.SeatFullInfo> listQuerySeatList = this.f88179b.querySeatList();
        Intrinsics.checkNotNull(listQuerySeatList);
        m88302a(listQuerySeatList);
        if (!m88305a()) {
            AbstractC39465b.m88232a(this.f88183f, "audience enter room, leave seat at first", "message", 0, "audience enter room, leave seat at first");
            disconnect(null);
        }
        if (m88305a()) {
            this.f88179b.getSeatApplicationList(new C39678F(this));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88183f, "message", 0);
        this.f88179b.addObserver(this.f88188k);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void acceptApplication(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: acceptApplication called with userID=", str, this.f88183f, "message", 0);
        m88304a(true, str, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void acceptInvitation(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: acceptInvitation called with inviterID=", str, this.f88183f, "message", 0);
        m88303a(true, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void addGuestListener(GuestListener guestListener) {
        C39510r c39510r = this.f88183f;
        String message = "API: addGuestListener called with listener=" + guestListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88187j.m88248a(guestListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void addHostListener(HostListener hostListener) {
        C39510r c39510r = this.f88183f;
        String message = "API: addHostListener called with listener=" + hostListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88186i.m88248a(hostListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void applyForSeat(int i11, int i12, String str, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88183f;
        String message = "API: applyForSeat called with seatIndex=" + i11 + ", timeout=" + i12 + ", extraInfo=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88189l = this.f88179b.takeSeat(i11, i12, new C39672C(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void cancelApplication(CompletionHandler completionHandler) {
        AbstractC39465b.m88232a(this.f88183f, "API: cancelApplication called", "message", 0, "API: cancelApplication called");
        TUIRoomDefine.Request request = this.f88189l;
        if (request != null) {
            this.f88179b.cancelRequest(request.requestId, new C39495c(completionHandler, new C39674D(this), null, 4));
            return;
        }
        C39510r c39510r = this.f88183f;
        StringBuilder sb2 = new StringBuilder("Response: cancelApplication onFailure with code=");
        TUICommonDefine.Error error = TUICommonDefine.Error.FAILED;
        sb2.append(error.getValue());
        sb2.append(", message=No application is requesting");
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), "No application is requesting");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void cancelInvitation(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: cancelInvitation called with inviteeID=", str, this.f88183f, "message", 0);
        TUIRoomDefine.Request request = (TUIRoomDefine.Request) this.f88185h.get(str);
        if (request != null) {
            this.f88179b.cancelRequest(request.requestId, new C39495c(completionHandler, new C39676E(this, str), null, 4));
            return;
        }
        AbstractC39465b.m88232a(this.f88183f, "No invitation is requesting", "message", 1, "No invitation is requesting");
        C39510r c39510r = this.f88183f;
        StringBuilder sb2 = new StringBuilder("Response: cancelInvitation onFailure with code=");
        TUICommonDefine.Error error = TUICommonDefine.Error.FAILED;
        sb2.append(error.getValue());
        sb2.append(", message=No invitation is requesting");
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), "No invitation is requesting");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void disconnect(CompletionHandler completionHandler) {
        AbstractC39465b.m88232a(this.f88183f, "API: disconnect called", "message", 0, "API: disconnect called");
        this.f88179b.leaveSeat(new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final CoGuestState getCoGuestState() {
        return this.f88193p;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void inviteToSeat(String str, int i11, int i12, String str2, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88183f;
        String message = "API: inviteToSeat called with inviteeID=" + str + ", seatIndex=" + i11 + ", timeout=" + i12 + ", extraInfo=" + str2;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIRoomDefine.Request requestTakeUserOnSeatByAdmin = this.f88179b.takeUserOnSeatByAdmin(i11, str, i12, new C39686J(this, completionHandler));
        Intrinsics.checkNotNull(requestTakeUserOnSeatByAdmin);
        InterfaceC41669n interfaceC41669n = this.f88181d;
        List mutableList = CollectionsKt.toMutableList((Collection) interfaceC41669n.getValue());
        mutableList.add(AbstractC39747j0.m88321a(requestTakeUserOnSeatByAdmin));
        interfaceC41669n.setValue(mutableList);
        LinkedHashMap linkedHashMap = this.f88185h;
        String userId = requestTakeUserOnSeatByAdmin.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        linkedHashMap.put(userId, requestTakeUserOnSeatByAdmin);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void rejectApplication(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: rejectApplication called with userID=", str, this.f88183f, "message", 0);
        m88304a(false, str, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void rejectInvitation(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: rejectInvitation called with inviterID=", str, this.f88183f, "message", 0);
        m88303a(false, completionHandler);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void removeGuestListener(GuestListener guestListener) {
        C39510r c39510r = this.f88183f;
        String message = "API: removeGuestListener called with listener=" + guestListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88187j.m88250b(guestListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.CoGuestStore
    public final void removeHostListener(HostListener hostListener) {
        C39510r c39510r = this.f88183f;
        String message = "API: removeHostListener called with listener=" + hostListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88186i.m88250b(hostListener);
    }

    public C39692M(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88178a = liveID;
        this.f88179b = roomEngine;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88180c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88181d = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88182e = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(CollectionsKt.emptyList());
        Intrinsics.checkNotNullParameter("CoGuestStoreImpl", "file");
        this.f88183f = new C39510r("AtomicXCore-Live", "CoGuestStoreImpl");
        this.f88184g = new LinkedHashMap();
        this.f88185h = new LinkedHashMap();
        this.f88186i = new C39509q();
        this.f88187j = new C39509q();
        this.f88188k = new C39785y(this);
        this.f88191n = new HashSet();
        this.f88193p = new CoGuestState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, interfaceC41669nM91009a4);
    }

    /* JADX INFO: renamed from: b */
    public static final void m88301b(C39692M c39692m, String str) {
        TypeIntrinsics.asMutableMap(c39692m.f88185h).remove(str);
        InterfaceC41669n interfaceC41669n = c39692m.f88181d;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((LiveUserInfo) obj).getUserID(), str)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88183f, "message", 0);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f88186i.f87705a;
        C39506n c39506n = C39506n.f87702a;
        CollectionsKt.removeAll((List) copyOnWriteArrayList, (Function1) c39506n);
        CollectionsKt.removeAll((List) this.f88187j.f87705a, (Function1) c39506n);
        this.f88179b.removeObserver(this.f88188k);
    }

    /* JADX INFO: renamed from: a */
    public final void m88304a(boolean z11, String str, CompletionHandler completionHandler) {
        TUIRoomDefine.Request request = (TUIRoomDefine.Request) this.f88184g.get(str);
        if (request == null) {
            C39510r c39510r = this.f88183f;
            StringBuilder sb2 = new StringBuilder("Response: responseApplication onFailure with code=");
            TUICommonDefine.Error error = TUICommonDefine.Error.FAILED;
            sb2.append(error.getValue());
            sb2.append(", message=Not receiving requests");
            String message = sb2.toString();
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(0, message);
            if (completionHandler != null) {
                completionHandler.onFailure(error.getValue(), "Not receiving requests");
                return;
            }
            return;
        }
        this.f88179b.responseRemoteRequest(request.requestId, z11, new C39495c(completionHandler, new C39688K(this, z11, request), null, 4));
    }

    /* JADX INFO: renamed from: a */
    public final void m88303a(boolean z11, CompletionHandler completionHandler) {
        TUIRoomDefine.Request request = this.f88190m;
        if (request == null) {
            AbstractC39465b.m88232a(this.f88183f, "Not receiving requests", "message", 1, "Not receiving requests");
            C39510r c39510r = this.f88183f;
            StringBuilder sb2 = new StringBuilder("Response: responseInvitation onFailure with code=");
            TUICommonDefine.Error error = TUICommonDefine.Error.FAILED;
            sb2.append(error.getValue());
            sb2.append(", message=Not receiving requests");
            String message = sb2.toString();
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(0, message);
            if (completionHandler != null) {
                completionHandler.onFailure(error.getValue(), "Not receiving requests");
                return;
            }
            return;
        }
        this.f88179b.responseRemoteRequest(request.requestId, z11, new C39495c(completionHandler, new C39690L(this, z11), null, 4));
    }

    /* JADX INFO: renamed from: a */
    public final void m88302a(List list) {
        Object value;
        ArrayList arrayList;
        LiveUserInfo liveOwner;
        InterfaceC41669n interfaceC41669n = this.f88180c;
        do {
            value = interfaceC41669n.getValue();
            ArrayList<TUIRoomDefine.SeatFullInfo> arrayList2 = new ArrayList();
            for (Object obj : list) {
                TUIRoomDefine.SeatFullInfo seatFullInfo = (TUIRoomDefine.SeatFullInfo) obj;
                String str = seatFullInfo.userId;
                if (str != null) {
                    Intrinsics.checkNotNull(str);
                    if (str.length() > 0 && Intrinsics.areEqual(seatFullInfo.roomId, this.f88178a)) {
                        arrayList2.add(obj);
                    }
                }
            }
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (TUIRoomDefine.SeatFullInfo seatFullInfo2 : arrayList2) {
                LiveInfo liveInfo = this.f88192o;
                boolean zAreEqual = Intrinsics.areEqual((liveInfo == null || (liveOwner = liveInfo.getLiveOwner()) == null) ? null : liveOwner.getUserID(), seatFullInfo2.userId);
                Intrinsics.checkNotNullParameter(seatFullInfo2, "seatFullInfo");
                String str2 = seatFullInfo2.userId;
                String str3 = seatFullInfo2.userName;
                String str4 = seatFullInfo2.userAvatar;
                String str5 = seatFullInfo2.roomId;
                TUIRoomDefine.DeviceStatus userMicrophoneStatus = seatFullInfo2.userMicrophoneStatus;
                Intrinsics.checkNotNullExpressionValue(userMicrophoneStatus, "userMicrophoneStatus");
                DeviceStatus deviceStatusM88297a = AbstractC39652i.m88297a(userMicrophoneStatus);
                TUIRoomDefine.DeviceStatus userCameraStatus = seatFullInfo2.userCameraStatus;
                Intrinsics.checkNotNullExpressionValue(userCameraStatus, "userCameraStatus");
                DeviceStatus deviceStatusM88297a2 = AbstractC39652i.m88297a(userCameraStatus);
                Role role = zAreEqual ? Role.OWNER : Role.GENERAL_USER;
                TUIRoomDefine.DeviceStatus deviceStatus = seatFullInfo2.userMicrophoneStatus;
                TUIRoomDefine.DeviceStatus deviceStatus2 = TUIRoomDefine.DeviceStatus.CLOSED_BY_ADMIN;
                boolean z11 = true;
                if (deviceStatus == deviceStatus2) {
                    z11 = false;
                }
                TUIRoomDefine.DeviceStatus deviceStatus3 = seatFullInfo2.userCameraStatus;
                boolean z12 = deviceStatus3 != deviceStatus2;
                SuspendStatus suspendStatus = SuspendStatus.INSTANCE.parse(deviceStatus3.getValue());
                Intrinsics.checkNotNull(str2);
                Intrinsics.checkNotNull(str3);
                Intrinsics.checkNotNull(str4);
                Intrinsics.checkNotNull(str5);
                arrayList.add(new SeatUserInfo(str2, str3, str4, role, str5, deviceStatusM88297a, z11, deviceStatusM88297a2, z12, suspendStatus));
            }
        } while (!interfaceC41669n.compareAndSet(value, arrayList));
    }

    /* JADX INFO: renamed from: a */
    public static final void m88300a(C39692M c39692m, String str) {
        c39692m.f88184g.remove(str);
        InterfaceC41669n interfaceC41669n = c39692m.f88182e;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((LiveUserInfo) obj).getUserID(), str)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m88305a() {
        LiveUserInfo liveOwner;
        LiveUserInfo liveOwner2;
        LiveInfo liveInfo = this.f88192o;
        String userID = null;
        String userID2 = (liveInfo == null || (liveOwner2 = liveInfo.getLiveOwner()) == null) ? null : liveOwner2.getUserID();
        if (userID2 == null || userID2.length() == 0) {
            return false;
        }
        String str = TUIRoomEngine.getSelfInfo().userId;
        LiveInfo liveInfo2 = this.f88192o;
        if (liveInfo2 != null && (liveOwner = liveInfo2.getLiveOwner()) != null) {
            userID = liveOwner.getUserID();
        }
        return Intrinsics.areEqual(str, userID);
    }
}
