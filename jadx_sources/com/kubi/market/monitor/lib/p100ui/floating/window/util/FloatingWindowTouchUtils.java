package com.kubi.market.monitor.lib.p100ui.floating.window.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Keep;
import aq.WindowStatus;
import com.kubi.market.monitor.lib.p100ui.floating.window.FloatingActionManager;
import com.kubi.market.monitor.lib.p100ui.floating.window.util.FloatingWindowTouchUtils;
import com.kubi.utils.C27100x0;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatingWindowTouchUtils.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;", "", "context", "Landroid/content/Context;", "config", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "<init>", "(Landroid/content/Context;Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;)V", "getContext", "()Landroid/content/Context;", "getConfig", "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "ScaledTouchSlop", "", "getScaledTouchSlop", "()I", "ScaledTouchSlop$delegate", "Lkotlin/Lazy;", "lastX", "", "lastY", "nowX", "nowY", "transX", "transY", "finalMoveX", "animationEndListener", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;", "getAnimationEndListener", "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;", "setAnimationEndListener", "(Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;)V", "updateFloat", "", "rootView", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;", "event", "Landroid/view/MotionEvent;", "windowManager", "Landroid/view/WindowManager;", ReportDataTable.COLUMN_PARAMS, "Landroid/view/WindowManager$LayoutParams;", "updataFloatingView", "newConfig", "AnimationEndListener", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingWindowTouchUtils {

    /* JADX INFO: renamed from: ScaledTouchSlop$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ScaledTouchSlop;

    @Nullable
    private InterfaceC18823a animationEndListener;

    @NotNull
    private final WindowStatus config;

    @NotNull
    private final Context context;
    private int finalMoveX;
    private float lastX;
    private float lastY;
    private float nowX;
    private float nowY;
    private float transX;
    private float transY;

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.util.FloatingWindowTouchUtils$a */
    /* JADX INFO: compiled from: FloatingWindowTouchUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;", "", "onAnimationEnd", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC18823a {
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.util.FloatingWindowTouchUtils$b */
    /* JADX INFO: compiled from: FloatingWindowTouchUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$updateFloat$3$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18824b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WindowManager.LayoutParams f34528b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f34529c;

        public C18824b(WindowManager.LayoutParams layoutParams, boolean z11) {
            this.f34528b = layoutParams;
            this.f34529c = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Function3<Boolean, Boolean, View, Object> function3M3961t;
            Intrinsics.checkNotNullParameter(animation, "animation");
            FloatingWindowTouchUtils.this.getConfig().m3925A(false);
            View floatingView = FloatingWindowTouchUtils.this.getConfig().getFloatingView();
            if (floatingView != null) {
                FloatingWindowTouchUtils floatingWindowTouchUtils = FloatingWindowTouchUtils.this;
                boolean z11 = this.f34529c;
                WindowStatus config = floatingWindowTouchUtils.getConfig();
                if (config != null && (function3M3961t = config.m3961t()) != null) {
                    function3M3961t.invoke(Boolean.TRUE, Boolean.valueOf(z11), floatingView);
                }
            }
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            WindowManager.LayoutParams layoutParams = this.f34528b;
            floatingActionManager.m41336J1(layoutParams.x, layoutParams.y);
        }
    }

    public FloatingWindowTouchUtils(@NotNull Context context, @NotNull WindowStatus config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.context = context;
        this.config = config;
        this.ScaledTouchSlop = LazyKt.lazy(new Function0() { // from class: aq.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(FloatingWindowTouchUtils.ScaledTouchSlop_delegate$lambda$0(this.f3778b));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ScaledTouchSlop_delegate$lambda$0(FloatingWindowTouchUtils floatingWindowTouchUtils) {
        return ViewConfiguration.get(floatingWindowTouchUtils.context).getScaledTouchSlop();
    }

    private final int getScaledTouchSlop() {
        return ((Number) this.ScaledTouchSlop.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateFloat$lambda$4(FloatingWindowTouchUtils floatingWindowTouchUtils, final WindowManager.LayoutParams layoutParams, final FloatingWindowFrameLayout floatingWindowFrameLayout, final WindowManager windowManager) {
        int i11 = floatingWindowTouchUtils.finalMoveX;
        boolean z11 = i11 == 0;
        int i12 = layoutParams.x;
        int i13 = i12 - i11;
        if (i13 < 300) {
            i13 = 300;
        }
        ValueAnimator duration = ValueAnimator.ofInt(i12, i11).setDuration(i13);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: aq.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FloatingWindowTouchUtils.updateFloat$lambda$4$lambda$3(floatingWindowFrameLayout, layoutParams, windowManager, valueAnimator);
            }
        });
        floatingWindowTouchUtils.config.m3925A(true);
        duration.start();
        duration.addListener(floatingWindowTouchUtils.new C18824b(layoutParams, z11));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFloat$lambda$4$lambda$3(FloatingWindowFrameLayout floatingWindowFrameLayout, WindowManager.LayoutParams layoutParams, WindowManager windowManager, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (floatingWindowFrameLayout.isAttachedToWindow()) {
            Object animatedValue = animation.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.x = ((Integer) animatedValue).intValue();
            windowManager.updateViewLayout(floatingWindowFrameLayout, layoutParams);
        }
    }

    @Nullable
    public final InterfaceC18823a getAnimationEndListener() {
        return this.animationEndListener;
    }

    @NotNull
    public final WindowStatus getConfig() {
        return this.config;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final void setAnimationEndListener(@Nullable InterfaceC18823a interfaceC18823a) {
        this.animationEndListener = interfaceC18823a;
    }

    public final int updataFloatingView(@NotNull WindowStatus newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (newConfig.getFloatingView() == null) {
            return -1;
        }
        this.config.m3931G(newConfig.getFloatingView());
        this.config.m3942R(newConfig.m3961t());
        this.config.m3932H(newConfig.getOffsetPair());
        return 1;
    }

    public final void updateFloat(@Nullable final FloatingWindowFrameLayout rootView, @NotNull MotionEvent event, @NotNull final WindowManager windowManager, @NotNull final WindowManager.LayoutParams params) {
        View floatingView;
        WindowStatus windowStatus;
        Function3<Boolean, Boolean, View, Object> function3M3961t;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(params, "params");
        if (rootView == null || rootView.getChildCount() == 0) {
            return;
        }
        if (!this.config.getDragEnable() || this.config.getIsAnim()) {
            this.config.m3930F(false);
            return;
        }
        int action = event.getAction() & 255;
        if (action == 0) {
            this.lastX = event.getRawX();
            this.lastY = event.getRawY();
            this.config.m3930F(false);
            return;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = event.getRawX() - this.lastX;
                float rawY = event.getRawY() - this.lastY;
                if (this.config.getIsDrag() || (rawX * rawX) + (rawY * rawY) >= getScaledTouchSlop()) {
                    this.nowX = event.getRawX();
                    float rawY2 = event.getRawY();
                    this.nowY = rawY2;
                    float f11 = this.nowX - this.lastX;
                    this.transX = f11;
                    float f12 = rawY2 - this.lastY;
                    this.transY = f12;
                    params.x = (int) (params.x + f11);
                    params.y = (int) (params.y + f12);
                    windowManager.updateViewLayout(rootView, params);
                    if (!this.config.getIsDrag() && (floatingView = this.config.getFloatingView()) != null && (windowStatus = this.config) != null && (function3M3961t = windowStatus.m3961t()) != null) {
                        Boolean bool = Boolean.FALSE;
                        function3M3961t.invoke(bool, bool, floatingView);
                    }
                    this.config.m3930F(true);
                    this.lastX = this.nowX;
                    this.lastY = this.nowY;
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        if (this.config.getIsDrag()) {
            this.finalMoveX = params.x + (rootView.getMeasuredWidth() / 2) >= windowManager.getDefaultDisplay().getWidth() / 2 ? windowManager.getDefaultDisplay().getWidth() - rootView.getMeasuredWidth() : 0;
            C27100x0.m66923d(new Function0() { // from class: aq.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingWindowTouchUtils.updateFloat$lambda$4(this.f3779b, params, rootView, windowManager);
                }
            });
        }
    }
}
