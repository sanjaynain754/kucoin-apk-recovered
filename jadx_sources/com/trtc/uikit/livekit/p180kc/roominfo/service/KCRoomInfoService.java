package com.trtc.uikit.livekit.p180kc.roominfo.service;

import com.kubi.utils.extensions.C27039d;
import com.trtc.uikit.livekit.common.LiveKitLogger;
import com.trtc.uikit.livekit.p180kc.roominfo.store.KCRoomInfoState;
import io.trtc.tuikit.atomicxcore.api.live.LiveInfo;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import je0.C40397b;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import le0.InterfaceC42178a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: KCRoomInfoService.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0012J\b\u0010 \u001a\u00020\u0012H\u0002J\u0006\u0010!\u001a\u00020\u0012J\u0006\u0010\"\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/roominfo/service/KCRoomInfoService;", "", "<init>", "()V", "logger", "Lcom/trtc/uikit/livekit/common/LiveKitLogger;", "pollingInterval", "", "Ljava/lang/Long;", "pollingJob", "Lkotlinx/coroutines/Job;", "liveWebService", "Lcom/trtc/uikit/livekit/kc/data/source/remote/LiveWebService;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isCardContainerClosedByUser", "", "setIsCardContainerClosedByUser", "", "roomInfoState", "Lcom/trtc/uikit/livekit/kc/roominfo/store/KCRoomInfoState;", "getRoomInfoState", "()Lcom/trtc/uikit/livekit/kc/roominfo/store/KCRoomInfoState;", "init", "liveInfo", "Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;", "loadRoomInfo", "followUser", "unfollowUser", "reserveLive", "cancelReserveLive", "queryFollowStatus", "startPollingJob", "loadLiveHotCount", "hideTradeCard", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KCRoomInfoService {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Long f79184b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC41775x1 f79185c;

    /* JADX INFO: renamed from: e */
    public InterfaceC41709m0 f79187e;

    /* JADX INFO: renamed from: f */
    public boolean f79188f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LiveKitLogger f79183a = LiveKitLogger.f77564c.getComponentLogger("KCRoomInfoService");

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC42178a f79186d = C40397b.f89707a.m89024b();

    /* JADX INFO: renamed from: g */
    @NotNull
    public final KCRoomInfoState f79189g = new KCRoomInfoState();

    /* JADX INFO: renamed from: f */
    public final void m81561f() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("cancelReserveLive: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$cancelReserveLive$1(this, roomId, null), 3, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m81562g() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("followUser: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$followUser$1(roomId, this, null), 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final KCRoomInfoState getF79189g() {
        return this.f79189g;
    }

    /* JADX INFO: renamed from: i */
    public final void m81564i() {
        this.f79189g.getTradeCardInfo().setValue(null);
    }

    /* JADX INFO: renamed from: j */
    public final void m81565j(@NotNull LiveInfo liveInfo, @NotNull InterfaceC41709m0 coroutineScope) {
        String userID;
        Intrinsics.checkNotNullParameter(liveInfo, "liveInfo");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f79187e = coroutineScope;
        this.f79189g.setRoomId(liveInfo.getLiveID());
        KCRoomInfoState kCRoomInfoState = this.f79189g;
        UserProfile value = LoginStore.shared.getLoginState().getLoginUserInfo().getValue();
        if (value == null || (userID = value.getUserID()) == null) {
            userID = "";
        }
        kCRoomInfoState.setSelfUserId(userID);
        this.f79189g.getOwnerId().setValue(liveInfo.getLiveOwner().getUserID());
        this.f79189g.getOwnerName().setValue(liveInfo.getLiveOwner().getUserName());
        this.f79189g.getOwnerAvatarUrl().setValue(liveInfo.getLiveOwner().getAvatarURL());
        C44128b.m97259c("Live", "KCRoomInfoService init: liveInfo=" + liveInfo);
    }

    /* JADX INFO: renamed from: k */
    public final void m81566k() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("loadLiveHotCount: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$loadLiveHotCount$1(this, roomId, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m81567l() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("loadRoomInfo: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$loadRoomInfo$1(this, roomId, null), 3, null);
    }

    /* JADX INFO: renamed from: m */
    public final void m81568m() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("queryFollowStatus: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$queryFollowStatus$1(this, roomId, null), 3, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m81569n() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("reserveLive: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$reserveLive$1(this, roomId, null), 3, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m81570o(boolean z11) {
        this.f79188f = z11;
    }

    /* JADX INFO: renamed from: p */
    public final void m81571p() {
        InterfaceC41709m0 interfaceC41709m0;
        InterfaceC41775x1 interfaceC41775x1 = this.f79185c;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        long jM66652l = C27039d.m66652l(this.f79184b);
        if (jM66652l <= 0) {
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        this.f79185c = C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$startPollingJob$1(jM66652l, this, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m81572q() {
        InterfaceC41709m0 interfaceC41709m0;
        String roomId = this.f79189g.getRoomId();
        if (roomId.length() == 0) {
            this.f79183a.m79406d("unfollowUser: roomId is empty");
            return;
        }
        InterfaceC41709m0 interfaceC41709m1 = this.f79187e;
        if (interfaceC41709m1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            interfaceC41709m0 = null;
        } else {
            interfaceC41709m0 = interfaceC41709m1;
        }
        C41696j.m91104d(interfaceC41709m0, null, null, new KCRoomInfoService$unfollowUser$1(this, roomId, null), 3, null);
    }
}
