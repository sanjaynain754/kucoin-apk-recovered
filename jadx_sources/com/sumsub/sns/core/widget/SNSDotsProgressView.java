package com.sumsub.sns.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.sumsub.sns.R$attr;
import com.sumsub.sns.R$style;
import com.sumsub.sns.R$styleable;
import com.sumsub.sns.internal.core.common.AbstractC28485q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSDotsProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "completePaint", "Landroid/graphics/Paint;", "dotPaint", "dotRadius", "minGap", "value", "progress", "getProgress", "()I", "setProgress", "(I)V", "onSizeChanged", "", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDotsProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDotsProgressView.kt\ncom/sumsub/sns/core/widget/SNSDotsProgressView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,80:1\n233#2,3:81\n*S KotlinDebug\n*F\n+ 1 SNSDotsProgressView.kt\ncom/sumsub/sns/core/widget/SNSDotsProgressView\n*L\n41#1:81,3\n*E\n"})
public final class SNSDotsProgressView extends View {

    @NotNull
    private final Paint completePaint;

    @NotNull
    private final Paint dotPaint;
    private int dotRadius;
    private int minGap;
    private int progress;

    @JvmOverloads
    public SNSDotsProgressView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
    }

    @JvmOverloads
    public SNSDotsProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setProgress(int i11) {
        if (i11 != this.progress) {
            this.progress = i11;
            invalidate();
        }
    }

    @JvmOverloads
    public SNSDotsProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int width;
        Paint paint;
        super.onDraw(canvas);
        canvas.save();
        int width2 = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / ((this.dotRadius * 2) + this.minGap);
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2) + getPaddingTop();
        if (width2 > 1) {
            width = (((getWidth() - getPaddingLeft()) - getPaddingRight()) - ((this.dotRadius * width2) * 2)) / (width2 - 1);
        } else {
            width = 0;
        }
        int paddingLeft = getPaddingLeft() + this.dotRadius;
        for (int i11 = 0; i11 < width2; i11++) {
            if ((i11 * 100) / width2 >= this.progress) {
                paint = this.dotPaint;
            } else {
                paint = this.completePaint;
            }
            canvas.drawCircle(paddingLeft, height, this.dotRadius, paint);
            paddingLeft += (this.dotRadius * 2) + width;
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        this.dotRadius = RangesKt.coerceAtLeast((h11 - getPaddingTop()) - getPaddingBottom(), 0) / 2;
    }

    public /* synthetic */ SNSDotsProgressView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? R$attr.sns_DotsProgressViewStyle : i11, (i13 & 8) != 0 ? R$style.Widget_SNSDotsProgressView : i12);
    }

    @JvmOverloads
    public SNSDotsProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint.setStyle(style);
        this.completePaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.dotPaint = paint2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SNSDotsProgressView, i11, i12);
        paint2.setColor(AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSDotsProgressView_sns_dotsProgressDotBackgroundColor, 0));
        paint.setColor(AbstractC28485q.m69379a(typedArrayObtainStyledAttributes, R$styleable.SNSDotsProgressView_sns_dotsProgressDotCompleteColor, 0));
        this.minGap = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SNSDotsProgressView_sns_dotsProgressMinGap, 0);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }
}
