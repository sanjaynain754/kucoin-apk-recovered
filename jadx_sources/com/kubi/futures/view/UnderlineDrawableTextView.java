package com.kubi.futures.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.blankj.utilcode.util.C5303w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnderlineDrawableTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0015J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0016¨\u0006\""}, m90084d2 = {"Lcom/kubi/futures/view/UnderlineDrawableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "underlinePaint", "Landroid/graphics/Paint;", "drawableStart", "Landroid/graphics/drawable/Drawable;", "path", "Landroid/graphics/Path;", "layoutText", "Landroid/text/StaticLayout;", "isLayoutRtl", "", "()Z", "isLayoutRtl$delegate", "Lkotlin/Lazy;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setDrawableStart", "drawable", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnderlineDrawableTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f25035b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Drawable f25036c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Path f25037d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public StaticLayout f25038e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Lazy f25039f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnderlineDrawableTextView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnderlineDrawableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m28887c() {
        return ((Boolean) this.f25039f.getValue()).booleanValue();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        CharSequence text;
        float f11;
        float width;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        StaticLayout staticLayout = this.f25038e;
        if (staticLayout == null || (text = getText()) == null) {
            return;
        }
        this.f25035b.setColor(getCurrentTextColor());
        getPaint().setColor(getCurrentTextColor());
        boolean zM28887c = m28887c();
        Drawable drawable = this.f25036c;
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        int compoundDrawablePadding = getCompoundDrawablePadding();
        int lineCount = staticLayout.getLineCount();
        float fMax = 0.0f;
        for (int i11 = 0; i11 < lineCount; i11++) {
            fMax = Math.max(fMax, staticLayout.getLineWidth(i11));
        }
        float f12 = intrinsicWidth + compoundDrawablePadding + fMax;
        int absoluteGravity = Gravity.getAbsoluteGravity(getGravity(), getLayoutDirection()) & 7;
        int i12 = 1;
        float paddingLeft = absoluteGravity != 1 ? (absoluteGravity == 3 || absoluteGravity != 5) ? getPaddingLeft() : (getWidth() - f12) - getPaddingRight() : (getWidth() - f12) / 2.0f;
        if (zM28887c) {
            f11 = paddingLeft;
            paddingLeft = paddingLeft + fMax + compoundDrawablePadding;
        } else {
            f11 = intrinsicWidth + paddingLeft + compoundDrawablePadding;
        }
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float paddingTop = getPaddingTop() + Math.abs((fontMetrics.descent - fontMetrics.ascent) - intrinsicHeight);
        if (drawable != null) {
            canvas2.save();
            canvas2.translate(paddingLeft, paddingTop);
            drawable.draw(canvas2);
            canvas2.restore();
        }
        canvas2.save();
        int lineCount2 = staticLayout.getLineCount();
        int i13 = 0;
        while (i13 < lineCount2) {
            float lineWidth = staticLayout.getLineWidth(i13);
            float lineBaseline = staticLayout.getLineBaseline(i13);
            if (absoluteGravity == i12) {
                width = (getWidth() - lineWidth) / 2.0f;
            } else if (absoluteGravity == 3) {
                width = getPaddingLeft();
                if (!zM28887c) {
                    width = width + compoundDrawablePadding + intrinsicWidth;
                }
            } else if (absoluteGravity != 5) {
                width = getPaddingLeft();
            } else {
                float width2 = getWidth() - lineWidth;
                float paddingRight = getPaddingRight();
                if (zM28887c) {
                    width2 = (width2 - paddingRight) - intrinsicWidth;
                    paddingRight = compoundDrawablePadding;
                }
                width = width2 - paddingRight;
            }
            int i14 = lineCount2;
            int i15 = i13;
            canvas2 = canvas;
            canvas2.drawText(text, staticLayout.getLineStart(i13), staticLayout.getLineEnd(i15), width, lineBaseline + getPaddingTop(), getPaint());
            i13 = i15 + 1;
            lineCount2 = i14;
            i12 = 1;
        }
        canvas2.restore();
        float height = getHeight();
        float f13 = zM28887c ? f11 + fMax : f11;
        if (!zM28887c) {
            f11 += fMax;
        }
        this.f25037d.reset();
        this.f25037d.moveTo(f13, height);
        this.f25037d.lineTo(f11, height);
        canvas2.drawPath(this.f25037d, this.f25035b);
    }

    public final void setDrawableStart(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            drawable = null;
        }
        this.f25036c = drawable;
        postInvalidate();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnderlineDrawableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25037d = new Path();
        this.f25039f = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.kubi.futures.view.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(UnderlineDrawableTextView.m28886d());
            }
        });
        Paint paint = new Paint(1);
        paint.setColor(getCurrentTextColor());
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.f25035b = paint;
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m28886d() {
        return C5303w0.m6511a();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int intrinsicWidth;
        Layout.Alignment alignment;
        TextDirectionHeuristic textDirectionHeuristic;
        int height;
        int size = (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight();
        Drawable drawable = this.f25036c;
        int intrinsicHeight = 0;
        if (drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        } else {
            intrinsicWidth = 0;
        }
        int iMax = Math.max((size - intrinsicWidth) - getCompoundDrawablePadding(), (int) getPaint().measureText("..."));
        boolean zM28887c = m28887c();
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(getText(), 0, getText().length(), getPaint(), iMax);
        if (zM28887c) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout.Builder alignment2 = builderObtain.setAlignment(alignment);
        if (zM28887c) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        StaticLayout staticLayoutBuild = alignment2.setTextDirection(textDirectionHeuristic).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(false).build();
        this.f25038e = staticLayoutBuild;
        if (staticLayoutBuild != null) {
            height = staticLayoutBuild.getHeight();
        } else {
            height = 0;
        }
        if (drawable != null) {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), getPaddingTop() + Math.max(height, intrinsicHeight) + getPaddingBottom() + 3);
    }
}
