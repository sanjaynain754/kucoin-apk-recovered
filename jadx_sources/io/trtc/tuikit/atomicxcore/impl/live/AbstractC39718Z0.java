package io.trtc.tuikit.atomicxcore.impl.live;

import io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.live.Z0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC39718Z0 {
    /* JADX INFO: renamed from: a */
    public static final SeatInfo m88316a(LiveSeatStore liveSeatStore, String str) {
        Intrinsics.checkNotNullParameter(liveSeatStore, "<this>");
        Object obj = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        for (Object obj2 : liveSeatStore.getLiveSeatState().getSeatList().getValue()) {
            if (Intrinsics.areEqual(((SeatInfo) obj2).getUserInfo().getUserID(), str)) {
                obj = obj2;
                break;
            }
        }
        return (SeatInfo) obj;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m88317a(C39763o1 c39763o1) {
        if (c39763o1.f88358b.size() <= 1) {
            return true;
        }
        for (SeatInfo seatInfo : c39763o1.f88358b) {
            if (seatInfo.getRegion().getW() == c39763o1.f88357a.getW() && seatInfo.getRegion().getH() == c39763o1.f88357a.getH()) {
                return true;
            }
        }
        return false;
    }
}
