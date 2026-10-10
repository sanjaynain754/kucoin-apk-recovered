package com.facebook.react.views.text.internal.span;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomLetterSpacingSpan.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/react/views/text/internal/span/CustomLetterSpacingSpan;", "Landroid/text/style/MetricAffectingSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "spacing", "", "<init>", "(F)V", "getSpacing", "()F", "updateDrawState", "", "paint", "Landroid/text/TextPaint;", "updateMeasureState", "apply", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CustomLetterSpacingSpan extends MetricAffectingSpan implements ReactSpan {
    private final float spacing;

    private final void apply(TextPaint paint) {
        if (Float.isNaN(this.spacing)) {
            return;
        }
        paint.setLetterSpacing(this.spacing);
    }

    public final float getSpacing() {
        return this.spacing;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        apply(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        apply(paint);
    }

    public CustomLetterSpacingSpan(float f11) {
        this.spacing = f11;
    }
}
