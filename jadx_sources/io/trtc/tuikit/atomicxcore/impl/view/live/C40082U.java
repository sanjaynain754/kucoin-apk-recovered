package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40082U;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.U */
/* JADX INFO: loaded from: classes61.dex */
public final class C40082U extends TUILiveConnectionManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40088Y f89153a;

    /* JADX INFO: renamed from: a */
    public static final void m88460a(List list, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            connectionObserver.onConnectedRoomsUpdated(list);
        }
    }

    public C40082U(C40088Y c40088y) {
        this.f89153a = c40088y;
    }

    /* JADX INFO: renamed from: a */
    public static final void m88459a(TUILiveConnectionManager.ConnectionUser invitee, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(invitee, "$invitee");
        if (connectionObserver != null) {
            connectionObserver.onCrossRoomConnectionAccepted(invitee);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88461b(TUILiveConnectionManager.ConnectionUser connectionUser, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            connectionObserver.onCrossRoomConnectionCancelled(connectionUser);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m88462c(TUILiveConnectionManager.ConnectionUser connectionUser, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            connectionObserver.onCrossRoomConnectionRequest(connectionUser);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m88463d(TUILiveConnectionManager.ConnectionUser invitee, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(invitee, "$invitee");
        if (connectionObserver != null) {
            connectionObserver.onCrossRoomConnectionRejected(invitee);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m88464e(TUILiveConnectionManager.ConnectionUser user, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(user, "$user");
        if (connectionObserver != null) {
            connectionObserver.onCrossRoomConnectionExited(user);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestAccept(final TUILiveConnectionManager.ConnectionUser invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        this.f89153a.m88487a(new InterfaceC40075Q() { // from class: ig0.o
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40082U.m88459a(invitee, connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestCancelled(final TUILiveConnectionManager.ConnectionUser connectionUser) {
        this.f89153a.m88487a(new InterfaceC40075Q() { // from class: ig0.t
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40082U.m88461b(connectionUser, connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestReceived(final TUILiveConnectionManager.ConnectionUser connectionUser, List list, String str) {
        this.f89153a.m88487a(new InterfaceC40075Q() { // from class: ig0.n
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40082U.m88462c(connectionUser, connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestReject(final TUILiveConnectionManager.ConnectionUser invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        this.f89153a.m88487a(new InterfaceC40075Q() { // from class: ig0.r
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40082U.m88463d(invitee, connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestTimeout(final TUILiveConnectionManager.ConnectionUser inviter, final TUILiveConnectionManager.ConnectionUser connectionUser) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        this.f89153a.m88487a(new InterfaceC40075Q() { // from class: ig0.s
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40082U.m88458a(inviter, connectionUser, connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionUserListChanged(final List list, List list2, List list3) {
        this.f89153a.m88487a(new InterfaceC40075Q() { // from class: ig0.p
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40082U.m88460a(list, connectionObserver);
            }
        });
        if (list3 != null) {
            C40088Y c40088y = this.f89153a;
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                final TUILiveConnectionManager.ConnectionUser connectionUser = (TUILiveConnectionManager.ConnectionUser) it.next();
                c40088y.m88487a(new InterfaceC40075Q() { // from class: ig0.q
                    @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
                    /* JADX INFO: renamed from: a */
                    public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                        C40082U.m88464e(connectionUser, connectionObserver);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88458a(TUILiveConnectionManager.ConnectionUser inviter, TUILiveConnectionManager.ConnectionUser connectionUser, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(inviter, "$inviter");
        if (connectionObserver != null) {
            connectionObserver.onCrossRoomConnectionTimeout(inviter, connectionUser);
        }
    }
}
