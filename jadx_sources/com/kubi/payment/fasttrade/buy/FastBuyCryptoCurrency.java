package com.kubi.payment.fasttrade.buy;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBuyCryptoCurrencyAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/buy/FastBuyCryptoCurrency;", "", "iconUrl", "", "title", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getIconUrl", "()Ljava/lang/String;", "getTitle", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastBuyCryptoCurrency {

    @NotNull
    private final String iconUrl;
    private boolean isSelected;

    @NotNull
    private final String title;

    public FastBuyCryptoCurrency(@NotNull String iconUrl, @NotNull String title, boolean z11) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.iconUrl = iconUrl;
        this.title = title;
        this.isSelected = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastBuyCryptoCurrency)) {
            return false;
        }
        FastBuyCryptoCurrency fastBuyCryptoCurrency = (FastBuyCryptoCurrency) other;
        return Intrinsics.areEqual(this.iconUrl, fastBuyCryptoCurrency.iconUrl) && Intrinsics.areEqual(this.title, fastBuyCryptoCurrency.title) && this.isSelected == fastBuyCryptoCurrency.isSelected;
    }

    public static /* synthetic */ FastBuyCryptoCurrency copy$default(FastBuyCryptoCurrency fastBuyCryptoCurrency, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastBuyCryptoCurrency.iconUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = fastBuyCryptoCurrency.title;
        }
        if ((i11 & 4) != 0) {
            z11 = fastBuyCryptoCurrency.isSelected;
        }
        return fastBuyCryptoCurrency.copy(str, str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final FastBuyCryptoCurrency copy(@NotNull String iconUrl, @NotNull String title, boolean isSelected) {
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        return new FastBuyCryptoCurrency(iconUrl, title, isSelected);
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((this.iconUrl.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    @NotNull
    public String toString() {
        return "FastBuyCryptoCurrency(iconUrl=" + this.iconUrl + ", title=" + this.title + ", isSelected=" + this.isSelected + ')';
    }

    public /* synthetic */ FastBuyCryptoCurrency(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? false : z11);
    }
}
