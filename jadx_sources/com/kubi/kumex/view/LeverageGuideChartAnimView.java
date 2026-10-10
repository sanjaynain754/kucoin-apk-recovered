package com.kubi.kumex.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.kubi.kumex.R$color;
import com.kubi.kumex.view.LeverageGuideChartAnimView;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LeverageGuideChartAnimView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0015J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m90084d2 = {"Lcom/kubi/kumex/view/LeverageGuideChartAnimView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "deffStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPaint", "Landroid/graphics/Paint;", "mPoints", "Ljava/util/ArrayList;", "Landroid/graphics/Point;", "Lkotlin/collections/ArrayList;", "mPath", "Landroid/graphics/Path;", "mPathShader", "shader", "Landroid/graphics/Shader;", "color", "Ljava/lang/Integer;", "mPaintFlagsDrawFilter", "Landroid/graphics/PaintFlagsDrawFilter;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "pathReset", "initPoints", "green", "", "currentPosition", "", "startAnim", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeverageGuideChartAnimView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverageGuideChartAnimView.kt\ncom/kubi/kumex/view/LeverageGuideChartAnimView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1878#2,3:159\n*S KotlinDebug\n*F\n+ 1 LeverageGuideChartAnimView.kt\ncom/kubi/kumex/view/LeverageGuideChartAnimView\n*L\n67#1:159,3\n*E\n"})
public final class LeverageGuideChartAnimView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f30877b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ArrayList<Point> f30878c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Path f30879d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Path f30880e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Shader f30881f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Integer f30882g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final PaintFlagsDrawFilter f30883h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final float[] f30884i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeverageGuideChartAnimView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public final void m36683d(boolean z11) {
        setVisibility(0);
        this.f30881f = z11 ? new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), Color.parseColor("#2A2dbd96"), Color.parseColor("#002dbd96"), Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), Color.parseColor("#2ADB5F5E"), Color.parseColor("#00DB5F5E"), Shader.TileMode.CLAMP);
        this.f30882g = Integer.valueOf(getResources().getColor(z11 ? R$color.primary : R$color.secondary));
        m36681b(z11);
        m36682c();
        float[] fArr = this.f30884i;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        final PathMeasure pathMeasure = new PathMeasure(this.f30879d, false);
        this.f30879d.reset();
        this.f30880e.reset();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        valueAnimatorOfFloat.setDuration(1100L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xm.d0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LeverageGuideChartAnimView.m36680e(this.f103834b, pathMeasure, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LeverageGuideChartAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: e */
    public static final void m36680e(LeverageGuideChartAnimView leverageGuideChartAnimView, PathMeasure pathMeasure, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        float[] fArr = leverageGuideChartAnimView.f30884i;
        float f11 = fArr[0];
        if (f11 != -1.0f) {
            float f12 = fArr[1];
            if (f12 != -1.0f) {
                leverageGuideChartAnimView.f30880e.lineTo(f11, f12);
            }
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        pathMeasure.getPosTan(fFloatValue, leverageGuideChartAnimView.f30884i, null);
        if (fFloatValue == 0.0f) {
            leverageGuideChartAnimView.f30879d.moveTo(leverageGuideChartAnimView.f30878c.get(0).x, leverageGuideChartAnimView.f30878c.get(0).y);
            leverageGuideChartAnimView.f30880e.moveTo(0.0f, leverageGuideChartAnimView.getHeight());
            leverageGuideChartAnimView.f30880e.lineTo(leverageGuideChartAnimView.f30878c.get(0).x, leverageGuideChartAnimView.f30878c.get(0).y);
        }
        Path path = leverageGuideChartAnimView.f30880e;
        float[] fArr2 = leverageGuideChartAnimView.f30884i;
        path.lineTo(fArr2[0], fArr2[1]);
        leverageGuideChartAnimView.f30880e.lineTo(leverageGuideChartAnimView.f30884i[0], leverageGuideChartAnimView.getHeight());
        pathMeasure.getSegment(0.0f, fFloatValue, leverageGuideChartAnimView.f30879d, true);
        leverageGuideChartAnimView.invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final void m36682c() {
        this.f30879d.reset();
        this.f30880e.reset();
        int i11 = 0;
        for (Object obj : this.f30878c) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Point point = (Point) obj;
            if (i11 == 0) {
                this.f30880e.moveTo(point.x, point.y);
                this.f30879d.moveTo(point.x, point.y);
            } else {
                this.f30880e.lineTo(point.x, point.y);
                this.f30879d.lineTo(point.x, point.y);
            }
            i11 = i12;
        }
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.setDrawFilter(this.f30883h);
        this.f30877b.reset();
        this.f30877b.setAntiAlias(true);
        this.f30877b.setStrokeWidth(2.0f);
        Shader shader = this.f30881f;
        if (shader != null) {
            this.f30877b.setShader(shader);
        }
        canvas.drawPath(this.f30880e, this.f30877b);
        this.f30877b.reset();
        this.f30877b.setStyle(Paint.Style.STROKE);
        this.f30877b.setAntiAlias(true);
        Integer num = this.f30882g;
        if (num != null) {
            this.f30877b.setColor(num.intValue());
        }
        this.f30877b.setStrokeWidth(2.0f);
        canvas.drawPath(this.f30879d, this.f30877b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeverageGuideChartAnimView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f30877b = paint;
        this.f30878c = new ArrayList<>();
        this.f30879d = new Path();
        this.f30880e = new Path();
        this.f30883h = new PaintFlagsDrawFilter(0, 1);
        paint.setAntiAlias(true);
        this.f30884i = new float[2];
    }

    /* JADX INFO: renamed from: b */
    public final void m36681b(boolean z11) {
        int width = getWidth();
        int height = getHeight();
        this.f30878c.clear();
        if (z11) {
            float f11 = height;
            this.f30878c.add(new Point(0, (int) (0.86715f * f11)));
            float f12 = width;
            this.f30878c.add(new Point((int) (0.14285f * f12), (int) (0.77429f * f11)));
            this.f30878c.add(new Point((int) (0.28571f * f12), (int) (0.41857f * f11)));
            this.f30878c.add(new Point((int) (0.42857f * f12), (int) (0.64143f * f11)));
            this.f30878c.add(new Point((int) (0.57142f * f12), (int) (0.69429f * f11)));
            int i11 = (int) (f11 * 0.37857f);
            this.f30878c.add(new Point((int) (0.71428f * f12), i11));
            this.f30878c.add(new Point((int) (f12 * 0.85714f), i11));
            this.f30878c.add(new Point(width, 0));
            return;
        }
        this.f30878c.add(new Point(0, 0));
        float f13 = width;
        float f14 = height;
        this.f30878c.add(new Point((int) (0.14285f * f13), (int) (0.11286f * f14)));
        this.f30878c.add(new Point((int) (0.28571f * f13), (int) (0.44857f * f14)));
        this.f30878c.add(new Point((int) (0.42857f * f13), (int) (0.20286f * f14)));
        this.f30878c.add(new Point((int) (0.57142f * f13), (int) (0.15715f * f14)));
        int i12 = (int) (0.50915f * f14);
        this.f30878c.add(new Point((int) (0.71428f * f13), i12));
        this.f30878c.add(new Point((int) (f13 * 0.85714f), i12));
        this.f30878c.add(new Point(width, (int) (f14 * 0.88715f)));
    }
}
