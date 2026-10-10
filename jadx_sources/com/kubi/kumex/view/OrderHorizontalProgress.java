package com.kubi.kumex.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$font;
import com.kubi.kumex.view.OrderHorizontalProgress;
import com.kubi.resources.C22890g;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OrderHorizontalProgress.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0014J\u0010\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020$H\u0002J\b\u00100\u001a\u00020\u0014H\u0002J\b\u00101\u001a\u00020\u001aH\u0002J\b\u00102\u001a\u00020\u001aH\u0002J.\u00103\u001a\u00020(2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$J\u0010\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020$H\u0002J\u0010\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020$H\u0002J\u0010\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0004\n\u0002\u0010%R\u000e\u0010&\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/kumex/view/OrderHorizontalProgress;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "bgPaint", "progressPaint", "currentText", "", "totalText", "backgroundLinearGradient", "Landroid/graphics/LinearGradient;", "getBackgroundLinearGradient", "()Landroid/graphics/LinearGradient;", "backgroundLinearGradient$delegate", "Lkotlin/Lazy;", "progress", "", "progressText", "progressColor", "currentColor", "totalColor", "progressLinearGradient", "current", "Ljava/math/BigDecimal;", "total", "isUp", "", "Ljava/lang/Boolean;", "change", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getTextBaseLine", "isRTL", "getProgressLinearGradient", "getStart", "getEnd", "setProgress", "getProgressStartColor", "green", "getProgressEndColor", "dpToPx", "dps", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class OrderHorizontalProgress extends View {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f30886b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f30887c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Paint f30888d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public String f30889e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public String f30890f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f30891g;

    /* JADX INFO: renamed from: h */
    public float f30892h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public String f30893i;

    /* JADX INFO: renamed from: j */
    public int f30894j;

    /* JADX INFO: renamed from: k */
    public int f30895k;

    /* JADX INFO: renamed from: l */
    public int f30896l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public LinearGradient f30897m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public BigDecimal f30898n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public BigDecimal f30899o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Boolean f30900p;

    /* JADX INFO: renamed from: q */
    public boolean f30901q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderHorizontalProgress(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderHorizontalProgress(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearGradient getBackgroundLinearGradient() {
        return (LinearGradient) this.f30891g.getValue();
    }

    private final LinearGradient getProgressLinearGradient() {
        LinearGradient linearGradient;
        if (this.f30897m == null || this.f30901q) {
            this.f30901q = false;
            if (this.f30894j == C27017c.f54310a.m66512a(R$color.primary)) {
                linearGradient = new LinearGradient(getStart(), 0.0f, getEnd(), getMeasuredHeight(), m36693f() ? m36691d(true) : m36692e(true), m36693f() ? m36692e(true) : m36691d(true), Shader.TileMode.CLAMP);
            } else {
                linearGradient = new LinearGradient(getStart(), 0.0f, getEnd(), getMeasuredHeight(), m36693f() ? m36691d(false) : m36692e(false), m36693f() ? m36692e(false) : m36691d(false), Shader.TileMode.CLAMP);
            }
            this.f30897m = linearGradient;
        }
        LinearGradient linearGradient2 = this.f30897m;
        Intrinsics.checkNotNull(linearGradient2);
        return linearGradient2;
    }

    private final float getTextBaseLine() {
        Paint.FontMetrics fontMetrics = this.f30886b.getFontMetrics();
        float measuredHeight = getMeasuredHeight() / 2;
        float f11 = fontMetrics.bottom;
        return (measuredHeight + ((f11 - fontMetrics.top) / 2)) - f11;
    }

    /* JADX INFO: renamed from: d */
    public final int m36691d(boolean z11) {
        if (DayNightThemeManager.f28592a.m33187l()) {
            return z11 ? Color.parseColor("#FFEAF8F4") : Color.parseColor("#FFFFF1F1");
        }
        return z11 ? Color.parseColor("#FF122329") : Color.parseColor("#FF272028");
    }

    /* JADX INFO: renamed from: e */
    public final int m36692e(boolean z11) {
        if (DayNightThemeManager.f28592a.m33187l()) {
            return Color.parseColor("#00FBFBFB");
        }
        return z11 ? Color.parseColor("#00161A23") : Color.parseColor("#00151923");
    }

    /* JADX INFO: renamed from: g */
    public final void m36694g(@NotNull BigDecimal current, @NotNull BigDecimal total, @NotNull String currentText, @NotNull String totalText, boolean z11) {
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(currentText, "currentText");
        Intrinsics.checkNotNullParameter(totalText, "totalText");
        this.f30900p = Boolean.valueOf(z11);
        this.f30901q = true;
        try {
            bigDecimalAbs = current.divide(total, 4, RoundingMode.HALF_UP).abs();
        } catch (Exception unused) {
            bigDecimalAbs = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalAbs;
        this.f30892h = bigDecimal.floatValue() * 100;
        Intrinsics.checkNotNull(bigDecimal);
        this.f30893i = C42180b.m92642g(bigDecimal, null, null, 0, false, false, false, 63, null);
        this.f30898n = current;
        this.f30899o = total;
        this.f30889e = currentText;
        if (totalText.length() == 0) {
            this.f30890f = totalText;
        } else {
            if (!z11) {
                totalText = C27041f.m66668h(C42828b.m93911l(totalText));
            }
            this.f30890f = totalText;
        }
        this.f30894j = C22890g.m54281f(C27017c.f54310a.m66513b(), z11);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        String strM93911l = C42828b.m93911l(this.f30889e);
        if (strM93911l == null) {
            strM93911l = this.f30889e;
        }
        String str = strM93911l;
        if (this.f30890f.length() == 0) {
            this.f30886b.setColor(this.f30895k);
            this.f30886b.setTextSize(m36690c(14));
            canvas.drawText(str, m36693f() ? width - this.f30886b.measureText(str) : 0.0f, getTextBaseLine(), this.f30886b);
            return;
        }
        if (!m36693f()) {
            this.f30887c.setShader(getBackgroundLinearGradient());
            canvas.drawRoundRect(0.0f, 0.0f, width, height, m36690c(4), m36690c(4), this.f30887c);
            if (this.f30892h > 0.0f) {
                this.f30888d.setShader(getProgressLinearGradient());
                canvas2 = canvas;
                canvas2.drawRoundRect(0.0f, 0.0f, (width * this.f30892h) / 100, height, m36690c(4), m36690c(4), this.f30888d);
                this.f30886b.setShader(null);
                this.f30886b.setTextSize(m36690c(12));
                this.f30886b.setColor(this.f30894j);
                canvas2.drawText(this.f30893i, (width - getPaddingEnd()) - this.f30886b.measureText(this.f30893i), getTextBaseLine(), this.f30886b);
            } else {
                canvas2 = canvas;
            }
            this.f30886b.setColor(this.f30895k);
            this.f30886b.setTextSize(m36690c(14));
            float fMeasureText = this.f30886b.measureText(str);
            float textBaseLine = getTextBaseLine();
            canvas2.drawText(str, getPaddingStart(), textBaseLine, this.f30886b);
            this.f30886b.setColor(this.f30896l);
            canvas2.drawText(" / " + this.f30890f, getPaddingStart() + fMeasureText, textBaseLine, this.f30886b);
            return;
        }
        this.f30887c.setShader(getBackgroundLinearGradient());
        canvas.drawRoundRect(0.0f, 0.0f, width, height, m36690c(4), m36690c(4), this.f30887c);
        this.f30886b.setShader(null);
        if (this.f30892h > 0.0f) {
            this.f30886b.setShader(getProgressLinearGradient());
            canvas3 = canvas;
            canvas3.drawRoundRect(width - ((this.f30892h * width) / 100), 0.0f, width, height, m36690c(4), m36690c(4), this.f30886b);
            this.f30886b.setShader(null);
            this.f30886b.setTextSize(m36690c(12));
            this.f30886b.setColor(this.f30894j);
            canvas3.drawText(this.f30893i, getPaddingEnd(), getTextBaseLine(), this.f30886b);
        } else {
            canvas3 = canvas;
        }
        this.f30886b.setColor(this.f30895k);
        this.f30886b.setTextSize(m36690c(14));
        float fMeasureText2 = this.f30886b.measureText(str);
        float textBaseLine2 = getTextBaseLine();
        float paddingStart = (width - fMeasureText2) - getPaddingStart();
        canvas3.drawText(str, paddingStart, textBaseLine2, this.f30886b);
        this.f30886b.setColor(this.f30896l);
        String str2 = this.f30890f + " / ";
        canvas3.drawText(str2, paddingStart - this.f30886b.measureText(str2), textBaseLine2, this.f30886b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderHorizontalProgress(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f30886b = paint;
        Paint paint2 = new Paint();
        this.f30887c = paint2;
        Paint paint3 = new Paint();
        this.f30888d = paint3;
        this.f30889e = "";
        this.f30890f = "";
        this.f30891g = LazyKt.lazy(new Function0() { // from class: xm.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderHorizontalProgress.m36689b(this.f103838b);
            }
        });
        this.f30892h = -1.0f;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f30893i = C42180b.m92642g(ZERO, null, null, 0, false, false, false, 63, null);
        C27017c c27017c = C27017c.f54310a;
        this.f30894j = c27017c.m66512a(R$color.primary);
        this.f30895k = c27017c.m66512a(R$color.c_text);
        this.f30896l = c27017c.m66512a(R$color.c_text40);
        this.f30898n = new BigDecimal("0");
        this.f30899o = new BigDecimal("0");
        paint.setAntiAlias(true);
        paint.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        paint2.setAntiAlias(true);
        paint3.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: b */
    public static final LinearGradient m36689b(OrderHorizontalProgress orderHorizontalProgress) {
        if (orderHorizontalProgress.m36693f()) {
            float measuredWidth = orderHorizontalProgress.getMeasuredWidth();
            float measuredHeight = orderHorizontalProgress.getMeasuredHeight();
            C27017c c27017c = C27017c.f54310a;
            return new LinearGradient(0.0f, 0.0f, measuredWidth, measuredHeight, c27017c.m66512a(R$color.emphasis4), c27017c.m66512a(R$color.emphasis2), Shader.TileMode.CLAMP);
        }
        float measuredWidth2 = orderHorizontalProgress.getMeasuredWidth();
        float measuredHeight2 = orderHorizontalProgress.getMeasuredHeight();
        C27017c c27017c2 = C27017c.f54310a;
        return new LinearGradient(0.0f, 0.0f, measuredWidth2, measuredHeight2, c27017c2.m66512a(R$color.emphasis2), c27017c2.m66512a(R$color.emphasis4), Shader.TileMode.CLAMP);
    }

    private final float getEnd() {
        if (m36693f()) {
            return getWidth();
        }
        return (getWidth() * this.f30892h) / 100;
    }

    private final float getStart() {
        if (m36693f()) {
            return getWidth() - ((getWidth() * this.f30892h) / 100);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m36690c(int i11) {
        return (getResources().getDisplayMetrics().density * i11) + 0.5f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m36693f() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }
}
