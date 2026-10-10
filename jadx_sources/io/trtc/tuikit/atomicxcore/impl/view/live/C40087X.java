package io.trtc.tuikit.atomicxcore.impl.view.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDefine;
import io.trtc.tuikit.atomicxcore.api.live.deprecated.LiveCoreViewDeprecated;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import io.trtc.tuikit.atomicxcore.impl.view.live.C40087X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.X */
/* JADX INFO: loaded from: classes61.dex */
public final class C40087X extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40088Y f89160a;

    /* JADX INFO: renamed from: a */
    public static final void m88480a(TUIRoomDefine.Request request, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(request, "$request");
        if (connectionObserver != null) {
            Intrinsics.checkNotNullParameter(request, "request");
            TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
            userInfo.userId = request.userId;
            userInfo.userName = request.userName;
            userInfo.avatarUrl = request.avatarUrl;
            connectionObserver.onUserConnectionCancelled(userInfo);
        }
    }

    public C40087X(C40088Y c40088y) {
        this.f89160a = c40088y;
    }

    /* JADX INFO: renamed from: b */
    public static final void m88485b(TUIRoomDefine.Request request, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            Intrinsics.checkNotNullParameter(request, "request");
            TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
            userInfo.userId = request.userId;
            userInfo.userName = request.userName;
            userInfo.avatarUrl = request.avatarUrl;
            connectionObserver.onUserConnectionRequest(userInfo);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onKickedOffSeat(int i11, TUIRoomDefine.UserInfo operateUser) throws Exception {
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        LiveCoreViewDeprecated liveCoreViewDeprecated = (LiveCoreViewDeprecated) this.f89160a.f89163c.get();
        if (liveCoreViewDeprecated != null && liveCoreViewDeprecated.getCoGuestAutoOpenCamera()) {
            LiveCoreViewDeprecated liveCoreViewDeprecated2 = (LiveCoreViewDeprecated) this.f89160a.f89163c.get();
            if (liveCoreViewDeprecated2 != null) {
                liveCoreViewDeprecated2.stopCamera();
            }
            LiveCoreViewDeprecated liveCoreViewDeprecated3 = (LiveCoreViewDeprecated) this.f89160a.f89163c.get();
            if (liveCoreViewDeprecated3 != null) {
                liveCoreViewDeprecated3.setCoGuestAutoOpenCamera$atomicxcore_release(false);
            }
        }
        LiveCoreViewDeprecated liveCoreViewDeprecated4 = (LiveCoreViewDeprecated) this.f89160a.f89163c.get();
        if (liveCoreViewDeprecated4 != null && liveCoreViewDeprecated4.getCoGuestAutoOpenMicrophone()) {
            LiveCoreViewDeprecated liveCoreViewDeprecated5 = (LiveCoreViewDeprecated) this.f89160a.f89163c.get();
            if (liveCoreViewDeprecated5 != null) {
                liveCoreViewDeprecated5.stopMicrophone();
            }
            LiveCoreViewDeprecated liveCoreViewDeprecated6 = (LiveCoreViewDeprecated) this.f89160a.f89163c.get();
            if (liveCoreViewDeprecated6 != null) {
                liveCoreViewDeprecated6.setCoGuestAutoOpenMicrophone$atomicxcore_release(false);
            }
        }
        this.f89160a.m88487a(new InterfaceC40075Q() { // from class: ig0.w
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40087X.m88482a(connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestCancelled(final TUIRoomDefine.Request request, TUIRoomDefine.UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.requestAction == TUIRoomDefine.RequestAction.REQUEST_TO_TAKE_SEAT) {
            this.f89160a.m88487a(new InterfaceC40075Q() { // from class: ig0.v
                @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
                /* JADX INFO: renamed from: a */
                public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                    C40087X.m88480a(request, connectionObserver);
                }
            });
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestReceived(final TUIRoomDefine.Request request) {
        if (request != null) {
            C40088Y c40088y = this.f89160a;
            if (request.requestAction == TUIRoomDefine.RequestAction.REQUEST_TO_TAKE_SEAT) {
                c40088y.m88487a(new InterfaceC40075Q() { // from class: ig0.u
                    @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
                    /* JADX INFO: renamed from: a */
                    public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                        C40087X.m88485b(request, connectionObserver);
                    }
                });
            }
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRoomDismissed(final String str, TUIRoomDefine.RoomDismissedReason roomDismissedReason) {
        C39510r c39510r = this.f89160a.f89161a;
        String message = "roomEngineObserver onRoomDismissed oid:" + this.f89160a.f89162b + ",roomId:" + str + ",reason:" + roomDismissedReason;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        if (str != null) {
            this.f89160a.m88489b(str);
        }
        this.f89160a.m88487a(new InterfaceC40075Q() { // from class: ig0.z
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40087X.m88483a(str, connectionObserver);
            }
        });
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSeatListChanged(List list, List list2, List list3) {
        final ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TUIRoomDefine.SeatInfo seatInfo = (TUIRoomDefine.SeatInfo) it.next();
                TUIRoomDefine.UserInfo userInfo = new TUIRoomDefine.UserInfo();
                if (seatInfo != null) {
                    userInfo.userId = seatInfo.userId;
                    userInfo.userName = seatInfo.userName;
                    userInfo.avatarUrl = seatInfo.avatarUrl;
                }
                arrayList.add(userInfo);
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                TUIRoomDefine.SeatInfo seatInfo2 = (TUIRoomDefine.SeatInfo) it2.next();
                TUIRoomDefine.UserInfo userInfo2 = new TUIRoomDefine.UserInfo();
                if (seatInfo2 != null) {
                    userInfo2.userId = seatInfo2.userId;
                    userInfo2.userName = seatInfo2.userName;
                    userInfo2.avatarUrl = seatInfo2.avatarUrl;
                }
                arrayList2.add(userInfo2);
            }
        }
        final ArrayList<TUIRoomDefine.UserInfo> arrayList3 = new ArrayList();
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                TUIRoomDefine.SeatInfo seatInfo3 = (TUIRoomDefine.SeatInfo) it3.next();
                TUIRoomDefine.UserInfo userInfo3 = new TUIRoomDefine.UserInfo();
                if (seatInfo3 != null) {
                    userInfo3.userId = seatInfo3.userId;
                    userInfo3.userName = seatInfo3.userName;
                    userInfo3.avatarUrl = seatInfo3.avatarUrl;
                }
                arrayList3.add(userInfo3);
            }
        }
        this.f89160a.m88487a(new InterfaceC40075Q() { // from class: ig0.x
            @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
            /* JADX INFO: renamed from: a */
            public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                C40087X.m88484a(arrayList, arrayList2, arrayList3, connectionObserver);
            }
        });
        for (final TUIRoomDefine.UserInfo userInfo4 : arrayList3) {
            this.f89160a.m88487a(new InterfaceC40075Q() { // from class: ig0.y
                @Override // io.trtc.tuikit.atomicxcore.impl.view.live.InterfaceC40075Q
                /* JADX INFO: renamed from: a */
                public final void mo87176a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
                    C40087X.m88481a(userInfo4, connectionObserver);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88483a(String str, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            connectionObserver.onRoomDismissed(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88484a(List userInfos, List joinUserList, List leaveUserList, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(userInfos, "$userInfos");
        Intrinsics.checkNotNullParameter(joinUserList, "$joinUserList");
        Intrinsics.checkNotNullParameter(leaveUserList, "$leaveUserList");
        if (connectionObserver != null) {
            connectionObserver.onConnectedUsersUpdated(userInfos, joinUserList, leaveUserList);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88481a(TUIRoomDefine.UserInfo userInfo, LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        Intrinsics.checkNotNullParameter(userInfo, "$userInfo");
        if (connectionObserver != null) {
            connectionObserver.onUserConnectionExited(userInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m88482a(LiveCoreViewDefine.ConnectionObserver connectionObserver) {
        if (connectionObserver != null) {
            connectionObserver.onUserConnectionTerminated();
        }
    }
}
