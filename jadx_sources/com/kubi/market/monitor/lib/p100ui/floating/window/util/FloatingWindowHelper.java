package com.kubi.market.monitor.lib.p100ui.floating.window.util;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.WindowManager;
import aq.C4373b;
import aq.InterfaceC4380i;
import aq.WindowStatus;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.market.monitor.lib.p100ui.floating.window.util.FloatingWindowHelper;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.util.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingWindowHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0005JB\u0010\"\u001a\u00020#2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050%¢\u0006\u0002\b&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020#0%J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J\u0006\u0010-\u001a\u00020\u001eJ\u0006\u0010.\u001a\u00020\u001eJ\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020#J\u0006\u00102\u001a\u00020#J\b\u00103\u001a\u00020#H\u0002J\u000e\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\u001eJ\u0006\u00106\u001a\u000200J\u0006\u00107\u001a\u000200J\u0006\u00108\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u00069"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper;", "", "context", "Landroid/content/Context;", "config", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "<init>", "(Landroid/content/Context;Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;)V", "getContext", "()Landroid/content/Context;", "getConfig", "()Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "setConfig", "(Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;)V", "frameLayout", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowFrameLayout;", "floatingWindowTouchUtils", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils;", ReportDataTable.COLUMN_PARAMS, "Landroid/view/WindowManager$LayoutParams;", "getParams", "()Landroid/view/WindowManager$LayoutParams;", "params$delegate", "Lkotlin/Lazy;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "windowManager$delegate", "createWindowInner", "", "createWindowInner$MarketMonitorLib_googleRelease", "updataFloatingView", "newConfig", "updataFloatingConfig", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "updataView", "Lkotlin/ParameterName;", "name", "data", "initParams", "initView", "defaultDisplayHeight", "windowFrameLayoutHeight", "windowShowing", "", "windowAddView", "windowRemoveView", "frameLayoutRemoveView", "updateframeLayoutParams", "viewWidth", "windowXisLeft", "windowYisTop", "getFloatConfig", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingWindowHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowHelper.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n+ 3 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,230:1\n63#2,14:231\n78#2:249\n63#2,14:250\n78#2:268\n63#2,14:269\n78#2:287\n45#3,4:245\n45#3,4:264\n45#3,4:283\n*S KotlinDebug\n*F\n+ 1 FloatingWindowHelper.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper\n*L\n161#1:231,14\n161#1:249\n172#1:250,14\n172#1:268\n191#1:269,14\n191#1:287\n161#1:245,4\n172#1:264,4\n191#1:283,4\n*E\n"})
public final class FloatingWindowHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f34530a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public WindowStatus f34531b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public FloatingWindowFrameLayout f34532c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public FloatingWindowTouchUtils f34533d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Lazy f34534e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f34535f;

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.util.a$a */
    /* JADX INFO: compiled from: FloatingWindowHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper$createWindowInner$1", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowTouchUtils$AnimationEndListener;", "onAnimationEnd", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements FloatingWindowTouchUtils.InterfaceC18823a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.util.a$b */
    /* JADX INFO: compiled from: FloatingWindowHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/window/util/FloatingWindowHelper$initView$1$1", "Lcom/kubi/market/monitor/lib/ui/floating/window/util/OnFloatWindowTouchListener;", "onTouch", "", "event", "Landroid/view/MotionEvent;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements InterfaceC4380i {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FloatingWindowTouchUtils f34537a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FloatingWindowHelper f34538b;

        public b(FloatingWindowTouchUtils floatingWindowTouchUtils, FloatingWindowHelper floatingWindowHelper) {
            this.f34537a = floatingWindowTouchUtils;
            this.f34538b = floatingWindowHelper;
        }

        @Override // aq.InterfaceC4380i
        /* JADX INFO: renamed from: a */
        public void mo3923a(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f34537a.updateFloat(this.f34538b.f34532c, event, this.f34538b.m41209m(), this.f34538b.m41208l());
        }
    }

    public FloatingWindowHelper(@NotNull Context context, @NotNull WindowStatus config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f34530a = context;
        this.f34531b = config;
        this.f34534e = LazyKt.lazy(new Function0() { // from class: aq.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingWindowHelper.m41201p();
            }
        });
        this.f34535f = LazyKt.lazy(new Function0() { // from class: aq.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingWindowHelper.m41202v(this.f3772b);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final WindowManager.LayoutParams m41201p() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        return layoutParams;
    }

    /* JADX INFO: renamed from: v */
    public static final WindowManager m41202v(FloatingWindowHelper floatingWindowHelper) {
        Object systemService = floatingWindowHelper.f34530a.getSystemService(InterfaceC33953u5.f72199F);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* JADX INFO: renamed from: g */
    public final int m41203g() {
        try {
            FloatingWindowFrameLayout floatingWindowFrameLayout = this.f34532c;
            Integer numValueOf = floatingWindowFrameLayout != null ? Integer.valueOf(floatingWindowFrameLayout.getChildCount()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                if (numValueOf != null) {
                    return 1;
                }
            }
            FloatingWindowTouchUtils floatingWindowTouchUtils = new FloatingWindowTouchUtils(this.f34530a, this.f34531b);
            this.f34533d = floatingWindowTouchUtils;
            floatingWindowTouchUtils.setAnimationEndListener(new a());
            m41211o();
            return 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final WindowStatus getF34531b() {
        return this.f34531b;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final WindowStatus m41207k() {
        return this.f34531b;
    }

    /* JADX INFO: renamed from: l */
    public final WindowManager.LayoutParams m41208l() {
        return (WindowManager.LayoutParams) this.f34534e.getValue();
    }

    /* JADX INFO: renamed from: m */
    public final WindowManager m41209m() {
        return (WindowManager) this.f34535f.getValue();
    }

    /* JADX INFO: renamed from: q */
    public final void m41212q(@NotNull Function1<? super WindowStatus, WindowStatus> block, @NotNull Function1<? super WindowStatus, Unit> updataView) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(updataView, "updataView");
        this.f34531b = block.invoke(this.f34531b);
        if (m41218x()) {
            updataView.invoke(this.f34531b);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m41213r(@NotNull WindowStatus newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (newConfig.getFloatingView() == null) {
            return -1;
        }
        this.f34531b.m3941Q(newConfig.m3960s());
        this.f34531b.m3942R(newConfig.m3961t());
        this.f34531b.m3931G(newConfig.getFloatingView());
        this.f34531b.m3932H(newConfig.getOffsetPair());
        FloatingWindowTouchUtils floatingWindowTouchUtils = this.f34533d;
        if (floatingWindowTouchUtils != null) {
            return floatingWindowTouchUtils.updataFloatingView(newConfig);
        }
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public final void m41214s(int i11) {
        FloatingWindowFrameLayout floatingWindowFrameLayout;
        if (!this.f34531b.getIsShow() || this.f34531b.getIsAnim() || this.f34531b.getIsDrag() || (floatingWindowFrameLayout = this.f34532c) == null || floatingWindowFrameLayout == null) {
            return;
        }
        if (m41208l().x + i11 > m41209m().getDefaultDisplay().getWidth() / 2) {
            m41208l().x = m41209m().getDefaultDisplay().getWidth() - i11;
            m41209m().updateViewLayout(this.f34532c, m41208l());
        } else if (m41208l().x + i11 < m41209m().getDefaultDisplay().getWidth() / 2) {
            m41208l().x = 0;
            m41209m().updateViewLayout(this.f34532c, m41208l());
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m41215t() throws Throwable {
        Object objM103844constructorimpl;
        if (this.f34531b.getFloatingView() == null || this.f34531b.getIsShow()) {
            return;
        }
        if (this.f34531b.getIsAnim()) {
            this.f34531b.m3966y(1);
            return;
        }
        WindowManager.LayoutParams layoutParamsM41208l = m41208l();
        layoutParamsM41208l.x = this.f34531b.getOffsetPair().x;
        layoutParamsM41208l.y = this.f34531b.getOffsetPair().y;
        FloatingWindowFrameLayout floatingWindowFrameLayout = this.f34532c;
        if (floatingWindowFrameLayout != null) {
            boolean zM3900b = C4373b.m3900b();
            try {
                Result.Companion companion = Result.INSTANCE;
                m41205i();
                floatingWindowFrameLayout.addView(getF34531b().getFloatingView());
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (!zM3900b || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                    C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "MarketMonitor", false, null, 8, null), null, 2, null);
                }
            }
            m41209m().addView(this.f34532c, m41208l());
            this.f34531b.m3938N(true);
            Function1<WindowStatus, Unit> function1M3960s = this.f34531b.m3960s();
            if (function1M3960s != null) {
                function1M3960s.invoke(this.f34531b);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final int m41216u() {
        FloatingWindowFrameLayout floatingWindowFrameLayout = this.f34532c;
        if (floatingWindowFrameLayout != null) {
            floatingWindowFrameLayout.measure(0, 0);
        }
        FloatingWindowFrameLayout floatingWindowFrameLayout2 = this.f34532c;
        if (floatingWindowFrameLayout2 != null) {
            return floatingWindowFrameLayout2.getMeasuredHeight();
        }
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m41218x() {
        return this.f34531b.getIsShow();
    }

    /* JADX INFO: renamed from: h */
    public final int m41204h() {
        return m41209m().getDefaultDisplay().getHeight();
    }

    /* JADX INFO: renamed from: i */
    public final void m41205i() throws Throwable {
        Object objM103844constructorimpl;
        Unit unit;
        boolean zM3900b = C4373b.m3900b();
        try {
            Result.Companion companion = Result.INSTANCE;
            FloatingWindowFrameLayout floatingWindowFrameLayout = this.f34532c;
            if (floatingWindowFrameLayout != null) {
                if (floatingWindowFrameLayout.getChildCount() > 0) {
                    floatingWindowFrameLayout.removeAllViews();
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM3900b && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                    C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "MarketMonitor", false, null, 8, null), null, 2, null);
                    return;
                }
                return;
            }
            throw thM103847exceptionOrNullimpl;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m41210n() {
        WindowManager.LayoutParams layoutParamsM41208l = m41208l();
        layoutParamsM41208l.format = 1;
        layoutParamsM41208l.gravity = 8388659;
        layoutParamsM41208l.flags = 40;
        layoutParamsM41208l.width = -2;
        layoutParamsM41208l.height = -2;
    }

    /* JADX INFO: renamed from: o */
    public final void m41211o() {
        m41210n();
        WindowStatus windowStatus = this.f34531b;
        FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
        windowStatus.m3928D(floatingWindowConfigManager.m40730g().getDataUpdateIntervalTime());
        this.f34531b.m3939O(floatingWindowConfigManager.m40730g().getTextSizeMode());
        this.f34531b.m3935K(floatingWindowConfigManager.m40730g().getPagingMode());
        this.f34531b.m3934J(floatingWindowConfigManager.m40730g().getPageTurningTime());
        this.f34531b.m3933I(floatingWindowConfigManager.m40730g().getPageSize());
        this.f34531b.m3965x(floatingWindowConfigManager.m40730g().getActionBarShow());
        this.f34531b.m3927C(floatingWindowConfigManager.m40730g().getCurrencyNameShow());
        this.f34531b.m3937M(floatingWindowConfigManager.m40730g().getQuoteChangeShow());
        this.f34531b.m3936L(floatingWindowConfigManager.m40730g().getPriceShow());
        this.f34531b.m3940P(floatingWindowConfigManager.m40730g().getTheme());
        this.f34531b.m3929E(floatingWindowConfigManager.m40730g().getDisplayMode());
        this.f34531b.m3926B(floatingWindowConfigManager.m40730g().getAutoScrollTime());
        int floatingWindowBgAlpha = floatingWindowConfigManager.m40730g().getFloatingWindowBgAlpha();
        if (floatingWindowBgAlpha <= 0) {
            floatingWindowBgAlpha = 0;
        }
        this.f34531b.m3967z((floatingWindowBgAlpha * 255) / 100);
        FloatingWindowFrameLayout floatingWindowFrameLayout = new FloatingWindowFrameLayout(this.f34531b, this.f34530a, null, 0, 12, null);
        this.f34532c = floatingWindowFrameLayout;
        FloatingWindowTouchUtils floatingWindowTouchUtils = this.f34533d;
        if (floatingWindowTouchUtils != null) {
            floatingWindowFrameLayout.setTouchListener(new b(floatingWindowTouchUtils, this));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m41217w() throws Throwable {
        Object objM103844constructorimpl;
        boolean zM3900b = C4373b.m3900b();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (getF34531b().getIsShow()) {
                if (getF34531b().getIsAnim()) {
                    getF34531b().m3966y(0);
                } else {
                    getF34531b().m3938N(false);
                    FloatingWindowFrameLayout floatingWindowFrameLayout = this.f34532c;
                    if (floatingWindowFrameLayout != null) {
                        m41209m().removeView(floatingWindowFrameLayout);
                        m41205i();
                    }
                    getF34531b().m3931G(null);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            if (zM3900b && !(thM103847exceptionOrNullimpl instanceof CancellationException)) {
                if (!C42899b.m94075e(thM103847exceptionOrNullimpl)) {
                    C43846g.m96568c(new MarketMonitorException(thM103847exceptionOrNullimpl, "MarketMonitor", false, null, 8, null), null, 2, null);
                    return;
                }
                return;
            }
            throw thM103847exceptionOrNullimpl;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m41219y() {
        if (m41208l().x == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m41220z() {
        if (m41208l().y <= 0) {
            return true;
        }
        return false;
    }
}
