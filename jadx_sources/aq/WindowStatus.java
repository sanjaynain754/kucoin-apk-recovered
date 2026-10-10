package aq;

import android.graphics.Point;
import android.view.View;
import com.kubi.kucoin.market.monitor.lib.R$color;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseApplication;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: aq.j, reason: from toString */
/* JADX INFO: compiled from: WindowStatus.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\bT\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BÓ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012O\b\u0002\u0010\r\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u000b\u0012%\b\u0002\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010#¢\u0006\u0004\b&\u0010'J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010`\u001a\u00020\u0007HÆ\u0003J\t\u0010a\u001a\u00020\u0007HÆ\u0003J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003JP\u0010e\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\u000bHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\u000bHÆ\u0003J\t\u0010j\u001a\u00020\u000bHÆ\u0003J\t\u0010k\u001a\u00020\u000bHÆ\u0003J\t\u0010l\u001a\u00020\u000bHÆ\u0003J\t\u0010m\u001a\u00020\u0007HÆ\u0003J\t\u0010n\u001a\u00020\u0007HÆ\u0003J\t\u0010o\u001a\u00020\u0007HÆ\u0003J\t\u0010p\u001a\u00020\u0007HÆ\u0003J\t\u0010q\u001a\u00020\u000bHÆ\u0003J\t\u0010r\u001a\u00020\u000bHÆ\u0003J\t\u0010s\u001a\u00020\u000bHÆ\u0003J&\u0010t\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010#HÆ\u0003JÕ\u0002\u0010u\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072O\b\u0002\u0010\r\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u000b2%\b\u0002\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010#HÆ\u0001J\u0013\u0010v\u001a\u00020\u00072\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u000bHÖ\u0001J\t\u0010y\u001a\u00020zHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u00100\"\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u00100\"\u0004\b5\u00102R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u00106\"\u0004\b7\u00108R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u00100\"\u0004\b9\u00102Ra\u0010\r\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010\u0014\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00106\"\u0004\b?\u00108R\u001a\u0010\u0015\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00106\"\u0004\bC\u00108R\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00106\"\u0004\bE\u00108R\u001a\u0010\u0018\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00106\"\u0004\bG\u00108R\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00106\"\u0004\bI\u00108R\u001a\u0010\u001a\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R\u001a\u0010\u001b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00100\"\u0004\bM\u00102R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00100\"\u0004\bO\u00102R\u001a\u0010\u001d\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00100\"\u0004\bQ\u00102R\u001a\u0010\u001e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00100\"\u0004\bS\u00102R\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u00106\"\u0004\bU\u00108R\u001a\u0010 \u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00106\"\u0004\bW\u00108R\u001a\u0010!\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00106\"\u0004\bY\u00108R7\u0010\"\u001a\u001f\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006{"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/util/WindowStatus;", "", "offsetPair", "Landroid/graphics/Point;", "floatingView", "Landroid/view/View;", "isDrag", "", "dragEnable", "isAnim", "isAddOrRomeView", "", "isShow", "updateWindowMoveCallBack", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "moveStop", "isLeft", "childView", "dataUpdateIntervalTime", "textSizeMode", "pageTurningTime", "pagingMode", "pageSize", "displayMode", "autoScrollTime", "actionBarShow", "currencyNameShow", "quoteChangeShow", "priceShow", BaseActivity.THEME, "bgColor", "alpha", "updataViewState", "Lkotlin/Function1;", "config", "", "<init>", "(Landroid/graphics/Point;Landroid/view/View;ZZZIZLkotlin/jvm/functions/Function3;IIIIIIIZZZZIIILkotlin/jvm/functions/Function1;)V", "getOffsetPair", "()Landroid/graphics/Point;", "setOffsetPair", "(Landroid/graphics/Point;)V", "getFloatingView", "()Landroid/view/View;", "setFloatingView", "(Landroid/view/View;)V", "()Z", "setDrag", "(Z)V", "getDragEnable", "setDragEnable", "setAnim", "()I", "setAddOrRomeView", "(I)V", "setShow", "getUpdateWindowMoveCallBack", "()Lkotlin/jvm/functions/Function3;", "setUpdateWindowMoveCallBack", "(Lkotlin/jvm/functions/Function3;)V", "getDataUpdateIntervalTime", "setDataUpdateIntervalTime", "getTextSizeMode", "setTextSizeMode", "getPageTurningTime", "setPageTurningTime", "getPagingMode", "setPagingMode", "getPageSize", "setPageSize", "getDisplayMode", "setDisplayMode", "getAutoScrollTime", "setAutoScrollTime", "getActionBarShow", "setActionBarShow", "getCurrencyNameShow", "setCurrencyNameShow", "getQuoteChangeShow", "setQuoteChangeShow", "getPriceShow", "setPriceShow", "getTheme", "setTheme", "getBgColor", "setBgColor", "getAlpha", "setAlpha", "getUpdataViewState", "()Lkotlin/jvm/functions/Function1;", "setUpdataViewState", "(Lkotlin/jvm/functions/Function1;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WindowStatus {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public Point offsetPair;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public View floatingView;

    /* JADX INFO: renamed from: c, reason: from toString */
    public boolean isDrag;

    /* JADX INFO: renamed from: d, reason: from toString */
    public boolean dragEnable;

    /* JADX INFO: renamed from: e, reason: from toString */
    public boolean isAnim;

    /* JADX INFO: renamed from: f, reason: from toString */
    public int isAddOrRomeView;

    /* JADX INFO: renamed from: g, reason: from toString */
    public boolean isShow;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public Function3<? super Boolean, ? super Boolean, ? super View, ? extends Object> updateWindowMoveCallBack;

    /* JADX INFO: renamed from: i, reason: from toString */
    public int dataUpdateIntervalTime;

    /* JADX INFO: renamed from: j, reason: from toString */
    public int textSizeMode;

    /* JADX INFO: renamed from: k, reason: from toString */
    public int pageTurningTime;

    /* JADX INFO: renamed from: l, reason: from toString */
    public int pagingMode;

    /* JADX INFO: renamed from: m, reason: from toString */
    public int pageSize;

    /* JADX INFO: renamed from: n, reason: from toString */
    public int displayMode;

    /* JADX INFO: renamed from: o, reason: from toString */
    public int autoScrollTime;

    /* JADX INFO: renamed from: p, reason: from toString */
    public boolean actionBarShow;

    /* JADX INFO: renamed from: q, reason: from toString */
    public boolean currencyNameShow;

    /* JADX INFO: renamed from: r, reason: from toString */
    public boolean quoteChangeShow;

    /* JADX INFO: renamed from: s, reason: from toString */
    public boolean priceShow;

    /* JADX INFO: renamed from: t, reason: from toString */
    public int theme;

    /* JADX INFO: renamed from: u, reason: from toString */
    public int bgColor;

    /* JADX INFO: renamed from: v, reason: from toString */
    public int alpha;

    /* JADX INFO: renamed from: w, reason: from toString */
    @Nullable
    public Function1<? super WindowStatus, Unit> updataViewState;

    public WindowStatus() {
        this(null, null, false, false, false, 0, false, null, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 0, 0, 0, null, 8388607, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ WindowStatus m3924b(WindowStatus windowStatus, Point point, View view, boolean z11, boolean z12, boolean z13, int i11, boolean z14, Function3 function3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z15, boolean z16, boolean z17, boolean z18, int i19, int i21, int i22, Function1 function1, int i23, Object obj) {
        Function1 function2;
        int i24;
        Point point2 = (i23 & 1) != 0 ? windowStatus.offsetPair : point;
        View view2 = (i23 & 2) != 0 ? windowStatus.floatingView : view;
        boolean z19 = (i23 & 4) != 0 ? windowStatus.isDrag : z11;
        boolean z21 = (i23 & 8) != 0 ? windowStatus.dragEnable : z12;
        boolean z22 = (i23 & 16) != 0 ? windowStatus.isAnim : z13;
        int i25 = (i23 & 32) != 0 ? windowStatus.isAddOrRomeView : i11;
        boolean z23 = (i23 & 64) != 0 ? windowStatus.isShow : z14;
        Function3 function4 = (i23 & 128) != 0 ? windowStatus.updateWindowMoveCallBack : function3;
        int i26 = (i23 & 256) != 0 ? windowStatus.dataUpdateIntervalTime : i12;
        int i27 = (i23 & 512) != 0 ? windowStatus.textSizeMode : i13;
        int i28 = (i23 & 1024) != 0 ? windowStatus.pageTurningTime : i14;
        int i29 = (i23 & 2048) != 0 ? windowStatus.pagingMode : i15;
        int i31 = (i23 & 4096) != 0 ? windowStatus.pageSize : i16;
        int i32 = (i23 & 8192) != 0 ? windowStatus.displayMode : i17;
        Point point3 = point2;
        int i33 = (i23 & 16384) != 0 ? windowStatus.autoScrollTime : i18;
        boolean z24 = (i23 & 32768) != 0 ? windowStatus.actionBarShow : z15;
        boolean z25 = (i23 & 65536) != 0 ? windowStatus.currencyNameShow : z16;
        boolean z26 = (i23 & 131072) != 0 ? windowStatus.quoteChangeShow : z17;
        boolean z27 = (i23 & 262144) != 0 ? windowStatus.priceShow : z18;
        int i34 = (i23 & 524288) != 0 ? windowStatus.theme : i19;
        int i35 = (i23 & 1048576) != 0 ? windowStatus.bgColor : i21;
        int i36 = (i23 & 2097152) != 0 ? windowStatus.alpha : i22;
        if ((i23 & 4194304) != 0) {
            i24 = i36;
            function2 = windowStatus.updataViewState;
        } else {
            function2 = function1;
            i24 = i36;
        }
        return windowStatus.m3943a(point3, view2, z19, z21, z22, i25, z23, function4, i26, i27, i28, i29, i31, i32, i33, z24, z25, z26, z27, i34, i35, i24, function2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowStatus)) {
            return false;
        }
        WindowStatus windowStatus = (WindowStatus) other;
        return Intrinsics.areEqual(this.offsetPair, windowStatus.offsetPair) && Intrinsics.areEqual(this.floatingView, windowStatus.floatingView) && this.isDrag == windowStatus.isDrag && this.dragEnable == windowStatus.dragEnable && this.isAnim == windowStatus.isAnim && this.isAddOrRomeView == windowStatus.isAddOrRomeView && this.isShow == windowStatus.isShow && Intrinsics.areEqual(this.updateWindowMoveCallBack, windowStatus.updateWindowMoveCallBack) && this.dataUpdateIntervalTime == windowStatus.dataUpdateIntervalTime && this.textSizeMode == windowStatus.textSizeMode && this.pageTurningTime == windowStatus.pageTurningTime && this.pagingMode == windowStatus.pagingMode && this.pageSize == windowStatus.pageSize && this.displayMode == windowStatus.displayMode && this.autoScrollTime == windowStatus.autoScrollTime && this.actionBarShow == windowStatus.actionBarShow && this.currencyNameShow == windowStatus.currencyNameShow && this.quoteChangeShow == windowStatus.quoteChangeShow && this.priceShow == windowStatus.priceShow && this.theme == windowStatus.theme && this.bgColor == windowStatus.bgColor && this.alpha == windowStatus.alpha && Intrinsics.areEqual(this.updataViewState, windowStatus.updataViewState);
    }

    public WindowStatus(@NotNull Point offsetPair, @Nullable View view, boolean z11, boolean z12, boolean z13, int i11, boolean z14, @Nullable Function3<? super Boolean, ? super Boolean, ? super View, ? extends Object> function3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z15, boolean z16, boolean z17, boolean z18, int i19, int i21, int i22, @Nullable Function1<? super WindowStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(offsetPair, "offsetPair");
        this.offsetPair = offsetPair;
        this.floatingView = view;
        this.isDrag = z11;
        this.dragEnable = z12;
        this.isAnim = z13;
        this.isAddOrRomeView = i11;
        this.isShow = z14;
        this.updateWindowMoveCallBack = function3;
        this.dataUpdateIntervalTime = i12;
        this.textSizeMode = i13;
        this.pageTurningTime = i14;
        this.pagingMode = i15;
        this.pageSize = i16;
        this.displayMode = i17;
        this.autoScrollTime = i18;
        this.actionBarShow = z15;
        this.currencyNameShow = z16;
        this.quoteChangeShow = z17;
        this.priceShow = z18;
        this.theme = i19;
        this.bgColor = i21;
        this.alpha = i22;
        this.updataViewState = function1;
    }

    /* JADX INFO: renamed from: A */
    public final void m3925A(boolean z11) {
        this.isAnim = z11;
    }

    /* JADX INFO: renamed from: B */
    public final void m3926B(int i11) {
        this.autoScrollTime = i11;
    }

    /* JADX INFO: renamed from: C */
    public final void m3927C(boolean z11) {
        this.currencyNameShow = z11;
    }

    /* JADX INFO: renamed from: D */
    public final void m3928D(int i11) {
        this.dataUpdateIntervalTime = i11;
    }

    /* JADX INFO: renamed from: E */
    public final void m3929E(int i11) {
        this.displayMode = i11;
    }

    /* JADX INFO: renamed from: F */
    public final void m3930F(boolean z11) {
        this.isDrag = z11;
    }

    /* JADX INFO: renamed from: G */
    public final void m3931G(@Nullable View view) {
        this.floatingView = view;
    }

    /* JADX INFO: renamed from: H */
    public final void m3932H(@NotNull Point point) {
        Intrinsics.checkNotNullParameter(point, "<set-?>");
        this.offsetPair = point;
    }

    /* JADX INFO: renamed from: I */
    public final void m3933I(int i11) {
        this.pageSize = i11;
    }

    /* JADX INFO: renamed from: J */
    public final void m3934J(int i11) {
        this.pageTurningTime = i11;
    }

    /* JADX INFO: renamed from: K */
    public final void m3935K(int i11) {
        this.pagingMode = i11;
    }

    /* JADX INFO: renamed from: L */
    public final void m3936L(boolean z11) {
        this.priceShow = z11;
    }

    /* JADX INFO: renamed from: M */
    public final void m3937M(boolean z11) {
        this.quoteChangeShow = z11;
    }

    /* JADX INFO: renamed from: N */
    public final void m3938N(boolean z11) {
        this.isShow = z11;
    }

    /* JADX INFO: renamed from: O */
    public final void m3939O(int i11) {
        this.textSizeMode = i11;
    }

    /* JADX INFO: renamed from: P */
    public final void m3940P(int i11) {
        this.theme = i11;
    }

    /* JADX INFO: renamed from: Q */
    public final void m3941Q(@Nullable Function1<? super WindowStatus, Unit> function1) {
        this.updataViewState = function1;
    }

    /* JADX INFO: renamed from: R */
    public final void m3942R(@Nullable Function3<? super Boolean, ? super Boolean, ? super View, ? extends Object> function3) {
        this.updateWindowMoveCallBack = function3;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final WindowStatus m3943a(@NotNull Point offsetPair, @Nullable View view, boolean z11, boolean z12, boolean z13, int i11, boolean z14, @Nullable Function3<? super Boolean, ? super Boolean, ? super View, ? extends Object> function3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z15, boolean z16, boolean z17, boolean z18, int i19, int i21, int i22, @Nullable Function1<? super WindowStatus, Unit> function1) {
        Intrinsics.checkNotNullParameter(offsetPair, "offsetPair");
        return new WindowStatus(offsetPair, view, z11, z12, z13, i11, z14, function3, i12, i13, i14, i15, i16, i17, i18, z15, z16, z17, z18, i19, i21, i22, function1);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getActionBarShow() {
        return this.actionBarShow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getAutoScrollTime() {
        return this.autoScrollTime;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getCurrencyNameShow() {
        return this.currencyNameShow;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getDataUpdateIntervalTime() {
        return this.dataUpdateIntervalTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getDisplayMode() {
        return this.displayMode;
    }

    public int hashCode() {
        int iHashCode = this.offsetPair.hashCode() * 31;
        View view = this.floatingView;
        int iHashCode2 = (((((((((((iHashCode + (view == null ? 0 : view.hashCode())) * 31) + Boolean.hashCode(this.isDrag)) * 31) + Boolean.hashCode(this.dragEnable)) * 31) + Boolean.hashCode(this.isAnim)) * 31) + Integer.hashCode(this.isAddOrRomeView)) * 31) + Boolean.hashCode(this.isShow)) * 31;
        Function3<? super Boolean, ? super Boolean, ? super View, ? extends Object> function3 = this.updateWindowMoveCallBack;
        int iHashCode3 = (((((((((((((((((((((((((((((iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31) + Integer.hashCode(this.dataUpdateIntervalTime)) * 31) + Integer.hashCode(this.textSizeMode)) * 31) + Integer.hashCode(this.pageTurningTime)) * 31) + Integer.hashCode(this.pagingMode)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.displayMode)) * 31) + Integer.hashCode(this.autoScrollTime)) * 31) + Boolean.hashCode(this.actionBarShow)) * 31) + Boolean.hashCode(this.currencyNameShow)) * 31) + Boolean.hashCode(this.quoteChangeShow)) * 31) + Boolean.hashCode(this.priceShow)) * 31) + Integer.hashCode(this.theme)) * 31) + Integer.hashCode(this.bgColor)) * 31) + Integer.hashCode(this.alpha)) * 31;
        Function1<? super WindowStatus, Unit> function1 = this.updataViewState;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDragEnable() {
        return this.dragEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final View getFloatingView() {
        return this.floatingView;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final Point getOffsetPair() {
        return this.offsetPair;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getPageTurningTime() {
        return this.pageTurningTime;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getPagingMode() {
        return this.pagingMode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getPriceShow() {
        return this.priceShow;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getQuoteChangeShow() {
        return this.quoteChangeShow;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getTextSizeMode() {
        return this.textSizeMode;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getTheme() {
        return this.theme;
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Function1<WindowStatus, Unit> m3960s() {
        return this.updataViewState;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Function3<Boolean, Boolean, View, Object> m3961t() {
        return this.updateWindowMoveCallBack;
    }

    @NotNull
    public String toString() {
        return "WindowStatus(offsetPair=" + this.offsetPair + ", floatingView=" + this.floatingView + ", isDrag=" + this.isDrag + ", dragEnable=" + this.dragEnable + ", isAnim=" + this.isAnim + ", isAddOrRomeView=" + this.isAddOrRomeView + ", isShow=" + this.isShow + ", updateWindowMoveCallBack=" + this.updateWindowMoveCallBack + ", dataUpdateIntervalTime=" + this.dataUpdateIntervalTime + ", textSizeMode=" + this.textSizeMode + ", pageTurningTime=" + this.pageTurningTime + ", pagingMode=" + this.pagingMode + ", pageSize=" + this.pageSize + ", displayMode=" + this.displayMode + ", autoScrollTime=" + this.autoScrollTime + ", actionBarShow=" + this.actionBarShow + ", currencyNameShow=" + this.currencyNameShow + ", quoteChangeShow=" + this.quoteChangeShow + ", priceShow=" + this.priceShow + ", theme=" + this.theme + ", bgColor=" + this.bgColor + ", alpha=" + this.alpha + ", updataViewState=" + this.updataViewState + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getIsAnim() {
        return this.isAnim;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getIsDrag() {
        return this.isDrag;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    /* JADX INFO: renamed from: x */
    public final void m3965x(boolean z11) {
        this.actionBarShow = z11;
    }

    /* JADX INFO: renamed from: y */
    public final void m3966y(int i11) {
        this.isAddOrRomeView = i11;
    }

    /* JADX INFO: renamed from: z */
    public final void m3967z(int i11) {
        this.alpha = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WindowStatus(Point point, View view, boolean z11, boolean z12, boolean z13, int i11, boolean z14, Function3 function3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z15, boolean z16, boolean z17, boolean z18, int i19, int i21, int i22, Function1 function1, int i23, DefaultConstructorMarker defaultConstructorMarker) {
        int color;
        Point point2 = (i23 & 1) != 0 ? new Point(0, 0) : point;
        View view2 = (i23 & 2) != 0 ? null : view;
        boolean z19 = (i23 & 4) != 0 ? false : z11;
        boolean z21 = (i23 & 8) != 0 ? true : z12;
        boolean z22 = (i23 & 16) != 0 ? false : z13;
        int i24 = (i23 & 32) != 0 ? -1 : i11;
        boolean z23 = (i23 & 64) != 0 ? false : z14;
        Function3 function4 = (i23 & 128) != 0 ? null : function3;
        int i25 = (i23 & 256) != 0 ? 5 : i12;
        int i26 = (i23 & 512) != 0 ? 2 : i13;
        int i27 = (i23 & 1024) != 0 ? 5 : i14;
        int i28 = (i23 & 2048) != 0 ? 8 : i15;
        int i29 = (i23 & 4096) != 0 ? 6 : i16;
        int i31 = (i23 & 8192) != 0 ? 0 : i17;
        int i32 = (i23 & 16384) != 0 ? 5 : i18;
        boolean z24 = (i23 & 32768) != 0 ? true : z15;
        boolean z25 = (i23 & 65536) != 0 ? true : z16;
        boolean z26 = (i23 & 131072) != 0 ? true : z17;
        boolean z27 = (i23 & 262144) != 0 ? false : z18;
        int i33 = (i23 & 524288) != 0 ? 0 : i19;
        if ((i23 & 1048576) == 0) {
            color = i21;
        } else if (i33 == 0) {
            color = BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_dark_color);
        } else {
            color = BaseApplication.INSTANCE.get().getResources().getColor(R$color.floating_light_color);
        }
        this(point2, view2, z19, z21, z22, i24, z23, function4, i25, i26, i27, i28, i29, i31, i32, z24, z25, z26, z27, i33, color, (i23 & 2097152) != 0 ? 153 : i22, (i23 & 4194304) != 0 ? null : function1);
    }
}
