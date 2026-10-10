package io.trtc.tuikit.atomicxcore.impl.room;

import java.util.Map;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.V0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39908V0 {

    /* JADX INFO: renamed from: a */
    public final String f88717a;

    /* JADX INFO: renamed from: b */
    public final Map f88718b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39908V0)) {
            return false;
        }
        C39908V0 c39908v0 = (C39908V0) obj;
        return Intrinsics.areEqual(this.f88717a, c39908v0.f88717a) && Intrinsics.areEqual(this.f88718b, c39908v0.f88718b);
    }

    public final int hashCode() {
        return this.f88718b.hashCode() + (this.f88717a.hashCode() * 31);
    }

    public final String toString() {
        return "UserDeviceRequests(userId=" + this.f88717a + ", deviceRequests=" + this.f88718b + ')';
    }

    public C39908V0(String userId, Map deviceRequests) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(deviceRequests, "deviceRequests");
        this.f88717a = userId;
        this.f88718b = deviceRequests;
    }
}
