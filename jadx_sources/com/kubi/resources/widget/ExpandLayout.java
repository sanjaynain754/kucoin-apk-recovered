package com.kubi.resources.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: ExpandLayout.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\tJ\u0010\u0010-\u001a\u00020+2\u0006\u0010,\u001a\u00020\tH\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u0012H\u0002J\u0006\u00101\u001a\u00020+J\b\u00102\u001a\u00020+H\u0014J\b\u00103\u001a\u00020+H\u0014J\b\u00104\u001a\u00020+H\u0002R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u0015¨\u00065"}, m90084d2 = {"Lcom/kubi/resources/widget/ExpandLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "expandHeight", "", "getExpandHeight", "()I", "setExpandHeight", "(I)V", "viewHeight", "getViewHeight", "setViewHeight", "isExpand", "", "()Z", "setExpand", "(Z)V", "animationDuration", "", "getAnimationDuration", "()J", "setAnimationDuration", "(J)V", "lock", "getLock", "setLock", "animation", "Landroid/animation/ValueAnimator;", "getAnimation", "()Landroid/animation/ValueAnimator;", "setAnimation", "(Landroid/animation/ValueAnimator;)V", "isAnimate", "setAnimate", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "initExpandHeight", "", "height", "setHeight", "animateToggle", "setExpandStatus", "expand", "reverseStatus", "onFinishInflate", "onDetachedFromWindow", "clearAnim", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ExpandLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public int f43795b;

    /* JADX INFO: renamed from: c */
    public int f43796c;

    /* JADX INFO: renamed from: d */
    public boolean f43797d;

    /* JADX INFO: renamed from: e */
    public long f43798e;

    /* JADX INFO: renamed from: f */
    public boolean f43799f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ValueAnimator f43800g;

    /* JADX INFO: renamed from: h */
    public boolean f43801h;

    /* JADX INFO: renamed from: com.kubi.resources.widget.ExpandLayout$a */
    /* JADX INFO: compiled from: ExpandLayout.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/resources/widget/ExpandLayout$animateToggle$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22918a extends AnimatorListenerAdapter {
        public C22918a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationCancel(animation);
            ExpandLayout.this.setAnimate(false);
            ExpandLayout.this.setLock(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            ExpandLayout.this.setAnimate(false);
            ExpandLayout.this.setLock(false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ExpandLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public final void m54502b(long j11) throws RuntimeException {
        if (this.f43796c == 0) {
            throw new RuntimeException("start height cannot be 0");
        }
        m54503d();
        ValueAnimator valueAnimatorOfFloat = this.f43797d ? ValueAnimator.ofFloat(this.f43796c, this.f43795b) : ValueAnimator.ofFloat(this.f43795b, this.f43796c);
        this.f43800g = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(j11);
        }
        ValueAnimator valueAnimator = this.f43800g;
        if (valueAnimator != null) {
            valueAnimator.setStartDelay(j11);
        }
        ValueAnimator valueAnimator2 = this.f43800g;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.resources.widget.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ExpandLayout.m54501c(this.f45215b, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.f43800g;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new C22918a());
        }
        ValueAnimator valueAnimator4 = this.f43800g;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
        this.f43799f = true;
    }

    public /* synthetic */ ExpandLayout(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public static final void m54501c(ExpandLayout expandLayout, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ValueAnimator valueAnimator = expandLayout.f43800g;
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        C44128b.m97268l(C23156u.m55567a(), "animateToggle: [" + animatedValue + ']');
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        expandLayout.setHeight((int) ((Float) animatedValue).floatValue());
    }

    private final void setExpandStatus(boolean expand) {
        this.f43797d = expand;
        m54502b(this.f43798e);
    }

    /* JADX INFO: renamed from: d */
    public final void m54503d() {
        ValueAnimator valueAnimator = this.f43800g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f43800g = null;
    }

    @Override // android.view.View
    @Nullable
    public final ValueAnimator getAnimation() {
        return this.f43800g;
    }

    /* JADX INFO: renamed from: getAnimationDuration, reason: from getter */
    public final long getF43798e() {
        return this.f43798e;
    }

    /* JADX INFO: renamed from: getExpandHeight, reason: from getter */
    public final int getF43795b() {
        return this.f43795b;
    }

    /* JADX INFO: renamed from: getLock, reason: from getter */
    public final boolean getF43799f() {
        return this.f43799f;
    }

    /* JADX INFO: renamed from: getViewHeight, reason: from getter */
    public final int getF43796c() {
        return this.f43796c;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        return this.f43801h;
    }

    public final void setAnimate(boolean z11) {
        this.f43801h = z11;
    }

    public final void setAnimation(@Nullable ValueAnimator valueAnimator) {
        this.f43800g = valueAnimator;
    }

    public final void setAnimationDuration(long j11) {
        this.f43798e = j11;
    }

    public final void setExpand(boolean z11) {
        this.f43797d = z11;
    }

    public final void setExpandHeight(int i11) {
        this.f43795b = i11;
    }

    public final void setLock(boolean z11) {
        this.f43799f = z11;
    }

    public final void setViewHeight(int i11) {
        this.f43796c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ExpandLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43798e = 200L;
    }

    private final void setHeight(int height) {
        getLayoutParams().height = height;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m54503d();
    }

    @Override // android.view.View
    public void onFinishInflate() throws RuntimeException {
        super.onFinishInflate();
        if (getChildCount() >= 1) {
        } else {
            throw new RuntimeException("the child view must be more than 1");
        }
    }
}
