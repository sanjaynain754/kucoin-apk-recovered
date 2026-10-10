package com.kubi.kumex.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.kubi.kumex.R$color;
import com.kubi.resources.widget.MultiLinesHintEditText;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PercentSuffixEditText.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kumex/view/PercentSuffixEditText;", "Lcom/kubi/resources/widget/MultiLinesHintEditText;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "fontMetrics", "Landroid/graphics/Paint$FontMetrics;", "setEllipsize", "", "ellipsis", "Landroid/text/TextUtils$TruncateAt;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getNewPaint", "getSuffixLength", "getPaddingLeft", "getPaddingRight", "getCompoundPaddingLeft", "getCompoundPaddingRight", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PercentSuffixEditText extends MultiLinesHintEditText {

    /* JADX INFO: renamed from: m */
    @Nullable
    public Paint f30902m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public Paint.FontMetrics f30903n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentSuffixEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentSuffixEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final Paint getNewPaint() {
        Paint paint = this.f30902m;
        if (paint != null) {
            Intrinsics.checkNotNull(paint);
            return paint;
        }
        Paint paint2 = new Paint(getPaint());
        paint2.setColor(C27017c.f54310a.m66512a(R$color.c_text40));
        this.f30902m = paint2;
        Intrinsics.checkNotNull(paint2);
        this.f30903n = paint2.getFontMetrics();
        Paint paint3 = this.f30902m;
        Intrinsics.checkNotNull(paint3);
        return paint3;
    }

    @Override // com.kubi.resources.widget.MultiLinesHintEditText, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint newPaint = getNewPaint();
        int compoundPaddingStart = getLayoutDirection() == 1 ? getCompoundPaddingStart() : (getWidth() - getCompoundPaddingRight()) + C27029c.m66601d(this, 3);
        float measuredHeight = getMeasuredHeight() / 2;
        Paint.FontMetrics fontMetrics = this.f30903n;
        float fM66649i = C27039d.m66649i(fontMetrics != null ? Float.valueOf(fontMetrics.bottom) : null, 0.0f, 1, null);
        Paint.FontMetrics fontMetrics2 = this.f30903n;
        float fM66649i2 = measuredHeight + ((fM66649i - C27039d.m66649i(fontMetrics2 != null ? Float.valueOf(fontMetrics2.top) : null, 0.0f, 1, null)) / 2);
        Paint.FontMetrics fontMetrics3 = this.f30903n;
        canvas.drawText("%", compoundPaddingStart + getScrollX(), fM66649i2 - C27039d.m66649i(fontMetrics3 != null ? Float.valueOf(fontMetrics3.bottom) : null, 0.0f, 1, null), newPaint);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentSuffixEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    private final int getSuffixLength() {
        return C27039d.m66650j(Integer.valueOf((int) getNewPaint().measureText("%"))) + C27029c.m66601d(this, 3);
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (getLayoutDirection() == 1) {
            return compoundPaddingLeft + getSuffixLength();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (getLayoutDirection() == 1) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + getSuffixLength();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        int paddingLeft = super.getPaddingLeft();
        if (getLayoutDirection() == 1) {
            return paddingLeft + getSuffixLength();
        }
        return paddingLeft;
    }

    @Override // android.view.View
    public int getPaddingRight() {
        int paddingRight = super.getPaddingRight();
        if (getLayoutDirection() == 1) {
            return paddingRight;
        }
        return paddingRight + getSuffixLength();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt ellipsis) {
        super.setEllipsize(ellipsis);
    }
}
