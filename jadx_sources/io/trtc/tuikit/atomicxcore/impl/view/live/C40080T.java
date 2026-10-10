package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStore;
import io.trtc.tuikit.atomicxcore.api.live.GuestListener;
import io.trtc.tuikit.atomicxcore.api.live.LiveUserInfo;
import io.trtc.tuikit.atomicxcore.api.live.NoResponseReason;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40080T;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.T */
/* JADX INFO: loaded from: classes61.dex */
public final class C40080T extends GuestListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40088Y f89149a;

    /* JADX INFO: renamed from: a */
    public static final void m88455a(LiveUserInfo guestUser, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(guestUser, "$guestUser");
        if (connectionObserver != null) {
            connectionObserver.onUserConnectionAccepted(AbstractC40043A.m88426a(guestUser));
        }
    }

    public C40080T(C40088Y c40088y) {
        this.f89149a = c40088y;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88456a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
            userInfo.userId = TUIRoomEngine.getSelfInfo().userId;
            userInfo.userName = TUIRoomEngine.getSelfInfo().userName;
            userInfo.avatarUrl = TUIRoomEngine.getSelfInfo().avatarUrl;
            connectionObserver.onUserConnectionTimeout(userInfo);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88457b(LiveUserInfo guestUser, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(guestUser, "$guestUser");
        if (connectionObserver != null) {
            connectionObserver.onUserConnectionRejected(AbstractC40043A.m88426a(guestUser));
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
    public final void onGuestApplicationNoResponse(NoResponseReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason == NoResponseReason.TIMEOUT) {
            AbstractC39465b.m88232a(this.f89149a.f89161a, "onGuestApplicationNoResponse => onUserConnectionTimeout", "message", 0, "onGuestApplicationNoResponse => onUserConnectionTimeout");
            this.f89149a.m88487a(new InterfaceC40075Q() { // from class: ig0.m
                @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
                /* JADX INFO: renamed from: a */
                public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                    C40080T.m88456a(connectionObserver);
                }
            });
        }
    }

    @Override // io.trtc.tuikit.atomicxcore.api.live.GuestListener
    public final void onGuestApplicationResponded(boolean z11, final LiveUserInfo guestUser) throws Exception {
        LiveCoreViewDeprecated liveCoreViewDeprecated;
        LiveCoreViewDeprecated liveCoreViewDeprecated2;
        Intrinsics.checkNotNullParameter(guestUser, "guestUser");
        if (!z11) {
            AbstractC39465b.m88232a(this.f89149a.f89161a, "onGuestApplicationResponded => onUserConnectionRejected", "message", 0, "onGuestApplicationResponded => onUserConnectionRejected");
            this.f89149a.m88487a(new InterfaceC40075Q() { // from class: ig0.l
                @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
                /* JADX INFO: renamed from: a */
                public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                    C40080T.m88457b(guestUser, connectionObserver);
                }
            });
            return;
        }
        C39510r c39510r = this.f89149a.f89161a;
        StringBuilder sb2 = new StringBuilder("onUserConnectionAccepted:");
        LiveCoreViewDeprecated liveCoreViewDeprecated3 = (LiveCoreViewDeprecated) this.f89149a.f89163c.get();
        sb2.append(liveCoreViewDeprecated3 != null ? Boolean.valueOf(liveCoreViewDeprecated3.getCoGuestAutoOpenCamera()) : null);
        String message = sb2.toString();
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        boolean zBooleanValue = DeviceStore.INSTANCE.shared().getDeviceState().isFrontCamera().getValue().booleanValue();
        LiveCoreViewDeprecated liveCoreViewDeprecated4 = (LiveCoreViewDeprecated) this.f89149a.f89163c.get();
        if (liveCoreViewDeprecated4 != null && liveCoreViewDeprecated4.getCoGuestAutoOpenCamera() && (liveCoreViewDeprecated2 = (LiveCoreViewDeprecated) this.f89149a.f89163c.get()) != null) {
            liveCoreViewDeprecated2.startCamera(zBooleanValue, null);
        }
        LiveCoreViewDeprecated liveCoreViewDeprecated5 = (LiveCoreViewDeprecated) this.f89149a.f89163c.get();
        if (liveCoreViewDeprecated5 != null && liveCoreViewDeprecated5.getCoGuestAutoOpenMicrophone() && (liveCoreViewDeprecated = (LiveCoreViewDeprecated) this.f89149a.f89163c.get()) != null) {
            liveCoreViewDeprecated.startMicrophone(null);
        }
        this.f89149a.m88487a(new InterfaceC40075Q() { // from class: ig0.k
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40080T.m88455a(guestUser, connectionObserver);
            }
        });
    }
}
