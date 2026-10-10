package io.trtc.tuikit.atomicxcore.impl.view.live.layer;

import android.content.Context;
import android.widget.FrameLayout;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.layer.b */
/* JADX INFO: loaded from: classes61.dex */
public final class C40115b extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final int f89225a;

    /* JADX INFO: renamed from: b */
    public final C39510r f89226b;

    /* JADX INFO: renamed from: c */
    public int f89227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40115b(Context context, String roomId) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        int iHashCode = hashCode();
        this.f89225a = iHashCode;
        C39510r c39510rM88229a = AbstractC39398a.m88229a("BattleWidgetsLayerView", "file", "AtomicXCore-Live", "BattleWidgetsLayerView");
        this.f89226b = c39510rM88229a;
        String message = "BattleWidgetsLayerView new OID:" + iHashCode + ",roomId:" + roomId;
        Intrinsics.checkNotNullParameter(message, "message");
        c39510rM88229a.m88251a(0, message);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f89227c = (int) ((context.getResources().getDisplayMetrics().density * 720.0f) + 0.5f);
        Intrinsics.checkNotNullParameter(context, "context");
        float f11 = context.getResources().getDisplayMetrics().density;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f89227c = getMeasuredWidth();
        getMeasuredHeight();
    }
}
