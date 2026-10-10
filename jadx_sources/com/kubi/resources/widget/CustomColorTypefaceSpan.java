package com.kubi.resources.widget;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomColorTypefaceSpan.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/resources/widget/CustomColorTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "color", "", "newTypeface", "Landroid/graphics/Typeface;", "<init>", "(ILandroid/graphics/Typeface;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "updateMeasureState", "paint", "applyColorTypeface", "Landroid/graphics/Paint;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class CustomColorTypefaceSpan extends TypefaceSpan {
    private final int color;

    @NotNull
    private final Typeface newTypeface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomColorTypefaceSpan(int i11, @NotNull Typeface newTypeface) {
        super("");
        Intrinsics.checkNotNullParameter(newTypeface, "newTypeface");
        this.color = i11;
        this.newTypeface = newTypeface;
    }

    private final void applyColorTypeface(Paint paint) {
        paint.setTypeface(this.newTypeface);
        paint.setColor(this.color);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds2) {
        Intrinsics.checkNotNullParameter(ds2, "ds");
        super.updateDrawState(ds2);
        applyColorTypeface(ds2);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        super.updateMeasureState(paint);
        applyColorTypeface(paint);
    }
}
