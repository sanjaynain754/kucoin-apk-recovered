package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FastBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/entity/FastSellBalanceMode;", "Landroid/os/Parcelable;", "fiatCurrency", "", "cryptoCurrency", "cryptoQuantity", "clientFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFiatCurrency", "()Ljava/lang/String;", "getCryptoCurrency", "getCryptoQuantity", "getClientFrom", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FastSellBalanceMode implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FastSellBalanceMode> CREATOR = new Creator();

    @Nullable
    private final String clientFrom;

    @Nullable
    private final String cryptoCurrency;

    @Nullable
    private final String cryptoQuantity;

    @Nullable
    private final String fiatCurrency;

    /* JADX INFO: compiled from: FastBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FastSellBalanceMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastSellBalanceMode createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FastSellBalanceMode(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FastSellBalanceMode[] newArray(int i11) {
            return new FastSellBalanceMode[i11];
        }
    }

    public FastSellBalanceMode(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.fiatCurrency = str;
        this.cryptoCurrency = str2;
        this.cryptoQuantity = str3;
        this.clientFrom = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FastSellBalanceMode)) {
            return false;
        }
        FastSellBalanceMode fastSellBalanceMode = (FastSellBalanceMode) other;
        return Intrinsics.areEqual(this.fiatCurrency, fastSellBalanceMode.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, fastSellBalanceMode.cryptoCurrency) && Intrinsics.areEqual(this.cryptoQuantity, fastSellBalanceMode.cryptoQuantity) && Intrinsics.areEqual(this.clientFrom, fastSellBalanceMode.clientFrom);
    }

    public static /* synthetic */ FastSellBalanceMode copy$default(FastSellBalanceMode fastSellBalanceMode, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fastSellBalanceMode.fiatCurrency;
        }
        if ((i11 & 2) != 0) {
            str2 = fastSellBalanceMode.cryptoCurrency;
        }
        if ((i11 & 4) != 0) {
            str3 = fastSellBalanceMode.cryptoQuantity;
        }
        if ((i11 & 8) != 0) {
            str4 = fastSellBalanceMode.clientFrom;
        }
        return fastSellBalanceMode.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCryptoQuantity() {
        return this.cryptoQuantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientFrom() {
        return this.clientFrom;
    }

    @NotNull
    public final FastSellBalanceMode copy(@Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String cryptoQuantity, @Nullable String clientFrom) {
        return new FastSellBalanceMode(fiatCurrency, cryptoCurrency, cryptoQuantity, clientFrom);
    }

    @Nullable
    public final String getClientFrom() {
        return this.clientFrom;
    }

    @Nullable
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    @Nullable
    public final String getCryptoQuantity() {
        return this.cryptoQuantity;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    public int hashCode() {
        String str = this.fiatCurrency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cryptoCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cryptoQuantity;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientFrom;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FastSellBalanceMode(fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", cryptoQuantity=" + this.cryptoQuantity + ", clientFrom=" + this.clientFrom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.fiatCurrency);
        dest.writeString(this.cryptoCurrency);
        dest.writeString(this.cryptoQuantity);
        dest.writeString(this.clientFrom);
    }

    public /* synthetic */ FastSellBalanceMode(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? "ANDROID" : str4);
    }
}
