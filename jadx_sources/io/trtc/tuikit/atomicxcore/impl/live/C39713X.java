package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager;
import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomEngine;
import io.trtc.tuikit.atomicxcore.api.live.CoHostStatus;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.X */
/* JADX INFO: loaded from: classes61.dex */
public final class C39713X extends TUILiveConnectionManager.Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39726c0 f88229a;

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionUserListChanged(List list, List list2, List list3) {
        Set set;
        Collection collectionEmptyList;
        List<TUILiveConnectionManager.ConnectionUser> listFilterNotNull;
        List<TUILiveConnectionManager.ConnectionUser> listFilterNotNull2;
        List listFilterNotNull3;
        Object value;
        Object obj = null;
        if (list != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TUILiveConnectionManager.ConnectionUser connectionUser = (TUILiveConnectionManager.ConnectionUser) it.next();
                arrayList.add(connectionUser != null ? connectionUser.roomId : null);
            }
            set = CollectionsKt.toSet(arrayList);
        } else {
            set = null;
        }
        if (set != null) {
            C39726c0 c39726c0 = this.f88229a;
            Iterable iterable = (Iterable) c39726c0.f88264e.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iterable) {
                if (!set.contains(((SeatUserInfo) obj2).getLiveID())) {
                    arrayList2.add(obj2);
                }
            }
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
            InterfaceC41669n interfaceC41669n = c39726c0.f88264e;
            do {
                value = interfaceC41669n.getValue();
            } while (!interfaceC41669n.compareAndSet(value, mutableList));
        }
        InterfaceC41669n interfaceC41669n2 = this.f88229a.f88262c;
        if (list != null) {
            for (Object obj3 : list) {
                TUILiveConnectionManager.ConnectionUser connectionUser2 = (TUILiveConnectionManager.ConnectionUser) obj3;
                if (connectionUser2 != null && Intrinsics.areEqual(connectionUser2.userId, TUIRoomEngine.getSelfInfo().userId)) {
                    obj = obj3;
                    break;
                }
            }
            obj = (TUILiveConnectionManager.ConnectionUser) obj;
        }
        interfaceC41669n2.setValue(obj == null ? CoHostStatus.DISCONNECTED : CoHostStatus.CONNECTED);
        InterfaceC41669n interfaceC41669n3 = this.f88229a.f88263d;
        if (list == null || (listFilterNotNull3 = CollectionsKt.filterNotNull(list)) == null) {
            collectionEmptyList = CollectionsKt.emptyList();
        } else {
            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull3, 10));
            Iterator it2 = listFilterNotNull3.iterator();
            while (it2.hasNext()) {
                collectionEmptyList.add(AbstractC39699P0.m88312a((TUILiveConnectionManager.ConnectionUser) it2.next()));
            }
        }
        interfaceC41669n3.setValue(collectionEmptyList);
        if (list2 != null && (listFilterNotNull2 = CollectionsKt.filterNotNull(list2)) != null) {
            C39726c0 c39726c1 = this.f88229a;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull2, 10));
            for (TUILiveConnectionManager.ConnectionUser connectionUser3 : listFilterNotNull2) {
                AbstractC39465b.m88232a(c39726c1.f88268i, "Listener: onCoHostUserJoined called", "message", 0, "Listener: onCoHostUserJoined called");
                c39726c1.f88269j.m88249a((Function1) new C39709V(connectionUser3));
                arrayList3.add(Unit.INSTANCE);
            }
        }
        if (list3 == null || (listFilterNotNull = CollectionsKt.filterNotNull(list3)) == null) {
            return;
        }
        C39726c0 c39726c2 = this.f88229a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listFilterNotNull, 10));
        for (TUILiveConnectionManager.ConnectionUser connectionUser4 : listFilterNotNull) {
            AbstractC39465b.m88232a(c39726c2.f88268i, "Listener: onCoHostUserLeft called", "message", 0, "Listener: onCoHostUserLeft called");
            c39726c2.f88269j.m88249a((Function1) new C39711W(connectionUser4));
            arrayList4.add(Unit.INSTANCE);
        }
    }

    public C39713X(C39726c0 c39726c0) {
        this.f88229a = c39726c0;
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestAccept(TUILiveConnectionManager.ConnectionUser invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        InterfaceC41669n interfaceC41669n = this.f88229a.f88266g;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), invitee.roomId)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
        AbstractC39465b.m88232a(this.f88229a.f88268i, "Listener: onCoHostRequestAccepted called", "message", 0, "Listener: onCoHostRequestAccepted called");
        this.f88229a.f88269j.m88249a((Function1) new C39698P(invitee));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestCancelled(TUILiveConnectionManager.ConnectionUser connectionUser) {
        this.f88229a.f88267h.setValue(null);
        TUIRoomDefine.LoginUserInfo selfInfo = TUIRoomEngine.getSelfInfo();
        String str = this.f88229a.f88260a;
        String str2 = selfInfo.userId;
        String str3 = selfInfo.userName;
        String str4 = selfInfo.avatarUrl;
        Intrinsics.checkNotNull(str2);
        Intrinsics.checkNotNull(str3);
        Intrinsics.checkNotNull(str4);
        SeatUserInfo seatUserInfo = new SeatUserInfo(str2, str3, str4, null, str, null, false, null, false, null, 1000, null);
        if (connectionUser != null) {
            C39726c0 c39726c0 = this.f88229a;
            AbstractC39465b.m88232a(c39726c0.f88268i, "Listener: onCoHostRequestCancelled called", "message", 0, "Listener: onCoHostRequestCancelled called");
            c39726c0.f88269j.m88249a((Function1) new C39700Q(connectionUser, seatUserInfo));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestReceived(TUILiveConnectionManager.ConnectionUser inviter, List inviteeList, String extensionInfo) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(inviteeList, "inviteeList");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        this.f88229a.f88267h.setValue(AbstractC39699P0.m88312a(inviter));
        AbstractC39465b.m88232a(this.f88229a.f88268i, "Listener: onCoHostRequestReceived called", "message", 0, "Listener: onCoHostRequestReceived called");
        this.f88229a.f88269j.m88249a((Function1) new C39703S(inviter, extensionInfo));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestReject(TUILiveConnectionManager.ConnectionUser invitee) {
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        InterfaceC41669n interfaceC41669n = this.f88229a.f88266g;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), invitee.roomId)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
        AbstractC39465b.m88232a(this.f88229a.f88268i, "Listener: onCoHostRequestRejected called", "message", 0, "Listener: onCoHostRequestRejected called");
        this.f88229a.f88269j.m88249a((Function1) new C39705T(invitee));
    }

    @Override // com.tencent.cloud.tuikit.engine.extension.TUILiveConnectionManager.Observer
    public final void onConnectionRequestTimeout(TUILiveConnectionManager.ConnectionUser inviter, TUILiveConnectionManager.ConnectionUser invitee) {
        Intrinsics.checkNotNullParameter(inviter, "inviter");
        Intrinsics.checkNotNullParameter(invitee, "invitee");
        if (Intrinsics.areEqual(inviter.roomId, this.f88229a.f88260a)) {
            InterfaceC41669n interfaceC41669n = this.f88229a.f88266g;
            Iterable iterable = (Iterable) interfaceC41669n.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!Intrinsics.areEqual(((SeatUserInfo) obj).getLiveID(), invitee.roomId)) {
                    arrayList.add(obj);
                }
            }
            interfaceC41669n.setValue(arrayList);
        } else {
            this.f88229a.f88267h.setValue(null);
        }
        AbstractC39465b.m88232a(this.f88229a.f88268i, "Listener: onCoHostRequestTimeout called", "message", 0, "Listener: onCoHostRequestTimeout called");
        this.f88229a.f88269j.m88249a((Function1) new C39707U(inviter, invitee));
    }
}
