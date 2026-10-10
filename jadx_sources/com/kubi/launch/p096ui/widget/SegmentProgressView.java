package com.kubi.launch.p096ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import com.kubi.app.facade.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SegmentProgressView.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0014R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/launch/ui/widget/SegmentProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "segmentCount", "gapDp", "", "totalDuration", "", "currentProgress", "paintProgressBg", "Landroid/graphics/Paint;", "paintProgress", "setProgress", "", "progress", "setDuration", TypedValues.TransitionType.S_DURATION, "setSegment", "segment", "onDraw", "canvas", "Landroid/graphics/Canvas;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSegmentProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentProgressView.kt\ncom/kubi/launch/ui/widget/SegmentProgressView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,102:1\n1#2:103\n52#3,9:104\n*S KotlinDebug\n*F\n+ 1 SegmentProgressView.kt\ncom/kubi/launch/ui/widget/SegmentProgressView\n*L\n35#1:104,9\n*E\n"})
public final class SegmentProgressView extends View {

    /* JADX INFO: renamed from: b */
    public int f31831b;

    /* JADX INFO: renamed from: c */
    public float f31832c;

    /* JADX INFO: renamed from: d */
    public long f31833d;

    /* JADX INFO: renamed from: e */
    public long f31834e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final Paint f31835f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Paint f31836g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SegmentProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SegmentProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f11 = this.f31832c;
        float width = (getWidth() - ((this.f31831b - 1) * f11)) / this.f31831b;
        float width2 = getWidth() * (this.f31834e / this.f31833d);
        int i11 = this.f31831b;
        int i12 = 0;
        while (i12 < i11) {
            float f12 = i12 * (width + f11);
            float f13 = f12 + width;
            float height = getHeight();
            Canvas canvas2 = canvas;
            canvas2.drawRect(f12, 0.0f, f13, height, this.f31835f);
            if (width2 > f12) {
                canvas2.drawRect(f12, 0.0f, Math.min(width2, f13), height, this.f31836g);
            }
            i12++;
            canvas = canvas2;
        }
    }

    public final void setDuration(long duration) {
        this.f31833d = duration;
        invalidate();
    }

    public final void setProgress(long progress) {
        if (0 > progress || progress > this.f31833d) {
            return;
        }
        this.f31834e = progress;
        invalidate();
    }

    public final void setSegment(int segment) {
        this.f31831b = segment;
        invalidate();
    }

    public /* synthetic */ SegmentProgressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SegmentProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31831b = 4;
        this.f31832c = 5.0f;
        this.f31833d = Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f31835f = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.f31836g = paint2;
        if (attributeSet != null) {
            int[] SegmentProgressView = R$styleable.SegmentProgressView;
            Intrinsics.checkNotNullExpressionValue(SegmentProgressView, "SegmentProgressView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SegmentProgressView, 0, 0);
            this.f31833d = typedArrayObtainStyledAttributes.getInteger(R$styleable.SegmentProgressView_totalDuration, 16000);
            this.f31831b = typedArrayObtainStyledAttributes.getInteger(R$styleable.SegmentProgressView_segmentCount, 4);
            this.f31832c = typedArrayObtainStyledAttributes.getDimension(R$styleable.SegmentProgressView_segmentGap, 5.0f);
            paint2.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentProgressView_progressColor, -1));
            paint.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.SegmentProgressView_progressBackgroundColor, -7829368));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
