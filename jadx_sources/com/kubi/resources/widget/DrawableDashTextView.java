package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DrawableDashTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0010\u0010\u001f\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\nJ\u0010\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\nH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m90084d2 = {"Lcom/kubi/resources/widget/DrawableDashTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mPaint", "Landroid/graphics/Paint;", "mPath", "Landroid/graphics/Path;", "needDash", "", "mGravity", "initPaint", "", "setDashColor", "color", "setNeedDash", "onDraw", "canvas", "Landroid/graphics/Canvas;", "textWidth", "", "getTextWidth", "()F", "setDashLineColor", "setGravity", "gravity", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawableDashTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableDashTextView.kt\ncom/kubi/resources/widget/DrawableDashTextView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
public final class DrawableDashTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    public Paint f43786b;

    /* JADX INFO: renamed from: c */
    public Path f43787c;

    /* JADX INFO: renamed from: d */
    public boolean f43788d;

    /* JADX INFO: renamed from: e */
    public int f43789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableDashTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        m54497b();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        float f11;
        float f12;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f43788d) {
            boolean z11 = true;
            Paint paint = null;
            setLayerType(1, null);
            boolean z12 = getLayoutDirection() == 1;
            int gravity = getGravity();
            if (gravity != 17 && gravity != 1) {
                z11 = false;
            }
            int height = getHeight();
            int width = getWidth();
            float textWidth = getTextWidth();
            Drawable drawable = getCompoundDrawables()[z12 ? (char) 2 : (char) 0];
            float intrinsicWidth = (drawable != null ? drawable.getIntrinsicWidth() : 0) + (drawable != null ? getCompoundDrawablePadding() : 0);
            Path path = this.f43787c;
            if (path == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPath");
                path = null;
            }
            path.reset();
            if (this.f43789e == 8388613) {
                Path path2 = this.f43787c;
                if (path2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                    path2 = null;
                }
                float f13 = height;
                path2.moveTo(z12 ? (width - textWidth) - intrinsicWidth : intrinsicWidth, f13);
                Path path3 = this.f43787c;
                if (path3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                    path3 = null;
                }
                path3.lineTo(z12 ? width - intrinsicWidth : textWidth + intrinsicWidth, f13);
            } else {
                Path path4 = this.f43787c;
                if (path4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                    path4 = null;
                }
                if (z11) {
                    f11 = (width / 2.0f) - (textWidth / 2);
                } else {
                    f11 = z12 ? (width - textWidth) - intrinsicWidth : intrinsicWidth;
                }
                float f14 = height;
                path4.moveTo(f11, f14);
                Path path5 = this.f43787c;
                if (path5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPath");
                    path5 = null;
                }
                if (z11) {
                    f12 = (width / 2.0f) + (textWidth / 2);
                } else {
                    f12 = z12 ? width - intrinsicWidth : textWidth + intrinsicWidth;
                }
                path5.lineTo(f12, f14);
            }
            Path path6 = this.f43787c;
            if (path6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPath");
                path6 = null;
            }
            Paint paint2 = this.f43786b;
            if (paint2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            } else {
                paint = paint2;
            }
            canvas.drawPath(path6, paint);
        }
    }

    public final void setDashColor(@ColorInt int color) {
        Paint paint = this.f43786b;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            paint = null;
        }
        paint.setColor(color);
    }

    public final void setDashLineColor(@ColorInt int color) {
        Paint paint = this.f43786b;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            paint = null;
        }
        paint.setColor(color);
        invalidate();
    }

    @Override // android.widget.TextView
    public void setGravity(int gravity) {
        this.f43789e = gravity;
        super.setGravity(gravity);
    }

    public final void setNeedDash(boolean needDash) {
        this.f43788d = needDash;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableDashTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m54497b();
    }

    /* JADX INFO: renamed from: b */
    private final void m54497b() {
        boolean z11;
        if (getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43788d = z11;
        Paint paint = new Paint(1);
        this.f43786b = paint;
        paint.setColor(getCurrentTextColor());
        Paint paint2 = this.f43786b;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            paint2 = null;
        }
        paint2.setStrokeWidth(3.0f);
        Paint paint4 = this.f43786b;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
            paint4 = null;
        }
        paint4.setStyle(Paint.Style.STROKE);
        Paint paint5 = this.f43786b;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPaint");
        } else {
            paint3 = paint5;
        }
        paint3.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.f43787c = new Path();
        setPadding(0, 0, 0, 3);
    }

    private final float getTextWidth() {
        int lineCount = getLineCount();
        float lineWidth = 0.0f;
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (lineWidth < getLayout().getLineWidth(i11)) {
                lineWidth = getLayout().getLineWidth(i11);
            }
        }
        if (lineWidth == 0.0f) {
            return getWidth();
        }
        return lineWidth;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawableDashTextView(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        m54497b();
    }
}
