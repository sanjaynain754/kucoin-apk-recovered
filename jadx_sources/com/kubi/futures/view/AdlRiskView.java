package com.kubi.futures.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.C5303w0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.R$color;
import com.kubi.kumex.utils.Log;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AdlRiskView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u000e\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/view/AdlRiskView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", FirebaseAnalytics.Param.LEVEL, "", "levelWidth", "rectF", "Landroid/graphics/RectF;", "color", "defaultColor", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setLevel", "dpToPx", "dps", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AdlRiskView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f24970b;

    /* JADX INFO: renamed from: c */
    public float f24971c;

    /* JADX INFO: renamed from: d */
    public float f24972d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final RectF f24973e;

    /* JADX INFO: renamed from: f */
    public int f24974f;

    /* JADX INFO: renamed from: g */
    public final int f24975g;

    public AdlRiskView(@Nullable Context context) {
        this(context, null);
    }

    public AdlRiskView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float paddingTop = getPaddingTop();
        float height = getHeight() - getPaddingBottom();
        boolean zM6511a = C5303w0.m6511a();
        int width = getWidth();
        for (int i11 = 0; i11 < 5; i11++) {
            if (zM6511a) {
                float paddingStart = width - (((i11 * 2) * this.f24972d) + getPaddingStart());
                this.f24973e.set(paddingStart - this.f24972d, paddingTop, paddingStart, height);
            } else {
                float paddingStart2 = (i11 * 2 * this.f24972d) + getPaddingStart();
                this.f24973e.set(paddingStart2, paddingTop, this.f24972d + paddingStart2, height);
            }
            if (this.f24971c > i11) {
                this.f24970b.setColor(this.f24974f);
            } else {
                this.f24970b.setColor(this.f24975g);
            }
            RectF rectF = this.f24973e;
            float f11 = this.f24972d;
            canvas.drawRoundRect(rectF, f11, f11, this.f24970b);
        }
    }

    public final void setLevel(float level) {
        int i11;
        Log.f30813a.m36615a("ADLRiskView", String.valueOf(level));
        float fCeil = (float) Math.ceil(level * 5);
        this.f24971c = fCeil;
        if (fCeil < 1.0f) {
            i11 = R$color.c_icon40;
        } else if (fCeil <= 2.0f) {
            i11 = R$color.primary;
        } else {
            i11 = fCeil <= 3.0f ? R$color.complementary : R$color.secondary;
        }
        this.f24974f = C27017c.f54310a.m66512a(i11);
        invalidate();
    }

    public AdlRiskView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        this.f24970b = paint;
        this.f24973e = new RectF();
        C27017c c27017c = C27017c.f54310a;
        int i12 = R$color.c_icon40;
        this.f24974f = c27017c.m66512a(i12);
        this.f24975g = c27017c.m66512a(i12);
        paint.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public final float m28813a(int i11) {
        return (getResources().getDisplayMetrics().density * i11) + 0.5f;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float fM28813a;
        float fM28813a2;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == 1073741824) {
            fM28813a = size / 9.0f;
        } else {
            fM28813a = m28813a(2);
        }
        this.f24972d = fM28813a;
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode2 == 1073741824) {
            fM28813a2 = size2 * 1.0f;
        } else {
            fM28813a2 = m28813a(8) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(((int) ((this.f24972d * 9) + 0.5f)) + getPaddingStart() + getPaddingEnd(), (int) fM28813a2);
    }
}
