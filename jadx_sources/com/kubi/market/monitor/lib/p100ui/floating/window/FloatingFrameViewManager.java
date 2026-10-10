package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.C4373b;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.market.monitor.lib.entity.FloatingItemMeasureInfo;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.exeption.MarketMonitorException;
import com.kubi.market.monitor.lib.p100ui.floating.view.FloatingWindowRecyclerView;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27046k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.u1, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingFrameViewManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b'\n\u0002\b\f*\u0001S\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0+J\b\u0010,\u001a\u00020(H\u0002J\u0006\u0010-\u001a\u00020(J\u000e\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\bJ\u0006\u00100\u001a\u00020\bJ\u0014\u00101\u001a\u00020(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0+J\u0006\u00102\u001a\u00020(J\u0006\u00103\u001a\u00020(J\u0006\u00104\u001a\u00020(J\u0006\u00105\u001a\u00020(J\u0006\u00106\u001a\u00020(J\u0006\u00107\u001a\u00020(J\u0006\u00108\u001a\u00020(J\u0006\u00109\u001a\u00020(J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0002J\b\u0010<\u001a\u00020(H\u0002J\b\u0010=\u001a\u00020(H\u0002J\b\u0010>\u001a\u00020(H\u0002J\b\u0010?\u001a\u00020(H\u0002J\u0010\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0004H\u0002J\u0010\u0010B\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0004H\u0002J\u0010\u0010C\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0004H\u0002J\b\u0010D\u001a\u00020(H\u0002J\b\u0010E\u001a\u00020(H\u0002J\u0010\u0010#\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0004H\u0002J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002J\b\u0010H\u001a\u00020(H\u0002J\b\u0010I\u001a\u00020(H\u0002J\u001a\u0010J\u001a\u00020(2\u0006\u0010K\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020\u0004H\u0002J\u001a\u0010M\u001a\u00020(2\u0006\u0010K\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020\u0004H\u0002J\b\u0010N\u001a\u00020(H\u0002J\u001c\u0010O\u001a\u00020(2\b\b\u0002\u0010K\u001a\u00020\u00042\b\b\u0002\u0010L\u001a\u00020\u0004H\u0002J\b\u0010P\u001a\u00020\bH\u0002J\u0006\u0010U\u001a\u00020(J\u0006\u0010V\u001a\u00020(J\b\u0010W\u001a\u00020(H\u0002J\b\u0010X\u001a\u00020\bH\u0002J\b\u0010Z\u001a\u00020(H\u0002J\b\u0010[\u001a\u00020(H\u0002J\b\u0010\\\u001a\u00020(H\u0002J\u0010\u0010]\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0004H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0004\n\u0002\u0010TR\u000e\u0010Y\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager;", "", "getSettingViewHeight", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "initListViewEd", "", "cacheListData", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "mRootView", "Landroid/widget/LinearLayout;", "isGoneViewStatus", "pagingViewLayout", "Landroid/view/View;", "kotlin.jvm.PlatformType", "getPagingViewLayout", "()Landroid/view/View;", "pagingViewLayout$delegate", "Lkotlin/Lazy;", "pagingPageAdapter", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingPageAdapter;", "getPagingPageAdapter", "()Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingPageAdapter;", "pagingPageAdapter$delegate", "scrollAdapter", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter;", "getScrollAdapter", "()Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingPagingItemAdapter;", "scrollAdapter$delegate", "updateAdapterStart", "pagerLayout", "Lcom/kubi/market/monitor/lib/ui/floating/view/FloatingWindowRecyclerView;", "paginationIndicator", "Landroid/widget/FrameLayout;", "tvPageNumber", "Landroid/widget/TextView;", "initView", "", "rootView", "data", "", "initChildView", "destroyView", "updateViewGoneStatus", "gone", "isViewStatusGone", "updateCacheListData", "updateSpanRow", "updateTextSizeMode", "updatePagingModeOrTurningTime", "updataAutoScrollTime", "updataItemViewStatus", "updateFloatingViewTheme", "setingAtionBarStatusChange", "switchMode", "setPagerLayoutViewVisible", "setScrollView", "setpPagingView", "updateScrollViewData", "updatePagingViewData", "setAdapterCallBack", "adapterCallBackElseLogv", ViewProps.POSITION, "scrollNotifyPositionItem", "turnPageNotifyPositionItem", "updatePagingModeViewMaxHeight", "initPaginationIndicator", "pageIndicationIconClick", "updatePageIndicationTheme", "setDividerColor", "setPageIndicationIcon", "updatePagingLayoutParams", "viewWidth", "viewHeight", "updateRootViewLayoutParams", "reductionRootViewLayoutParams", "updatePagerLayoutParams", "isRtl", "whatTurnPageOrScroll", "mHandler", "com/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager$mHandler$1", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager$mHandler$1;", "removeTurnPageOrScrollMessage", "sendTurnPageOrScrollMessage", "updatePageEdSendMessage", "isTurnPageOrScrollIng", "pageNumber", "scrollToPosition", "nextTurnPagecSroll", "previousPage", "pagingPageUpdateRootViewLayoutParams", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingFrameViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingFrameViewManager.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 MarketMonitorIssue.kt\ncom/kubi/market/monitor/lib/exeption/MarketMonitorIssueKt\n*L\n1#1,850:1\n63#2,6:851\n69#2,8:858\n78#2:870\n63#2,6:871\n69#2,8:878\n78#2:890\n34#3:857\n34#3:877\n45#4,4:866\n45#4,4:886\n*S KotlinDebug\n*F\n+ 1 FloatingFrameViewManager.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager\n*L\n102#1:851,6\n102#1:858,8\n102#1:870\n299#1:871,6\n299#1:878,8\n299#1:890\n103#1:857\n300#1:877\n102#1:866,4\n299#1:886,4\n*E\n"})
public final class FloatingFrameViewManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function0<Integer> f34509a;

    /* JADX INFO: renamed from: b */
    public boolean f34510b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<StateTradeItemBean> f34511c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public LinearLayout f34512d;

    /* JADX INFO: renamed from: e */
    public boolean f34513e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f34514f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f34515g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f34516h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f34517i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public FloatingWindowRecyclerView f34518j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public FrameLayout f34519k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public TextView f34520l;

    /* JADX INFO: renamed from: m */
    public final int f34521m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final a f34522n;

    /* JADX INFO: renamed from: o */
    public int f34523o;

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.u1$a */
    /* JADX INFO: compiled from: FloatingFrameViewManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/window/FloatingFrameViewManager$mHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == FloatingFrameViewManager.this.f34521m) {
                if (FloatingActionManager.f34540a.m41367h0()) {
                    FloatingFrameViewManager.this.m41157U();
                } else {
                    FloatingFrameViewManager.this.m41149G();
                }
                FloatingFrameViewManager.this.m41158V();
            }
        }
    }

    public FloatingFrameViewManager(@NotNull Function0<Integer> getSettingViewHeight) {
        Intrinsics.checkNotNullParameter(getSettingViewHeight, "getSettingViewHeight");
        this.f34509a = getSettingViewHeight;
        this.f34511c = new ArrayList();
        this.f34513e = true;
        this.f34514f = LazyKt.lazy(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.i1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingFrameViewManager.m41110N();
            }
        });
        this.f34515g = LazyKt.lazy(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.l1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingFrameViewManager.m41109L();
            }
        });
        this.f34516h = LazyKt.lazy(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.m1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingFrameViewManager.m41111R();
            }
        });
        m41150H();
        m41159W();
        this.f34521m = 3;
        this.f34522n = new a(Looper.getMainLooper());
        this.f34523o = 1;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m41107I(FloatingFrameViewManager floatingFrameViewManager) {
        if (FloatingActionManager.f34540a.m41350V0()) {
            floatingFrameViewManager.m41153O();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m41108J(FloatingFrameViewManager floatingFrameViewManager) {
        if (FloatingActionManager.f34540a.m41350V0()) {
            floatingFrameViewManager.m41149G();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final FloatingPagingPageAdapter m41109L() {
        return new FloatingPagingPageAdapter();
    }

    /* JADX INFO: renamed from: N */
    public static final View m41110N() {
        return LayoutInflater.from(BaseApplication.INSTANCE.get()).inflate(R$layout.kucoin_floating_paging_layout, (ViewGroup) null);
    }

    /* JADX INFO: renamed from: R */
    public static final FloatingPagingItemAdapter m41111R() {
        return new FloatingPagingItemAdapter();
    }

    /* JADX INFO: renamed from: T */
    public static final void m41112T(int i11, FloatingFrameViewManager floatingFrameViewManager) {
        FloatingItemMeasureInfo floatingItemMeasureInfoM41401h;
        if (FloatingActionManager.f34540a.m41367h0()) {
            if (i11 >= 0 && i11 < floatingFrameViewManager.m41185z().getItemCount() && (floatingItemMeasureInfoM41401h = floatingFrameViewManager.m41185z().m41401h(i11)) != null) {
                floatingFrameViewManager.m41174q0(floatingItemMeasureInfoM41401h.getMeasuredWidth(), floatingItemMeasureInfoM41401h.getMeasuredHeight());
            }
            floatingFrameViewManager.m41185z().m41402i(i11);
        }
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m41113X(final FloatingFrameViewManager floatingFrameViewManager, final int i11, final int i12, final int i13) {
        if (!floatingFrameViewManager.f34517i) {
            return Unit.INSTANCE;
        }
        LinearLayout linearLayout = floatingFrameViewManager.f34512d;
        if (linearLayout != null) {
            linearLayout.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.k1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrameViewManager.m41114Y(this.f34489b, i11, i12, i13);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m41114Y(FloatingFrameViewManager floatingFrameViewManager, int i11, int i12, int i13) {
        RecyclerView.LayoutManager layoutManager;
        int i14;
        if (floatingFrameViewManager.f34517i) {
            if (i11 == 0 && ((i14 = floatingFrameViewManager.f34523o) == 1 || i14 == 0)) {
                floatingFrameViewManager.m41142B();
                floatingFrameViewManager.m41177u0();
                floatingFrameViewManager.f34523o = 1;
                floatingFrameViewManager.m41175s0(i12, i13);
                FloatingWindowRecyclerView floatingWindowRecyclerView = floatingFrameViewManager.f34518j;
                layoutManager = floatingWindowRecyclerView != null ? floatingWindowRecyclerView.getLayoutManager() : null;
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPosition(0);
                floatingFrameViewManager.m41167i0(0);
                floatingFrameViewManager.m41172o0();
                floatingFrameViewManager.f34517i = false;
                return;
            }
            if (i11 > 0) {
                int i15 = floatingFrameViewManager.f34523o;
                if (i11 == i15 - 1) {
                    floatingFrameViewManager.m41151K(i15);
                    floatingFrameViewManager.m41175s0(i12, i13);
                    FloatingWindowRecyclerView floatingWindowRecyclerView2 = floatingFrameViewManager.f34518j;
                    layoutManager = floatingWindowRecyclerView2 != null ? floatingWindowRecyclerView2.getLayoutManager() : null;
                    Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    ((LinearLayoutManager) layoutManager).scrollToPosition(i11);
                    floatingFrameViewManager.m41167i0(i11);
                    floatingFrameViewManager.m41172o0();
                    floatingFrameViewManager.f34517i = false;
                    return;
                }
            }
            if (floatingFrameViewManager.f34523o <= floatingFrameViewManager.m41182x().getItemCount()) {
                floatingFrameViewManager.m41178v(i11);
                return;
            }
            if (floatingFrameViewManager.m41182x().getItemCount() == 1) {
                FrameLayout frameLayout = floatingFrameViewManager.f34519k;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                floatingFrameViewManager.m41177u0();
            }
            int itemCount = floatingFrameViewManager.m41182x().getItemCount();
            floatingFrameViewManager.f34523o = itemCount;
            floatingFrameViewManager.m41151K(itemCount);
            floatingFrameViewManager.m41175s0(i12, i13);
            FloatingWindowRecyclerView floatingWindowRecyclerView3 = floatingFrameViewManager.f34518j;
            layoutManager = floatingWindowRecyclerView3 != null ? floatingWindowRecyclerView3.getLayoutManager() : null;
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(i11);
            floatingFrameViewManager.m41167i0(i11);
            floatingFrameViewManager.m41172o0();
            floatingFrameViewManager.f34517i = false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m41115Z(final FloatingFrameViewManager floatingFrameViewManager, final int i11, final int i12, final int i13) {
        if (!floatingFrameViewManager.f34517i) {
            return Unit.INSTANCE;
        }
        LinearLayout linearLayout = floatingFrameViewManager.f34512d;
        if (linearLayout != null) {
            linearLayout.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.j1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrameViewManager.m41117a0(this.f34484b, i11, i12, i13);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m41117a0(FloatingFrameViewManager floatingFrameViewManager, int i11, int i12, int i13) {
        RecyclerView.LayoutManager layoutManager;
        int i14;
        if (floatingFrameViewManager.f34517i) {
            if (i11 == 0 && ((i14 = floatingFrameViewManager.f34523o) == 1 || i14 == 0)) {
                floatingFrameViewManager.m41177u0();
                floatingFrameViewManager.m41174q0(i12, i13);
                floatingFrameViewManager.f34523o = 1;
                FloatingWindowRecyclerView floatingWindowRecyclerView = floatingFrameViewManager.f34518j;
                layoutManager = floatingWindowRecyclerView != null ? floatingWindowRecyclerView.getLayoutManager() : null;
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPosition(0);
                floatingFrameViewManager.m41156S(0);
                floatingFrameViewManager.m41172o0();
                floatingFrameViewManager.f34517i = false;
                return;
            }
            if (i11 > 0 && i11 == floatingFrameViewManager.f34523o - 1) {
                floatingFrameViewManager.m41177u0();
                floatingFrameViewManager.m41174q0(i12, i13);
                FloatingWindowRecyclerView floatingWindowRecyclerView2 = floatingFrameViewManager.f34518j;
                layoutManager = floatingWindowRecyclerView2 != null ? floatingWindowRecyclerView2.getLayoutManager() : null;
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPosition(i11);
                floatingFrameViewManager.m41156S(i11);
                floatingFrameViewManager.m41172o0();
                floatingFrameViewManager.f34517i = false;
                return;
            }
            if (floatingFrameViewManager.f34523o < floatingFrameViewManager.m41185z().getItemCount()) {
                floatingFrameViewManager.m41178v(i11);
                return;
            }
            floatingFrameViewManager.m41177u0();
            floatingFrameViewManager.m41174q0(i12, i13);
            floatingFrameViewManager.f34523o = floatingFrameViewManager.m41185z().getItemCount();
            FloatingWindowRecyclerView floatingWindowRecyclerView3 = floatingFrameViewManager.f34518j;
            layoutManager = floatingWindowRecyclerView3 != null ? floatingWindowRecyclerView3.getLayoutManager() : null;
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(i11);
            floatingFrameViewManager.m41156S(i11);
            floatingFrameViewManager.m41172o0();
            floatingFrameViewManager.f34517i = false;
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m41127j0(FloatingFrameViewManager floatingFrameViewManager, int i11) {
        if (FloatingActionManager.f34540a.m41367h0()) {
            return;
        }
        floatingFrameViewManager.m41152M(i11);
        floatingFrameViewManager.m41182x().m41413l(i11);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m41136r0(FloatingFrameViewManager floatingFrameViewManager, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = -2;
        }
        if ((i13 & 2) != 0) {
            i12 = -2;
        }
        floatingFrameViewManager.m41174q0(i11, i12);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m41140x0(FloatingFrameViewManager floatingFrameViewManager, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = -2;
        }
        floatingFrameViewManager.m41181w0(i11, i12);
    }

    /* JADX INFO: renamed from: B */
    public final void m41142B() {
        FrameLayout frameLayout = this.f34519k;
        if (frameLayout != null) {
            frameLayout.setVisibility((m41182x().getItemCount() <= 1 || !FloatingActionManager.f34540a.m41350V0()) ? 8 : 0);
        }
        m41173p0();
        m41151K(1);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m41143B0() {
        if (this.f34513e) {
            return;
        }
        if (FloatingActionManager.f34540a.m41367h0()) {
            this.f34517i = true;
            m41185z().notifyDataSetChanged();
        } else {
            this.f34517i = true;
            m41182x().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m41144C(@NotNull LinearLayout rootView, @NotNull List<StateTradeItemBean> data) throws Throwable {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f34510b) {
            return;
        }
        this.f34510b = true;
        this.f34512d = rootView;
        m41141A();
        this.f34511c.clear();
        this.f34511c.addAll(data);
        m41162d0();
        FloatingActionManager.f34540a.m41349U0("setFloatingPageNewData", data);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m41145C0(boolean z11) {
        Object objM103844constructorimpl;
        LinearLayout linearLayout = this.f34512d;
        if (linearLayout != null) {
            if (!z11) {
                m41162d0();
                return;
            }
            boolean zM3900b = C4373b.m3900b();
            try {
                Result.Companion companion = Result.INSTANCE;
                View viewM41183y = m41183y();
                Intrinsics.checkNotNullExpressionValue(viewM41183y, "access$getPagingViewLayout(...)");
                if (linearLayout.indexOfChild(viewM41183y) != -1) {
                    linearLayout.removeView(m41183y());
                }
                this.f34513e = true;
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
            Result.m103843boximpl(objM103844constructorimpl);
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m41146D() {
        LinearLayout linearLayout = this.f34512d;
        return linearLayout != null && linearLayout.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m41147E() {
        return this.f34522n.hasMessages(this.f34521m);
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getF34513e() {
        return this.f34513e;
    }

    /* JADX INFO: renamed from: K */
    public final void m41151K(int i11) {
        TextView textView;
        StringBuilder sb2;
        StringBuilder sb3;
        FrameLayout frameLayout = this.f34519k;
        if ((frameLayout == null || frameLayout.getVisibility() != 8) && (textView = this.f34520l) != null) {
            String strValueOf = String.valueOf(i11);
            if (m41146D()) {
                sb2 = new StringBuilder();
                sb2.append(m41182x().getItemCount());
                sb2.append("/");
            } else {
                sb2 = new StringBuilder();
                sb2.append("/");
                sb2.append(m41182x().getItemCount());
            }
            String string = sb2.toString();
            if (m41146D()) {
                sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(strValueOf);
            } else {
                sb3 = new StringBuilder();
                sb3.append(strValueOf);
                sb3.append(string);
            }
            String string2 = sb3.toString();
            SpannableString spannableString = new SpannableString(string2);
            int iIndexOf$default = m41146D() ? 0 : StringsKt.indexOf$default((CharSequence) string2, "/", 0, false, 6, (Object) null);
            int length = string.length() + iIndexOf$default;
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            textView.setTextColor(floatingActionManager.m41383r1());
            spannableString.setSpan(new ForegroundColorSpan(floatingActionManager.m41378p1()), iIndexOf$default, length, 17);
            textView.setText(spannableString);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m41152M(int i11) {
        FloatingItemMeasureInfo floatingItemMeasureInfoM41412k;
        if (FloatingActionManager.f34540a.m41367h0() || (floatingItemMeasureInfoM41412k = m41182x().m41412k(i11)) == null) {
            return;
        }
        m41175s0(floatingItemMeasureInfoM41412k.getMeasuredWidth(), floatingItemMeasureInfoM41412k.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: P */
    public final void m41154P() {
        LinearLayout linearLayout = this.f34512d;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        LinearLayout linearLayout2 = this.f34512d;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m41155Q() {
        this.f34522n.removeMessages(this.f34521m);
    }

    /* JADX INFO: renamed from: S */
    public final void m41156S(final int i11) {
        FloatingWindowRecyclerView floatingWindowRecyclerView;
        if (FloatingActionManager.f34540a.m41367h0() && (floatingWindowRecyclerView = this.f34518j) != null) {
            floatingWindowRecyclerView.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.o1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrameViewManager.m41112T(i11, this);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m41162d0() throws Throwable {
        Object objM103844constructorimpl;
        LinearLayout linearLayout = this.f34512d;
        if (linearLayout != null) {
            boolean zM3900b = C4373b.m3900b();
            try {
                Result.Companion companion = Result.INSTANCE;
                View viewM41183y = m41183y();
                Intrinsics.checkNotNullExpressionValue(viewM41183y, "access$getPagingViewLayout(...)");
                if (linearLayout.indexOfChild(viewM41183y) != -1) {
                    linearLayout.removeView(m41183y());
                }
                linearLayout.addView(m41183y());
                this.f34513e = false;
                if (FloatingActionManager.f34540a.m41367h0()) {
                    m41182x().m41410i();
                    m41163e0();
                } else {
                    m41185z().m41400g();
                    m41165g0();
                }
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
            if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
                this.f34513e = false;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m41163e0() {
        FrameLayout frameLayout = this.f34519k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        LinearLayout linearLayout = this.f34512d;
        if (linearLayout != null) {
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if (floatingWindowRecyclerView != null) {
                floatingWindowRecyclerView.setLayoutManager(new LinearLayoutManager(linearLayout.getContext(), 1, false));
            }
            FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
            if (floatingWindowRecyclerView2 != null) {
                floatingWindowRecyclerView2.setAdapter(m41185z());
            }
            m41154P();
            m41136r0(this, 0, 0, 3, null);
            m41184y0();
            m41158V();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m41164f0() {
        if (this.f34513e) {
            return;
        }
        this.f34517i = true;
        m41177u0();
        this.f34517i = true;
        if (FloatingActionManager.f34540a.m41367h0()) {
            m41185z().notifyDataSetChanged();
        } else {
            m41182x().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m41165g0() {
        LinearLayout linearLayout = this.f34512d;
        if (linearLayout != null) {
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if (floatingWindowRecyclerView != null) {
                floatingWindowRecyclerView.setLayoutManager(new LinearLayoutManager(linearLayout.getContext(), 0, false));
            }
            FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
            if (floatingWindowRecyclerView2 != null) {
                floatingWindowRecyclerView2.setAdapter(m41182x());
            }
            this.f34523o = 1;
            m41140x0(this, FloatingActionManager.m41313u0(FloatingActionManager.f34540a, false, false, false, 5, null), 0, 2, null);
            m41136r0(this, 0, 0, 3, null);
            m41179v0();
            m41158V();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m41166h0() {
        if (!this.f34513e && this.f34510b) {
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if ((floatingWindowRecyclerView != null ? floatingWindowRecyclerView.getLayoutManager() : null) instanceof LinearLayoutManager) {
                FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
                RecyclerView.LayoutManager layoutManager = floatingWindowRecyclerView2 != null ? floatingWindowRecyclerView2.getLayoutManager() : null;
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                m41155Q();
                if (FloatingActionManager.f34540a.m41367h0()) {
                    if (linearLayoutManager.getOrientation() == 1) {
                        return;
                    }
                    m41163e0();
                } else {
                    if (linearLayoutManager.getOrientation() == 0) {
                        return;
                    }
                    m41165g0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m41167i0(final int i11) {
        FloatingWindowRecyclerView floatingWindowRecyclerView;
        if (FloatingActionManager.f34540a.m41367h0() || (floatingWindowRecyclerView = this.f34518j) == null) {
            return;
        }
        floatingWindowRecyclerView.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.t1
            @Override // java.lang.Runnable
            public final void run() {
                FloatingFrameViewManager.m41127j0(this.f34506b, i11);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public final void m41168k0() {
        if (!this.f34513e && FloatingActionManager.f34540a.m41367h0()) {
            m41158V();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m41169l0() {
        if (this.f34513e) {
            return;
        }
        this.f34517i = true;
        if (FloatingActionManager.f34540a.m41367h0()) {
            m41185z().notifyDataSetChanged();
        } else {
            m41182x().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m41170m0(@NotNull List<StateTradeItemBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f34511c.clear();
        this.f34511c.addAll(data);
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        floatingActionManager.m41349U0("setFloatingPageNewData", data);
        if (this.f34513e) {
            return;
        }
        if (floatingActionManager.m41367h0()) {
            m41184y0();
        } else {
            m41179v0();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m41171n0() {
        if (this.f34513e) {
            return;
        }
        if (FloatingActionManager.f34540a.m41367h0()) {
            m41185z().notifyDataSetChanged();
            return;
        }
        m41182x().notifyDataSetChanged();
        m41173p0();
        m41151K(this.f34523o);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m41173p0() {
        FrameLayout frameLayout = this.f34519k;
        if (frameLayout == null || frameLayout.getVisibility() != 8) {
            m41160b0();
            m41161c0();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m41174q0(int i11, int i12) {
        FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
        ViewGroup.LayoutParams layoutParams = floatingWindowRecyclerView != null ? floatingWindowRecyclerView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        if (layoutParams != null) {
            layoutParams.height = i12;
        }
        FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
        if (floatingWindowRecyclerView2 != null) {
            floatingWindowRecyclerView2.setLayoutParams(layoutParams);
        }
        m41181w0(i11, -2);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m41175s0(int i11, int i12) {
        FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
        ViewGroup.LayoutParams layoutParams = floatingWindowRecyclerView != null ? floatingWindowRecyclerView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = i12;
        }
        FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
        if (floatingWindowRecyclerView2 != null) {
            floatingWindowRecyclerView2.setLayoutParams(layoutParams);
        }
        m41181w0(i11, -2);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m41176t0() {
        if (this.f34513e) {
            return;
        }
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        if (floatingActionManager.m41367h0()) {
            return;
        }
        FrameLayout frameLayout = this.f34519k;
        boolean z11 = frameLayout != null && frameLayout.getVisibility() == 8;
        if (z11 && floatingActionManager.m41350V0() && m41182x().getItemCount() > 1) {
            m41155Q();
            FrameLayout frameLayout2 = this.f34519k;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
            m41177u0();
            m41173p0();
            m41151K(this.f34523o);
            m41179v0();
        } else if (!z11 && !floatingActionManager.m41350V0()) {
            m41155Q();
            FrameLayout frameLayout3 = this.f34519k;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
            m41177u0();
            m41179v0();
        }
        m41158V();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m41177u0() {
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        if (floatingActionManager.m41367h0()) {
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if (floatingWindowRecyclerView != null) {
                floatingWindowRecyclerView.updateMaxHeight(-1);
                return;
            }
            return;
        }
        int iM41366g0 = (floatingActionManager.m41366g0() - C5275i0.m6236a(5.0f)) - this.f34509a.invoke().intValue();
        FrameLayout frameLayout = this.f34519k;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            frameLayout.measure(0, 0);
            iM41366g0 -= frameLayout.getMeasuredHeight();
        }
        FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
        if (floatingWindowRecyclerView2 != null) {
            floatingWindowRecyclerView2.updateMaxHeight(iM41366g0);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m41178v(int i11) {
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        C43840a.m96550d("adapter callback pageMode = " + (floatingActionManager.m41367h0() ? "滚动模式" : "分页模式") + " ,adapterPosition = " + i11 + " ,pageNumber = " + this.f34523o + " , itemViewCount = " + (floatingActionManager.m41367h0() ? m41185z().getItemCount() : m41182x().getItemCount()), "FloatingFrameViewManager");
    }

    /* JADX INFO: renamed from: v0 */
    public final void m41179v0() {
        if (this.f34511c.size() == 0) {
            return;
        }
        this.f34517i = true;
        m41182x().m41417p(this.f34511c);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m41181w0(int i11, int i12) {
        if (i11 <= 0) {
            return;
        }
        LinearLayout linearLayout = this.f34512d;
        ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i11;
        }
        if (layoutParams != null) {
            layoutParams.height = i12;
        }
        LinearLayout linearLayout2 = this.f34512d;
        if (linearLayout2 != null) {
            linearLayout2.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: x */
    public final FloatingPagingPageAdapter m41182x() {
        return (FloatingPagingPageAdapter) this.f34515g.getValue();
    }

    /* JADX INFO: renamed from: y */
    public final View m41183y() {
        return (View) this.f34514f.getValue();
    }

    /* JADX INFO: renamed from: y0 */
    public final void m41184y0() {
        if (this.f34511c.size() == 0) {
            return;
        }
        this.f34517i = true;
        m41185z().m41407n(this.f34511c);
    }

    /* JADX INFO: renamed from: z */
    public final FloatingPagingItemAdapter m41185z() {
        return (FloatingPagingItemAdapter) this.f34516h.getValue();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m41186z0() {
        if (this.f34513e || FloatingActionManager.f34540a.m41367h0()) {
            return;
        }
        m41155Q();
        m41179v0();
        FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
        if (floatingWindowRecyclerView != null) {
            floatingWindowRecyclerView.post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.window.n1
                @Override // java.lang.Runnable
                public final void run() {
                    FloatingFrameViewManager.m41106A0(this.f34494b);
                }
            });
        }
        m41158V();
    }

    /* JADX INFO: renamed from: A0 */
    public static final void m41106A0(FloatingFrameViewManager floatingFrameViewManager) {
        RecyclerView.LayoutManager layoutManager;
        if (floatingFrameViewManager.m41182x().getItemCount() <= 0) {
            return;
        }
        if (floatingFrameViewManager.f34523o <= 0) {
            floatingFrameViewManager.f34523o = 1;
        }
        if (floatingFrameViewManager.f34523o > floatingFrameViewManager.m41182x().getItemCount()) {
            floatingFrameViewManager.f34523o = floatingFrameViewManager.m41182x().getItemCount();
        }
        floatingFrameViewManager.m41151K(floatingFrameViewManager.f34523o);
        floatingFrameViewManager.m41152M(floatingFrameViewManager.f34523o - 1);
        FloatingWindowRecyclerView floatingWindowRecyclerView = floatingFrameViewManager.f34518j;
        if (floatingWindowRecyclerView != null) {
            layoutManager = floatingWindowRecyclerView.getLayoutManager();
        } else {
            layoutManager = null;
        }
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).scrollToPosition(floatingFrameViewManager.f34523o - 1);
        floatingFrameViewManager.m41167i0(floatingFrameViewManager.f34523o - 1);
    }

    /* JADX INFO: renamed from: A */
    public final void m41141A() {
        this.f34518j = (FloatingWindowRecyclerView) m41183y().findViewById(R$id.pagerLayout);
        this.f34519k = (FrameLayout) m41183y().findViewById(R$id.paginationIndicator);
        this.f34520l = (TextView) m41183y().findViewById(R$id.tvPageNumber);
    }

    /* JADX INFO: renamed from: G */
    public final void m41149G() {
        int itemCount = m41182x().getItemCount();
        if (itemCount == 0) {
            m41155Q();
            return;
        }
        int i11 = this.f34523o;
        int i12 = i11 % itemCount;
        this.f34523o = i11 + 1;
        RecyclerView.LayoutManager layoutManager = null;
        if (i12 == 0) {
            this.f34523o = 1;
            m41152M(0);
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if (floatingWindowRecyclerView != null) {
                layoutManager = floatingWindowRecyclerView.getLayoutManager();
            }
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(0);
            m41167i0(0);
        } else {
            m41152M(i12);
            FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
            if (floatingWindowRecyclerView2 != null) {
                layoutManager = floatingWindowRecyclerView2.getLayoutManager();
            }
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(i12);
            m41167i0(i12);
        }
        m41151K(this.f34523o);
    }

    /* JADX INFO: renamed from: H */
    public final void m41150H() {
        View viewFindViewById = m41183y().findViewById(R$id.previousPage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.p1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingFrameViewManager.m41107I(this.f34498b);
            }
        }, 1, null);
        View viewFindViewById2 = m41183y().findViewById(R$id.nexPage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        C27046k.m66711z(viewFindViewById2, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.q1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingFrameViewManager.m41108J(this.f34500b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m41153O() {
        int itemCount = m41182x().getItemCount();
        if (itemCount == 0) {
            m41155Q();
            return;
        }
        int i11 = this.f34523o - 1;
        this.f34523o = i11;
        int i12 = i11 % itemCount;
        RecyclerView.LayoutManager layoutManager = null;
        if (i12 <= 0) {
            this.f34523o = itemCount;
            int i13 = itemCount - 1;
            m41152M(i13);
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if (floatingWindowRecyclerView != null) {
                layoutManager = floatingWindowRecyclerView.getLayoutManager();
            }
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(i13);
            m41167i0(i13);
        } else {
            int i14 = i12 - 1;
            m41152M(i14);
            FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
            if (floatingWindowRecyclerView2 != null) {
                layoutManager = floatingWindowRecyclerView2.getLayoutManager();
            }
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(i14);
            m41167i0(i14);
        }
        m41151K(this.f34523o);
    }

    /* JADX INFO: renamed from: U */
    public final void m41157U() {
        int itemCount = m41185z().getItemCount();
        if (itemCount == 0) {
            m41155Q();
            return;
        }
        int i11 = this.f34523o;
        int i12 = i11 % itemCount;
        this.f34523o = i11 + 1;
        RecyclerView.LayoutManager layoutManager = null;
        if (i12 == 0) {
            FloatingItemMeasureInfo floatingItemMeasureInfoM41401h = m41185z().m41401h(0);
            if (floatingItemMeasureInfoM41401h != null) {
                m41174q0(floatingItemMeasureInfoM41401h.getMeasuredWidth(), floatingItemMeasureInfoM41401h.getMeasuredHeight());
            }
            this.f34523o = 1;
            FloatingWindowRecyclerView floatingWindowRecyclerView = this.f34518j;
            if (floatingWindowRecyclerView != null) {
                layoutManager = floatingWindowRecyclerView.getLayoutManager();
            }
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(0);
            m41156S(0);
            return;
        }
        FloatingItemMeasureInfo floatingItemMeasureInfoM41401h2 = m41185z().m41401h(i12);
        if (floatingItemMeasureInfoM41401h2 != null) {
            m41174q0(floatingItemMeasureInfoM41401h2.getMeasuredWidth(), floatingItemMeasureInfoM41401h2.getMeasuredHeight());
        }
        FloatingWindowRecyclerView floatingWindowRecyclerView2 = this.f34518j;
        if (floatingWindowRecyclerView2 != null) {
            layoutManager = floatingWindowRecyclerView2.getLayoutManager();
        }
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).scrollToPosition(i12);
        m41156S(i12);
    }

    /* JADX INFO: renamed from: V */
    public final void m41158V() {
        m41155Q();
        if (!this.f34513e) {
            FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
            if (floatingActionManager.m41367h0() || !floatingActionManager.m41350V0()) {
                if (!floatingActionManager.m41367h0() || m41185z().getItemCount() > 1) {
                    if (floatingActionManager.m41367h0() || m41182x().getItemCount() > 1) {
                        long jM41355Y0 = floatingActionManager.m41355Y0();
                        if (jM41355Y0 <= 0) {
                            return;
                        }
                        Message messageObtainMessage = this.f34522n.obtainMessage();
                        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                        messageObtainMessage.what = this.f34521m;
                        this.f34522n.sendMessageDelayed(messageObtainMessage, jM41355Y0);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m41159W() {
        m41182x().m41416o(new Function3() { // from class: com.kubi.market.monitor.lib.ui.floating.window.r1
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FloatingFrameViewManager.m41113X(this.f34502b, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        m41185z().m41405l(new Function3() { // from class: com.kubi.market.monitor.lib.ui.floating.window.s1
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return FloatingFrameViewManager.m41115Z(this.f34504b, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final void m41160b0() {
        m41183y().findViewById(R$id.viewLine).setBackgroundColor(FloatingActionManager.f34540a.m41369i0());
    }

    /* JADX INFO: renamed from: c0 */
    public final void m41161c0() {
        ImageView imageView = (ImageView) m41183y().findViewById(R$id.previousPage);
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        imageView.setImageResource(floatingActionManager.m41327C0(m41146D()));
        ((ImageView) m41183y().findViewById(R$id.nexPage)).setImageResource(floatingActionManager.m41395z0(m41146D()));
    }

    /* JADX INFO: renamed from: o0 */
    public final void m41172o0() {
        if (m41147E()) {
            return;
        }
        m41158V();
    }

    /* JADX INFO: renamed from: w */
    public final void m41180w() {
        m41155Q();
        this.f34511c.clear();
    }
}
