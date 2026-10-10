package com.sumsub.sns.core.theme;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSThemeColor;", "", "", "light", "dark", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLight", "getDark", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class SNSThemeColor {
    private final int dark;
    private final int light;

    public SNSThemeColor(int i11, int i12) {
        this.light = i11;
        this.dark = i12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSThemeColor)) {
            return false;
        }
        SNSThemeColor sNSThemeColor = (SNSThemeColor) other;
        return this.light == sNSThemeColor.light && this.dark == sNSThemeColor.dark;
    }

    public final int getDark() {
        return this.dark;
    }

    public final int getLight() {
        return this.light;
    }

    public int hashCode() {
        return Integer.hashCode(this.dark) + (Integer.hashCode(this.light) * 31);
    }

    @NotNull
    public String toString() {
        return "SNSThemeColor(light=" + this.light + ", dark=" + this.dark + ")";
    }

    public /* synthetic */ SNSThemeColor(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
