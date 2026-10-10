package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnitEditText.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u000fH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/resources/widget/UnitEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "firstPaddingEnd", "", "getFirstPaddingEnd", "()I", "firstPaddingEnd$delegate", "Lkotlin/Lazy;", "mPaint", "Landroid/graphics/Paint;", "value", "", "unit", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "getHeight", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnitEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f44197b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Paint f44198c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public String f44199d;

    public /* synthetic */ UnitEditText(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44197b = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.widget.s3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(UnitEditText.m54913e(this.f45108b));
            }
        });
        Paint paint = new Paint();
        this.f44198c = paint;
        paint.setTextSize(C27025c.m66565c(context, 14));
        paint.setAntiAlias(true);
        paint.setColor(context.getResources().getColor(R$color.c_text40));
        Typeface font = ResourcesCompat.getFont(context, R$font.medium);
        if (font != null) {
            paint.setTypeface(font);
        }
        this.f44199d = "";
    }

    private final int getFirstPaddingEnd() {
        return ((Number) this.f44197b.getValue()).intValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getUnit, reason: from getter */
    public final String getF44199d() {
        return this.f44199d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f44199d)) {
            return;
        }
        canvas.save();
        if (getLayoutDirection() == 0) {
            float measuredWidth = (getMeasuredWidth() - getPaddingEnd()) + getScrollX();
            float f11 = 2;
            float measuredHeight = getMeasuredHeight() / f11;
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            canvas.translate(measuredWidth, (measuredHeight + (m54914f(paint) / f11)) - getPaint().getFontMetrics().descent);
        } else {
            float firstPaddingEnd = getFirstPaddingEnd() + getScrollX();
            float f12 = 2;
            float measuredHeight2 = getMeasuredHeight() / f12;
            TextPaint paint2 = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
            canvas.translate(firstPaddingEnd, (measuredHeight2 + (m54914f(paint2) / f12)) - getPaint().getFontMetrics().descent);
        }
        canvas.drawText(this.f44199d, 0.0f, 0.0f, this.f44198c);
        canvas.restore();
    }

    public final void setUnit(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (TextUtils.isEmpty(value)) {
            setPaddingRelative(getPaddingStart(), getPaddingTop(), getFirstPaddingEnd(), getPaddingBottom());
        } else {
            setPaddingRelative(getPaddingStart(), getPaddingTop(), getFirstPaddingEnd() + ((int) getPaint().measureText(value)), getPaddingBottom());
        }
        this.f44199d = value;
    }

    /* JADX INFO: renamed from: e */
    public static final int m54913e(UnitEditText unitEditText) {
        return unitEditText.getPaddingEnd();
    }

    /* JADX INFO: renamed from: f */
    public final float m54914f(Paint paint) {
        return Math.abs(paint.getFontMetrics().top - paint.getFontMetrics().bottom);
    }
}
