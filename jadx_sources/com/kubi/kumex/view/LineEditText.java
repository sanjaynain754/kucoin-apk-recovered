package com.kubi.kumex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.kubi.kumex.R$styleable;
import com.kubi.kumex.view.LineEditText;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LineEditText.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J%\u0010\u000f\u001a\u00020\u000b*\u00020\u00102\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u0012¢\u0006\u0002\b\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/kumex/view/LineEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawLine", "use", "Landroid/content/res/TypedArray;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class LineEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Paint f30885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setBackground(null);
        final Paint paint = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.LineEditText);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        m36687g(typedArrayObtainStyledAttributes, new Function1() { // from class: xm.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LineEditText.m36685f(paint, (TypedArray) obj);
            }
        });
        this.f30885b = paint;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m36685f(Paint paint, TypedArray use) {
        Intrinsics.checkNotNullParameter(use, "$this$use");
        paint.setColor(use.getColor(R$styleable.LineEditText_lineColor, -16776961));
        paint.setStrokeWidth(use.getDimensionPixelSize(R$styleable.LineEditText_lineHeight, 10));
        return Unit.INSTANCE;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        m36686e(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m36686e(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, getMeasuredHeight() - this.f30885b.getStrokeWidth());
        canvas.drawLine(getPaddingStart(), 0.0f, getMeasuredWidth() - getPaddingEnd(), 0.0f, this.f30885b);
        canvas.restore();
    }

    /* JADX INFO: renamed from: g */
    public final void m36687g(TypedArray typedArray, Function1<? super TypedArray, Unit> function1) {
        function1.invoke(typedArray);
        typedArray.recycle();
    }
}
