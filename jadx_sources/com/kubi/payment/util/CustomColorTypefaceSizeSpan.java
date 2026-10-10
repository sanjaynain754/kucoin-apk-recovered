package com.kubi.payment.util;

import android.graphics.Typeface;
import android.text.TextPaint;
import com.kubi.resources.widget.CustomColorTypefaceSpan;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomColorTypefaceSizeSpan.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/util/CustomColorTypefaceSizeSpan;", "Lcom/kubi/resources/widget/CustomColorTypefaceSpan;", "color", "", "newTypeface", "Landroid/graphics/Typeface;", "textSize", "", "<init>", "(ILandroid/graphics/Typeface;F)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "paint", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CustomColorTypefaceSizeSpan extends CustomColorTypefaceSpan {
    private final float textSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorTypefaceSizeSpan(int i11, @NotNull Typeface newTypeface, float f11) {
        super(i11, newTypeface);
        Intrinsics.checkNotNullParameter(newTypeface, "newTypeface");
        this.textSize = f11;
    }

    @Override // com.kubi.resources.widget.CustomColorTypefaceSpan, android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        super.updateDrawState(ds2);
        ds2.setTextSize(this.textSize);
    }

    @Override // com.kubi.resources.widget.CustomColorTypefaceSpan, android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        super.updateMeasureState(paint);
        paint.setTextSize(this.textSize);
    }
}
