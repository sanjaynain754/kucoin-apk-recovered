package com.trtc.uikit.livekit.p180kc.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCRiskView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0002J\u0006\u0010\u001c\u001a\u00020\u0015J\b\u0010\u001d\u001a\u00020\u0015H\u0014R\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/trtc/uikit/livekit/kc/widget/KCRiskView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "clipContainer", "contentContainer", "Landroid/view/View;", "tvRiskTip", "Landroid/widget/TextView;", "animator", "Landroid/animation/ValueAnimator;", "speedPxPerSecond", "", "contentWidth", "setContent", "", "text", "", "shouldShow", "", "prepareAndStartIfNeeded", "restart", InterfaceC33730j9.f70350a, "onDetachedFromWindow", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCRiskView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRiskView.kt\ncom/trtc/uikit/livekit/kc/widget/KCRiskView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,160:1\n65#2,4:161\n37#2:165\n53#2:166\n72#2:167\n65#2,4:168\n37#2:172\n53#2:173\n72#2:174\n*S KotlinDebug\n*F\n+ 1 KCRiskView.kt\ncom/trtc/uikit/livekit/kc/widget/KCRiskView\n*L\n54#1:161,4\n54#1:165\n54#1:166\n54#1:167\n74#1:168,4\n74#1:172\n74#1:173\n74#1:174\n*E\n"})
public final class KCRiskView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FrameLayout f79257b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final View f79258c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextView f79259d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ValueAnimator f79260e;

    /* JADX INFO: renamed from: f */
    public float f79261f;

    /* JADX INFO: renamed from: g */
    public int f79262g;

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCRiskView$a */
    /* JADX INFO: compiled from: KCRiskView.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/trtc/uikit/livekit/kc/widget/KCRiskView$prepareAndStartIfNeeded$3$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C36440a extends AnimatorListenerAdapter {
        public C36440a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            KCRiskView.this.setVisibility(8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            KCRiskView.this.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCRiskView$b */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 KCRiskView.kt\ncom/trtc/uikit/livekit/kc/widget/KCRiskView\n*L\n1#1,414:1\n69#2:415\n70#2:418\n75#3,2:416\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC36441b implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC36441b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            KCRiskView.this.m81667c(true);
        }
    }

    /* JADX INFO: renamed from: com.trtc.uikit.livekit.kc.widget.KCRiskView$c */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "left", "", ViewProps.TOP, "right", ViewProps.BOTTOM, "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnNextLayout$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 KCRiskView.kt\ncom/trtc/uikit/livekit/kc/widget/KCRiskView\n*L\n1#1,414:1\n69#2:415\n70#2:417\n54#3:416\n*E\n"})
    public static final class ViewOnLayoutChangeListenerC36442c implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC36442c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            view.removeOnLayoutChangeListener(this);
            KCRiskView.m81665d(KCRiskView.this, false, 1, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCRiskView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m81667c(boolean z11) {
        CharSequence text = this.f79259d.getText();
        if (text == null || text.length() == 0 || this.f79257b.getWidth() <= 0) {
            return;
        }
        if (z11) {
            m81669g();
        }
        TextView textView = this.f79259d;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = -2;
        textView.setLayoutParams(layoutParams);
        View view = this.f79258c;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = -2;
        view.setLayoutParams(layoutParams2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(this.f79257b.getHeight(), getHeight()), Integer.MIN_VALUE);
        this.f79259d.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
        this.f79258c.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
        int iMax = Math.max(this.f79259d.getMeasuredWidth(), this.f79258c.getMeasuredWidth());
        this.f79262g = iMax;
        if (iMax <= 0) {
            return;
        }
        View view2 = this.f79258c;
        view2.layout(0, 0, iMax, view2.getMeasuredHeight());
        float width = this.f79257b.getWidth();
        float f11 = -this.f79262g;
        this.f79258c.setTranslationX(width);
        long jMax = Math.max(1L, (long) (((width - f11) / this.f79261f) * 1000.0f));
        setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(width, f11);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(jMax);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.trtc.uikit.livekit.kc.widget.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                KCRiskView.m81666e(this.f79298b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C36440a());
        valueAnimatorOfFloat.start();
        this.f79260e = valueAnimatorOfFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCRiskView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m81665d(KCRiskView kCRiskView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        kCRiskView.m81667c(z11);
    }

    /* JADX INFO: renamed from: e */
    public static final void m81666e(KCRiskView kCRiskView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View view = kCRiskView.f79258c;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationX(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: f */
    public final void m81668f(@NotNull String text, boolean z11) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (!z11) {
            m81669g();
            return;
        }
        setVisibility(0);
        this.f79259d.setText(text);
        if (this.f79257b.getWidth() > 0) {
            m81667c(true);
            return;
        }
        FrameLayout frameLayout = this.f79257b;
        if (!frameLayout.isLaidOut() || frameLayout.isLayoutRequested()) {
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC36441b());
        } else {
            m81667c(true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m81669g() {
        ValueAnimator valueAnimator = this.f79260e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f79260e = null;
        setVisibility(8);
    }

    public /* synthetic */ KCRiskView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81669g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public KCRiskView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f79261f = 160.0f;
        LayoutInflater.from(context).inflate(R$layout.live_kc_audience_risk_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.clipContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f79257b = frameLayout;
        View viewFindViewById2 = findViewById(R$id.contentContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f79258c = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.tvRiskTip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        this.f79259d = textView;
        textView.setSingleLine(true);
        textView.setEllipsize(null);
        textView.setMaxLines(1);
        textView.setHorizontallyScrolling(true);
        frameLayout.setClipToPadding(true);
        frameLayout.setClipChildren(true);
        if (frameLayout.isLaidOut() && !frameLayout.isLayoutRequested()) {
            m81665d(this, false, 1, null);
        } else {
            frameLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC36442c());
        }
    }
}
