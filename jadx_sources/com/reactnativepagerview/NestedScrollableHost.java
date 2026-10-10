package com.reactnativepagerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NestedScrollableHost.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010(R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0016\u00101\u001a\u0004\u0018\u00010.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, m90084d2 = {"Lcom/reactnativepagerview/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "e", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "", "orientation", "", "delta", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(IF)Z", "", "b", "(Landroid/view/MotionEvent;)V", "Ljava/lang/Integer;", "getInitialIndex", "()Ljava/lang/Integer;", "setInitialIndex", "(Ljava/lang/Integer;)V", "initialIndex", "c", "Z", "getDidSetInitialIndex", "()Z", "setDidSetInitialIndex", "(Z)V", "didSetInitialIndex", "d", "I", "touchSlop", "F", "initialX", "f", "initialY", "g", "nativeGestureStarted", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "parentViewPager", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "react-native-pager-view_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class NestedScrollableHost extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Integer initialIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean didSetInitialIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int touchSlop;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public float initialX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float initialY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean nativeGestureStarted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final boolean getDidSetInitialIndex() {
        return this.didSetInitialIndex;
    }

    @Nullable
    public final Integer getInitialIndex() {
        return this.initialIndex;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        m68163b(e11);
        return super.onInterceptTouchEvent(e11);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        if (e11.getActionMasked() == 1 && this.nativeGestureStarted) {
            NativeGestureUtil.notifyNativeGestureEnded(this, e11);
            this.nativeGestureStarted = false;
        }
        return super.onTouchEvent(e11);
    }

    public final void setDidSetInitialIndex(boolean z11) {
        this.didSetInitialIndex = z11;
    }

    public final void setInitialIndex(@Nullable Integer num) {
        this.initialIndex = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewPager2 getParentViewPager() {
        View view;
        Object parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null && !(view instanceof ViewPager2)) {
                Object parent2 = view.getParent();
                if (!(parent2 instanceof View)) {
                    view = null;
                } else {
                    view = (View) parent2;
                }
            }
            if (!(view instanceof ViewPager2)) {
                return null;
            }
            return (ViewPager2) view;
        }
        view = null;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m68162a(int orientation, float delta) {
        int i11 = -((int) Math.signum(delta));
        if (orientation != 0) {
            if (orientation == 1) {
                View child = getChild();
                if (child == null) {
                    return false;
                }
                return child.canScrollVertically(i11);
            }
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 == null) {
            return false;
        }
        return child2.canScrollHorizontally(i11);
    }

    /* JADX INFO: renamed from: b */
    public final void m68163b(MotionEvent e11) {
        Integer numValueOf;
        boolean z11;
        float f11;
        boolean z12;
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            numValueOf = Integer.valueOf(parentViewPager.getOrientation());
        } else {
            numValueOf = null;
        }
        if (e11.getAction() == 0) {
            this.initialX = e11.getX();
            this.initialY = e11.getY();
            if (numValueOf != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        if (e11.getAction() == 2) {
            float x11 = e11.getX() - this.initialX;
            float y11 = e11.getY() - this.initialY;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            float fAbs = Math.abs(x11);
            float f12 = 1.0f;
            if (z11) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            float f13 = fAbs * f11;
            float fAbs2 = Math.abs(y11);
            if (!z11) {
                f12 = 0.5f;
            }
            float f14 = fAbs2 * f12;
            int i11 = this.touchSlop;
            if (f13 > i11 || f14 > i11) {
                NativeGestureUtil.notifyNativeGestureStarted(this, e11);
                this.nativeGestureStarted = true;
                if (numValueOf != null) {
                    if (f14 > f13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 == z12) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    int iIntValue = numValueOf.intValue();
                    if (!z11) {
                        x11 = y11;
                    }
                    if (m68162a(iIntValue, x11)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }
}
