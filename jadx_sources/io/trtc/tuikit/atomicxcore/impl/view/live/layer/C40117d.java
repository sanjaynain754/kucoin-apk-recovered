package io.trtc.tuikit.atomicxcore.impl.view.live.layer;

import android.content.Context;
import android.widget.FrameLayout;
import com.tencent.cloud.tuikit.engine.common.TUIVideoView;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.view.live.layer.d */
/* JADX INFO: loaded from: classes61.dex */
public final class C40117d extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TUIVideoView f89232a;

    /* JADX INFO: renamed from: b */
    public final int f89233b;

    /* JADX INFO: renamed from: c */
    public String f89234c;

    /* JADX INFO: renamed from: d */
    public final C39510r f89235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40117d(Context context, String roomId) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        int iHashCode = hashCode();
        this.f89233b = iHashCode;
        this.f89234c = "";
        C39510r c39510rM88229a = AbstractC39398a.m88229a("MixStreamLayerView", "file", "AtomicXCore-Live", "MixStreamLayerView");
        this.f89235d = c39510rM88229a;
        String message = "new OID:" + iHashCode + ", roomId:" + roomId;
        Intrinsics.checkNotNullParameter(message, "message");
        c39510rM88229a.m88251a(0, message);
    }

    @NotNull
    public final String getMixStreamUserId() {
        return this.f89234c;
    }

    @Nullable
    public final TUIVideoView getTUIVideoView() {
        return this.f89232a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f89232a = new TUIVideoView(getContext().getApplicationContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        TUIVideoView tUIVideoView = this.f89232a;
        if (tUIVideoView != null) {
            addView(tUIVideoView, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C39510r c39510r = this.f89235d;
        String message = "MixStreamLayerLayout cleanup OID:" + this.f89233b;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        TUIVideoView tUIVideoView = this.f89232a;
        if (tUIVideoView != null) {
            removeView(tUIVideoView);
        }
        this.f89232a = null;
    }

    public final void setMixStreamUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f89234c = userId;
    }
}
