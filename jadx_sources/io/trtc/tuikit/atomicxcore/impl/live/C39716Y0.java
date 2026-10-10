package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.common.TUICommonDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.DeviceControlPolicy;
import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatState;
import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.MoveSeatPolicy;
import io.trtc.tuikit.atomicxcore.api.live.RegionInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.SuspendStatus;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39506n;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.device.AbstractC39652i;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import io.trtc.tuikit.atomicxcore.impl.live.C39716Y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.Y0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39716Y0 extends LiveSeatStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f88234a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f88235b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88236c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88237d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88238e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC41669n f88239f;

    /* JADX INFO: renamed from: g */
    public final C39510r f88240g;

    /* JADX INFO: renamed from: h */
    public final C39509q f88241h;

    /* JADX INFO: renamed from: i */
    public final C39710V0 f88242i;

    /* JADX INFO: renamed from: j */
    public final C39712W0 f88243j;

    /* JADX INFO: renamed from: k */
    public LiveInfo f88244k;

    /* JADX INFO: renamed from: l */
    public TUIRoomDefine.SeatFullInfo f88245l;

    /* JADX INFO: renamed from: m */
    public final LiveSeatState f88246m;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) throws JSONException {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88240g;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88244k = liveInfo;
        List<TUIRoomDefine.SeatFullInfo> listQuerySeatList = this.f88235b.querySeatList();
        Intrinsics.checkNotNull(listQuerySeatList);
        m88315a(listQuerySeatList);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void addLiveSeatEventListener(LiveSeatListener liveSeatListener) {
        C39510r c39510r = this.f88240g;
        String message = "API: addLiveSeatEventListener called with listener=" + liveSeatListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88241h.m88248a(liveSeatListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88240g, "message", 0);
        this.f88235b.addObserver(this.f88242i);
        this.f88235b.getTRTCCloud().addListener(this.f88243j);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void closeRemoteCamera(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: closeRemoteCamera called with userID=", str, this.f88240g, "message", 0);
        SeatInfo seatInfoM88316a = AbstractC39718Z0.m88316a(this, str);
        if (seatInfoM88316a == null) {
            AbstractC39662a.m88299a("Response: closeRemoteCamera failed, user not find:", str, this.f88240g, "message", 2);
            if (completionHandler != null) {
                completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "user not find");
                return;
            }
            return;
        }
        TUIRoomDefine.SeatLockParams seatLockParams = new TUIRoomDefine.SeatLockParams();
        seatLockParams.lockVideo = true;
        seatLockParams.lockAudio = true ^ seatInfoM88316a.getUserInfo().getAllowOpenMicrophone();
        this.f88235b.lockSeatByAdmin(seatInfoM88316a.getIndex(), seatLockParams, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void closeRemoteMicrophone(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: closeRemoteMicrophone called with userID=", str, this.f88240g, "message", 0);
        SeatInfo seatInfoM88316a = AbstractC39718Z0.m88316a(this, str);
        if (seatInfoM88316a != null) {
            TUIRoomDefine.SeatLockParams seatLockParams = new TUIRoomDefine.SeatLockParams();
            seatLockParams.lockAudio = true;
            seatLockParams.lockVideo = true ^ seatInfoM88316a.getUserInfo().getAllowOpenCamera();
            this.f88235b.lockSeatByAdmin(seatInfoM88316a.getIndex(), seatLockParams, new C39495c(completionHandler, null, null, 6));
            return;
        }
        AbstractC39662a.m88299a("closeRemoteMicrophone failed, user not find:", str, this.f88240g, "message", 2);
        C39510r c39510r = this.f88240g;
        StringBuilder sb2 = new StringBuilder("Response: closeRemoteMicrophone onFailure with code=");
        TUICommonDefine.Error error = TUICommonDefine.Error.FAILED;
        sb2.append(error.getValue());
        sb2.append(", message=user not find");
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (completionHandler != null) {
            completionHandler.onFailure(error.getValue(), "user not find");
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final LiveSeatState getLiveSeatState() {
        return this.f88246m;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void kickUserOutOfSeat(String str, CompletionHandler completionHandler) {
        AbstractC39662a.m88299a("API: kickUserOutOfSeat called with userID=", str, this.f88240g, "message", 0);
        this.f88235b.kickUserOffSeatByAdmin(-1, str, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void leaveSeat(CompletionHandler completionHandler) {
        AbstractC39465b.m88232a(this.f88240g, "API: leaveSeat called", "message", 0, "API: leaveSeat called");
        this.f88235b.leaveSeat(new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void lockSeat(int i11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88240g;
        String message = "API: lockSeat called with seatIndex=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIRoomDefine.SeatLockParams seatLockParams = new TUIRoomDefine.SeatLockParams();
        seatLockParams.lockSeat = true;
        this.f88235b.lockSeatByAdmin(i11, seatLockParams, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void moveUserToSeat(String str, int i11, MoveSeatPolicy policy, CompletionHandler completionHandler) {
        TUIRoomDefine.MoveSeatPolicy moveSeatPolicy;
        C39510r c39510r = this.f88240g;
        String message = "API: moveUserToSeat called with userID=" + str + ", targetIndex=" + i11 + ", policy=" + policy;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (Intrinsics.areEqual(str, TUIRoomEngine.getSelfInfo().userId)) {
            this.f88235b.moveToSeat(i11, new C39495c(completionHandler, null, null, 6));
            return;
        }
        TUIRoomEngine tUIRoomEngine = this.f88235b;
        if (policy == null) {
            policy = MoveSeatPolicy.ABORT_WHEN_OCCUPIED;
        }
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i12 = AbstractC39697O0.f88211a[policy.ordinal()];
        if (i12 == 1) {
            moveSeatPolicy = TUIRoomDefine.MoveSeatPolicy.ABORT_WHEN_OCCUPIED;
        } else if (i12 == 2) {
            moveSeatPolicy = TUIRoomDefine.MoveSeatPolicy.FORCE_REPLACE;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            moveSeatPolicy = TUIRoomDefine.MoveSeatPolicy.SWAP_POSITION;
        }
        tUIRoomEngine.moveUserToSeatByAdmin(str, i11, moveSeatPolicy, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void muteMicrophone() {
        AbstractC39465b.m88232a(this.f88240g, "API: muteMicrophone called", "message", 0, "API: muteMicrophone called");
        this.f88235b.muteLocalAudio();
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void openRemoteCamera(String str, DeviceControlPolicy policy, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        C39510r c39510r = this.f88240g;
        String message = "API: openRemoteCamera called with userID=" + str + ", policy=" + policy;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (policy == DeviceControlPolicy.UNLOCK_ONLY) {
            SeatInfo seatInfoM88316a = AbstractC39718Z0.m88316a(this, str);
            if (seatInfoM88316a == null) {
                AbstractC39662a.m88299a("Response: openRemoteCamera failed, user not find:", str, this.f88240g, "message", 2);
                if (completionHandler != null) {
                    completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "user not find");
                    return;
                }
                return;
            }
            TUIRoomDefine.SeatLockParams seatLockParams = new TUIRoomDefine.SeatLockParams();
            seatLockParams.lockVideo = false;
            seatLockParams.lockAudio = !seatInfoM88316a.getUserInfo().getAllowOpenMicrophone();
            this.f88235b.lockSeatByAdmin(seatInfoM88316a.getIndex(), seatLockParams, new C39495c(completionHandler, null, null, 6));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void openRemoteMicrophone(String str, DeviceControlPolicy policy, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        C39510r c39510r = this.f88240g;
        String message = "API: openRemoteMicrophone called with userID=" + str + ", policy=" + policy;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (policy == DeviceControlPolicy.UNLOCK_ONLY) {
            SeatInfo seatInfoM88316a = AbstractC39718Z0.m88316a(this, str);
            if (seatInfoM88316a == null) {
                AbstractC39662a.m88299a("Response: openRemoteMicrophone failed, user not find:", str, this.f88240g, "message", 2);
                if (completionHandler != null) {
                    completionHandler.onFailure(TUICommonDefine.Error.FAILED.getValue(), "user not find");
                    return;
                }
                return;
            }
            TUIRoomDefine.SeatLockParams seatLockParams = new TUIRoomDefine.SeatLockParams();
            seatLockParams.lockAudio = false;
            seatLockParams.lockVideo = !seatInfoM88316a.getUserInfo().getAllowOpenCamera();
            this.f88235b.lockSeatByAdmin(seatInfoM88316a.getIndex(), seatLockParams, new C39495c(completionHandler, null, null, 6));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void removeLiveSeatEventListener(LiveSeatListener liveSeatListener) {
        C39510r c39510r = this.f88240g;
        String message = "API: removeLiveSeatEventListener called with listener=" + liveSeatListener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88241h.m88250b(liveSeatListener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void takeSeat(int i11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88240g;
        String message = "API: takeSeat called with seatIndex=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88235b.takeSeat(i11, 60, new C39714X0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void unlockSeat(int i11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88240g;
        String message = "API: unlockSeat called with seatIndex=" + i11;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIRoomDefine.SeatLockParams seatLockParams = new TUIRoomDefine.SeatLockParams();
        seatLockParams.lockSeat = false;
        this.f88235b.lockSeatByAdmin(i11, seatLockParams, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore
    public final void unmuteMicrophone(CompletionHandler completionHandler) {
        AbstractC39465b.m88232a(this.f88240g, "API: unmuteMicrophone called", "message", 0, "API: unmuteMicrophone called");
        this.f88235b.unmuteLocalAudio(new C39495c(completionHandler, null, null, 6));
    }

    public C39716Y0(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88234a = liveID;
        this.f88235b = roomEngine;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88236c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(new LiveCanvas(0, 0, 0, 7, null));
        this.f88237d = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(new LinkedHashMap());
        this.f88238e = interfaceC41669nM91009a3;
        InterfaceC41669n interfaceC41669nM91009a4 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88239f = interfaceC41669nM91009a4;
        this.f88240g = AbstractC39398a.m88229a("LiveSeatStoreImpl", "file", "AtomicXCore-Live", "LiveSeatStoreImpl");
        this.f88241h = new C39509q();
        this.f88242i = new C39710V0(this);
        this.f88243j = new C39712W0(this);
        this.f88246m = new LiveSeatState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3, interfaceC41669nM91009a4);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88240g, "message", 0);
        CollectionsKt.removeAll((List) this.f88241h.f87705a, (Function1) C39506n.f87702a);
        this.f88235b.removeObserver(this.f88242i);
        this.f88235b.getTRTCCloud().removeListener(this.f88243j);
    }

    /* JADX INFO: renamed from: a */
    public final void m88315a(List list) throws JSONException {
        Object value;
        ArrayList arrayList;
        Object value2;
        Object value3;
        LiveCanvas liveCanvasM88314a = m88314a();
        if (liveCanvasM88314a != null) {
            InterfaceC41669n interfaceC41669n = this.f88237d;
            do {
                value3 = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value3, liveCanvasM88314a));
        }
        InterfaceC41669n interfaceC41669n2 = this.f88236c;
        do {
            value = interfaceC41669n2.getValue();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TUIRoomDefine.SeatFullInfo seatFullInfo = (TUIRoomDefine.SeatFullInfo) it.next();
                Intrinsics.checkNotNullParameter(seatFullInfo, "seatFullInfo");
                String str = seatFullInfo.userId;
                String str2 = seatFullInfo.userName;
                String str3 = seatFullInfo.userAvatar;
                String str4 = seatFullInfo.roomId;
                TUIRoomDefine.DeviceStatus userMicrophoneStatus = seatFullInfo.userMicrophoneStatus;
                Intrinsics.checkNotNullExpressionValue(userMicrophoneStatus, "userMicrophoneStatus");
                DeviceStatus deviceStatusM88297a = AbstractC39652i.m88297a(userMicrophoneStatus);
                TUIRoomDefine.DeviceStatus userCameraStatus = seatFullInfo.userCameraStatus;
                Intrinsics.checkNotNullExpressionValue(userCameraStatus, "userCameraStatus");
                DeviceStatus deviceStatusM88297a2 = AbstractC39652i.m88297a(userCameraStatus);
                TUIRoomDefine.DeviceStatus deviceStatus = seatFullInfo.userCameraStatus;
                TUIRoomDefine.DeviceStatus deviceStatus2 = TUIRoomDefine.DeviceStatus.CLOSED_BY_ADMIN;
                boolean z11 = true;
                boolean z12 = deviceStatus != deviceStatus2;
                if (seatFullInfo.userMicrophoneStatus == deviceStatus2) {
                    z11 = false;
                }
                SuspendStatus suspendStatus = SuspendStatus.INSTANCE.parse(deviceStatus.getValue());
                Intrinsics.checkNotNull(str);
                Intrinsics.checkNotNull(str2);
                Intrinsics.checkNotNull(str3);
                Intrinsics.checkNotNull(str4);
                SeatUserInfo seatUserInfo = new SeatUserInfo(str, str2, str3, null, str4, deviceStatusM88297a, z11, deviceStatusM88297a2, z12, suspendStatus, 8, null);
                RegionInfo regionInfo = new RegionInfo(seatFullInfo.f73243x, seatFullInfo.f73244y, seatFullInfo.width, seatFullInfo.height, seatFullInfo.zorder);
                SeatInfo seatInfo = new SeatInfo(0, false, null, null, 15, null);
                seatInfo.setIndex(seatFullInfo.seatIndex);
                seatInfo.setLocked(seatFullInfo.isSeatLocked);
                seatInfo.setUserInfo(seatUserInfo);
                seatInfo.setRegion(regionInfo);
                arrayList.add(seatInfo);
            }
        } while (!interfaceC41669n2.compareAndSet(value, arrayList));
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(((TUIRoomDefine.SeatFullInfo) it2.next()).userId, TUIRoomEngine.getSelfInfo().userId)) {
                    return;
                }
            }
        }
        InterfaceC41669n interfaceC41669n3 = this.f88239f;
        do {
            value2 = interfaceC41669n3.getValue();
        } while (!interfaceC41669n3.compareAndSet(value2, CollectionsKt.emptyList()));
    }

    /* JADX INFO: renamed from: a */
    public final LiveCanvas m88314a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("roomId", this.f88234a);
        jSONObject.put("api", "querySeatLayout");
        jSONObject.put(ReportDataTable.COLUMN_PARAMS, jSONObject2);
        try {
            Object objCallExperimentalAPI = this.f88235b.callExperimentalAPI(jSONObject.toString(), new TUIRoomDefine.ExperimentalAPIResponseCallback() { // from class: fg0.a
                @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.ExperimentalAPIResponseCallback
                public final void onResponse(String str) {
                    C39716Y0.m88313a(this.f83088a, str);
                }
            });
            C39510r c39510r = this.f88240g;
            String message = "callExperimentalAPI querySeatLayout response: " + objCallExperimentalAPI;
            c39510r.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            c39510r.m88251a(0, message);
            if (objCallExperimentalAPI == null || !(objCallExperimentalAPI instanceof String)) {
                return null;
            }
            return AbstractC39699P0.m88311a((String) objCallExperimentalAPI);
        } catch (Exception e11) {
            C39510r c39510r2 = this.f88240g;
            String message2 = "callExperimentalAPI querySeatLayout failed, " + e11.getMessage();
            c39510r2.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            c39510r2.m88251a(2, message2);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88313a(C39716Y0 this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AbstractC39662a.m88299a("callExperimentalAPI querySeatLayout response: ", str, this$0.f88240g, "message", 0);
    }
}
