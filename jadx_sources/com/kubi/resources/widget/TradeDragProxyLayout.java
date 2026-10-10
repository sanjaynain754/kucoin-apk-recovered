package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsSeekBar;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.sequences.SequencesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradeDragProxyLayout.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJn\u0010\u001f\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020$H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0002J\u0010\u0010)\u001a\u00020\u00112\u0006\u0010&\u001a\u00020$H\u0002J \u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\rH\u0002J\u0012\u0010.\u001a\u00020\u00142\b\b\u0002\u0010/\u001a\u00020\u0007H\u0002J\u0010\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\rH\u0002J\u0018\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\rH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/resources/widget/TradeDragProxyLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "baseTouchSlop", "touchSlop", "horizontalDragFactor", "", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "aggressiveVerticalDrag", "", "onTouchScrollStart", "Lkotlin/Function0;", "", "onTouchScroll", "Lkotlin/Function1;", "onTouchScrollStop", "onOffsetChanged", "downRawX", "downRawY", "lastRawY", "dragStartOffset", "dragging", "blockDrag", "bindAppBar", "requestDisallowInterceptTouchEvent", "disallowIntercept", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "event", "currentBehavior", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "isExclusiveGestureTarget", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "x", "y", "resetGesture", TUIConstants.TIMPush.NOTIFICATION.ACTION, "dispatchScrollDelta", "rawY", "isVerticalDrag", "dx", "dy", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeDragProxyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeDragProxyLayout.kt\ncom/kubi/resources/widget/TradeDragProxyLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n1869#2,2:200\n*S KotlinDebug\n*F\n+ 1 TradeDragProxyLayout.kt\ncom/kubi/resources/widget/TradeDragProxyLayout\n*L\n167#1:200,2\n*E\n"})
public final class TradeDragProxyLayout extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public final int f44089b;

    /* JADX INFO: renamed from: c */
    public int f44090c;

    /* JADX INFO: renamed from: d */
    public float f44091d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AppBarLayout f44092e;

    /* JADX INFO: renamed from: f */
    public boolean f44093f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function0<Unit> f44094g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Function1<? super Integer, Unit> f44095h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Unit> f44096i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super Integer, Unit> f44097j;

    /* JADX INFO: renamed from: k */
    public float f44098k;

    /* JADX INFO: renamed from: l */
    public float f44099l;

    /* JADX INFO: renamed from: m */
    public float f44100m;

    /* JADX INFO: renamed from: n */
    public int f44101n;

    /* JADX INFO: renamed from: o */
    public boolean f44102o;

    /* JADX INFO: renamed from: p */
    public boolean f44103p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeDragProxyLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: f */
    public final void m54809f(int i11) {
        this.f44102o = false;
        this.f44103p = false;
        Function0<Unit> function0 = this.f44096i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeDragProxyLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final AppBarLayout.Behavior m54804a() {
        AppBarLayout appBarLayout = this.f44092e;
        if (appBarLayout == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return null;
        }
        CoordinatorLayout.Behavior behavior = layoutParams2.getBehavior();
        if (behavior instanceof AppBarLayout.Behavior) {
            return (AppBarLayout.Behavior) behavior;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m54805b(float f11) {
        Function1<? super Integer, Unit> function1;
        int iRoundToInt = MathKt.roundToInt(f11 - this.f44100m);
        this.f44100m = f11;
        if (iRoundToInt == 0 || (function1 = this.f44095h) == null) {
            return;
        }
        function1.invoke(Integer.valueOf(-iRoundToInt));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev2) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(ev2, "ev");
        int actionMasked = ev2.getActionMasked();
        if (actionMasked == 0) {
            this.f44098k = ev2.getRawX();
            this.f44099l = ev2.getRawY();
            this.f44100m = ev2.getRawY();
            AppBarLayout.Behavior behaviorM54804a = m54804a();
            this.f44101n = behaviorM54804a != null ? behaviorM54804a.getTopAndBottomOffset() : 0;
            this.f44102o = false;
            boolean zM54806c = m54806c(ev2);
            this.f44103p = zM54806c;
            if (!zM54806c && (function0 = this.f44094g) != null) {
                function0.invoke();
            }
        } else if (actionMasked == 1) {
            m54809f(ev2.getActionMasked());
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                m54809f(ev2.getActionMasked());
            }
        } else {
            if (this.f44103p) {
                return false;
            }
            if (m54808e(ev2.getRawX() - this.f44098k, ev2.getRawY() - this.f44099l)) {
                this.f44102o = true;
                this.f44100m = ev2.getRawY();
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        AppBarLayout appBarLayout = this.f44092e;
        if (appBarLayout == null) {
            return super.onTouchEvent(event);
        }
        AppBarLayout.Behavior behaviorM54804a = m54804a();
        if (behaviorM54804a == null) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f44098k = event.getRawX();
            this.f44099l = event.getRawY();
            this.f44100m = event.getRawY();
            this.f44101n = behaviorM54804a.getTopAndBottomOffset();
            this.f44102o = false;
            boolean zM54806c = m54806c(event);
            this.f44103p = zM54806c;
            return !zM54806c;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f44103p) {
                    return super.onTouchEvent(event);
                }
                if (!this.f44102o) {
                    if (!m54808e(event.getRawX() - this.f44098k, event.getRawY() - this.f44099l)) {
                        return super.onTouchEvent(event);
                    }
                    this.f44102o = true;
                    this.f44100m = event.getRawY();
                }
                m54805b(event.getRawY());
                int iCoerceIn = RangesKt.coerceIn(this.f44101n + MathKt.roundToInt(event.getRawY() - this.f44099l), -appBarLayout.getTotalScrollRange(), 0);
                if (behaviorM54804a.getTopAndBottomOffset() != iCoerceIn) {
                    behaviorM54804a.setTopAndBottomOffset(iCoerceIn);
                    Function1<? super Integer, Unit> function1 = this.f44097j;
                    if (function1 != null) {
                        function1.invoke(Integer.valueOf(Math.abs(iCoerceIn)));
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                return super.onTouchEvent(event);
            }
        }
        boolean z11 = this.f44102o;
        m54809f(event.getActionMasked());
        return z11 || super.onTouchEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (this.f44093f && disallowIntercept && !this.f44103p) {
            return;
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public /* synthetic */ TradeDragProxyLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m54806c(MotionEvent motionEvent) {
        return m54807d(this, motionEvent.getX(), motionEvent.getY());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m54807d(View view, float f11, float f12) {
        if (view.getVisibility() != 0 || f11 < 0.0f || f11 >= view.getWidth() || f12 < 0.0f || f12 >= view.getHeight()) {
            return false;
        }
        if (view instanceof ViewGroup) {
            for (View view2 : CollectionsKt.asReversed(SequencesKt.toList(ViewGroupKt.getChildren((ViewGroup) view)))) {
                if (m54807d(view2, f11 - view2.getLeft(), f12 - view2.getTop())) {
                    return true;
                }
            }
        }
        if (view instanceof AbsSeekBar) {
            return true;
        }
        String name = view.getClass().getName();
        Intrinsics.checkNotNull(name);
        if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "KcSeekBar", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) name, (CharSequence) "BubbleSeekBar", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) name, (CharSequence) "InputProgressView", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) name, (CharSequence) "PercentView", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m54808e(float f11, float f12) {
        if (Math.abs(f12) > this.f44090c && Math.abs(f12) > Math.abs(f11) * this.f44091d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradeDragProxyLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f44089b = scaledTouchSlop;
        this.f44090c = Math.max(1, scaledTouchSlop / 2);
        this.f44091d = 0.7f;
    }
}
