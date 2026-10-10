package com.sumsub.sns.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.sumsub.sns.R$dimen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0014R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/Rect;", "docRect", "getDocRect", "()Landroid/graphics/Rect;", "setDocRect", "(Landroid/graphics/Rect;)V", "Landroid/graphics/RectF;", "docRectF", "getDocRectF", "()Landroid/graphics/RectF;", "setDocRectF", "(Landroid/graphics/RectF;)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSDocBoundsCheckResultView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSDocBoundsCheckResultView.kt\ncom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,44:1\n337#2:45\n*S KotlinDebug\n*F\n+ 1 SNSDocBoundsCheckResultView.kt\ncom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView\n*L\n23#1:45\n*E\n"})
public final class SNSDocBoundsCheckResultView extends View {

    @Nullable
    private Rect docRect;

    @Nullable
    private RectF docRectF;

    @NotNull
    private final Paint paint;

    @JvmOverloads
    public SNSDocBoundsCheckResultView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SNSDocBoundsCheckResultView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Nullable
    public final Rect getDocRect() {
        return this.docRect;
    }

    @Nullable
    public final RectF getDocRectF() {
        return this.docRectF;
    }

    public final void setDocRect(@Nullable Rect rect) {
        this.docRect = rect;
        setDocRectF(rect != null ? new RectF(rect) : null);
    }

    public final void setDocRectF(@Nullable RectF rectF) {
        this.docRectF = rectF;
        invalidate();
    }

    public /* synthetic */ SNSDocBoundsCheckResultView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.docRectF;
        if (rectF == null) {
            return;
        }
        canvas.drawRect(rectF, this.paint);
    }

    @JvmOverloads
    public SNSDocBoundsCheckResultView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint();
        paint.setColor(-16711936);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimensionPixelSize(R$dimen.sns_frame_stroke_width));
        this.paint = paint;
    }
}
