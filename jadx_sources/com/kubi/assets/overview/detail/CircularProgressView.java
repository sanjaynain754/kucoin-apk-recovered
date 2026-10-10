package com.kubi.assets.overview.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.kubi.assets.R$color;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Typography;
import ro.C44128b;

/* JADX INFO: compiled from: CircularProgressView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0015J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/CircularProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "progressPaint", "Landroid/graphics/Paint;", "backgroundPaint", "textPaint", "progress", "", "progressColor", "totalAmount", "Ljava/math/BigDecimal;", "setProgress", "", "total", "setProgressColor", "color", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "spToPx", "sp", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CircularProgressView extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f18315b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f18316c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Paint f18317d;

    /* JADX INFO: renamed from: e */
    public float f18318e;

    /* JADX INFO: renamed from: f */
    public int f18319f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BigDecimal f18320g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircularProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m18601a(float f11, @Nullable BigDecimal bigDecimal) {
        this.f18318e = RangesKt.coerceIn(f11, 0.0f, 1.0f);
        this.f18320g = bigDecimal;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircularProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation", "DefaultLocale"})
    public void onDraw(@NotNull Canvas canvas) {
        String strM92642g;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f11 = 2;
        float fMin = (Math.min(width, height) / f11) - this.f18315b.getStrokeWidth();
        float f12 = width / f11;
        float f13 = height / f11;
        this.f18315b.setColor(this.f18319f);
        RectF rectF = new RectF(f12 - fMin, f13 - fMin, f12 + fMin, fMin + f13);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f18316c);
        canvas.drawArc(rectF, -90.0f, (-this.f18318e) * TXVodDownloadDataSource.QUALITY_360P, false, this.f18315b);
        float f14 = this.f18318e;
        if (100 * f14 >= 0.1f) {
            strM92642g = C42180b.m92642g(new BigDecimal(String.valueOf(this.f18318e)), null, null, 1, false, false, false, 59, null);
        } else if (f14 != 0.0f || C41014a.m89917B(this.f18320g)) {
            strM92642g = Typography.less + C42180b.m92642g(new BigDecimal(String.valueOf(0.001d)), null, null, 1, false, false, false, 59, null);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Typography.almostEqual);
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            sb2.append(C42180b.m92642g(bigDecimalValueOf, null, null, 0, false, false, false, 59, null));
            strM92642g = sb2.toString();
        }
        if (this.f18318e == 1.0f) {
            this.f18317d.setTextSize(m18602b(9.0f));
        } else {
            this.f18317d.setTextSize(m18602b(10.0f));
        }
        canvas.drawText(strM92642g, f12, f13 + (this.f18317d.getTextSize() / 3), this.f18317d);
    }

    public final void setProgressColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
        try {
            this.f18319f = Color.parseColor(color);
            invalidate();
        } catch (IllegalArgumentException unused) {
            C44128b.m97260d("coin detail color");
        }
    }

    public /* synthetic */ CircularProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: b */
    public final float m18602b(float f11) {
        return TypedValue.applyDimension(2, f11, getResources().getDisplayMetrics());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircularProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(10.0f);
        this.f18315b = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(10.0f);
        paint2.setColor(getResources().getColor(R$color.c_cover4));
        this.f18316c = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(getResources().getColor(R$color.c_text40));
        paint3.setTextSize(m18602b(10.0f));
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f18317d = paint3;
        this.f18319f = Color.parseColor("#25D17F");
    }
}
