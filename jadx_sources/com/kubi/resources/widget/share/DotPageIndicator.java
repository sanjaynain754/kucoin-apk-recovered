package com.kubi.resources.widget.share;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import com.kubi.sdk.res.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DotPageIndicator.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/resources/widget/share/DotPageIndicator;", "Lcom/kubi/resources/widget/share/PageIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "normalColor", "selectColor", "indicatorWidth", "", "indicatorHeight", "drawNormal", "", "canvas", "Landroid/graphics/Canvas;", "centerX", "centerY", "drawSelect", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CustomViewStyleable"})
public final class DotPageIndicator extends PageIndicator {

    /* JADX INFO: renamed from: h */
    public int f45109h;

    /* JADX INFO: renamed from: i */
    public int f45110i;

    /* JADX INFO: renamed from: j */
    public float f45111j;

    /* JADX INFO: renamed from: k */
    public float f45112k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotPageIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotPageIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.kubi.resources.widget.share.PageIndicator
    /* JADX INFO: renamed from: b */
    public void mo55469b(@NotNull Canvas canvas, float f11, float f12) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iMax = Math.max((getPaddingBottom() + getPaddingTop()) / 2, (getPaddingLeft() + getPaddingRight()) / 2);
        getF45117f().setColor(this.f45109h);
        canvas.drawCircle(f11, f12, (Math.min(this.f45111j, this.f45112k) / 2) - iMax, getF45117f());
    }

    @Override // com.kubi.resources.widget.share.PageIndicator
    /* JADX INFO: renamed from: d */
    public void mo55470d(@NotNull Canvas canvas, float f11, float f12) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iMax = Math.max((getPaddingBottom() + getPaddingTop()) / 2, (getPaddingLeft() + getPaddingRight()) / 2);
        getF45117f().setColor(this.f45110i);
        canvas.drawCircle(f11, f12, (Math.min(this.f45111j, this.f45112k) / 2) - iMax, getF45117f());
    }

    @Override // com.kubi.resources.widget.share.PageIndicator
    /* JADX INFO: renamed from: e, reason: from getter */
    public float getF45112k() {
        return this.f45112k;
    }

    @Override // com.kubi.resources.widget.share.PageIndicator
    /* JADX INFO: renamed from: f, reason: from getter */
    public float getF45111j() {
        return this.f45111j;
    }

    public /* synthetic */ DotPageIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DotPageIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f45109h = Color.rgb(172, 172, 172);
        this.f45110i = Color.rgb(127, 127, 127);
        this.f45111j = 20.0f;
        this.f45112k = 20.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Kucoin_PageIndicator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f45111j = typedArrayObtainStyledAttributes.getDimension(R$styleable.Kucoin_PageIndicator_indicatorWidth, this.f45111j);
        this.f45112k = typedArrayObtainStyledAttributes.getDimension(R$styleable.Kucoin_PageIndicator_indicatorHeight, this.f45112k);
        this.f45109h = typedArrayObtainStyledAttributes.getColor(R$styleable.Kucoin_PageIndicator_normalColor, this.f45109h);
        this.f45110i = typedArrayObtainStyledAttributes.getColor(R$styleable.Kucoin_PageIndicator_selectColor, this.f45110i);
        typedArrayObtainStyledAttributes.recycle();
    }
}
