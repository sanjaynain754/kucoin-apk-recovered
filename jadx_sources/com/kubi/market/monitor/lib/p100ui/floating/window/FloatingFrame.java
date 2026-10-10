package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorMessage;
import com.kubi.market.monitor.lib.p100ui.floating.window.util.FloatWindowBuild;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleVBMviView;
import com.kubi.sdk.function.language.LanguageType;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import sl.C44518g;
import sl.C44519h;
import w00.C45682f;

/* JADX INFO: compiled from: FloatingFrame.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0017\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001SB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\tH\u0014J\b\u0010(\u001a\u00020\u001dH\u0014J\b\u0010)\u001a\u00020\u001dH\u0014J\b\u0010*\u001a\u00020\u001dH\u0002J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u0015H\u0002J\u0006\u0010-\u001a\u00020\u001dJ\u0006\u0010.\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u001dJ\u0006\u00100\u001a\u00020\u001dJ\u0006\u00101\u001a\u00020\u001dJ\u0006\u00102\u001a\u00020\u001dJ\u0006\u00103\u001a\u00020\u001dJ\u0006\u00104\u001a\u00020\u001dJ\u0006\u00105\u001a\u00020\u001dJ\u0006\u00106\u001a\u00020\u001dJ\u0006\u00107\u001a\u00020\u001dJ\u0016\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0015J\b\u0010;\u001a\u00020\u001dH\u0002J\u0016\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0015J\u000e\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u0015J\u0006\u0010D\u001a\u00020\u001dJ\u0006\u0010E\u001a\u00020\u001dJ\b\u0010I\u001a\u00020\u001dH\u0002J\b\u0010J\u001a\u00020\u001dH\u0002J\b\u0010K\u001a\u00020\u001dH\u0002J\u0016\u0010L\u001a\u00020\u00152\f\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NH\u0002J\b\u0010P\u001a\u00020\u001dH\u0002J\b\u0010Q\u001a\u00020\u001dH\u0002J\u0006\u0010R\u001a\u00020\u0015R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b \u0010!R\"\u0010#\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020%0$8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame;", "Lcom/kubi/mvi/state/SimpleVBMviView;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowState;", "Lcom/kubi/kucoin/market/monitor/lib/databinding/KucoinFloatingLayoutBinding;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kucoinFloatingHeadsetingLayoutBinding", "Lcom/kubi/kucoin/market/monitor/lib/databinding/KucoinFloatingHeadsetingLayoutBinding;", "getKucoinFloatingHeadsetingLayoutBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/KucoinFloatingHeadsetingLayoutBinding;", "kucoinFloatingHeadsetingLayoutBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setingView", "Landroid/view/View;", "isPauseViewState", "", "languageChangeListener", "com/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$languageChangeListener$1;", "floatingFrameViewManager", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager;", "initViewEd", "initView", "", "getLayout", "binding", "getBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/KucoinFloatingLayoutBinding;", "binding$delegate", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "bindState", "onDestroy", "initClickListener", "showLevitatingBall", "isShow", "pauseView", "recoverView", "updataDownTime", "setPageSize", "setTextSizeMode", "upPagingModeOrTurningTime", "showScrollOrExpand", "updataAutoScrollTime", "updataTheme", "updataItemViewStatus", "updataSetingLayoutStatus", "updataLevitatingBallBg", "moveStop", "isLeft", "updataBallBgAlphaDelayed", "updataBgAlphaDelayedRun", "Ljava/lang/Runnable;", "addOrRemoveSymbol", "symbol", "", "isAdd", "onBackgroundJobStartOrStop", "isStart", "upGreenValueChangeUpdatePage", "sortListData", "leftCornerRadii", "", "rightCornerRadii", "updtataLlexpandContentTheme", "setSetingViewImageResource", "updtataLevitatingBallTheme", "noDataViewGone", "newList", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "setNoDataViewTheme", "setNoDataViewTextSize", "noDataViewIsShow", "Companion", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingFrame.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,611:1\n41#2:612\n65#2:613\n80#2,7:614\n52#2:621\n80#2,7:622\n*S KotlinDebug\n*F\n+ 1 FloatingFrame.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame\n*L\n41#1:612\n41#1:613\n41#1:614,7\n75#1:621\n75#1:622,7\n*E\n"})
public final class FloatingFrame extends SimpleVBMviView<FloatingWindowState, C44519h> {

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC24293a f34429f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public View f34430g;

    /* JADX INFO: renamed from: h */
    public boolean f34431h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final FloatingFrame$languageChangeListener$1 f34432i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public FloatingFrameViewManager f34433j;

    /* JADX INFO: renamed from: k */
    public boolean f34434k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final InterfaceC24293a f34435l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Runnable f34436m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final float[] f34437n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final float[] f34438o;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f34428q = {Reflection.property1(new PropertyReference1Impl(FloatingFrame.class, "kucoinFloatingHeadsetingLayoutBinding", "getKucoinFloatingHeadsetingLayoutBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/KucoinFloatingHeadsetingLayoutBinding;", 0)), Reflection.property1(new PropertyReference1Impl(FloatingFrame.class, "binding", "getBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/KucoinFloatingLayoutBinding;", 0))};

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f34427p = new Companion(null);

    /* JADX INFO: compiled from: FloatingFrame.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$Companion;", "", "<init>", "()V", "TAG", "", "breadcrumbsInfo", "", "msg", "watchfloatingLogv", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFloatingFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingFrame.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$Companion\n+ 2 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,611:1\n55#2,2:612\n*S KotlinDebug\n*F\n+ 1 FloatingFrame.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$Companion\n*L\n608#1:612,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void breadcrumbsInfo(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            C43840a.m96550d(msg, "watchfloatingTag");
        }

        public final void watchfloatingLogv(@NotNull String msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            C43846g.m96568c(new MarketMonitorMessage(msg, "watchfloatingTag", true), null, 2, null);
        }
    }

    public /* synthetic */ FloatingFrame(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m40986S(FloatingFrame floatingFrame) {
        floatingFrame.m41006e0(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$languageChangeListener$1] */
    public FloatingFrame(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34429f = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44518g>() { // from class: com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44518g invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44518g.m98496a(C45682f.m100801b(viewGroup));
            }
        });
        this.f34432i = new MultiLanguageManager.a() { // from class: com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$languageChangeListener$1
            @Override // com.kubi.sdk.function.language.MultiLanguageManager.a
            public void onLanguageChange(LanguageType language) {
                Intrinsics.checkNotNullParameter(language, "language");
                C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f34439a), C42911a.m94121c(), null, new FloatingFrame$languageChangeListener$1$onLanguageChange$1(null), 2, null);
            }
        };
        this.f34435l = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44519h>() { // from class: com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44519h invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44519h.m98498a(C45682f.m100800a(viewGroup));
            }
        });
        this.f34436m = new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.z0
            @Override // java.lang.Runnable
            public final void run() {
                FloatingFrame.m40989m0(this.f34560b);
            }
        };
        this.f34437n = new float[]{0.0f, 0.0f, C5275i0.m6236a(20.0f), C5275i0.m6236a(20.0f), C5275i0.m6236a(20.0f), C5275i0.m6236a(20.0f), 0.0f, 0.0f};
        this.f34438o = new float[]{C5275i0.m6236a(20.0f), C5275i0.m6236a(20.0f), 0.0f, 0.0f, 0.0f, 0.0f, C5275i0.m6236a(20.0f), C5275i0.m6236a(20.0f)};
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m40987T() {
        FloatingActionManager.f34540a.m41333H0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m40988f0(boolean z11, FloatingFrame floatingFrame) {
        RelativeLayout relativeLayout;
        ImageView imageView;
        LinearLayout linearLayout;
        ImageView imageView2;
        ImageView imageView3;
        LinearLayout linearLayout2;
        if (z11) {
            C44519h binding = floatingFrame.getBinding();
            if (binding != null && (linearLayout2 = binding.f98664d) != null) {
                linearLayout2.setVisibility(8);
            }
            C44519h binding2 = floatingFrame.getBinding();
            if (binding2 != null && (imageView3 = binding2.f98663c) != null) {
                imageView3.setVisibility(0);
            }
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            floatingFrame.m41016p0(true, floatingActionManager.m41342O0());
            floatingFrame.m41019s0();
            FloatingFrameViewManager floatingFrameViewManager = floatingFrame.f34433j;
            if (floatingFrameViewManager != null) {
                floatingFrameViewManager.m41155Q();
            }
            floatingFrame.m42695w(new FloatingWindowContract$FloatingWindowIntent.PageStateIntent(1));
            floatingFrame.m41013l0();
            C44519h binding3 = floatingFrame.getBinding();
            if (binding3 != null) {
                binding3.f98662b.invalidate();
                binding3.f98663c.measure(0, 0);
                floatingActionManager.m41384r2(binding3.f98663c.getMeasuredWidth());
                return;
            }
            return;
        }
        C44519h binding4 = floatingFrame.getBinding();
        if (binding4 != null && (imageView2 = binding4.f98663c) != null) {
            imageView2.removeCallbacks(floatingFrame.f34436m);
        }
        C44519h binding5 = floatingFrame.getBinding();
        if (binding5 != null && (linearLayout = binding5.f98664d) != null) {
            linearLayout.setVisibility(0);
        }
        C44519h binding6 = floatingFrame.getBinding();
        if (binding6 != null && (imageView = binding6.f98663c) != null) {
            imageView.setVisibility(8);
        }
        floatingFrame.m41005d0();
        floatingFrame.m41020u0();
        C44519h binding7 = floatingFrame.getBinding();
        if (binding7 != null && (relativeLayout = binding7.f98662b) != null) {
            relativeLayout.invalidate();
        }
        FloatingFrameViewManager floatingFrameViewManager2 = floatingFrame.f34433j;
        if (floatingFrameViewManager2 != null) {
            floatingFrameViewManager2.m41158V();
        }
        floatingFrame.m42695w(new FloatingWindowContract$FloatingWindowIntent.PageStateIntent(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44518g getKucoinFloatingHeadsetingLayoutBinding() {
        return (C44518g) this.f34429f.getValue(this, f34428q[0]);
    }

    /* JADX INFO: renamed from: Q */
    public final void m40995Q(@NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        m42695w(new FloatingWindowContract$FloatingWindowIntent.AddOrRemoveDataIntent(symbol, z11));
    }

    /* JADX INFO: renamed from: W */
    public final void m40998W(boolean z11) {
        if (this.f34434k) {
            m42695w(new FloatingWindowContract$FloatingWindowIntent.AppBackgroundPollingMonitor(z11));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m41000Y() {
        ImageView imageView;
        if (this.f34431h) {
            this.f34431h = false;
            C44519h binding = getBinding();
            if (binding == null || (imageView = binding.f98663c) == null || imageView.getVisibility() != 0) {
                FloatingFrameViewManager floatingFrameViewManager = this.f34433j;
                if (floatingFrameViewManager != null) {
                    floatingFrameViewManager.m41158V();
                }
                m42695w(new FloatingWindowContract$FloatingWindowIntent.PageStateIntent(6));
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m41004c0() {
        ImageView imageView;
        ImageView imageView2;
        View view = this.f34430g;
        if (view == null || view.getVisibility() != 0 || this.f34430g == null) {
            return;
        }
        C44518g kucoinFloatingHeadsetingLayoutBinding = getKucoinFloatingHeadsetingLayoutBinding();
        if (kucoinFloatingHeadsetingLayoutBinding != null && (imageView2 = kucoinFloatingHeadsetingLayoutBinding.f98660c) != null) {
            imageView2.setImageResource(FloatingActionManager.f34540a.m41332G0());
        }
        C44518g kucoinFloatingHeadsetingLayoutBinding2 = getKucoinFloatingHeadsetingLayoutBinding();
        if (kucoinFloatingHeadsetingLayoutBinding2 == null || (imageView = kucoinFloatingHeadsetingLayoutBinding2.f98659b) == null) {
            return;
        }
        imageView.setImageResource(FloatingActionManager.f34540a.m41329E0());
    }

    @Override // com.kubi.mvi.state.SimpleVBMviView
    @Nullable
    public C44519h getBinding() {
        return (C44519h) this.f34435l.getValue(this, f34428q[1]);
    }

    @Override // com.kubi.mvi.view.LifecycleView
    public int getLayout() {
        return R$layout.kucoin_floating_layout;
    }

    @Override // com.kubi.mvi.view.MviView
    @NotNull
    public KClass<? extends AbstractC19290l<FloatingWindowState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(FloatingWindowVM.class);
    }

    @Override // com.kubi.mvi.view.MviView, com.kubi.mvi.view.LifecycleView
    /* JADX INFO: renamed from: h */
    public void mo41008h() {
        ImageView imageView;
        FloatingActionManager.m41292k0(FloatingActionManager.f34540a, "onDestroy()", null, 2, null);
        m42695w(new FloatingWindowContract$FloatingWindowIntent.OnDestroyIntent());
        C44519h binding = getBinding();
        if (binding != null && (imageView = binding.f98663c) != null) {
            imageView.removeCallbacks(this.f34436m);
        }
        MultiLanguageManager.f46805a.removeOnLanguageChangeListener(this.f34432i);
        m40998W(false);
        FloatingFrameViewManager floatingFrameViewManager = this.f34433j;
        if (floatingFrameViewManager != null) {
            floatingFrameViewManager.m41180w();
        }
        super.mo41008h();
        this.f34434k = false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m41009h0() {
        m42695w(new FloatingWindowContract$FloatingWindowIntent.SortListDataIntent());
    }

    /* JADX INFO: renamed from: i0 */
    public final void m41010i0() {
        FloatingFrameViewManager floatingFrameViewManager;
        ImageView imageView;
        if (this.f34434k) {
            C44519h binding = getBinding();
            if ((binding != null && (imageView = binding.f98663c) != null && imageView.getVisibility() == 0) || m40997V() || (floatingFrameViewManager = this.f34433j) == null) {
                return;
            }
            floatingFrameViewManager.m41169l0();
        }
    }

    /* JADX INFO: renamed from: R */
    private final void m40985R() {
        TextView textView;
        ImageView imageView;
        C44519h binding = getBinding();
        if (binding != null && (imageView = binding.f98663c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingFrame.m40986S(this.f34552b);
                }
            }, 1, null);
        }
        C44519h binding2 = getBinding();
        if (binding2 != null && (textView = binding2.f98665e) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.y0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FloatingFrame.m40987T();
                }
            }, 1, null);
        }
        MultiLanguageManager.f46805a.addOnLanguageChangeListener(this.f34432i);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m40989m0(FloatingFrame floatingFrame) {
        ImageView imageView;
        C44519h binding;
        ImageView imageView2;
        Drawable background;
        C44519h binding2 = floatingFrame.getBinding();
        if (binding2 != null && (imageView = binding2.f98663c) != null && imageView.getVisibility() == 0) {
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            if (floatingActionManager.m41340M0() && (binding = floatingFrame.getBinding()) != null && (imageView2 = binding.f98663c) != null && (background = imageView2.getBackground()) != null && (background instanceof GradientDrawable)) {
                ((GradientDrawable) background).setAlpha(floatingActionManager.m41391w0());
                floatingFrame.postInvalidate();
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m40990t0(FloatingFrame floatingFrame) {
        ImageView imageView;
        ImageView imageView2;
        Drawable background;
        ImageView imageView3;
        C44519h binding = floatingFrame.getBinding();
        if (binding != null && (imageView = binding.f98663c) != null && imageView.getVisibility() == 0) {
            C44519h binding2 = floatingFrame.getBinding();
            if (binding2 != null && (imageView3 = binding2.f98663c) != null) {
                imageView3.setImageResource(FloatWindowBuild.f34525a.getLevitatingBallIcon());
            }
            C44519h binding3 = floatingFrame.getBinding();
            if (binding3 != null && (imageView2 = binding3.f98663c) != null && (background = imageView2.getBackground()) != null && (background instanceof GradientDrawable)) {
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
                gradientDrawable.setColor(floatingActionManager.m41380q0());
                gradientDrawable.setAlpha(floatingActionManager.m41377p0());
                floatingFrame.postInvalidate();
                floatingFrame.m41013l0();
            }
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m40991v0(FloatingFrame floatingFrame) {
        LinearLayout linearLayout;
        FloatingFrameViewManager floatingFrameViewManager;
        LinearLayout linearLayout2;
        Drawable background;
        C44519h binding = floatingFrame.getBinding();
        if (binding != null && (linearLayout = binding.f98664d) != null && linearLayout.getVisibility() == 0) {
            C44519h binding2 = floatingFrame.getBinding();
            if (binding2 != null && (linearLayout2 = binding2.f98664d) != null && (background = linearLayout2.getBackground()) != null && (background instanceof GradientDrawable)) {
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
                gradientDrawable.setColor(floatingActionManager.m41380q0());
                gradientDrawable.setAlpha(floatingActionManager.m41377p0());
                floatingFrame.postInvalidate();
            }
            floatingFrame.m41004c0();
            if (!floatingFrame.m40997V() && (floatingFrameViewManager = floatingFrame.f34433j) != null) {
                floatingFrameViewManager.m41171n0();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final boolean m40996U(List<StateTradeItemBean> list) {
        boolean zM41148F;
        ViewGroup.LayoutParams layoutParams;
        TextView textView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        boolean zIsEmpty = list.isEmpty();
        FloatingFrameViewManager floatingFrameViewManager = this.f34433j;
        if (floatingFrameViewManager != null) {
            zM41148F = floatingFrameViewManager.getF34513e();
        } else {
            zM41148F = true;
        }
        if (!zIsEmpty) {
            C44519h binding = getBinding();
            if (binding != null && (textView4 = binding.f98665e) != null && textView4.getVisibility() == 8 && !zM41148F) {
                return false;
            }
            C44519h binding2 = getBinding();
            if (binding2 != null && (textView3 = binding2.f98665e) != null) {
                textView3.setVisibility(8);
            }
            FloatingFrameViewManager floatingFrameViewManager2 = this.f34433j;
            if (floatingFrameViewManager2 != null) {
                floatingFrameViewManager2.m41145C0(false);
            }
            return true;
        }
        C44519h binding3 = getBinding();
        if (binding3 != null && (textView2 = binding3.f98665e) != null && textView2.getVisibility() == 0 && zM41148F) {
            return false;
        }
        C44519h binding4 = getBinding();
        if (binding4 != null && (linearLayout2 = binding4.f98664d) != null) {
            layoutParams = linearLayout2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = FloatingActionManager.m41313u0(FloatingActionManager.f34540a, true, false, false, 6, null);
        }
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        C44519h binding5 = getBinding();
        if (binding5 != null && (linearLayout = binding5.f98664d) != null) {
            linearLayout.setLayoutParams(layoutParams);
        }
        C44519h binding6 = getBinding();
        if (binding6 != null && (textView = binding6.f98665e) != null) {
            textView.setVisibility(0);
        }
        FloatingFrameViewManager floatingFrameViewManager3 = this.f34433j;
        if (floatingFrameViewManager3 != null) {
            floatingFrameViewManager3.m41145C0(true);
        }
        m41002a0();
        m41001Z();
        FloatingFrameViewManager floatingFrameViewManager4 = this.f34433j;
        if (floatingFrameViewManager4 != null) {
            floatingFrameViewManager4.m41155Q();
        }
        FloatingFrameViewManager floatingFrameViewManager5 = this.f34433j;
        if (floatingFrameViewManager5 != null) {
            floatingFrameViewManager5.m41170m0(CollectionsKt.emptyList());
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m40997V() {
        TextView textView;
        C44519h binding = getBinding();
        if (binding == null || (textView = binding.f98665e) == null || textView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: X */
    public final void m40999X() {
        ImageView imageView;
        C44519h binding = getBinding();
        if (binding != null && (imageView = binding.f98663c) != null && imageView.getVisibility() == 0) {
            return;
        }
        this.f34431h = true;
        FloatingFrameViewManager floatingFrameViewManager = this.f34433j;
        if (floatingFrameViewManager != null) {
            floatingFrameViewManager.m41155Q();
        }
        m42695w(new FloatingWindowContract$FloatingWindowIntent.PageStateIntent(5));
    }

    /* JADX INFO: renamed from: Z */
    public final void m41001Z() {
        C44519h binding;
        TextView textView;
        TextView textView2;
        C44519h binding2 = getBinding();
        if ((binding2 == null || (textView2 = binding2.f98665e) == null || textView2.getVisibility() != 8) && (binding = getBinding()) != null && (textView = binding.f98665e) != null) {
            textView.setTextSize(FloatingActionManager.f34540a.m41324A0());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m41002a0() {
        C44519h binding;
        TextView textView;
        TextView textView2;
        C44519h binding2 = getBinding();
        if ((binding2 == null || (textView2 = binding2.f98665e) == null || textView2.getVisibility() != 8) && (binding = getBinding()) != null && (textView = binding.f98665e) != null) {
            textView.setTextColor(FloatingActionManager.f34540a.m41383r1());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m41003b0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$setPageSize$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m41005d0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$setTextSizeMode$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m41006e0(final boolean z11) {
        RelativeLayout relativeLayout;
        C44519h binding = getBinding();
        if (binding != null && (relativeLayout = binding.f98662b) != null) {
            relativeLayout.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.a1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrame.m40988f0(z11, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m41007g0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$showScrollOrExpand$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m41011j0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$upPagingModeOrTurningTime$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m41012k0() {
        LinearLayout linearLayout;
        FloatingFrameViewManager floatingFrameViewManager;
        C44519h binding = getBinding();
        if (binding != null && (linearLayout = binding.f98664d) != null && linearLayout.getVisibility() == 0 && !m40997V() && (floatingFrameViewManager = this.f34433j) != null) {
            floatingFrameViewManager.m41168k0();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m41013l0() {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        C44519h binding = getBinding();
        if (binding != null && (imageView = binding.f98663c) != null && imageView.getVisibility() == 0 && FloatingActionManager.f34540a.m41340M0()) {
            C44519h binding2 = getBinding();
            if (binding2 != null && (imageView3 = binding2.f98663c) != null) {
                imageView3.removeCallbacks(this.f34436m);
            }
            C44519h binding3 = getBinding();
            if (binding3 != null && (imageView2 = binding3.f98663c) != null) {
                imageView2.postDelayed(this.f34436m, 5000L);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m41014n0() {
        LinearLayout linearLayout;
        C44519h binding = getBinding();
        if (binding == null || (linearLayout = binding.f98664d) == null || linearLayout.getVisibility() != 0 || m40997V()) {
            return;
        }
        m42695w(new FloatingWindowContract$FloatingWindowIntent.DataUpdateIntervalTimeIntent());
    }

    /* JADX INFO: renamed from: o0 */
    public final void m41015o0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$updataItemViewStatus$1(this, null), 2, null);
    }

    @Override // com.kubi.mvi.view.MviView
    /* JADX INFO: renamed from: p */
    public void mo40902p() {
        super.mo40902p();
        m42693q(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$bindState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((FloatingWindowState) obj).getDataList();
            }
        }, new FloatingFrame$bindState$2(this, null));
        m42693q(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$bindState$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Integer.valueOf(((FloatingWindowState) obj).getPageSize());
            }
        }, new FloatingFrame$bindState$4(this, null));
    }

    /* JADX INFO: renamed from: p0 */
    public final void m41016p0(boolean z11, boolean z12) {
        ImageView imageView;
        C44519h binding;
        ImageView imageView2;
        Drawable background;
        ImageView imageView3;
        C44519h binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.f98663c) != null && imageView.getVisibility() == 0 && z11 && (binding = getBinding()) != null && (imageView2 = binding.f98663c) != null && (background = imageView2.getBackground()) != null && (background instanceof GradientDrawable)) {
            C44519h binding3 = getBinding();
            if (binding3 != null && (imageView3 = binding3.f98663c) != null) {
                imageView3.removeCallbacks(this.f34436m);
            }
            if (z12) {
                ((GradientDrawable) background).setCornerRadii(this.f34437n);
            } else {
                ((GradientDrawable) background).setCornerRadii(this.f34438o);
            }
            m41013l0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m41017q0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$updataSetingLayoutStatus$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m41018r0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94121c(), null, new FloatingFrame$updataTheme$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m41019s0() {
        ImageView imageView;
        C44519h binding = getBinding();
        if (binding != null && (imageView = binding.f98663c) != null) {
            imageView.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.b1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrame.m40990t0(this.f34462b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m41020u0() {
        LinearLayout linearLayout;
        C44519h binding = getBinding();
        if (binding != null && (linearLayout = binding.f98664d) != null) {
            linearLayout.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.c1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrame.m40991v0(this.f34470b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.view.MviView
    /* JADX INFO: renamed from: v */
    public void mo40903v() {
        super.mo40903v();
        this.f34434k = true;
        m40985R();
        m42695w(new FloatingWindowContract$FloatingWindowIntent.InitFloating());
    }
}
