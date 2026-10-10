package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveCanvas;
import java.util.List;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.o1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C39763o1 {

    /* JADX INFO: renamed from: a */
    public final LiveCanvas f88357a;

    /* JADX INFO: renamed from: b */
    public final List f88358b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39763o1)) {
            return false;
        }
        C39763o1 c39763o1 = (C39763o1) obj;
        return Intrinsics.areEqual(this.f88357a, c39763o1.f88357a) && Intrinsics.areEqual(this.f88358b, c39763o1.f88358b);
    }

    public C39763o1(LiveCanvas canvas, List seatList) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(seatList, "seatList");
        this.f88357a = canvas;
        this.f88358b = seatList;
    }

    public final int hashCode() {
        return this.f88358b.hashCode() + (this.f88357a.hashCode() * 31);
    }

    public final String toString() {
        return "SeatLayout(canvas=" + this.f88357a + ", seatList=" + this.f88358b + ')';
    }
}
