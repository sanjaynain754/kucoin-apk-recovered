package com.facebook.react.views.text.internal.span;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.facebook.react.uimanager.ViewProps;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CustomLineHeightSpan.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/react/views/text/internal/span/CustomLineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "Lcom/facebook/react/views/text/internal/span/ReactSpan;", "height", "", "<init>", "(F)V", ViewProps.LINE_HEIGHT, "", "getLineHeight", "()I", "chooseHeight", "", "text", "", "start", "end", "spanstartv", "v", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class CustomLineHeightSpan implements LineHeightSpan, ReactSpan {
    private final int lineHeight;

    public final int getLineHeight() {
        return this.lineHeight;
    }

    public CustomLineHeightSpan(float f11) {
        this.lineHeight = (int) Math.ceil(f11);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int start, int end, int spanstartv, int v11, @NotNull Paint.FontMetricsInt fm2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        int i11 = this.lineHeight;
        int i12 = fm2.ascent;
        double d11 = (i11 - ((-i12) + fm2.descent)) / 2.0f;
        fm2.ascent = i12 - ((int) Math.ceil(d11));
        fm2.descent += (int) Math.floor(d11);
        if (start == 0) {
            fm2.top = fm2.ascent;
        }
        if (end == text.length()) {
            fm2.bottom = fm2.descent;
        }
    }
}
