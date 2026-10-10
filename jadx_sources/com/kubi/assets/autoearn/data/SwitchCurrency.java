package com.kubi.assets.autoearn.data;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoEarnOpenRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/assets/autoearn/data/SwitchCurrency;", "", FirebaseAnalytics.Param.CURRENCY, "", "isOpen", "", "<init>", "(Ljava/lang/String;I)V", "getCurrency", "()Ljava/lang/String;", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SwitchCurrency {

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @NotNull
    private final String currency;

    @SerializedName("is_open")
    private final int isOpen;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchCurrency)) {
            return false;
        }
        SwitchCurrency switchCurrency = (SwitchCurrency) other;
        return Intrinsics.areEqual(this.currency, switchCurrency.currency) && this.isOpen == switchCurrency.isOpen;
    }

    public SwitchCurrency(@NotNull String currency, int i11) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.isOpen = i11;
    }

    public static /* synthetic */ SwitchCurrency copy$default(SwitchCurrency switchCurrency, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = switchCurrency.currency;
        }
        if ((i12 & 2) != 0) {
            i11 = switchCurrency.isOpen;
        }
        return switchCurrency.copy(str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIsOpen() {
        return this.isOpen;
    }

    @NotNull
    public final SwitchCurrency copy(@NotNull String currency, int isOpen) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new SwitchCurrency(currency, isOpen);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (this.currency.hashCode() * 31) + Integer.hashCode(this.isOpen);
    }

    public final int isOpen() {
        return this.isOpen;
    }

    @NotNull
    public String toString() {
        return "SwitchCurrency(currency=" + this.currency + ", isOpen=" + this.isOpen + ')';
    }
}
