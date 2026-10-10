package com.trtc.uikit.livekit.features.livelist.view.singlecolumn;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LiveStatusView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\u0006\u0010\u0015\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\b\u0010\u001a\u001a\u00020\u0011H\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/LiveStatusView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "barPaint", "Landroid/graphics/Paint;", "barHeights", "", "animator", "Landroid/animation/ValueAnimator;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "startAnimation", "stopAnimation", "dp2px", "", "dp", "onAttachedToWindow", "onDetachedFromWindow", "Companion", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLiveStatusView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveStatusView.kt\ncom/trtc/uikit/livekit/features/livelist/view/singlecolumn/LiveStatusView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,91:1\n1#2:92\n470#3:93\n*S KotlinDebug\n*F\n+ 1 LiveStatusView.kt\ncom/trtc/uikit/livekit/features/livelist/view/singlecolumn/LiveStatusView\n*L\n25#1:93\n*E\n"})
public final class LiveStatusView extends View {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Companion f79115e = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f79116f = Color.parseColor("#FFFFFF");

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f79117b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final float[] f79118c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ValueAnimator f79119d;

    /* JADX INFO: compiled from: LiveStatusView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/features/livelist/view/singlecolumn/LiveStatusView$Companion;", "", "<init>", "()V", "BAR_COUNT", "", "BAR_WIDTH", "BAR_HEIGHT", "BAR_SPACING", "ANIM_DURATION", "COLOR", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveStatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final void m81471c() {
        ValueAnimator valueAnimator = this.f79119d;
        if (valueAnimator != null) {
            if (!valueAnimator.isRunning()) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.trtc.uikit.livekit.features.livelist.view.singlecolumn.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LiveStatusView.m81469d(this.f79146b, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.f79119d = valueAnimatorOfFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static final void m81469d(LiveStatusView liveStatusView, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        for (int i11 = 0; i11 < 3; i11++) {
            liveStatusView.f79118c[i11] = liveStatusView.m81470b(7 + ((float) (Math.sin(((double) (((i11 * 0.6f) + fFloatValue) % 1.0f)) * 3.141592653589793d) * ((double) 15))));
        }
        liveStatusView.invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m81472e() {
        ValueAnimator valueAnimator = this.f79119d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f11 = 2;
        float width = (getWidth() - m81470b(12.0f)) / f11;
        int height = getHeight() / 2;
        for (int i11 = 0; i11 < 3; i11++) {
            float fM81470b = width + (i11 * m81470b(5.0f));
            float f12 = height;
            canvas.drawRoundRect(fM81470b, f12 - (this.f79118c[i11] / f11), m81470b(2.0f) + fM81470b, (this.f79118c[i11] / f11) + f12, m81470b(2.0f), m81470b(2.0f), this.f79117b);
        }
    }

    public /* synthetic */ LiveStatusView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public final float m81470b(float f11) {
        return (f11 * getResources().getDisplayMetrics().density) + 0.5f;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m81471c();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m81472e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LiveStatusView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(f79116f);
        paint.setStyle(Paint.Style.FILL);
        this.f79117b = paint;
        float[] fArr = new float[3];
        for (int i12 = 0; i12 < 3; i12++) {
            fArr[i12] = m81470b(7.0f);
        }
        this.f79118c = fArr;
    }
}
