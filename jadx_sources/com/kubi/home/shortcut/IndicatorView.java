package com.kubi.home.shortcut;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: IndicatorView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\bH\u0016J\u0018\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0014J\u0010\u0010$\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(H\u0014J\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0014H\u0002J\u0010\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\bH\u0002J\b\u0010-\u001a\u00020\u0014H\u0002J\u0010\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\u0014H\u0002J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u00101\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0014J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u00104\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014J\u0010\u00105\u001a\u00020\u00002\b\b\u0001\u00106\u001a\u00020\bJ\u0010\u00107\u001a\u00020\u00002\b\b\u0001\u00108\u001a\u00020\bR\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u00069"}, m90084d2 = {"Lcom/kubi/home/shortcut/IndicatorView;", "Landroid/view/View;", "Lcom/kubi/home/shortcut/Indicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectedPage", "pagerCount", "unColor", "selectedColor", "indicatorPaint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "indicatorRadius", "", "indicatorRatio", "indicatorSelectedRadius", "indicatorSelectedRatio", "indicatorSpacing", "ratioRadius", "getRatioRadius", "()F", "initIndicatorCount", "", "currentPage", "onPageSelected", ViewProps.POSITION, "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "measureWidth", "measureHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawDash", "midY", "indicatorStartX", "index", "getRatioSelectedRadius", "dip2px", "dp", "setIndicatorRadius", "setIndicatorRatio", "setIndicatorSelectedRadius", "setIndicatorSelectedRatio", "setIndicatorSpacing", "setIndicatorColor", "indicatorColor", "setIndicatorSelectorColor", "indicatorSelectorColor", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IndicatorView extends View {

    /* JADX INFO: renamed from: b */
    public int f26214b;

    /* JADX INFO: renamed from: c */
    public int f26215c;

    /* JADX INFO: renamed from: d */
    public int f26216d;

    /* JADX INFO: renamed from: e */
    public int f26217e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Paint f26218f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final RectF f26219g;

    /* JADX INFO: renamed from: h */
    public float f26220h;

    /* JADX INFO: renamed from: i */
    public float f26221i;

    /* JADX INFO: renamed from: j */
    public float f26222j;

    /* JADX INFO: renamed from: k */
    public float f26223k;

    /* JADX INFO: renamed from: l */
    public float f26224l;

    @JvmOverloads
    public IndicatorView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public IndicatorView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final float getRatioRadius() {
        return this.f26220h * this.f26221i;
    }

    private final float getRatioSelectedRadius() {
        return this.f26222j * this.f26223k;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f26215c == 0) {
            return;
        }
        m30252b(canvas, (getHeight() / 2.0f) + 0.5f);
    }

    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: a */
    public final int m30251a(float f11) {
        return (int) (f11 * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public final void m30252b(Canvas canvas, float f11) {
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float f12 = ratioSelectedRadius - ratioRadius;
        this.f26218f.setColor(this.f26216d);
        int i11 = this.f26215c;
        for (int i12 = 0; i12 < i11; i12++) {
            float fM30253c = m30253c(i12);
            float f13 = fM30253c - ratioRadius;
            float f14 = this.f26220h;
            float f15 = f11 - f14;
            float f16 = fM30253c + ratioRadius;
            float f17 = f14 + f11;
            if (this.f26214b + 1 <= i12) {
                this.f26219g.set(f13 + f12, f15, f16 + f12, f17);
            } else {
                this.f26219g.set(f13, f15, f16, f17);
            }
            RectF rectF = this.f26219g;
            float f18 = this.f26220h;
            canvas.drawRoundRect(rectF, f18, f18, this.f26218f);
        }
        this.f26218f.setColor(this.f26217e);
        float fM30253c2 = m30253c(this.f26214b) - ratioSelectedRadius;
        float f19 = (ratioSelectedRadius * 2) + fM30253c2 + f12;
        RectF rectF2 = this.f26219g;
        float f21 = this.f26222j;
        rectF2.set(fM30253c2, f11 - f21, f19, f11 + f21);
        RectF rectF3 = this.f26219g;
        float f22 = this.f26222j;
        canvas.drawRoundRect(rectF3, f22, f22, this.f26218f);
    }

    /* JADX INFO: renamed from: c */
    public final float m30253c(int i11) {
        float fMax = Math.max(getRatioRadius(), getRatioSelectedRadius());
        return fMax + getPaddingLeft() + (((2.0f * fMax) + this.f26224l) * i11);
    }

    /* JADX INFO: renamed from: d */
    public final int m30254d(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        return (int) ((RangesKt.coerceAtLeast(getRatioSelectedRadius(), getRatioRadius()) * 2) + getPaddingTop() + getPaddingBottom());
    }

    /* JADX INFO: renamed from: e */
    public final int m30255e(int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float fCoerceAtLeast = RangesKt.coerceAtLeast(ratioSelectedRadius, ratioRadius) * 2;
        int i12 = this.f26215c;
        return (int) ((fCoerceAtLeast * i12) + ((i12 - 1) * this.f26224l) + (ratioSelectedRadius - ratioRadius) + getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(m30255e(widthMeasureSpec), m30254d(heightMeasureSpec));
    }

    @JvmOverloads
    public IndicatorView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f26215c = 1;
        this.f26216d = -7829368;
        this.f26217e = -1;
        this.f26218f = new Paint(1);
        this.f26219g = new RectF();
        this.f26220h = m30251a(3.5f);
        this.f26221i = 1.0f;
        this.f26222j = m30251a(3.5f);
        this.f26223k = 1.0f;
        this.f26224l = m30251a(10.0f);
    }
}
