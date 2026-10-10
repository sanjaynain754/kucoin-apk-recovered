package com.sumsub.sns.core.theme;

import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSThemeFont;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "sizeSp", "I", "getSizeSp", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SNSThemeFont {
    private final int sizeSp;

    @NotNull
    private final Typeface typeface;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSThemeFont)) {
            return false;
        }
        SNSThemeFont sNSThemeFont = (SNSThemeFont) other;
        return Intrinsics.areEqual(this.typeface, sNSThemeFont.typeface) && this.sizeSp == sNSThemeFont.sizeSp;
    }

    public final int getSizeSp() {
        return this.sizeSp;
    }

    @NotNull
    public final Typeface getTypeface() {
        return this.typeface;
    }

    public int hashCode() {
        return Integer.hashCode(this.sizeSp) + (this.typeface.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SNSThemeFont(typeface=" + this.typeface + ", sizeSp=" + this.sizeSp + ")";
    }
}
