package com.kubi.market.monitor.lib.p100ui.floating.window.util;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import aq.InterfaceC4380i;
import aq.WindowStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatingWindowFrameLayout.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;", "Landroid/widget/FrameLayout;", "config", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "touchListener", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/OnFloatWindowTouchListener;", "getTouchListener", "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/OnFloatWindowTouchListener;", "setTouchListener", "(Lcom/kubi/market/monitor/lib/ui/floating/window/util/OnFloatWindowTouchListener;)V", "onInterceptTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingWindowFrameLayout extends FrameLayout {

    @NotNull
    private final WindowStatus config;

    @Nullable
    private InterfaceC4380i touchListener;

    public /* synthetic */ FloatingWindowFrameLayout(WindowStatus windowStatus, Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowStatus, context, (i12 & 4) != 0 ? null : attributeSet, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingWindowFrameLayout(@NotNull WindowStatus config, @NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.config = config;
    }

    @Nullable
    public final InterfaceC4380i getTouchListener() {
        return this.touchListener;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent event) {
        InterfaceC4380i interfaceC4380i;
        if (event != null && (interfaceC4380i = this.touchListener) != null) {
            interfaceC4380i.mo3923a(event);
        }
        return this.config.getIsDrag() || super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        InterfaceC4380i interfaceC4380i;
        if (event != null && (interfaceC4380i = this.touchListener) != null) {
            interfaceC4380i.mo3923a(event);
        }
        return this.config.getIsDrag() || super.onTouchEvent(event);
    }

    public final void setTouchListener(@Nullable InterfaceC4380i interfaceC4380i) {
        this.touchListener = interfaceC4380i;
    }
}
