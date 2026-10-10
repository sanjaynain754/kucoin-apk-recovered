package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.live.LiveEndedReason;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.live.LiveKickedOutReason;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Lazy;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.B0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39671B0 extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39695N0 f88141a;

    public C39671B0(C39695N0 c39695n0) {
        this.f88141a = c39695n0;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onKickedOffLine(String str) {
        AbstractC39662a.m88299a("onKickedOffLine: message:", str, this.f88141a.f88203d, "message", 0);
        if (C39695N0.m88307a(((LiveInfo) this.f88141a.f88202c.getValue()).getSeatLayoutTemplateID())) {
            return;
        }
        this.f88141a.m88309a(false);
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onKickedOutOfRoom(String roomID, TUIRoomDefine.KickedOutOfRoomReason reason, String message) {
        LiveKickedOutReason liveKickedOutReason;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        C39510r c39510r = this.f88141a.f88203d;
        String message2 = "onKickedOutOfRoom: roomID:" + roomID + ", reason:" + reason + ", message:" + message;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        c39510r.m88251a(0, message2);
        if (!C39695N0.m88307a(((LiveInfo) this.f88141a.f88202c.getValue()).getSeatLayoutTemplateID())) {
            this.f88141a.m88309a(false);
        }
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88328b(((LiveInfo) this.f88141a.f88202c.getValue()).getLiveID());
        if (Intrinsics.areEqual(((LiveInfo) this.f88141a.f88202c.getValue()).getLiveID(), roomID)) {
            this.f88141a.f88202c.setValue(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        }
        Intrinsics.checkNotNullParameter(reason, "reason");
        switch (AbstractC39776t0.f88395a[reason.ordinal()]) {
            case 1:
                liveKickedOutReason = LiveKickedOutReason.BY_ADMIN;
                break;
            case 2:
                liveKickedOutReason = LiveKickedOutReason.BY_LOGGED_ON_OTHER_DEVICE;
                break;
            case 3:
                liveKickedOutReason = LiveKickedOutReason.BY_SERVER;
                break;
            case 4:
                liveKickedOutReason = LiveKickedOutReason.FOR_NETWORK_DISCONNECTED;
                break;
            case 5:
                liveKickedOutReason = LiveKickedOutReason.FOR_JOIN_ROOM_STATUS_INVALID_DURING_OFFLINE;
                break;
            case 6:
                liveKickedOutReason = LiveKickedOutReason.FOR_COUNT_OF_JOINED_ROOMS_EXCEED_LIMIT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f88141a.f88204e.m88249a((Function1) new C39786y0(roomID, liveKickedOutReason, message));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomDismissed(String roomID, TUIRoomDefine.RoomDismissedReason reason) {
        LiveEndedReason liveEndedReason;
        Intrinsics.checkNotNullParameter(roomID, "roomID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        C39510r c39510r = this.f88141a.f88203d;
        String message = "onRoomDismissed: " + roomID + ", " + reason;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (!C39695N0.m88307a(((LiveInfo) this.f88141a.f88202c.getValue()).getSeatLayoutTemplateID())) {
            this.f88141a.m88309a(false);
        }
        String liveID = ((LiveInfo) this.f88141a.f88202c.getValue()).getLiveID();
        this.f88141a.f88207h.m88249a((Function1) new C39788z0(liveID));
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88328b(liveID);
        if (Intrinsics.areEqual(((LiveInfo) this.f88141a.f88202c.getValue()).getLiveID(), roomID)) {
            this.f88141a.f88202c.setValue(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
        }
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i11 = AbstractC39776t0.f88396b[reason.ordinal()];
        if (i11 == 1) {
            liveEndedReason = LiveEndedReason.ENDED_BY_HOST;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            liveEndedReason = LiveEndedReason.ENDED_BY_SERVER;
        }
        this.f88141a.f88204e.m88249a((Function1) new C39669A0(roomID, liveEndedReason));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomMetadataChanged(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC41669n interfaceC41669n = this.f88141a.f88202c;
        interfaceC41669n.setValue(LiveInfo.copy$default((LiveInfo) interfaceC41669n.getValue(), null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, MapsKt.plus(((LiveInfo) this.f88141a.f88202c.getValue()).getMetaData(), TuplesKt.m90091to(key, value)), 262143, null));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserSigExpired() {
        AbstractC39465b.m88232a(this.f88141a.f88203d, "onUserSigExpired", "message", 0, "onUserSigExpired");
        if (!C39695N0.m88307a(((LiveInfo) this.f88141a.f88202c.getValue()).getSeatLayoutTemplateID())) {
            this.f88141a.m88309a(false);
        }
        Lazy lazy = C39772r1.f88378c;
        AbstractC39769q1.m88324a().m88328b(((LiveInfo) this.f88141a.f88202c.getValue()).getLiveID());
        this.f88141a.f88202c.setValue(new LiveInfo(null, null, null, false, false, false, false, 0, null, 0, null, null, null, 0, null, 0L, 0, false, null, 524287, null));
    }
}
