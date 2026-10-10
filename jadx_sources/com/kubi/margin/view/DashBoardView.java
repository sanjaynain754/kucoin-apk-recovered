package com.kubi.margin.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.margin.view.DashBoardView;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$mipmap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Triple;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DashBoardView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0014J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0015J\b\u0010&\u001a\u00020\u001fH\u0014J&\u0010'\u001a\u00020\u001f2\u001e\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u00190\u0018J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020\u001aJ\u0006\u0010.\u001a\u00020\u001aR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/margin/view/DashBoardView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultWidth", "", "boardHeight", "boardWidth", "ringStroke", "", "bottomPadding", "ringPaint", "Landroid/graphics/Paint;", "bitmapPaint", "bitmap", "Landroid/graphics/Bitmap;", "mValueAnimator", "Landroid/animation/ValueAnimator;", "pairs", "", "Lkotlin/Triple;", "", "percent", "targetPercent", "maxPercent", "init", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDetachedFromWindow", "setData", "newParis", "setPercent", "newPercent", "animate", "", "getPercent", "getTargetPercent", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDashBoardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DashBoardView.kt\ncom/kubi/margin/view/DashBoardView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1869#2,2:169\n*S KotlinDebug\n*F\n+ 1 DashBoardView.kt\ncom/kubi/margin/view/DashBoardView\n*L\n91#1:169,2\n*E\n"})
public final class DashBoardView extends View {

    /* JADX INFO: renamed from: b */
    public final int f34224b;

    /* JADX INFO: renamed from: c */
    public int f34225c;

    /* JADX INFO: renamed from: d */
    public int f34226d;

    /* JADX INFO: renamed from: e */
    public float f34227e;

    /* JADX INFO: renamed from: f */
    public float f34228f;

    /* JADX INFO: renamed from: g */
    public Paint f34229g;

    /* JADX INFO: renamed from: h */
    public Paint f34230h;

    /* JADX INFO: renamed from: i */
    public Bitmap f34231i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ValueAnimator f34232j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public List<Triple<Double, Double, Integer>> f34233k;

    /* JADX INFO: renamed from: l */
    public double f34234l;

    /* JADX INFO: renamed from: m */
    public double f34235m;

    /* JADX INFO: renamed from: n */
    public double f34236n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashBoardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34224b = C5275i0.m6236a(36.0f);
        this.f34227e = C5275i0.m6236a(4.0f);
        this.f34228f = C5275i0.m6236a(1.0f);
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(0.6d);
        Triple triple = new Triple(dValueOf, dValueOf2, Integer.valueOf(R$color.primary));
        Double dValueOf3 = Double.valueOf(0.9d);
        this.f34233k = CollectionsKt.listOf((Object[]) new Triple[]{triple, new Triple(dValueOf2, dValueOf3, Integer.valueOf(R$color.complementary)), new Triple(dValueOf3, Double.valueOf(1.0d), Integer.valueOf(R$color.secondary))});
        this.f34236n = 1.0d;
        m40667b();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m40665d(DashBoardView dashBoardView, double d11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        dashBoardView.m40668c(d11, z11);
    }

    /* JADX INFO: renamed from: e */
    public static final void m40666e(DashBoardView dashBoardView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        dashBoardView.f34234l = Math.abs(((Float) animatedValue).floatValue());
        dashBoardView.invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final void m40667b() {
        Paint paint = new Paint();
        this.f34229g = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f34229g;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ringPaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.f34230h = paint3;
        paint3.setAntiAlias(true);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R$mipmap.bmargin_ic_needle);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
        this.f34231i = bitmapDecodeResource;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
      0x0006: PHI (r0v8 double) = (r0v0 double), (r0v1 double) binds: [B:3:0x0004, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    public final void m40668c(double d11, boolean z11) {
        double d12 = 0.0d;
        if (d11 < 0.0d) {
            d11 = d12;
        } else {
            d12 = this.f34236n;
            if (d11 > d12) {
                d11 = d12;
            }
        }
        this.f34235m = d11;
        if (!z11) {
            this.f34234l = d11;
            invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((float) (-this.f34234l), (float) d11);
        this.f34232j = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration((long) (((double) 600.0f) * ((this.f34234l + d11) / this.f34236n) * ((double) 2.0f)));
        }
        ValueAnimator valueAnimator = this.f34232j;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.f34232j;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xp.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    DashBoardView.m40666e(this.f103888b, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.f34232j;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: renamed from: getPercent, reason: from getter */
    public final double getF34234l() {
        return this.f34234l;
    }

    /* JADX INFO: renamed from: getTargetPercent, reason: from getter */
    public final double getF34235m() {
        return this.f34235m;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        double d11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f11 = this.f34227e;
        float f12 = this.f34228f;
        float f13 = 2;
        int i11 = this.f34226d;
        RectF rectF = new RectF((f11 / 2.0f) + (f12 / f13), (f11 / 2.0f) + (f12 / f13), (i11 - (f11 / 2.0f)) - (f12 / f13), (i11 - (f11 / 2.0f)) - (f12 / f13));
        Iterator<T> it = this.f34233k.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            Paint paint = this.f34229g;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ringPaint");
                paint = null;
            }
            paint.setColor(ContextCompat.getColor(getContext(), ((Number) triple.getThird()).intValue()));
            double d12 = 240;
            float fDoubleValue = (float) ((((Number) triple.getFirst()).doubleValue() * d12) - ((double) 210));
            float fDoubleValue2 = (float) (((((Number) triple.getSecond()).doubleValue() - ((Number) triple.getFirst()).doubleValue()) / this.f34236n) * d12);
            Paint paint2 = this.f34229g;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ringPaint");
                paint2 = null;
            }
            canvas.drawArc(rectF, fDoubleValue, fDoubleValue2, false, paint2);
        }
        canvas.save();
        int i12 = this.f34226d;
        Bitmap bitmap = this.f34231i;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap = null;
        }
        float width = (i12 - bitmap.getWidth()) / 2.0f;
        int i13 = this.f34225c;
        Bitmap bitmap2 = this.f34231i;
        if (bitmap2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap2 = null;
        }
        canvas.translate(width, ((i13 - bitmap2.getHeight()) / 2.0f) - (this.f34228f / 3));
        double d13 = this.f34234l / this.f34236n;
        if (d13 <= 0.5d) {
            double d14 = 116.0f;
            d11 = ((d13 * d14) / ((double) 0.5f)) - d14;
        } else {
            double d15 = 0.5f;
            d11 = ((d13 - d15) / d15) * ((double) 116.0f);
        }
        float f14 = (float) d11;
        Bitmap bitmap3 = this.f34231i;
        if (bitmap3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap3 = null;
        }
        float width2 = bitmap3.getWidth() / 2.0f;
        Bitmap bitmap4 = this.f34231i;
        if (bitmap4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap4 = null;
        }
        float height = bitmap4.getHeight();
        Bitmap bitmap5 = this.f34231i;
        if (bitmap5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap5 = null;
        }
        canvas.rotate(f14, width2, height - (bitmap5.getWidth() / 2.0f));
        Bitmap bitmap6 = this.f34231i;
        if (bitmap6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap6 = null;
        }
        canvas.drawBitmap(bitmap6, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
    }

    public final void setData(@NotNull List<Triple<Double, Double, Integer>> newParis) {
        Intrinsics.checkNotNullParameter(newParis, "newParis");
        if (newParis.isEmpty()) {
            return;
        }
        this.f34233k = newParis;
        this.f34236n = newParis.get(newParis.size() - 1).getSecond().doubleValue();
        invalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator2 = this.f34232j;
        if (valueAnimator2 != null) {
            Intrinsics.checkNotNull(valueAnimator2);
            if (valueAnimator2.isRunning() && (valueAnimator = this.f34232j) != null) {
                valueAnimator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824) {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        } else {
            size = this.f34224b;
        }
        this.f34226d = size;
        if (size > C5267e0.m6183e()) {
            this.f34226d = C5267e0.m6183e();
        }
        int i11 = this.f34226d;
        this.f34225c = i11;
        this.f34228f = i11 / 5.0f;
        this.f34227e = i11 * 0.10526316f;
        Paint paint = this.f34229g;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ringPaint");
            paint = null;
        }
        paint.setStrokeWidth(this.f34227e);
        setMeasuredDimension(this.f34226d, this.f34225c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashBoardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34224b = C5275i0.m6236a(36.0f);
        this.f34227e = C5275i0.m6236a(4.0f);
        this.f34228f = C5275i0.m6236a(1.0f);
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(0.6d);
        Triple triple = new Triple(dValueOf, dValueOf2, Integer.valueOf(R$color.primary));
        Double dValueOf3 = Double.valueOf(0.9d);
        this.f34233k = CollectionsKt.listOf((Object[]) new Triple[]{triple, new Triple(dValueOf2, dValueOf3, Integer.valueOf(R$color.complementary)), new Triple(dValueOf3, Double.valueOf(1.0d), Integer.valueOf(R$color.secondary))});
        this.f34236n = 1.0d;
        m40667b();
    }
}
