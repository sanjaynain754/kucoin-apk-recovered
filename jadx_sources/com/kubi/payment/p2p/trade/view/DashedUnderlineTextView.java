package com.kubi.payment.p2p.trade.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import com.kubi.otc.R$color;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DashedUnderlineTextView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/DashedUnderlineTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DashedUnderlineTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    @Nullable
    public Paint f40133b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Path f40134c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DashedUnderlineTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DashedUnderlineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        float lineBaseline = getLayout().getLineBaseline(0) + 10;
        Path path = this.f40134c;
        if (path != null) {
            path.reset();
        }
        Path path2 = this.f40134c;
        if (path2 != null) {
            path2.moveTo(paddingLeft, lineBaseline);
        }
        Path path3 = this.f40134c;
        if (path3 != null) {
            path3.lineTo(width, lineBaseline);
        }
        Path path4 = this.f40134c;
        Intrinsics.checkNotNull(path4);
        Paint paint = this.f40133b;
        Intrinsics.checkNotNull(paint);
        canvas.drawPath(path4, paint);
    }

    public /* synthetic */ DashedUnderlineTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DashedUnderlineTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f40133b = paint;
        paint.setColor(context.getResources().getColor(R$color.c_text40));
        Paint paint2 = this.f40133b;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = this.f40133b;
        if (paint3 != null) {
            paint3.setStrokeWidth(C27025c.m66564b(context, 2.0f));
        }
        Paint paint4 = this.f40133b;
        if (paint4 != null) {
            paint4.setPathEffect(new DashPathEffect(new float[]{8.0f, 8.0f}, 0.0f));
        }
        this.f40134c = new Path();
    }
}
