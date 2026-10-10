package io.trtc.tuikit.atomicxcore.impl.view.room;

import com.tencent.cloud.tuikit.engine.room.TUIRoomDefine;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.room.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C40151e {

    /* JADX INFO: renamed from: a */
    public final String f89293a;

    /* JADX INFO: renamed from: b */
    public final TUIRoomDefine.VideoStreamType f89294b;

    /* JADX INFO: renamed from: c */
    public final int f89295c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40151e)) {
            return false;
        }
        C40151e c40151e = (C40151e) obj;
        return Intrinsics.areEqual(this.f89293a, c40151e.f89293a) && this.f89294b == c40151e.f89294b && this.f89295c == c40151e.f89295c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f89295c) + ((this.f89294b.hashCode() + (this.f89293a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoStreamInfo(userID=" + this.f89293a + ", streamType=" + this.f89294b + ", viewID=" + this.f89295c + ')';
    }

    public C40151e(String userID, TUIRoomDefine.VideoStreamType streamType, int i11) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(streamType, "streamType");
        this.f89293a = userID;
        this.f89294b = streamType;
        this.f89295c = i11;
    }
}
