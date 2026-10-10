package io.trtc.tuikit.atomicxcore.impl.view.live.layer;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.FrameLayout;
import io.trtc.tuikit.atomicxcore.api.device.DeviceStatus;
import io.trtc.tuikit.atomicxcore.api.live.SeatInfo;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.layer.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40114a extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final SparseArray f89221d;

    /* JADX INFO: renamed from: a */
    public final int f89222a;

    /* JADX INFO: renamed from: b */
    public final C39510r f89223b;

    /* JADX INFO: renamed from: c */
    public SeatInfo f89224c;

    static {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, "VISIBLE");
        sparseArray.put(4, "INVISIBLE");
        sparseArray.put(8, "GONE");
        f89221d = sparseArray;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40114a(Context context, String roomId, SeatInfo region) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(region, "region");
        int iHashCode = hashCode();
        this.f89222a = iHashCode;
        C39510r c39510rM88229a = AbstractC39398a.m88229a("BackgroundSeatView", "file", "AtomicXCore-Live", "BackgroundSeatView");
        this.f89223b = c39510rM88229a;
        String message = "BackgroundView new OID:" + iHashCode + ",roomId:" + roomId + ",region:" + region;
        Intrinsics.checkNotNullParameter(message, "message");
        int i11 = 0;
        c39510rM88229a.m88251a(0, message);
        this.f89224c = region;
        if (region.getUserInfo().getCameraStatus() != DeviceStatus.OFF && !TextUtils.isEmpty(this.f89224c.getUserInfo().getUserID())) {
            i11 = 8;
        }
        setVisibility(i11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        C39510r c39510r = this.f89223b;
        String message = "setVisibility OID:" + this.f89222a + " visibility:" + ((String) f89221d.get(i11));
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
    }
}
