package io.trtc.tuikit.atomicxcore.impl.live;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import com.tencent.cloud.tuikit.engine.room.TUIRoomObserver;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.SeatUserInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.y */
/* JADX INFO: loaded from: classes61.dex */
public final class C39785y extends TUIRoomObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39692M f88410a;

    public C39785y(C39692M c39692m) {
        this.f88410a = c39692m;
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onKickedOffSeat(int i11, TUIRoomDefine.UserInfo operateUser, String extensionInfo) {
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        Intrinsics.checkNotNullParameter(extensionInfo, "extensionInfo");
        C39692M c39692m = this.f88410a;
        c39692m.f88187j.m88249a((Function1) new C39773s(c39692m, i11, operateUser));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestCancelled(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo operateUser) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        TUIRoomDefine.RequestAction requestAction = request.requestAction;
        int i11 = requestAction == null ? -1 : AbstractC39770r.f88376a[requestAction.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            C39692M c39692m = this.f88410a;
            c39692m.f88190m = null;
            c39692m.f88187j.m88249a((Function1) new C39777u(c39692m, request));
            return;
        }
        C39692M c39692m2 = this.f88410a;
        String userId = request.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        C39692M.m88300a(c39692m2, userId);
        C39692M c39692m3 = this.f88410a;
        c39692m3.f88186i.m88249a((Function1) new C39775t(c39692m3, request));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestProcessed(TUIRoomDefine.Request request, TUIRoomDefine.UserInfo operateUser) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(operateUser, "operateUser");
        if (request.requestAction == TUIRoomDefine.RequestAction.REQUEST_TO_TAKE_SEAT) {
            C39692M c39692m = this.f88410a;
            String userId = request.userId;
            Intrinsics.checkNotNullExpressionValue(userId, "userId");
            C39692M.m88300a(c39692m, userId);
            C39692M c39692m2 = this.f88410a;
            c39692m2.f88186i.m88249a((Function1) new C39779v(c39692m2, request, operateUser));
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onRequestReceived(TUIRoomDefine.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        TUIRoomDefine.RequestAction requestAction = request.requestAction;
        int i11 = requestAction == null ? -1 : AbstractC39770r.f88376a[requestAction.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            C39692M c39692m = this.f88410a;
            c39692m.f88190m = request;
            c39692m.f88187j.m88249a((Function1) new C39783x(request, c39692m));
            return;
        }
        C39692M c39692m2 = this.f88410a;
        InterfaceC41669n interfaceC41669n = c39692m2.f88182e;
        List mutableList = CollectionsKt.toMutableList((Collection) interfaceC41669n.getValue());
        mutableList.add(AbstractC39747j0.m88321a(request));
        interfaceC41669n.setValue(mutableList);
        LinkedHashMap linkedHashMap = c39692m2.f88184g;
        String userId = request.userId;
        Intrinsics.checkNotNullExpressionValue(userId, "userId");
        linkedHashMap.put(userId, request);
        C39692M c39692m3 = this.f88410a;
        c39692m3.f88186i.m88249a((Function1) new C39781w(request, c39692m3));
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onSeatListChanged(String roomId, List seatList, List newlySeatedUsers, List newlyLeftUsers) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        Intrinsics.checkNotNullParameter(newlySeatedUsers, "newlySeatedUsers");
        Intrinsics.checkNotNullParameter(newlyLeftUsers, "newlyLeftUsers");
        if (Intrinsics.areEqual(roomId, this.f88410a.f88178a)) {
            this.f88410a.m88302a(seatList);
        }
    }

    @Override // com.tencent.cloud.tuikit.engine.room.TUIRoomObserver
    public final void onUserAudioStateChanged(String str, boolean z11, TUIRoomDefine.ChangeReason reason) {
        Object obj;
        ArrayList arrayList;
        String userID = str;
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (z11) {
            this.f88410a.f88191n.add(userID);
        } else {
            this.f88410a.f88191n.remove(userID);
        }
        DeviceStatus deviceStatus = z11 ? DeviceStatus.ON : DeviceStatus.OFF;
        InterfaceC41669n interfaceC41669n = this.f88410a.f88180c;
        while (true) {
            Object value = interfaceC41669n.getValue();
            List<SeatUserInfo> list = (List) value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (SeatUserInfo seatUserInfoCopy$default : list) {
                if (Intrinsics.areEqual(seatUserInfoCopy$default.getUserID(), userID)) {
                    arrayList = arrayList2;
                    obj = value;
                    seatUserInfoCopy$default = SeatUserInfo.copy$default(seatUserInfoCopy$default, null, null, null, null, null, deviceStatus, false, null, false, null, 991, null);
                } else {
                    obj = value;
                    arrayList = arrayList2;
                }
                arrayList.add(seatUserInfoCopy$default);
                value = obj;
                arrayList2 = arrayList;
                userID = str;
            }
            if (interfaceC41669n.compareAndSet(value, arrayList2)) {
                return;
            } else {
                userID = str;
            }
        }
    }
}
