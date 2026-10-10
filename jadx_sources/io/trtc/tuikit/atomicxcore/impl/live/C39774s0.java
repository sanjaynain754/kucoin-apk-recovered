package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceState;
import io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39495c;
import io.trtc.tuikit.atomicxcore.impl.common.C39506n;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.gift.AbstractC39662a;
import java.util.List;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.s0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39774s0 extends LiveAudienceStore implements InterfaceC39729d0 {

    /* JADX INFO: renamed from: a */
    public final String f88384a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomEngine f88385b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88386c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88387d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f88388e;

    /* JADX INFO: renamed from: f */
    public final C39510r f88389f;

    /* JADX INFO: renamed from: g */
    public final C39509q f88390g;

    /* JADX INFO: renamed from: h */
    public final C39762o0 f88391h;

    /* JADX INFO: renamed from: i */
    public final LiveAudienceState f88392i;

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88234a(LiveInfo liveInfo) {
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        C39510r c39510r = this.f88389f;
        String message = "API: afterEnterRoom called with liveInfo=" + liveInfo;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        fetchAudienceList(null);
        AbstractC39465b.m88232a(this.f88389f, "API: getBannedUserList called", "message", 0, "API: getBannedUserList called");
        this.f88385b.getBannedUserList(new C39771r0(this));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void addLiveAudienceListener(LiveAudienceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C39510r c39510r = this.f88389f;
        String message = "API: addLiveAudienceListener called with listener=" + listener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88390g.m88248a(listener);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: b */
    public final void mo88236b(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: beforeEnterRoom called with liveID=", liveID, this.f88389f, "message", 0);
        this.f88385b.addObserver(this.f88391h);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void disableSendMessage(String str, boolean z11, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88389f;
        String message = "API: disableSendingMessageByAdmin called with userID=" + str + ", isDisable=" + z11 + ", completion=" + completionHandler;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88385b.disableSendingMessageByAdmin(str, z11, new C39765p0(this, str, completionHandler, z11));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void fetchAudienceList(CompletionHandler completionHandler) {
        AbstractC39465b.m88232a(this.f88389f, "API: fetchAudienceList called", "message", 0, "API: fetchAudienceList called");
        this.f88385b.getUserList(0L, new C39768q0(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final LiveAudienceState getLiveAudienceState() {
        return this.f88392i;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void kickUserOutOfRoom(String str, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88389f;
        String message = "API: kickUserOutOfRoom called with userID=" + str + ", completion=" + completionHandler;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88385b.kickRemoteUserOutOfRoom(str, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void removeLiveAudienceListener(LiveAudienceListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C39510r c39510r = this.f88389f;
        String message = "API: removeLiveAudienceListener called with listener=" + listener;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88390g.m88250b(listener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void revokeAdministrator(String str, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88389f;
        String message = "API: revokeAdministrator called with userID=" + str + ", completion=" + completionHandler;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88385b.changeUserRole(str, TUIRoomDefine.Role.GENERAL_USER, new C39495c(completionHandler, null, null, 6));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.LiveAudienceStore
    public final void setAdministrator(String str, CompletionHandler completionHandler) {
        C39510r c39510r = this.f88389f;
        String message = "API: setAdministrator called with userID=" + str + ", completion=" + completionHandler;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        this.f88385b.changeUserRole(str, TUIRoomDefine.Role.MANAGER, new C39495c(completionHandler, null, null, 6));
    }

    public C39774s0(String liveID) {
        TUIRoomEngine roomEngine = TUIRoomEngine.sharedInstance();
        Intrinsics.checkNotNullExpressionValue(roomEngine, "sharedInstance(...)");
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        Intrinsics.checkNotNullParameter(roomEngine, "roomEngine");
        this.f88384a = liveID;
        this.f88385b = roomEngine;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88386c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(0);
        this.f88387d = interfaceC41669nM91009a2;
        InterfaceC41669n interfaceC41669nM91009a3 = C41679x.m91009a(CollectionsKt.emptyList());
        this.f88388e = interfaceC41669nM91009a3;
        this.f88389f = AbstractC39398a.m88229a("LiveAudienceStoreImpl", "file", "AtomicXCore-Live", "LiveAudienceStoreImpl");
        this.f88390g = new C39509q();
        this.f88391h = new C39762o0(this);
        this.f88392i = new LiveAudienceState(interfaceC41669nM91009a, interfaceC41669nM91009a2, interfaceC41669nM91009a3);
    }

    @Override // io.trtc.tuikit.atomicxcore.impl.live.InterfaceC39729d0
    /* JADX INFO: renamed from: a */
    public final void mo88235a(String liveID) {
        Intrinsics.checkNotNullParameter(liveID, "liveID");
        AbstractC39662a.m88299a("API: leaveRoom called with liveID=", liveID, this.f88389f, "message", 0);
        this.f88386c.setValue(CollectionsKt.emptyList());
        this.f88387d.setValue(0);
        CollectionsKt.removeAll((List) this.f88390g.f87705a, (Function1) C39506n.f87702a);
        this.f88385b.removeObserver(this.f88391h);
    }
}
