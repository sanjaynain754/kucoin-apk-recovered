package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import io.trtc.tuikit.atomicxcore.api.device.DeviceType;
import io.trtc.tuikit.atomicxcore.api.room.DeviceRequestInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C39915b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f88727a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41669n f88728b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f88729c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f88730d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f88731e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f88732f;

    /* JADX INFO: renamed from: a */
    public final void m88344a(DeviceType deviceType, TUIRoomDefine.Request request) {
        Object value;
        Intrinsics.checkNotNullParameter(deviceType, "device");
        Intrinsics.checkNotNullParameter(request, "request");
        String str = request.fromUser.userId;
        C39908V0 c39908v0 = (C39908V0) this.f88730d.get(str);
        if (c39908v0 == null) {
            Intrinsics.checkNotNull(str);
            c39908v0 = new C39908V0(str, MapsKt.emptyMap());
        }
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(request, "request");
        Map deviceRequests = MapsKt.toMutableMap(c39908v0.f88718b);
        deviceRequests.put(deviceType, request);
        String userId = c39908v0.f88717a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
        C39908V0 c39908v1 = new C39908V0(userId, deviceRequests);
        LinkedHashMap linkedHashMap = this.f88730d;
        Intrinsics.checkNotNull(str);
        linkedHashMap.put(str, c39908v1);
        InterfaceC41669n interfaceC41669n = this.f88727a;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, CollectionsKt.plus((Collection<? extends DeviceRequestInfo>) value, AbstractC39939m0.m88361a(request))));
    }

    public C39915b(InterfaceC41669n pendingDeviceApplications, InterfaceC41669n pendingDeviceInvitations) {
        Intrinsics.checkNotNullParameter(pendingDeviceApplications, "pendingDeviceApplications");
        Intrinsics.checkNotNullParameter(pendingDeviceInvitations, "pendingDeviceInvitations");
        this.f88727a = pendingDeviceApplications;
        this.f88728b = pendingDeviceInvitations;
        this.f88729c = new LinkedHashMap();
        this.f88730d = new LinkedHashMap();
        this.f88731e = new LinkedHashMap();
        this.f88732f = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: b */
    public final void m88346b(String userID, DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        C39908V0 c39908v0 = (C39908V0) this.f88732f.get(userID);
        if (c39908v0 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Map deviceRequests = MapsKt.toMutableMap(c39908v0.f88718b);
        deviceRequests.remove(deviceType);
        String userId = c39908v0.f88717a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
        C39908V0 c39908v1 = new C39908V0(userId, deviceRequests);
        if (deviceRequests.isEmpty()) {
            this.f88732f.remove(userID);
        } else {
            this.f88732f.put(userID, c39908v1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m88347c(String userID, DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        C39908V0 c39908v0 = (C39908V0) this.f88731e.get(userID);
        if (c39908v0 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Map deviceRequests = MapsKt.toMutableMap(c39908v0.f88718b);
        deviceRequests.remove(deviceType);
        String userId = c39908v0.f88717a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
        C39908V0 c39908v1 = new C39908V0(userId, deviceRequests);
        if (deviceRequests.isEmpty()) {
            this.f88731e.remove(userID);
        } else {
            this.f88731e.put(userID, c39908v1);
        }
        InterfaceC41669n interfaceC41669n = this.f88728b;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((DeviceRequestInfo) obj).getSenderUserID(), userID)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m88345a(DeviceType deviceType, String userID) {
        Intrinsics.checkNotNullParameter(deviceType, "device");
        Intrinsics.checkNotNullParameter(userID, "userID");
        C39908V0 c39908v0 = (C39908V0) this.f88730d.get(userID);
        if (c39908v0 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Map deviceRequests = MapsKt.toMutableMap(c39908v0.f88718b);
        deviceRequests.remove(deviceType);
        String userId = c39908v0.f88717a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
        C39908V0 c39908v1 = new C39908V0(userId, deviceRequests);
        if (deviceRequests.isEmpty()) {
            this.f88730d.remove(userID);
        } else {
            this.f88730d.put(userID, c39908v1);
        }
        InterfaceC41669n interfaceC41669n = this.f88727a;
        Iterable iterable = (Iterable) interfaceC41669n.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!Intrinsics.areEqual(((DeviceRequestInfo) obj).getSenderUserID(), userID)) {
                arrayList.add(obj);
            }
        }
        interfaceC41669n.setValue(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final TUIRoomDefine.Request m88343a(String userID, DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(deviceType, "device");
        C39908V0 c39908v0 = (C39908V0) this.f88731e.get(userID);
        if (c39908v0 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        return (TUIRoomDefine.Request) c39908v0.f88718b.get(deviceType);
    }
}
