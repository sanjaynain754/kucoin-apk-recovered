package com.kubi.kumex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.RadioGroup;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.kumex.R$styleable;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ClipRadioGroup.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0014J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kumex/view/ClipRadioGroup;", "Landroid/widget/RadioGroup;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "path", "Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "radius", "", ViewProps.ON_LAYOUT, "", "changed", "", CmcdData.Factory.STREAM_TYPE_LIVE, "", "t", "r", "b", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "resetPath", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ClipRadioGroup extends RadioGroup {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Path f30816b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final RectF f30817c;

    /* JADX INFO: renamed from: d */
    public final float f30818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipRadioGroup(@NotNull Context context, @NotNull AttributeSet attr) {
        super(context, attr);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
        this.f30816b = new Path();
        this.f30817c = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attr, R$styleable.ClipRadioGroup);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f30818d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ClipRadioGroup_radius, (int) C27025c.m66565c(context, 4));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.clipPath(this.f30816b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: a */
    public final void m36623a() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        this.f30816b.reset();
        this.f30816b.moveTo(this.f30818d, measuredHeight);
        RectF rectF = this.f30817c;
        float f11 = this.f30818d;
        float f12 = 2;
        rectF.set(0.0f, measuredHeight - (f11 * f12), f11 * f12, measuredHeight);
        this.f30816b.arcTo(this.f30817c, 90.0f, 90.0f);
        this.f30816b.lineTo(0.0f, this.f30818d);
        RectF rectF2 = this.f30817c;
        float f13 = this.f30818d;
        rectF2.set(0.0f, 0.0f, f13 * f12, f13 * f12);
        this.f30816b.arcTo(this.f30817c, 180.0f, 90.0f);
        this.f30816b.lineTo(measuredWidth - this.f30818d, 0.0f);
        RectF rectF3 = this.f30817c;
        float f14 = this.f30818d;
        rectF3.set(measuredWidth - (f14 * f12), 0.0f, measuredWidth, f14 * f12);
        this.f30816b.arcTo(this.f30817c, 270.0f, 90.0f);
        this.f30816b.lineTo(measuredWidth, measuredHeight - this.f30818d);
        RectF rectF4 = this.f30817c;
        float f15 = this.f30818d;
        rectF4.set(measuredWidth - (f15 * f12), measuredHeight - (f15 * f12), measuredWidth, measuredHeight);
        this.f30816b.arcTo(this.f30817c, 0.0f, 90.0f);
        this.f30816b.lineTo(this.f30818d, measuredHeight);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        super.onLayout(changed, l11, t11, r11, b11);
        m36623a();
    }
}
