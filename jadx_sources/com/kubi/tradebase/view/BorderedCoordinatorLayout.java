package com.kubi.tradebase.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.res.R$color;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BorderedCoordinatorLayout.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H\u0014J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/tradebase/view/BorderedCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mPath", "Landroid/graphics/Path;", "mRectF", "Landroid/graphics/RectF;", "mBorderPaint", "Landroid/graphics/Paint;", "mBorderWidth", "", "mRadius", "mBorderColor", "", "init", "", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dpToPx", "dp", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BorderedCoordinatorLayout extends CoordinatorLayout {

    /* JADX INFO: renamed from: b */
    public Path f51681b;

    /* JADX INFO: renamed from: c */
    public RectF f51682c;

    /* JADX INFO: renamed from: d */
    public Paint f51683d;

    /* JADX INFO: renamed from: e */
    public final float f51684e;

    /* JADX INFO: renamed from: f */
    public final float f51685f;

    /* JADX INFO: renamed from: g */
    public final int f51686g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderedCoordinatorLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51684e = m63403a(1.0f);
        this.f51685f = m63403a(16.0f);
        this.f51686g = C27017c.f54310a.m66512a(R$color.color_00000000_14F3F3F3);
        m63402b();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        RectF rectF = this.f51682c;
        RectF rectF2 = null;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRectF");
            rectF = null;
        }
        rectF.set(0.0f, 0.0f, w11, h11);
        Path path = this.f51681b;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
            path = null;
        }
        path.reset();
        Path path2 = this.f51681b;
        if (path2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
            path2 = null;
        }
        RectF rectF3 = this.f51682c;
        if (rectF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRectF");
        } else {
            rectF2 = rectF3;
        }
        float f11 = this.f51685f;
        path2.addRoundRect(rectF2, new float[]{f11, f11, f11, f11, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: b */
    private final void m63402b() {
        this.f51681b = new Path();
        this.f51682c = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f51684e);
        paint.setColor(this.f51686g);
        paint.setAntiAlias(true);
        this.f51683d = paint;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        Path path = this.f51681b;
        Paint paint = null;
        if (path == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPath");
            path = null;
        }
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f51685f);
        float f11 = 2;
        float f12 = this.f51685f;
        path2.arcTo(0.0f, 0.0f, f11 * f12, f11 * f12, 180.0f, 90.0f, false);
        path2.lineTo(getWidth() - this.f51685f, 0.0f);
        path2.arcTo(getWidth() - (this.f51685f * f11), 0.0f, getWidth(), f11 * this.f51685f, -90.0f, 90.0f, false);
        Paint paint2 = this.f51683d;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBorderPaint");
        } else {
            paint = paint2;
        }
        canvas.drawPath(path2, paint);
    }

    /* JADX INFO: renamed from: a */
    public final float m63403a(float f11) {
        return f11 * getContext().getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderedCoordinatorLayout(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f51684e = m63403a(1.0f);
        this.f51685f = m63403a(16.0f);
        this.f51686g = C27017c.f54310a.m66512a(R$color.color_00000000_14F3F3F3);
        m63402b();
    }
}
