package io.trtc.tuikit.atomicxcore.impl.room;

import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39392b;
import io.trtc.tuikit.atomicxcore.api.room.RoomUser;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.room.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39921e {

    /* JADX INFO: renamed from: a */
    public final RoomUser f88738a;

    /* JADX INFO: renamed from: b */
    public String f88739b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39921e)) {
            return false;
        }
        C39921e c39921e = (C39921e) obj;
        return Intrinsics.areEqual(this.f88738a, c39921e.f88738a) && Intrinsics.areEqual(this.f88739b, c39921e.f88739b);
    }

    public C39921e() {
        RoomUser roomUser = new RoomUser(null, null, null, 7, null);
        Intrinsics.checkNotNullParameter(roomUser, "roomUser");
        Intrinsics.checkNotNullParameter("", TUIConstantDefine.NAME_CARD);
        this.f88738a = roomUser;
        this.f88739b = "";
    }

    public final int hashCode() {
        return this.f88739b.hashCode() + (this.f88738a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RoomOwner(roomUser=");
        sb2.append(this.f88738a);
        sb2.append(", nameCard=");
        return AbstractC39392b.m88221a(sb2, this.f88739b, ')');
    }
}
