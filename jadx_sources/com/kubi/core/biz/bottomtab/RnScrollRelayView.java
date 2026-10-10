package com.kubi.core.biz.bottomtab;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild2;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: RnScrollRelayView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001KB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016J(\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016J0\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\tH\u0016J@\u0010*\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0011H\u0016J8\u0010*\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016J\u0018\u0010/\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\tH\u0016J\b\u00101\u001a\u00020\u001aH\u0002J\b\u00102\u001a\u00020\u001aH\u0002J\u0014\u00103\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t04H\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\u0012\u00106\u001a\u0004\u0018\u00010 2\u0006\u00107\u001a\u00020 H\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020\u001aH\u0016J\u0010\u0010:\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010>\u001a\u00020%2\u0006\u0010?\u001a\u00020\u001aH\u0016J\b\u0010@\u001a\u00020\u001aH\u0016J\u0010\u0010A\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\tH\u0016J\u0018\u0010A\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010B\u001a\u00020%H\u0016J\u0010\u0010B\u001a\u00020%2\u0006\u0010#\u001a\u00020\tH\u0016J\b\u0010C\u001a\u00020\u001aH\u0016J\u0010\u0010C\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\tH\u0016J2\u0010D\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010\u0011H\u0016J:\u0010D\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\b\u0010E\u001a\u0004\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\tH\u0016J,\u0010F\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u00112\b\u0010E\u001a\u0004\u0018\u00010\u0011H\u0016J4\u0010F\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u00112\b\u0010E\u001a\u0004\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\tH\u0016J\u0018\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0016H\u0016J \u0010J\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001aH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006L"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/RnScrollRelayView;", "Landroid/widget/FrameLayout;", "Landroidx/core/view/NestedScrollingParent3;", "Landroidx/core/view/NestedScrollingChild2;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "parentHelper", "Landroidx/core/view/NestedScrollingParentHelper;", "childHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "tempConsumed", "", "touchSlop", "longPressTimeout", "", "interceptStartY", "", "interceptStartX", "interceptDownTime", "isIntercepting", "", "handedOffToChild", "isSwipingUp", "rnListAtTopOnDown", "onStartNestedScroll", "child", "Landroid/view/View;", "target", "axes", "type", "onNestedScrollAccepted", "", "onNestedPreScroll", "dx", "dy", "consumed", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onStopNestedScroll", "getNestedScrollAxes", "isAppBarScrollable", "isAppBarExpandable", "getAppBarOffset", "Lkotlin/Pair;", "isRnListAtTop", "findScrollableChild", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "requestDisallowInterceptTouchEvent", "disallowIntercept", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "setNestedScrollingEnabled", "enabled", "isNestedScrollingEnabled", "startNestedScroll", "stopNestedScroll", "hasNestedScrollingParent", "dispatchNestedScroll", "offsetInWindow", "dispatchNestedPreScroll", "dispatchNestedPreFling", "velocityX", "velocityY", "dispatchNestedFling", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRnScrollRelayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnScrollRelayView.kt\ncom/kubi/core/biz/bottomtab/RnScrollRelayView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n295#2,2:365\n1563#2:367\n1634#2,3:368\n295#2,2:371\n1#3:373\n*S KotlinDebug\n*F\n+ 1 RnScrollRelayView.kt\ncom/kubi/core/biz/bottomtab/RnScrollRelayView\n*L\n134#1:365,2\n138#1:367\n138#1:368,3\n139#1:371,2\n*E\n"})
public final class RnScrollRelayView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild2 {

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Companion f20168n = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NestedScrollingParentHelper f20169b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final NestedScrollingChildHelper f20170c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final int[] f20171d;

    /* JADX INFO: renamed from: e */
    public final int f20172e;

    /* JADX INFO: renamed from: f */
    public final long f20173f;

    /* JADX INFO: renamed from: g */
    public float f20174g;

    /* JADX INFO: renamed from: h */
    public float f20175h;

    /* JADX INFO: renamed from: i */
    public long f20176i;

    /* JADX INFO: renamed from: j */
    public boolean f20177j;

    /* JADX INFO: renamed from: k */
    public boolean f20178k;

    /* JADX INFO: renamed from: l */
    public boolean f20179l;

    /* JADX INFO: renamed from: m */
    public boolean f20180m;

    /* JADX INFO: compiled from: RnScrollRelayView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/RnScrollRelayView$Companion;", "", "<init>", "()V", "VERTICAL_INTERCEPT_BIAS", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RnScrollRelayView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int dx2, int dy2, @Nullable int[] consumed, @Nullable int[] offsetInWindow) {
        return this.f20170c.dispatchNestedPreScroll(dx2, dy2, consumed, offsetInWindow);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @Nullable int[] offsetInWindow) {
        return this.f20170c.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return this.f20170c.hasNestedScrollingParent();
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @NotNull int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, null, type);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int axes) {
        return this.f20170c.startNestedScroll(axes);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        this.f20170c.stopNestedScroll();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RnScrollRelayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final View m21312a(View view) {
        if ((view instanceof RecyclerView) || (view instanceof ScrollView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                View viewM21312a = m21312a(childAt);
                if (viewM21312a != null) {
                    return viewM21312a;
                }
            }
        }
        return null;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f20170c.dispatchNestedFling(velocityX, velocityY, consumed);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f20170c.dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int dx2, int dy2, @Nullable int[] consumed, @Nullable int[] offsetInWindow, int type) {
        return this.f20170c.dispatchNestedPreScroll(dx2, dy2, consumed, offsetInWindow, type);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @Nullable int[] offsetInWindow, int type) {
        return this.f20170c.dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f20169b.getNestedScrollAxes();
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int type) {
        return this.f20170c.hasNestedScrollingParent(type);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.f20170c.isNestedScrollingEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.f20174g = ev2.getY();
            this.f20175h = ev2.getX();
            this.f20176i = SystemClock.uptimeMillis();
            this.f20177j = false;
            this.f20178k = false;
            this.f20179l = false;
            this.f20180m = m21315d();
            startNestedScroll(2, 0);
        } else if (actionMasked == 1) {
            this.f20176i = 0L;
            this.f20177j = false;
            this.f20178k = false;
            stopNestedScroll(0);
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f20176i = 0L;
                this.f20177j = false;
                this.f20178k = false;
                stopNestedScroll(0);
            }
        } else {
            if (this.f20178k) {
                return false;
            }
            float fAbs = Math.abs(ev2.getX() - this.f20175h);
            float y11 = ev2.getY() - this.f20174g;
            float fAbs2 = Math.abs(y11);
            boolean zM21314c = m21314c();
            boolean zM21313b = m21313b();
            if (!this.f20177j && fAbs2 > this.f20172e && fAbs2 >= fAbs * 1.5f) {
                if (y11 < 0.0f && zM21314c) {
                    this.f20177j = true;
                    this.f20179l = true;
                } else if (y11 > 0.0f && zM21313b && this.f20180m) {
                    this.f20177j = true;
                    this.f20179l = false;
                }
            }
            if (this.f20177j) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NotNull View target, int dx2, int dy2, @NotNull int[] consumed, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        int[] iArr = this.f20171d;
        iArr[0] = 0;
        iArr[1] = 0;
        if (dispatchNestedPreScroll(dx2, dy2, iArr, null, type)) {
            int i11 = consumed[0];
            int[] iArr2 = this.f20171d;
            consumed[0] = i11 + iArr2[0];
            consumed[1] = consumed[1] + iArr2[1];
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        dispatchNestedScroll(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, null, type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NotNull View child, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f20169b.onNestedScrollAccepted(child, target, axes, type);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NotNull View child, @NotNull View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        boolean z11 = (axes & 2) != 0;
        if (z11) {
            startNestedScroll(2, type);
        }
        return z11;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NotNull View target, int type) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f20169b.onStopNestedScroll(target, type);
        stopNestedScroll(type);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev2) {
        RnScrollRelayView rnScrollRelayView;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 1) {
            this.f20177j = false;
            this.f20178k = false;
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int y11 = (int) (this.f20174g - ev2.getY());
            this.f20174g = ev2.getY();
            int[] iArr = this.f20171d;
            iArr[0] = 0;
            iArr[1] = 0;
            if (this.f20179l) {
                rnScrollRelayView = this;
                rnScrollRelayView.dispatchNestedPreScroll(0, y11, iArr, null, 0);
            } else {
                rnScrollRelayView = this;
                rnScrollRelayView.dispatchNestedScroll(0, 0, 0, y11, null, 0);
            }
            if (!rnScrollRelayView.f20179l ? !m21313b() : !m21314c()) {
                rnScrollRelayView.f20177j = false;
                rnScrollRelayView.f20178k = true;
                stopNestedScroll(0);
                super.requestDisallowInterceptTouchEvent(true);
                MotionEvent motionEventObtain = MotionEvent.obtain(ev2);
                motionEventObtain.setAction(0);
                super.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                return false;
            }
        } else if (actionMasked == 3) {
            this.f20177j = false;
            this.f20178k = false;
            stopNestedScroll(0);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept && !this.f20177j && !this.f20178k) {
            if (this.f20176i > 0 && SystemClock.uptimeMillis() - this.f20176i >= this.f20173f) {
                this.f20178k = true;
                super.requestDisallowInterceptTouchEvent(true);
                return;
            } else {
                if (m21314c()) {
                    return;
                }
                if (m21313b() && this.f20180m) {
                    return;
                }
            }
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f20170c.setNestedScrollingEnabled(enabled);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int axes, int type) {
        return this.f20170c.startNestedScroll(axes, type);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int type) {
        this.f20170c.stopNestedScroll(type);
    }

    public /* synthetic */ RnScrollRelayView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final Pair<Integer, Integer> getAppBarOffset() {
        Object next;
        AppBarLayout appBarLayout;
        CoordinatorLayout.LayoutParams layoutParams;
        CoordinatorLayout.Behavior behavior;
        Object next2;
        AppBarLayout appBarLayout2;
        CoordinatorLayout.LayoutParams layoutParams2;
        CoordinatorLayout.Behavior behavior2;
        View view;
        Object parent = getParent();
        while (parent != null) {
            AppBarLayout.Behavior behavior3 = null;
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type android.view.View");
                List<View> dependencies = coordinatorLayout.getDependencies(this);
                Intrinsics.checkNotNullExpressionValue(dependencies, "getDependencies(...)");
                Iterator<T> it = dependencies.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                        break;
                    }
                } while (!(((View) next) instanceof AppBarLayout));
                if (next instanceof AppBarLayout) {
                    appBarLayout = (AppBarLayout) next;
                } else {
                    appBarLayout = null;
                }
                if (appBarLayout == null) {
                    IntRange intRangeUntil = RangesKt.until(0, coordinatorLayout.getChildCount());
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                    Iterator<Integer> it2 = intRangeUntil.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(coordinatorLayout.getChildAt(((IntIterator) it2).nextInt()));
                    }
                    Iterator it3 = arrayList.iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                        } else {
                            next2 = null;
                            break;
                        }
                    } while (!(((View) next2) instanceof AppBarLayout));
                    if (next2 instanceof AppBarLayout) {
                        appBarLayout2 = (AppBarLayout) next2;
                    } else {
                        appBarLayout2 = null;
                    }
                    if (appBarLayout2 == null) {
                        return TuplesKt.m90091to(0, 0);
                    }
                    ViewGroup.LayoutParams layoutParams3 = appBarLayout2.getLayoutParams();
                    if (layoutParams3 instanceof CoordinatorLayout.LayoutParams) {
                        layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams3;
                    } else {
                        layoutParams2 = null;
                    }
                    if (layoutParams2 != null) {
                        behavior2 = layoutParams2.getBehavior();
                    } else {
                        behavior2 = null;
                    }
                    if (behavior2 instanceof AppBarLayout.Behavior) {
                        behavior3 = (AppBarLayout.Behavior) behavior2;
                    }
                    if (behavior3 == null) {
                        return TuplesKt.m90091to(0, 0);
                    }
                    return TuplesKt.m90091to(Integer.valueOf(behavior3.getTopAndBottomOffset()), Integer.valueOf(appBarLayout2.getTotalScrollRange()));
                }
                ViewGroup.LayoutParams layoutParams4 = appBarLayout.getLayoutParams();
                if (layoutParams4 instanceof CoordinatorLayout.LayoutParams) {
                    layoutParams = (CoordinatorLayout.LayoutParams) layoutParams4;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    behavior = layoutParams.getBehavior();
                } else {
                    behavior = null;
                }
                if (behavior instanceof AppBarLayout.Behavior) {
                    behavior3 = (AppBarLayout.Behavior) behavior;
                }
                if (behavior3 == null) {
                    return TuplesKt.m90091to(0, 0);
                }
                return TuplesKt.m90091to(Integer.valueOf(behavior3.getTopAndBottomOffset()), Integer.valueOf(appBarLayout.getTotalScrollRange()));
            }
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
            if (view != null) {
                parent = view.getParent();
            } else {
                parent = null;
            }
        }
        return TuplesKt.m90091to(0, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21313b() {
        if (getAppBarOffset().component1().intValue() < 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21314c() {
        Pair<Integer, Integer> appBarOffset = getAppBarOffset();
        int iIntValue = appBarOffset.component1().intValue();
        int iIntValue2 = appBarOffset.component2().intValue();
        if (iIntValue2 > 0 && iIntValue > (-iIntValue2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21315d() {
        View viewM21312a = m21312a(this);
        if (viewM21312a == null) {
            return true;
        }
        if (viewM21312a instanceof RecyclerView) {
            if (!viewM21312a.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }
        if (!(viewM21312a instanceof ScrollView) || ((ScrollView) viewM21312a).getScrollY() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RnScrollRelayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20169b = new NestedScrollingParentHelper(this);
        this.f20170c = new NestedScrollingChildHelper(this);
        this.f20171d = new int[2];
        this.f20172e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f20173f = ViewConfiguration.getLongPressTimeout();
        this.f20180m = true;
        setNestedScrollingEnabled(true);
    }
}
