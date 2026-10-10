package com.kubi.resources.widget.chart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.kubi.resources.widget.chart.KuCoinPieChartView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KuCoinPieChartView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000eH\u0014J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0014J\b\u0010+\u001a\u00020$H\u0014J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\u0018\u0010.\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u000eH\u0002J6\u00100\u001a\u00020$2.\u00101\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u00130\u0012j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0013`\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u00130\u0012j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u0013`\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/KuCoinPieChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defaultWidth", "", "defaultHeight", "defaultStroke", "mTypeCount", "", "mWidth", "mHeight", "mList", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Lkotlin/collections/ArrayList;", "mRingPaint", "Landroid/graphics/Paint;", "mDrawPath", "Landroid/graphics/Path;", "mPathMeasure", "Landroid/graphics/PathMeasure;", "mValueAnimator", "Landroid/animation/ValueAnimator;", "mPathLength", "mEndDistance", "mPathStarts", "", "mPathEnds", "init", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onDetachedFromWindow", "drawRing", "calculatePaths", "dp2px", "dp", "setPieData", "list", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuCoinPieChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinPieChartView.kt\ncom/kubi/resources/widget/chart/KuCoinPieChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1869#2,2:153\n*S KotlinDebug\n*F\n+ 1 KuCoinPieChartView.kt\ncom/kubi/resources/widget/chart/KuCoinPieChartView\n*L\n127#1:153,2\n*E\n"})
public final class KuCoinPieChartView extends View {

    /* JADX INFO: renamed from: b */
    public final float f44428b;

    /* JADX INFO: renamed from: c */
    public final float f44429c;

    /* JADX INFO: renamed from: d */
    public final float f44430d;

    /* JADX INFO: renamed from: e */
    public int f44431e;

    /* JADX INFO: renamed from: f */
    public int f44432f;

    /* JADX INFO: renamed from: g */
    public int f44433g;

    /* JADX INFO: renamed from: h */
    public ArrayList<Pair<Integer, Double>> f44434h;

    /* JADX INFO: renamed from: i */
    public Paint f44435i;

    /* JADX INFO: renamed from: j */
    public Path f44436j;

    /* JADX INFO: renamed from: k */
    public PathMeasure f44437k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ValueAnimator f44438l;

    /* JADX INFO: renamed from: m */
    public float f44439m;

    /* JADX INFO: renamed from: n */
    public float f44440n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public List<Float> f44441o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public List<Float> f44442p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinPieChartView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44428b = m55057d(context2, 128);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f44429c = m55057d(context3, 128);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f44430d = m55057d(context4, 4);
        this.f44431e = 6;
        this.f44441o = new ArrayList();
        this.f44442p = new ArrayList();
        m55059g();
    }

    /* JADX INFO: renamed from: e */
    public final void m55058e() {
        Path path = new Path();
        float fMin = Math.min(this.f44432f, this.f44433g) / 2.0f;
        Paint paint = this.f44435i;
        PathMeasure pathMeasure = null;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            paint = null;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        Paint paint2 = this.f44435i;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            paint2 = null;
        }
        float strokeWidth2 = paint2.getStrokeWidth() / 2.0f;
        float f11 = 2 * fMin;
        Paint paint3 = this.f44435i;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            paint3 = null;
        }
        float strokeWidth3 = f11 - (paint3.getStrokeWidth() / 2.0f);
        Paint paint4 = this.f44435i;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            paint4 = null;
        }
        path.addArc(strokeWidth, strokeWidth2, strokeWidth3, f11 - (paint4.getStrokeWidth() / 2.0f), 270.0f, 360.0f);
        PathMeasure pathMeasure2 = this.f44437k;
        if (pathMeasure2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPathMeasure");
            pathMeasure2 = null;
        }
        pathMeasure2.setPath(path, false);
        PathMeasure pathMeasure3 = this.f44437k;
        if (pathMeasure3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPathMeasure");
        } else {
            pathMeasure = pathMeasure3;
        }
        this.f44439m = pathMeasure.getLength();
        m55056c();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.f44439m);
        this.f44438l = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(1000L);
        }
        ValueAnimator valueAnimator = this.f44438l;
        if (valueAnimator != null) {
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        }
        ValueAnimator valueAnimator2 = this.f44438l;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lw.f
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    KuCoinPieChartView.m55054f(this.f93837b, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.f44438l;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m55054f(KuCoinPieChartView kuCoinPieChartView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        kuCoinPieChartView.f44440n = ((Float) animatedValue).floatValue();
        kuCoinPieChartView.invalidate();
    }

    /* JADX INFO: renamed from: h */
    public static final void m55055h(KuCoinPieChartView kuCoinPieChartView, ArrayList arrayList) {
        kuCoinPieChartView.f44434h = arrayList;
        kuCoinPieChartView.f44431e = arrayList.size();
        kuCoinPieChartView.f44441o.clear();
        kuCoinPieChartView.f44442p.clear();
        kuCoinPieChartView.m55058e();
    }

    /* JADX INFO: renamed from: c */
    public final void m55056c() {
        ArrayList<Pair<Integer, Double>> arrayList = this.f44434h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mList");
            arrayList = null;
        }
        Iterator<T> it = arrayList.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            this.f44441o.add(Float.valueOf((float) (((double) this.f44439m) * dDoubleValue)));
            dDoubleValue += ((Number) pair.getSecond()).doubleValue();
            this.f44442p.add(Float.valueOf((float) (((double) this.f44439m) * dDoubleValue)));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m55059g() {
        Paint paint = new Paint();
        this.f44435i = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f44435i;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.f44435i;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            paint4 = null;
        }
        paint4.setColor(Color.parseColor("#5198FA"));
        Paint paint5 = this.f44435i;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
        } else {
            paint3 = paint5;
        }
        paint3.setStrokeWidth(this.f44430d);
        this.f44434h = new ArrayList<>();
        this.f44436j = new Path();
        this.f44437k = new PathMeasure();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f44440n == 0.0f) {
            return;
        }
        int i11 = this.f44431e;
        for (int i12 = 0; i12 < i11; i12++) {
            Path path = this.f44436j;
            Paint paint = null;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDrawPath");
                path = null;
            }
            path.reset();
            Path path2 = this.f44436j;
            if (path2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDrawPath");
                path2 = null;
            }
            path2.rLineTo(0.0f, 0.0f);
            Paint paint2 = this.f44435i;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
                paint2 = null;
            }
            ArrayList<Pair<Integer, Double>> arrayList = this.f44434h;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mList");
                arrayList = null;
            }
            paint2.setColor(arrayList.get(i12).getFirst().intValue());
            if (this.f44440n >= this.f44442p.get(i12).floatValue()) {
                PathMeasure pathMeasure = this.f44437k;
                if (pathMeasure == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPathMeasure");
                    pathMeasure = null;
                }
                float fFloatValue = this.f44441o.get(i12).floatValue();
                float fFloatValue2 = this.f44442p.get(i12).floatValue();
                Path path3 = this.f44436j;
                if (path3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDrawPath");
                    path3 = null;
                }
                pathMeasure.getSegment(fFloatValue, fFloatValue2, path3, true);
            } else {
                PathMeasure pathMeasure2 = this.f44437k;
                if (pathMeasure2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPathMeasure");
                    pathMeasure2 = null;
                }
                float fFloatValue3 = this.f44441o.get(i12).floatValue();
                float f11 = this.f44440n;
                Path path4 = this.f44436j;
                if (path4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDrawPath");
                    path4 = null;
                }
                pathMeasure2.getSegment(fFloatValue3, f11, path4, true);
            }
            Path path5 = this.f44436j;
            if (path5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDrawPath");
                path5 = null;
            }
            Paint paint3 = this.f44435i;
            if (paint3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRingPaint");
            } else {
                paint = paint3;
            }
            canvas.drawPath(path5, paint);
        }
    }

    public final void setPieData(@NotNull final ArrayList<Pair<Integer, Double>> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        post(new Runnable() { // from class: lw.e
            @Override // java.lang.Runnable
            public final void run() {
                KuCoinPieChartView.m55055h(this.f93835b, list);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final float m55057d(Context context, int i11) {
        return (i11 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator2 = this.f44438l;
        if (valueAnimator2 != null) {
            Intrinsics.checkNotNull(valueAnimator2);
            if (valueAnimator2.isRunning() && (valueAnimator = this.f44438l) != null) {
                valueAnimator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        int size2;
        if (View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824) {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        } else {
            size = (int) this.f44428b;
        }
        this.f44432f = size;
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        } else {
            size2 = (int) this.f44429c;
        }
        this.f44433g = size2;
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuCoinPieChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f44428b = m55057d(context2, 128);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f44429c = m55057d(context3, 128);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f44430d = m55057d(context4, 4);
        this.f44431e = 6;
        this.f44441o = new ArrayList();
        this.f44442p = new ArrayList();
        m55059g();
    }
}
