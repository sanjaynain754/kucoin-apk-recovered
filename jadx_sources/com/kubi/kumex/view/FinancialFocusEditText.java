package com.kubi.kumex.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.kumex.R$color;
import com.kubi.kumex.R$drawable;
import com.kubi.kumex.view.FinancialFocusEditText;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.C22912t;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.core.C27029c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinancialFocusEditText.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0016J\u0006\u0010.\u001a\u00020$J\u0006\u0010/\u001a\u00020$J\u000e\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020\u0017J\u0016\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020)R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR#\u0010\u0012\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\fR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00065"}, m90084d2 = {"Lcom/kubi/kumex/view/FinancialFocusEditText;", "Lcom/kubi/numeric/financial/widget/FinancialInputEditText;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "normalBg", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getNormalBg", "()Landroid/graphics/drawable/Drawable;", "normalBg$delegate", "Lkotlin/Lazy;", "focusBg", "getFocusBg", "focusBg$delegate", "errorBg", "getErrorBg", "errorBg$delegate", "currentBg", "mOnFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "paint", "Landroid/graphics/Paint;", "fontMetrics", "Landroid/graphics/Paint$FontMetrics;", "value", "", "unit", "getUnit", "()Ljava/lang/String;", "setUnit", "(Ljava/lang/String;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "getNewPaint", "getSuffixLength", "", "getPaddingLeft", "getPaddingRight", "getCompoundPaddingLeft", "getCompoundPaddingRight", "showError", "hideError", "addOnFocusChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setHintTextAndSize", "hint", "textSize", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FinancialFocusEditText extends FinancialInputEditText {

    /* JADX INFO: renamed from: s */
    @NotNull
    public final Lazy f30819s;

    /* JADX INFO: renamed from: t */
    @NotNull
    public final Lazy f30820t;

    /* JADX INFO: renamed from: u */
    @NotNull
    public final Lazy f30821u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public Drawable f30822v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public View.OnFocusChangeListener f30823w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public Paint f30824x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public Paint.FontMetrics f30825y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public String f30826z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialFocusEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30819s = LazyKt.lazy(new Function0() { // from class: xm.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialFocusEditText.m36631H(this.f103863b);
            }
        });
        this.f30820t = LazyKt.lazy(new Function0() { // from class: xm.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialFocusEditText.m36630G(this.f103864b);
            }
        });
        this.f30821u = LazyKt.lazy(new Function0() { // from class: xm.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialFocusEditText.m36629F(this.f103865b);
            }
        });
        this.f30826z = "";
        C22912t.m54419q(this, R$drawable.shape_primary_cursor);
        setTextColor(getResources().getColor(R$color.c_text));
        setTextSize(14.0f);
        setHintTextColor(getResources().getColor(R$color.c_text20));
        setBackgroundDrawable(getNormalBg());
        setSingleLine();
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xm.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                FinancialFocusEditText.m36628E(this.f103866b, view, z11);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public static final void m36628E(FinancialFocusEditText financialFocusEditText, View view, boolean z11) {
        if (!Intrinsics.areEqual(financialFocusEditText.f30822v, financialFocusEditText.getErrorBg())) {
            Drawable focusBg = z11 ? financialFocusEditText.getFocusBg() : financialFocusEditText.getNormalBg();
            financialFocusEditText.setBackgroundDrawable(focusBg);
            financialFocusEditText.f30822v = focusBg;
        }
        View.OnFocusChangeListener onFocusChangeListener = financialFocusEditText.f30823w;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
    }

    private final Drawable getErrorBg() {
        return (Drawable) this.f30821u.getValue();
    }

    private final Drawable getFocusBg() {
        return (Drawable) this.f30820t.getValue();
    }

    private final Paint getNewPaint() {
        Paint paint = this.f30824x;
        if (paint != null) {
            Intrinsics.checkNotNull(paint);
            return paint;
        }
        Paint paint2 = new Paint(getPaint());
        paint2.setColor(C27017c.f54310a.m66512a(R$color.c_text40));
        this.f30824x = paint2;
        Intrinsics.checkNotNull(paint2);
        this.f30825y = paint2.getFontMetrics();
        Paint paint3 = this.f30824x;
        Intrinsics.checkNotNull(paint3);
        return paint3;
    }

    private final Drawable getNormalBg() {
        return (Drawable) this.f30819s.getValue();
    }

    public final void addOnFocusChangeListener(@NotNull View.OnFocusChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30823w = listener;
    }

    @NotNull
    /* JADX INFO: renamed from: getUnit, reason: from getter */
    public final String getF30826z() {
        return this.f30826z;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint newPaint = getNewPaint();
        int compoundPaddingStart = getLayoutDirection() == 1 ? getCompoundPaddingStart() : (getWidth() - getCompoundPaddingRight()) + C27029c.m66601d(this, 3);
        float measuredHeight = getMeasuredHeight() / 2;
        Paint.FontMetrics fontMetrics = this.f30825y;
        float fM66649i = C27039d.m66649i(fontMetrics != null ? Float.valueOf(fontMetrics.bottom) : null, 0.0f, 1, null);
        Paint.FontMetrics fontMetrics2 = this.f30825y;
        float fM66649i2 = measuredHeight + ((fM66649i - C27039d.m66649i(fontMetrics2 != null ? Float.valueOf(fontMetrics2.top) : null, 0.0f, 1, null)) / 2);
        Paint.FontMetrics fontMetrics3 = this.f30825y;
        canvas.drawText(this.f30826z, compoundPaddingStart + getScrollX(), fM66649i2 - C27039d.m66649i(fontMetrics3 != null ? Float.valueOf(fontMetrics3.bottom) : null, 0.0f, 1, null), newPaint);
    }

    public final void setUnit(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30826z = value;
        invalidate();
    }

    /* JADX INFO: renamed from: F */
    public static final Drawable m36629F(FinancialFocusEditText financialFocusEditText) {
        return financialFocusEditText.getResources().getDrawable(R$drawable.shape_input_error);
    }

    /* JADX INFO: renamed from: G */
    public static final Drawable m36630G(FinancialFocusEditText financialFocusEditText) {
        return financialFocusEditText.getResources().getDrawable(R$drawable.shape_input_focus);
    }

    /* JADX INFO: renamed from: H */
    public static final Drawable m36631H(FinancialFocusEditText financialFocusEditText) {
        return financialFocusEditText.getResources().getDrawable(R$drawable.shape_input_normal);
    }

    private final int getSuffixLength() {
        return C27039d.m66650j(Integer.valueOf((int) getNewPaint().measureText(this.f30826z))) + C27029c.m66601d(this, 3);
    }

    /* JADX INFO: renamed from: I */
    public final void m36632I() {
        setBackgroundDrawable(getErrorBg());
        this.f30822v = getErrorBg();
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
}
