package com.kubi.kumex.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.kumex.R$mipmap;
import com.kubi.kumex.R$string;
import com.kubi.kumex.view.LeverageGuideAnimView;
import com.kubi.utils.C27017c;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.math.MathKt;

/* JADX INFO: compiled from: LeverageGuideAnimView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0014J\u0018\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020,2\u0006\u00104\u001a\u000205H\u0014J\u0010\u00106\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u00107\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u00106\u001a\u00020\u001cH\u0002J\b\u00107\u001a\u00020\u001cH\u0002J\u0010\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\u001cH\u0002J\u0006\u0010:\u001a\u00020,J\b\u0010;\u001a\u00020,H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b(\u0010$R\u000e\u0010*\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/kumex/view/LeverageGuideAnimView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "deffStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPaint", "Landroid/graphics/Paint;", "mMatrix", "Landroid/graphics/Matrix;", "mRect", "Landroid/graphics/RectF;", "verticalDistance", "leverageBitmap", "Landroid/graphics/Bitmap;", "mainBitmap", "scaleBitmap", "profitBitmap", "marginBitmap", Snapshot.TARGET_HEIGHT, JPushConstants.Geofence.KEY_INTERVAL, "mDegrees", "", "mAlpha", "mHeight", "hintBitmap", "rightHintBitmap", "leftText", "", "getLeftText", "()Ljava/lang/String;", "leftText$delegate", "Lkotlin/Lazy;", "rightText", "getRightText", "rightText$delegate", "hintAlpha", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "calculateMeasuredDimension", "spec", "isWidth", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getCurrentRightVerticalLength", "getCurrentRightHorizontalLength", "dpToPx", "dps", "startAnim", "startNextAnim", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LeverageGuideAnimView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public Paint f30857b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public Matrix f30858c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final RectF f30859d;

    /* JADX INFO: renamed from: e */
    public final int f30860e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Bitmap f30861f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Bitmap f30862g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Bitmap f30863h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Bitmap f30864i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Bitmap f30865j;

    /* JADX INFO: renamed from: k */
    public final int f30866k;

    /* JADX INFO: renamed from: l */
    public final int f30867l;

    /* JADX INFO: renamed from: m */
    public float f30868m;

    /* JADX INFO: renamed from: n */
    public float f30869n;

    /* JADX INFO: renamed from: o */
    public float f30870o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Bitmap f30871p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final Bitmap f30872q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final Lazy f30873r;

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Lazy f30874s;

    /* JADX INFO: renamed from: t */
    public int f30875t;

    /* JADX INFO: renamed from: com.kubi.kumex.view.LeverageGuideAnimView$a */
    /* JADX INFO: compiled from: LeverageGuideAnimView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kumex/view/LeverageGuideAnimView$startAnim$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17077a extends AnimatorListenerAdapter {
        public C17077a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            super.onAnimationEnd(animation);
            LeverageGuideAnimView.this.m36678o();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeverageGuideAnimView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: o */
    public final void m36678o() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(15.0f, 0.0f, -15.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xm.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LeverageGuideAnimView.m36671p(this.f103825b, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(1000L);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xm.c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LeverageGuideAnimView.m36672q(this.f103831b, valueAnimator);
            }
        });
        valueAnimatorOfInt.setDuration(750L);
        valueAnimatorOfInt.setStartDelay(250L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeverageGuideAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float getCurrentRightHorizontalLength() {
        return (this.f30861f.getWidth() / 2.0f) * ((float) (((double) 1) - Math.cos((((double) this.f30868m) * 3.141592653589793d) / ((double) 180))));
    }

    private final float getCurrentRightVerticalLength() {
        return (float) (((double) (this.f30861f.getWidth() / 2.0f)) * Math.sin((((double) this.f30868m) * 3.141592653589793d) / ((double) 180)));
    }

    private final String getLeftText() {
        return (String) this.f30873r.getValue();
    }

    private final String getRightText() {
        return (String) this.f30874s.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static final String m36668k() {
        return C27017c.f54310a.m66516f(R$string.leverage_guide_left_hint, new Object[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final String m36669l() {
        return C27017c.f54310a.m66516f(R$string.leverage_guide_right_hint, new Object[0]);
    }

    /* JADX INFO: renamed from: n */
    public static final void m36670n(LeverageGuideAnimView leverageGuideAnimView, Ref.FloatRef floatRef, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        leverageGuideAnimView.f30869n = fFloatValue;
        leverageGuideAnimView.f30870o = floatRef.element * fFloatValue;
        leverageGuideAnimView.invalidate();
    }

    /* JADX INFO: renamed from: p */
    public static final void m36671p(LeverageGuideAnimView leverageGuideAnimView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        leverageGuideAnimView.f30868m = ((Float) animatedValue).floatValue();
        leverageGuideAnimView.invalidate();
    }

    /* JADX INFO: renamed from: q */
    public static final void m36672q(LeverageGuideAnimView leverageGuideAnimView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        leverageGuideAnimView.f30875t = ((Integer) animatedValue).intValue();
        leverageGuideAnimView.invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final float m36675i(float f11) {
        return (this.f30861f.getWidth() / 2.0f) * ((float) (((double) 1) - Math.cos((((double) f11) * 3.141592653589793d) / ((double) 180))));
    }

    /* JADX INFO: renamed from: j */
    public final float m36676j(float f11) {
        return (float) (((double) (this.f30861f.getWidth() / 2.0f)) * Math.sin((((double) f11) * 3.141592653589793d) / ((double) 180)));
    }

    /* JADX INFO: renamed from: m */
    public final void m36677m() {
        float height = (this.f30866k / this.f30862g.getHeight()) * 1.0f;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = m36674h(28.0f) / height;
        floatRef.element = ((((getHeight() - this.f30866k) + (floatRef.element / 2)) - getCurrentRightVerticalLength()) + this.f30865j.getHeight()) - m36674h(6.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xm.a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LeverageGuideAnimView.m36670n(this.f103822b, floatRef, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C17077a());
        valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setStartDelay(500L);
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float height = getHeight();
        float height2 = (this.f30866k / this.f30862g.getHeight()) * 1.0f;
        this.f30857b.reset();
        this.f30857b.setAntiAlias(true);
        this.f30858c.reset();
        float height3 = this.f30861f.getHeight();
        float width2 = this.f30861f.getWidth();
        float fM36674h = m36674h(28.0f) / height2;
        RectF rectF = this.f30859d;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = width2;
        rectF.bottom = height3;
        this.f30858c.mapRect(rectF);
        this.f30858c.postScale(height2, height2);
        float f11 = 2;
        float f12 = width2 / f11;
        this.f30858c.postRotate(this.f30868m, f12, height3 / f11);
        Matrix matrix = this.f30858c;
        float f13 = width;
        RectF rectF2 = this.f30859d;
        float f14 = fM36674h / f11;
        matrix.postTranslate(f13 - (rectF2.right / f11), ((height - this.f30866k) + f14) - (rectF2.bottom / f11));
        canvas.drawBitmap(this.f30861f, this.f30858c, this.f30857b);
        this.f30858c.reset();
        this.f30858c.postScale(height2, height2);
        RectF rectF3 = this.f30859d;
        rectF3.top = 0.0f;
        rectF3.left = 0.0f;
        rectF3.right = this.f30862g.getWidth();
        this.f30859d.bottom = this.f30862g.getHeight();
        this.f30858c.mapRect(this.f30859d);
        Matrix matrix2 = this.f30858c;
        RectF rectF4 = this.f30859d;
        matrix2.postTranslate(f13 - (rectF4.right / f11), height - rectF4.bottom);
        canvas.drawBitmap(this.f30862g, this.f30858c, this.f30857b);
        this.f30858c.reset();
        this.f30858c.postScale(height2, height2);
        RectF rectF5 = this.f30859d;
        rectF5.top = 0.0f;
        rectF5.left = 0.0f;
        rectF5.right = this.f30864i.getWidth();
        this.f30859d.bottom = this.f30864i.getHeight();
        this.f30858c.mapRect(this.f30859d);
        float f15 = f13 + f12;
        this.f30858c.postTranslate(((f15 - (this.f30859d.right / f11)) - getCurrentRightHorizontalLength()) - this.f30867l, (height - this.f30866k) + f14 + getCurrentRightVerticalLength() + (this.f30867l / 2));
        canvas.drawBitmap(this.f30864i, this.f30858c, this.f30857b);
        this.f30858c.reset();
        this.f30858c.postScale(height2, height2);
        RectF rectF6 = this.f30859d;
        rectF6.top = 0.0f;
        rectF6.left = 0.0f;
        rectF6.right = this.f30863h.getWidth();
        this.f30859d.bottom = this.f30863h.getHeight();
        this.f30858c.mapRect(this.f30859d);
        float f16 = f13 - f12;
        this.f30858c.postTranslate((f16 - (this.f30859d.right / f11)) + getCurrentRightHorizontalLength() + this.f30867l, (((height - this.f30866k) + f14) - getCurrentRightVerticalLength()) + (this.f30867l / 2));
        canvas.drawBitmap(this.f30863h, this.f30858c, this.f30857b);
        this.f30858c.reset();
        this.f30858c.postScale(height2, height2);
        RectF rectF7 = this.f30859d;
        rectF7.top = 0.0f;
        rectF7.left = 0.0f;
        rectF7.right = this.f30865j.getWidth();
        this.f30859d.bottom = this.f30865j.getHeight();
        this.f30858c.mapRect(this.f30859d);
        if (this.f30869n >= 1.0f) {
            this.f30858c.postTranslate((f16 - (this.f30859d.right / f11)) + getCurrentRightHorizontalLength() + this.f30867l, (((((height - this.f30866k) + f14) - getCurrentRightVerticalLength()) + this.f30865j.getHeight()) - m36674h(6.0f)) + (this.f30867l / 2));
        } else {
            this.f30858c.postTranslate((f16 - (this.f30859d.right / f11)) + getCurrentRightHorizontalLength() + this.f30867l, this.f30870o);
            this.f30857b.setAlpha((int) (this.f30869n * 100));
            this.f30857b.setStyle(Paint.Style.STROKE);
        }
        canvas.drawBitmap(this.f30865j, this.f30858c, this.f30857b);
        if (this.f30875t < 1) {
            return;
        }
        this.f30857b.reset();
        this.f30857b.setTextSize(m36674h(12.0f));
        this.f30857b.setColor(-1);
        this.f30857b.setTextAlign(Paint.Align.CENTER);
        this.f30857b.setAntiAlias(true);
        int i11 = this.f30875t;
        if (i11 < 100) {
            this.f30857b.setAlpha(i11);
            this.f30857b.setStyle(Paint.Style.STROKE);
        }
        this.f30858c.reset();
        float fMeasureText = this.f30857b.measureText(getLeftText()) + m36674h(13.0f);
        float width3 = fMeasureText > ((float) this.f30871p.getWidth()) ? fMeasureText / this.f30871p.getWidth() : 1.0f;
        float fM36675i = f16 + m36675i(-15.0f);
        RectF rectF8 = this.f30859d;
        rectF8.left = 0.0f;
        rectF8.top = 0.0f;
        rectF8.right = this.f30871p.getWidth();
        this.f30859d.bottom = this.f30871p.getHeight();
        this.f30858c.mapRect(this.f30859d);
        float fM36676j = ((((height - this.f30866k) + fM36674h) - m36676j(-15.0f)) - m36674h(8.0f)) + (this.f30867l / 2);
        if (width3 <= 1.0f) {
            fMeasureText = this.f30871p.getWidth();
        }
        float f17 = fMeasureText > fM36675i ? 0.0f : fM36675i - fMeasureText;
        this.f30858c.postTranslate(f17, fM36676j);
        this.f30858c.postScale(width3, 1.0f);
        canvas.drawBitmap(this.f30871p, this.f30858c, this.f30857b);
        canvas.drawText(getLeftText(), f17 + (fMeasureText / 2.0f), fM36676j + ((this.f30857b.descent() - this.f30857b.ascent()) / f11) + m36674h(11.0f), this.f30857b);
        this.f30858c.reset();
        this.f30859d.left = this.f30872q.getWidth();
        this.f30859d.right = getWidth();
        RectF rectF9 = this.f30859d;
        rectF9.top = 0.0f;
        rectF9.bottom = this.f30872q.getHeight();
        this.f30858c.mapRect(this.f30859d);
        float fMeasureText2 = this.f30857b.measureText(getRightText()) + m36674h(13.0f);
        float width4 = fMeasureText2 > ((float) this.f30872q.getWidth()) ? fMeasureText2 / this.f30871p.getWidth() : 1.0f;
        float fM36675i2 = f15 - m36675i(-15.0f);
        if (width4 <= 1.0f) {
            fMeasureText2 = this.f30872q.getWidth();
        }
        if (fMeasureText2 + fM36675i2 >= getWidth()) {
            fM36675i2 = getWidth() - fMeasureText2;
        }
        float height4 = this.f30864i.getHeight() + m36674h(12.0f);
        this.f30858c.postScale(width4, 1.0f);
        this.f30858c.postTranslate(fM36675i2, height4);
        canvas.drawBitmap(this.f30872q, this.f30858c, this.f30857b);
        canvas.drawText(getRightText(), fM36675i2 + (fMeasureText2 / f11), height4 + ((this.f30857b.descent() - this.f30857b.ascent()) / f11) + m36674h(15.75f), this.f30857b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverageGuideAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30857b = new Paint();
        this.f30859d = new RectF();
        this.f30866k = m36674h(180.0f);
        this.f30867l = m36674h(4.0f);
        this.f30868m = 15.0f;
        this.f30873r = LazyKt.lazy(new Function0() { // from class: xm.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeverageGuideAnimView.m36668k();
            }
        });
        this.f30874s = LazyKt.lazy(new Function0() { // from class: xm.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LeverageGuideAnimView.m36669l();
            }
        });
        this.f30857b.setAntiAlias(true);
        this.f30858c = new Matrix();
        Resources resources = getResources();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_leverage);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        this.f30861f = bitmapDecodeResource;
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_main);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource2, "decodeResource(...)");
        this.f30862g = bitmapDecodeResource2;
        Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_scale);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource3, "decodeResource(...)");
        this.f30863h = bitmapDecodeResource3;
        Bitmap bitmapDecodeResource4 = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_profit);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource4, "decodeResource(...)");
        this.f30864i = bitmapDecodeResource4;
        Bitmap bitmapDecodeResource5 = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_margin);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource5, "decodeResource(...)");
        this.f30865j = bitmapDecodeResource5;
        this.f30860e = (int) (((double) (bitmapDecodeResource.getWidth() / 2.0f)) * Math.sin(0.2617993877991494d));
        Bitmap bitmapDecodeResource6 = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_left_tip);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource6, "decodeResource(...)");
        this.f30871p = bitmapDecodeResource6;
        Bitmap bitmapDecodeResource7 = BitmapFactory.decodeResource(resources, R$mipmap.bkumex_leverage_guide_right_tip);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource7, "decodeResource(...)");
        this.f30872q = bitmapDecodeResource7;
    }

    /* JADX INFO: renamed from: g */
    public final int m36673g(int i11, boolean z11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                if (z11) {
                    return Math.min(size, this.f30861f.getWidth() + this.f30864i.getWidth());
                }
                return Math.min(size, m36674h(180.0f) + this.f30860e);
            }
            return size;
        }
        if (z11) {
            return Math.min(size, this.f30861f.getWidth() + this.f30864i.getWidth());
        }
        return Math.min(size, m36674h(172.0f) + this.f30860e);
    }

    /* JADX INFO: renamed from: h */
    public final int m36674h(float f11) {
        return MathKt.roundToInt(getResources().getDisplayMetrics().density * f11);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(m36673g(widthMeasureSpec, true), m36673g(heightMeasureSpec, false));
    }
}
